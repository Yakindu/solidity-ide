// SPDX-License-Identifier: GPL-3.0
pragma solidity 0.6.10;

abstract contract Feline {
    function utterance() public virtual returns (bytes32);
}

contract Cat is Feline {
    function utterance() public override returns (bytes32) { return "miaow"; }
}