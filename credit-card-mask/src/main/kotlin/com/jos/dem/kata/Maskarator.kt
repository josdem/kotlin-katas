package com.jos.dem.kata

class Maskarator {

    private val SUFFIX_LENGTH = 4

    fun maskify(keyword: String): String {
        return if (keyword.length <= SUFFIX_LENGTH) keyword else keyword.substring(0, keyword.length - SUFFIX_LENGTH)
            .replace(".".toRegex(), "#") + keyword.substring(keyword.length - SUFFIX_LENGTH)
    }

}
