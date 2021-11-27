package com.jos.dem.kata

/*
* Counting vowels and consonants. Create two functions one for counting vowels and another for counting consonants
* Given: A string
* When: That string is josdem
* Then: Counting vowels should be 2 and consonants 4
*/

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharactersCounterTest {

    private val nickname = "josdem"
    private val charactersCounter: CharactersCounter = CharactersCounter()

    @Test
    fun shouldCountVowels() {
        assertEquals(2, charactersCounter.countVowels(nickname))
    }

    @Test
    fun shouldCountConsonants() {
        assertEquals(4, charactersCounter.countConsonants(nickname))
    }

}