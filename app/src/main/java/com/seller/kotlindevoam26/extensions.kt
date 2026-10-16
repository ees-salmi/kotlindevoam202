package com.seller.kotlindevoam26

//extension
fun String.herflekher() : Char{
    return this.get(this.length-1)
}

fun lastchar(s:String):Char{
    return s[s.length - 1]
}

fun String.getFirstAndLast():String{
    return this.get(0).toString() + this.get(this.length - 1)
}

fun Int.isPair():Boolean {
    if (this % 2 == 0)
        return true
    else
        return false
}

fun main(){
    var s: String = "bouchra"
    println(s.herflekher())
    println(s.getFirstAndLast())
    var nombre = 5
    println(nombre.isPair())
}