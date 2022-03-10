package com.jos.dem.kata

import java.util.stream.Collectors

class VowelTrollRemover {

    private val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    fun remove(keyword: String): String {
        return keyword
            .chars()
            .mapToObj { it.toChar() }
            .filter { !vowels.contains(it) }
            .map { it.toString() }
            .collect(Collectors.joining())
    }
}