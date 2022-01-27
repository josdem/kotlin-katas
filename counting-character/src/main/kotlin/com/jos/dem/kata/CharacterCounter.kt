package com.jos.dem.kata

class CharacterCounter {

    fun count(keyword: String, ch: Char): Int {
        return keyword.length + ch.code
    }

}
