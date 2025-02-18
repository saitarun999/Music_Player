package org.example

import org.example.Map

fun main() {
    //Collections
    val mapObject = Map()
    mapObject.map()
    val listObject = List()
    listObject.list()
    val setObject = Set()
    setObject.set()
    //keywords
    val a = 12
    for(i in 1..5){
        if(i!=a) continue
        else{
            println("found a");
            break;
        }
    }
    var i = 0
    while(i<5){
        println(i)
        i++
    }
    val check = verify(a,12)
   println(check)
}
fun verify(a:Int,b:Int):Boolean{
    if(a==b)return true
    return false
}
