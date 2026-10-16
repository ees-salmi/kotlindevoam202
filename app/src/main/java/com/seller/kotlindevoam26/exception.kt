package com.seller.kotlindevoam26


fun main(){
    var a = 10
    var b = 0
    var res = 0
    println("traitement")
    try {
        res = a/b
    } catch (e: Exception){
        println("un probleme a ete recontree")

    }

    println(res)
}