package com.jos.dem.kata

/*
 * Counting vowels and consonants. Create two functions one for counting vowels and another for
 * Given: A string
 * When: That string is josdem
 * Then: Counting vowels should be 2 and consonants 4
 */

class CharactersCounter {

    fun countVowels(keyword: String): Int {
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        return keyword.count { vowels.contains(it) }
    }

    fun countConsonants(keyword: String): Int {
        val consonants = listOf(
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'r', 'p', 'q', 's', 't', 'v',
            'w', 'x', 'y', 'z'
        )
        return keyword.count { consonants.contains(it) }
    }

}
