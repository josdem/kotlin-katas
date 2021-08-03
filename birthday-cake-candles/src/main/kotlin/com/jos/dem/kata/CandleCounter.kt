package com.jos.dem.kata

/*
It is your birthday! And you want to make it special, so you want to keep only biggest candles in the cake
Your task is to create a function that removes all small candles and just keep the biggest ones.
 */

class CandleCounter {
    fun count(candles: List<Int>): List<Int> {
        val biggest = candles.maxOrNull() ?: 0
        return candles.filter { it === biggest }
    }

}
