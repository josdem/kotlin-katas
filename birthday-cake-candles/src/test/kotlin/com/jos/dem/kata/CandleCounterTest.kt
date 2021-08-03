package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CandleCounterTest {

    private val candleCounter: CandleCounter = CandleCounter()

    @Test
    fun `should keep biggest candles`(){
        assertEquals(listOf(3, 3), candleCounter.count(listOf(3, 2, 1, 3)))
        assertEquals(listOf(1), candleCounter.count(listOf(1)))
    }

}

