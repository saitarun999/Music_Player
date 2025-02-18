package org.example

class List {
    fun list(){
        //immutablelist
        val ilist = listOf("Tarun","Varun","Tarun Kumar")
        println(ilist)
        println(ilist.get(2))
        //mutablelist
        val mlist = mutableListOf("Tarun","Varun","Tarun Kumar")
        mlist.add("Venu")
        mlist.add(1,"Hari")
        println(mlist)
        println(mlist.get(2))
        mlist.removeAt(3)
        println(mlist)
    }
}