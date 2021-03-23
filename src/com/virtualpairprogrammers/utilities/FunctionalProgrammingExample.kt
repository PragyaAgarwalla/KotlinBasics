package com.virtualpairprogrammers.utilities

fun AddSomeFunctionToAString(inputstring : String, myFunction : (String) -> String) : String {
    return myFunction(inputstring)
}
fun main(args: Array<String>) {
    val result = AddSomeFunctionToAString("hello", ::toSentenceCase) //reflection
    val result2 = AddSomeFunctionToAString("hello") { it.toUpperCase() } //lambda
    println(result)
    println(result2)

    val colors = listOf("red", "green", "blue", "black")
    val uppercaseColors = colors.map { it.toUpperCase() } //map transformation creates 1 to 1 mapping between starting and ending list

    uppercaseColors.forEach{ println(it)}

    val colorsStaringWithB = colors.filter { it.startsWith('b') }
    colorsStaringWithB.forEach { println(it) }

    colors.flatMap { if(it.startsWith('b')) listOf(it,it) else listOf(it) }.forEach { println(it) } //1 to 0 or 1 or many mapping between starting and ending list

    println(colors.reduce{result, value -> "$result, $value"}) //reduce converts a collection to a single value

    val numbers = colors.map{ it.length }
    numbers.forEach { println(it) }
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())

    println(numbers.fold(0){result, value -> result + value}) // fold is similar to result but it needs a starting value for result
    println(numbers.fold(0){result, value -> if(value > result) value else result})

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter { it.value.startsWith('t') }.forEach { (k,v) -> println("$k $v") }
}