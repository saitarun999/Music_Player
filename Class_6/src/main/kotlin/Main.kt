package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val first: Int = readln().toInt()
    val second: Int = readln().toInt()
    val list:MutableList<Int> = mutableListOf()
    for(i in first..second){
        var flag = true
           for(j in 2..(i-1)){
               if(i%j==0) {
                   flag = false;
               }
           }
          if(flag) list.add(i)
    }
    println(list)
    val random: Int = list.random()
    println(random)
}