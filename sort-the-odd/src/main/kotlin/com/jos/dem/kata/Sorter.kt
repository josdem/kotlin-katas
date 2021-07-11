package com.jos.dem.kata

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

class Sorter {

    fun sort(array: IntArray): IntArray {
        val result : ArrayList<Int> = ArrayList()
        val odds = array.filter { it % 2  == 1 }.sorted().toMutableList()
        array.forEach { if(it % 2 == 0) result.add(it) else result.add(odds.removeFirst())}
        return result.toIntArray()
    }

}
