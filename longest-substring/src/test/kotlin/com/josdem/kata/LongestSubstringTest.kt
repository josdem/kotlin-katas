package com.josdem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Given A string
 * When I call reduce method
 * Then I should have the length of a new string without repeated characters
 *
 * Examples:
 * 1. abcabcbb -> abc = 3
 * 2. bbbbb -> b = 1
 * 3. ABDEFGABEF -> BDEFGA = 6
 */

class LongestSubstringTest {
    private val longestSubstring : LongestSubstring = LongestSubstring()

    @Test
    fun `should return 3 when input is abcabcbb`() {
        val input = "abcabcbb"
        val expected = 3
        val actual = longestSubstring.reduce(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return 1 when input is bbbbb`() {
        val input = "bbbbb"
        val expected = 1
        val actual = longestSubstring.reduce(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return 6 when input is ABDEFGABEF`() {
        val input = "ABDEFGABEF"
        val expected = 6
        val actual = longestSubstring.reduce(input)
        assertEquals(expected, actual)
    }

}