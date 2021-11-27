package com.jos.dem.kata

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
