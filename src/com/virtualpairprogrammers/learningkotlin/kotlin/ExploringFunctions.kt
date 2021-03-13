package com.virtualpairprogrammers.learningkotlin.kotlin

public fun printAString(value : String) {
    println(value)
}

//functions can exist outside class in Kotlin. they are called top level functions
// they are public and static by default.c Though you can change it to public etc.


//Single expression function
//with single line of code the coompiler can infer the return type. so no need to mention that in the function
fun addTwoNumbers(one : Double = 6.3, two : Double = 3.6) =
  one + two

fun printSomeMaths(one: Double, two: Double) { // every parameter is a val. it cant be declared as var. its value also cant be changed inside the function
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun functionWithinAFunction(a: String){ //function inside another function is visible only in the outer function. It cant be used outside the function
        println(a)
    }
    functionWithinAFunction("Hello Function")
}

fun methodTakesALamba(input: String, action: (String)-> Int){
    println(action(input))
}

fun main(args: Array<String>) {
    printAString("Hello World")
    println(addTwoNumbers(17.3, 9.6))
    println(addTwoNumbers((5.6)))
    println(addTwoNumbers(two = 5.6))
    printSomeMaths(17.3,9.6)
    printSomeMaths(two = 17.3,one = 9.6) //named parameters. here we need to name all the parameters.we cant name just few.
}