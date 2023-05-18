package com.josdem.kata

class LongestSubstring {
    fun reduce(input: String): Number {
        return input.split("").distinct().size - 1
    }
}
