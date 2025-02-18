package org.example

class Set {
    fun set(){
        //immutable set
        val iset = setOf("Tarun","Varun","Tarun Kumar")
        println(iset)
        for (item in iset) println(item)
        //mutable set
        val mset = mutableSetOf("Tarun","Varun","Tarun Kumar")
        for(item in mset) println(item)
        println(mset.contains("Tarun"))
        mset.add("Venu")
        println(mset)
    }
}