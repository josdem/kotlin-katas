package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BitCounterTest {

    private val bitCounter: BitCounter = BitCounter()

    @Test
    fun `should count bits`() {
        assertEquals(5, bitCounter.countBits(1234));
        assertEquals(1, bitCounter.countBits(4));
        assertEquals(3, bitCounter.countBits(7));
        assertEquals(2, bitCounter.countBits(9));
        assertEquals(2, bitCounter.countBits(10));
    }
}