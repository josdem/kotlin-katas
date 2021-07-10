package com.jos.dem.kata

import java.util.stream.Collectors

class VowelTrollRemover {

    fun remove(keyword: String): String {
        val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        
        return keyword
            .chars()
            .mapToObj { it.toChar() }
            .filter { !vowels.contains(it) }
            .map { it.toString() }
            .collect(Collectors.joining())
    }
}