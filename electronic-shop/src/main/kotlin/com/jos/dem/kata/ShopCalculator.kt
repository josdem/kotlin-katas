package com.jos.dem.kata

import java.util.stream.Collectors

class ShopCalculator {
    fun compute(amount: Int, keyboards: List<Int>, usbs: List<Int>): Int {
        val pairs = ArrayList<Pair<Int, Int>>()
        keyboards.forEach { k -> usbs.forEach { u -> pairs.add(Pair(k, u)) } }
        val prices = pairs.stream().map { pair -> pair.first + pair.second }.collect(Collectors.toList())
        return prices.stream().filter { it <= amount }.max(Int::compareTo).get()
    }

}
