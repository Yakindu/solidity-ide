//SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.6.10;

contract announcementTypes {

    enum announcementType {
        /*
            type of announcements
        */
        newModule,
        dropModule,
        replaceModule,
        replaceModuleHandler,
        question,
        transactionFeeRate,
        transactionFeeMin,
        transactionFeeMax,
        transactionFeeBurn,
        providerPublicFunds,
        providerPrivateFunds,
        providerPrivateClientLimit,
        providerPublicMinRate,
        providerPublicMaxRate,
        providerPrivateMinRate,
        providerPrivateMaxRate,
        providerGasProtect,
        providerInterestMinFunds,
        providerRentRate,
        schellingRoundBlockDelay,
        schellingCheckRounds,
        schellingCheckAboves,
        schellingRate,
        publisherMinAnnouncementDelay,
        publisherOppositeRate
    }
}