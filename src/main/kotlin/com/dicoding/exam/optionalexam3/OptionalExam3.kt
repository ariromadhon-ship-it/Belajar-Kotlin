package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    // find trailing digits
    var idx = str.length
    while (idx > 0 && str[idx - 1].isDigit()) idx--
    return if (idx == str.length) {
        // no trailing digits
        str + int
    } else {
        val prefix = str.substring(0, idx)
        val suffixNum = str.substring(idx).toIntOrNull() ?: 0
        prefix + (int * suffixNum)
    }
}
