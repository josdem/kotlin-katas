package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringCompressorTest {
    private val stringCompressor: StringCompressor = StringCompressor()

    @Test
    fun `should compress a string`() {
        val keyword = "aaabbbbcc"
        val expectedString = "3a4b2c"
        assertEquals(expectedString, stringCompressor.compress(keyword))
    }
}