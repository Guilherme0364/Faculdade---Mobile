package org.example

fun printVet(b: IntArray, off: Int = 0, len: Int = b.size){
    for(i in off..len-1 ){
        println(b[i])
    }
}

fun func(arg1: Int = 0, arg2: Int = 1, arg3: () -> Unit){

}

fun main() {
    val b = IntArray(5){10*(it+1)}
    printVet(b, off = 1, len = 2)

    func(1){ println("Hello") }
    func(arg3 = { println("Hello") })
    func{ println("Hello") }

}
