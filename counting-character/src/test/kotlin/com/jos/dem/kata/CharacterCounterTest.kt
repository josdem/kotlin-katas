package com.jos.dem.kata

/*
Given: A string named keyword
When: We call count character method
Then: I count how many times this character appears in the keyword
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharacterCounterTest {
    private val characterCounter: CharacterCounter = CharacterCounter()

    @Test
    fun `should count last character`() {
        val keyword = "josdem"
        assertEquals(1, characterCounter.count(keyword, 'm'))
    }

    @Test
    fun `should count three characters`() {
        val keyword = "Alabama"
        assertEquals(3, characterCounter.count(keyword, 'a'))
    }
}