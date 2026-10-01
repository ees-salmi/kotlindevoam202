package com.seller.kotlindevoam26

fun contientAt(chaine : String) : Boolean{

    for(i in 0..chaine.length - 1){
        if(chaine[i] == '@'){
            return true
        }
    }
    return false
} // ecrire une fonction qui prend en paramètre degré en celsius et retourne Fahrenheit
fun tofahr(degre : Double) : Double{
    var fahr = degre * 1.8 + 32
    return fahr
}

fun getLastChar(chaine : String) : String {

    return chaine[chaine.length - 1].toString()
}

fun getLastChar2(chaine : String) : String {
    var c = ""
    for(i in 0..chaine.length-1){
        c = c + chaine[i]
    }
    return c
}

fun gettailles(chaine : String): Int{

    return chaine.length
}

fun contiena(chaine : String) : Boolean {
    var cont = false
    for (i in 0..chaine.length - 1){
        if(chaine[i] == 'a'){
            cont = true
        }
    }
    return cont
}


fun main(){

    print("test")

}