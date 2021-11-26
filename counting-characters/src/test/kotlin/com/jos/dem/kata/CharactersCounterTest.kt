package com.jos.dem.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharactersCounterTest {

    private val charactersCounter: CharactersCounter = CharactersCounter()

    @Test
    fun shouldCountVowels() {
        assertEquals(2, charactersCounter.countVowels("josdem"))
    }

    @Test
    fun shouldCountConsonants() {
        assertEquals(4, charactersCounter.countConsonants("josdem"))
    }

}