//SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.6.10;

import '../math/SafeMath.sol';


/**
 * @title PullPayment
 * @dev Base contract supporting async send for pull payments. Inherit from this
 * contract and use asyncSend instead of send.
 */
contract PullPayment {
    using SafeMath for uint256;

    mapping(address => uint256) public payments;
    uint256 public totalPayments;

    /**
     * @dev Called by the payer to store the sent amount as credit to be pulled.
     * @param dest The destination address of the funds.
     * @param amount The amount to transfer.
     */
    function asyncSend(address dest, uint256 amount) internal {
        payments[dest] = payments[dest].add(amount);
        totalPayments = totalPayments.add(amount);
    }

    /**
     * @dev withdraw accumulated balance, called by payee.
     */
    function withdrawPayments() public {
        address payable payee = msg.sender;
        uint256 payment = payments[payee];

        if (payment == 0) {
            revert ("Something bad happened") ;
        }

        if (address(this).balance < payment) {
            revert ("Something bad happened") ;
        }

        totalPayments = totalPayments.sub(payment);
        payments[payee] = 0;

        if (!payee.send(payment)) {
            revert ("Something bad happened") ;
        }
    }
}


