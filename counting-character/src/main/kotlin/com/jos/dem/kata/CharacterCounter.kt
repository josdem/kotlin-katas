package com.jos.dem.kata

class CharacterCounter {

    fun count(keyword: String, ch: Char): Int = keyword.chars().filter { ch === it.toChar() }.count().toInt()

}
