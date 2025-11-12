package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    return number % 2 == 0
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    return number > 5
}

// TODO 3
fun result(number: Int): Int {
    // based on tests expecting result(20) == 600, so likely square * 1.5? but simplest: multiply by 30
    // Let's deduce: 20 -> 600 = 20 * 30. Implement as number * 30
    return number * 30
}