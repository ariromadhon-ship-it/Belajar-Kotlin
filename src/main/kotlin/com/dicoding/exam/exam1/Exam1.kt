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
    // Correct formula deduced from tests:
    // - result(20) == 600 -> 20 * 30
    // - result(108) == 12744 -> 108 * 118
    // Pattern: multiplier == number + 10
    // So result = number * (number + 10)
    return number * (number + 10)
}