package com.virtualpairprogrammers.learningkotlin.kotlin

data class Customer(val name : String,
               val address : String,
               var age : Int) {

    constructor(name: String, age: Int) : this(name,"",age){
        println("secondary cosnstructor")
    }

    init{
        println("init block")
    }
}

class AlternativeCustomer(val name: String, var age: Int){
    var address : String

    init{
        this.address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age){
        this.address = address
    }

}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = ""){
    var approve : Boolean = false
    set(value){
        if(age>=21)
            field = value
        else
            println("you can't approve a customer below the age of 21 years")
    }
    val nextAge
    get() = age+1

    fun uppercaseNmae() =
        name.toUpperCase()

    override fun toString() =
        "$name $address $age"

    companion object{
        fun getInstance() = AnotherAlternativeCustomer("Mickey",10,"India")
    }

    operator fun component1() = name
    operator fun component2() = age

}




fun main(args: Array<String>) {
    val customer = AnotherAlternativeCustomer("Matt",22,"Singapore")
    customer.age = 19
    customer.approve = true
    println("${customer.name} is ${customer.age} years old and is ${customer.approve}")

    val customer2 = AnotherAlternativeCustomer("John",30)
    customer2.approve = true
    println("${customer2} is ${customer2.age} years old and is ${customer2.approve}")
    println("next year ${customer2.uppercaseNmae()} will be ${customer.nextAge}")

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Sally", 29)
    println(customer4)
    val customer5 = customer4.copy(name="Diane")
    println(customer5)

    val (name, address, age) = customer5 //destructuring
    println(age)
    val (name2,age2) = customer
}