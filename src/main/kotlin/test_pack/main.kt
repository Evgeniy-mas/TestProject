package org.example.test_pack

fun main() {

val x = 1
    val y = 5

    println(x + y)

    val list = listOf("Hello")
    println(list)

    val string = arrayOf("Have a nice day!")
    string.forEach { println(it) }

    val p = {z:Int,p:Int -> z + p}
   println(p.invoke(7,8))






}