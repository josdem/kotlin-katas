package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BiggestNumberFinderTest {

    private val biggestNumberFinder : BiggestNumberFinder = BiggestNumberFinder()

    @Test
    fun `should find biggest number`() {
        assertEquals(32.0, biggestNumberFinder.find(listOf("hi", "2.0", "@#$%", "32.0")));
        assertEquals(-10.0, biggestNumberFinder.find(listOf("pair", "car", "-10.0")));
        assertEquals(3.1416, biggestNumberFinder.find(listOf("main", "3.1416", "yaml")));
    }
}