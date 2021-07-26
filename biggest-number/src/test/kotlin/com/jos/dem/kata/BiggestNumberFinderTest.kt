package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BiggestNumberFinderTest {

    private val biggestNumberFinder : BiggestNumberFinder = BiggestNumberFinder()

    @Test
    fun `should find biggest number`() {
        assertEquals(32, biggestNumberFinder.find(listOf("hi", "2", "@#$%", "32")));
        assertEquals(-10, biggestNumberFinder.find(listOf("pair", "car", "-10")));
        assertEquals(3.1416, biggestNumberFinder.find(listOf("main", "3.1416", "yaml")));
    }
}