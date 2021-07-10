package com.jos.dem.kata

import java.util.stream.Collectors

class VowelTrollRemover {

    fun remove(keyword: String) : String {
        return keyword
            .chars()
            .mapToObj { ch -> ch.toChar() }
            .filter { ch ->
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'
            }
            .map { ch -> ch.toString() }
            .collect(Collectors.joining())
    }
}