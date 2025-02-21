package org.example

class Companion {
    companion object{
        const val PI = 3.14
        fun name(){
            println("Hello")
        }
    }
    fun companion(){
        println("The value of PI is ${Companion.PI}")
        Companion.name()
    }
}