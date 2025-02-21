package org.example

class NewFunc {
    fun newfunc(){
        //intern
        val str1 = "Tarun"
        val str2 = "tarun"
        val str3 = str2.intern()
        println(str1===str2)
        println(str1===str3)
        //pad start
        val str = "tarun"
        println(str.padStart(5,'4'))
        println(str.padEnd(5,'n'))
        //trim
        val str4 = "@@@tarun****"
        println(str4.trim('@','*'))
    }
}