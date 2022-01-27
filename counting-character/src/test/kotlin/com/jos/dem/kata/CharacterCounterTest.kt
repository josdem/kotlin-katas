package com.jos.dem.kata

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