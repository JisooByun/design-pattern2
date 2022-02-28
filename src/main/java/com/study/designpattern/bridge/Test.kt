package com.study.designpattern.bridge


fun test(i1: Int, i2: Int) {
    println(i1 + i2)
    val listOf = listOf<Int>(i1, i2)
    val any = listOf.any
    println(any)

}
