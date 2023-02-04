package com.gobang.cryptocurrency.data.repository

import com.gobang.cryptocurrency.data.remote.dto.CoinDetailDto
import com.gobang.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}