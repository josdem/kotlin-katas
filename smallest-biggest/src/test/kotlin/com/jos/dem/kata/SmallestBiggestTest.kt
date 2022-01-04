package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestBiggestTest {

    private val smallestBiggest: SmallestBiggest = SmallestBiggest()

    @Test
    fun `should find smallest and biggest`() {
        val numbers = listOf(7, 5, 2, 4, 3, 9)
        assertEquals(listOf(2, 9), smallestBiggest.find(numbers))
    }
}