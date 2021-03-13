package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val myDouble = 2.4

    println("Is myDouble a double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")
    println("myDouble's java class is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")

    val anotherInteger : Int = 17

    val myFloat : Float = 13.6f

    val result = myFloat + anotherInteger
    println(result)

    val bd = BigDecimal(17)
    val bd2 : BigDecimal
    println("Hello")

    bd2 = bd.add(BigDecimal(30))
    println(bd2)


    var name = "Pragya"
    val surname = "Agarwal"//immutable i.e.cannot be changed
    name="John"

    println("Hello $name ${surname.toUpperCase()}")
    println("The \$name variables has ${name.length} characters")

    val story = """It was a dark and story night.
        |A foul smell crept across the city.
        |John wondered what time is was and when it would be daylight.""".trimMargin("|")

    println(story)

    val changeStory = story.replaceAfterLast("it"," would be dawn.")
    println(changeStory)
}