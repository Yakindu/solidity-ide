//SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.6.10;


contract Test7 {
    struct Proposal{
        bytes32 name;
        uint voteCount;
    }
    Proposal[] public proposals;

    function init() public {
        proposals.push(Proposal({
                voteCount: 0,
                name: "Test"
            }));
    }

    function callMe(int32 i, bool b) public{
        callMe({b : false, i : 5});
    }
}


