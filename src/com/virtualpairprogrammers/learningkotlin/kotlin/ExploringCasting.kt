package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*


fun main(args: Array<String>) {
    var result : Any

    val random =  Random().nextInt(3)
    if(random == 1)
        result = BigDecimal(30)
    else
        result = "hello";
    println("Result is currently $result")

    if(result is BigDecimal)
        result = result.add(BigDecimal(10));
    else{
        val tempResult = result as String
        result = tempResult.toUpperCase()
    }
    println("Result is currently $result")
}