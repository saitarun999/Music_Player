package org.example

class Map {
    fun map(){
        //immutable map
        val imap = mapOf(1 to "Tarun",2 to "Varun",3 to "Tarun Kumar")
        for(keys in imap.keys) println(imap[keys])
        //mutable map
        val mmap = mutableMapOf(1 to "Tarun",2 to "Varun",3 to "Tarun Kumar")
        for(keys in mmap.keys) println(mmap[keys])
        mmap.put(4,"Venu")
        mmap.put(5,"Hari")
        for(item in mmap.values) println(item)
    }
}