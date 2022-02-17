package com.jos.dem.kata

class CandleCounter {
    fun count(candles: List<Int>): List<Int> {
        val biggest = candles.maxOrNull() ?: 0
        return candles.filter { it === biggest }
    }

}
