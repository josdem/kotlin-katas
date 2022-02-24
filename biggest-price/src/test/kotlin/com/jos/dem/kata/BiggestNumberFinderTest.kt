package com.jos.dem.kata

/*
Messages with random data are coming! But we care about prices!
Implement a function that removes all non-numeric data and return just the most significant price in the collection
messages = ["hi", "2.0", "@#$%", "32.0"]
result = 32.0
*/

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BiggestNumberFinderTest {

    private val biggestNumberFinder: BiggestNumberFinder = BiggestNumberFinder()

    @Test
    fun `should find biggest number`() {
        assertEquals(32.0, biggestNumberFinder.find(listOf("hi", "2.0", "@#$%", "32.0")));
        assertEquals(-10.0, biggestNumberFinder.find(listOf("pair", "car", "-10.0")));
        assertEquals(3.14, biggestNumberFinder.find(listOf("main", "3.14", "yaml")));
    }
}