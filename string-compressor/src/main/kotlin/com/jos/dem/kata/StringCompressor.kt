package com.jos.dem.kata

import java.util.stream.Collectors

/*
Given a string "aaabbbbcc"
When we call compress method
Then we have a compressed string like "a3b4c2"
 */

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