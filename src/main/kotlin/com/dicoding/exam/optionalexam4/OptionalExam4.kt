package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    if (string.isEmpty()) return ""
    val len = string.length
    return if (len % 2 == 0) {
        val mid = len / 2
        string.substring(mid - 1, mid + 1)
    } else {
        val mid = len / 2
        string.substring(mid, mid + 1)
    }
}