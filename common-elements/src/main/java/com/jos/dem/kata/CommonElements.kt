package com.jos.dem.kata;

class CommonElements {

    fun find(first: List<Int>, second: List<Int>): List<Int> = first.filter { second.contains(it) }

}
