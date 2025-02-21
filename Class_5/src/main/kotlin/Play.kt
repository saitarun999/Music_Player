package org.example

class Play {
    fun play(){
        var str = "Tarun"
        val c = 'T'
        println("The first letter of $str is $c")
        val age = 24
        println("The age of $str is $age years")
        str = str + " Nuka"
        println("Full name is $str")
        println(str.indexOf("arun"))
        var s = "Tarun"
        println(s.plus(" Nuka"))
    }
}