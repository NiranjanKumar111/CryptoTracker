package com.niranjan.cryptotracker.crypto.presentation.coin_list

import com.niranjan.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}