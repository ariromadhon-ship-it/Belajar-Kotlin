package com.dicoding.exam.exam5

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    // simulate long running task (~3 seconds)
    try {
        Thread.sleep(3000)
    } catch (e: InterruptedException) {
        // ignore
    }
    return valueA + valueB
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    // simulate long running task (~2 seconds)
    try {
        Thread.sleep(2000)
    } catch (e: InterruptedException) {
        // ignore
    }
    return valueA * valueB
}
