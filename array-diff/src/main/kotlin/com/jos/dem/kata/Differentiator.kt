package com.jos.dem.kata

class Differentiator {

    fun diff(a: IntArray, b: IntArray): IntArray = a.filter { !b.contains(it) }.toIntArray()
    

}
