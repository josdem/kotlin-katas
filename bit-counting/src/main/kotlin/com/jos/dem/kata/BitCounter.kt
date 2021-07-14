package com.jos.dem.kata

class BitCounter {

    fun countBits(number: Int): Int {
        return Integer.toBinaryString(number)
            .chars()
            .mapToObj { it.toChar() }
            .filter { it == '1' }
            .count().toInt()
    }

}
