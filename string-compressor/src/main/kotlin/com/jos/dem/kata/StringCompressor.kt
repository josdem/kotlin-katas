package com.jos.dem.kata

import java.util.stream.Collectors

class StringCompressor {
    fun compress(keyword: String): String {
        val map: Map<Char, Long> = keyword
            .chars()
            .mapToObj { it.toChar() }
            .collect(Collectors.groupingBy({ it }, Collectors.counting()))
        val sb = StringBuilder()
        map.forEach { (k: Char, v: Long) ->
            sb.append(k)
            sb.append(v)
        }
        return sb.toString()
    }
}