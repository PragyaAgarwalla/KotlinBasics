package com.virtualpairprogrammers.learningkotlin.kotlin

import java.io.FileInputStream

@Throws (InterruptedException::class)
fun divide(a: Int, b: Int): Double{
    Thread.sleep(1000)
    return a.toDouble()/b
}

fun printFile(){
    val input = FileInputStream("file.txt")
    input.use {
        //if an exception is thrown here then the object calling use will be closed automatically
    }
}

fun main(args: Array<String>) {

    var result = try{
        divide(7,23)
    }
    catch(e: Exception){
        println(e)
        0
    }

    print(result)
}