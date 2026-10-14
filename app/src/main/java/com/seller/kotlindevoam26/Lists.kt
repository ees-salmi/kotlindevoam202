package com.seller.kotlindevoam26

class Personnes {
    var age : Int = 0
    var nom  : String = ""
    var enfants : ArrayList<String> = arrayListOf("youssef","omar") // []
    var enfant2 : Array<String> = arrayOf("salah","zineb") // static can't add or remove

    fun addChild(child : String){
        enfants.add(child)
    }

    fun removeChild(child : String){
        enfants.remove(child)
    }


}

fun main(){
    var yasine = Personnes() // objet
    yasine.addChild("khadija")
    println(yasine.enfants)

    yasine.removeChild("omar")
    println(yasine.enfants)

    /* var list : ArrayList<Int> = arrayListOf<Int>()
     list.add(12)
     list.add(11)
     list.add(4)
     list.add(7)
     list.remove(12)
     println(list.filter { it % 2 == 0})

     list.add(9)
     // la taille de la list
     //println(list.size)
     list.add(17)
     for (elm in list){
         if(elm < 10){
             println(elm)
         }
     }
     var notesvalide = list.filter { it >= 10 }
     var notesnonvalide = list.filter { it < 10 }
     println(notesvalide)
     println(notesnonvalide)

    var lists : ArrayList<String> = arrayListOf()
    lists.add("yasser")
    lists.add("khadija")
    lists.add("mohamed")
    lists.add("ali")
    lists.add("aya")
    var rest = lists.filter { it.contains("me") }
    print(rest)*/



    var notes : ArrayList<Double> = arrayListOf()
    notes.add(16.0)



    notes.add(12.5)
    notes.add(8.5)
    notes.add(10.25)
    notes.add(8.25)
    notes.add(9.5)
    var arrayp = notes.filter { it >= 10 }
    var arrayn = notes.filter { it < 10 }
    //println(arrayp)
    //println(arrayn)
    var noms : ArrayList<String> = arrayListOf()
    noms.add("Abdelaah")
    noms.add("Marouane")
    noms.add("Hamza")
    //print(noms.size)
    var noms2  = noms.filter { it.contains("m",true) }
    //println(noms2)



}