package com.jos.dem.kata

class CharactersCounter {

    private val vowels = listOf('a', 'e', 'i', 'o', 'u')
    private val consonants = listOf(
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'r', 'p', 'q', 's', 't', 'v',
        'w', 'x', 'y', 'z'
    )

    fun countVowels(keyword: String): Int = keyword.count { vowels.contains(it) }
    fun countConsonants(keyword: String): Int = keyword.count { consonants.contains(it) }

}
