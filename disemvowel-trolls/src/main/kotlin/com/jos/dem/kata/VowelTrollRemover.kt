package com.jos.dem.kata

import java.util.stream.Collectors

class VowelTrollRemover {

    fun remove(keyword: String): String {
        return keyword
            .chars()
            .mapToObj { it.toChar() }
            .filter { it != 'a' && it != 'e' && it != 'i' && it != 'o' && it != 'u' && it != 'A' && it != 'E' && it != 'I' && it != 'O' && it != 'U' }
            .map { it.toString() }
            .collect(Collectors.joining())
    }
}