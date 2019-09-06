package com.example.kotlinsbdemo

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {

    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }

}

fun ranges() {
    for (x in 1..10 step 2){
        println(x)
    }
}

fun loops(){
    val items = listOf("Oranges", "Bananas", "Kiwis")
    println("Items in basket")
    for (item in items){
        println(item)
    }
}

fun collections(){
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}

fun main(args: Array<String>) {
    collections()
}