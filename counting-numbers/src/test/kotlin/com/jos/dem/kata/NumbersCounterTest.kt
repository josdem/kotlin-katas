package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumbersCounterTest {

    private val numbersCounter : NumbersCounter = NumbersCounter()

    @Test
    fun `should count numbers`() {
        assertArrayEquals(intArrayOf(3, 2, 1), numbersCounter.count(intArrayOf(-4, 3, -9, 0, 4, 1)))
    }
}