package com.seller.kotlindevoam26


import android.R.attr.x
import android.util.Log.i
fun caractere(A : String):Char{

    var  l : Char = A[A.length - 1]
    return l
}

fun gettaille(A : String):Int{

    var  taille = A.length
    return taille
}

fun contientA(nom: String):Int{

    for(i in 0..nom.length - 1){

        if(nom[i] == 'a'){
            return 1
        }
    }
    return 0
}

fun contientlA(nom: String):Boolean{

    var conA = false
    for(i in 0..nom.length - 1){

        if(nom.lowercase()[i] == 'a'){
            conA = true
        }
    }
    return conA
}

fun estpalindrome(s : String):Boolean {
    // kayak // aya
    var inverse : String = ""
    var estp : Boolean = false
    for(i in s.length-1 downTo 0){
        inverse = inverse + s[i]
    }
    if(s == inverse){
        estp = true
        return true
    }
    else
        return false

}

fun estpalindrome2(s:String):Boolean{
    return s.reversed().equals(s)
}

fun nombrevoyelles(s:String):Int{
    var compteur : Int = 0
    var chaine = s.lowercase()
    for (i in 0..s.length-1){
        if(chaine[i] == 'a' || chaine[i] == 'i' || chaine[i] == 'o' ||
            chaine[i] == 'y' || chaine[i] == 'e' || chaine[i] == 'u' ){
            compteur = compteur + 1
        }
    }
    return compteur
}

fun nombreconsonnes(chaine : String) : Int{
    var nombre = chaine.length - nombrevoyelles(chaine)
    return nombre
}

fun nombreconsonnes2(s : String):Int {
    var compteur: Int = 0
    var chaine = s.lowercase()
    for (i in 0..s.length - 1) {
        if (chaine[i] != 'a' && chaine[i] != 'i' && chaine[i] != 'o' &&
            chaine[i] != 'y' && chaine[i] != 'e' && chaine[i] != 'u'
        ) {
            compteur = compteur + 1
        }
    }
    return compteur
}

fun contientAte(chaine : String) : Boolean{

    for(i in 0..chaine.length - 1){
        if(chaine[i] == '@'){
            return true
        }
    }
    return false
} // ecrire une fonction qui prend en paramètre degré en celsius et retourne Fahrenheit
fun tofahre(degre : Double) : Double{
    var fahr = degre * 1.8 + 32
    return fahr
}

fun getLastChare(chaine : String) : String {

    return chaine[chaine.length - 1].toString()
}

fun getLastChar2e(chaine : String) : String {
    var c = ""
    for(i in 0..chaine.length-1){
        c = c + chaine[i]
    }
    return c
}

fun gettaillese(chaine : String): Int{

    return chaine.length
}

fun contienae(chaine : String) : Boolean {
    var cont = false
    for (i in 0..chaine.length - 1){
        if(chaine[i] == 'a'){
            cont = true
        }
    }
    return cont
}


fun supprimerEspace(s:String):String {
    var a: String = ""
    for (i in 0..s.length - 1) {
        if (s[i] != ' ') {
            a =  a + s[i]
        }
    }
    return a
}



fun afficher( s:String):Char{
    var a = 4%2
    var b = 5%2
    return s[a+b]
}
// 202
class Stagiaire(val nom:String,val age : Int,val adresse : String)
class Personne(val cin : String, val prenom : String, val estMarie : Boolean)
class Stagiaire2{
    //proprieté
    var nom : String = ""
    var age : Int = 0
    //methode
    fun lire(){
        println("le stagiaire est entrin de liser")
    }

    fun marcher(){
        println("il marche")
    }
//202
}

fun mon_fonc(ch:String,charn : Int){
    for(i in 0..charn){
        print(ch[i])
    }
}

fun my_fonc(sh:String):String{
    var s = sh
    return s.reversed().uppercase()
}

fun afficherString(sh : String){
    var a = 4%2
    var b = 5%2
    var s = sh[sh.length-1]
    println(s)
}

fun eliminer_voyel(chaine:String):String{
    var s = ""
    for(i in 0.. chaine.length-1){
        if (chaine[i] != 'a' && chaine[i] != 'i' && chaine[i] != 'o' &&
            chaine[i] != 'y' && chaine[i] != 'e' && chaine[i] != 'u'){

            s = s + chaine[i].toString()
        }
    }
    return s
}

class Voiture{
    // des propriétés attributs
    var marque : String? = null
    var model : String? = null
    var nombre_places : Int = 0
    // les méthodes

    fun marcher(){
        println("la voiture marche")
    }

    fun freiner(){
        println("la voiture s'arrete")
    }

}


class Pc(val marque:String, val type_processeur : String, val capacite_stockage : Int )
class Calculatrice{
    var a : Int = 0
    var b : Int = 0
    var walid : String? = null
    fun additionner(s: Int):Int{
        return a+b+s
    }

    fun soustraire(b : Int):Int{
        var b =5
        return a-this.b
    }
}


fun main() {
    //création d'objet
    var objetvoiture = Voiture()
    objetvoiture.marque = "toyota"
    objetvoiture.model = "yaris"
    objetvoiture.nombre_places = 3

    var pc1 = Pc("DELL","INTEL",500)
    // créer objet calculatrice
    var bouch = Calculatrice()

    bouch.a = 4
    bouch.b = 6
    bouch.walid = "walid"
    var obj2 = Calculatrice()
    obj2.a = 3
    obj2.b = 3
    obj2.walid = "abc"
    var obj3 = Calculatrice()

    println(bouch.additionner(5))
    println(bouch.soustraire(2))


}






/* var prenom : String = "yassine"

 var prenom2 : String? = null

 // elvis operator
 var a1 = 4
 var c1 : Int? = null

 var somme = a1 + (c1 ?: 0)

 println(somme)
 var sumConcat = prenom2 ?: "Bonjour " + prenom

 println(sumConcat)




 //exercice 3

 var nom2 : String = "hAmzal"

 var nom1 = nom2.lowercase()
 var compteur = 0

 for(i in 1 until nom1.length){
     if(nom1[i] == 'a' || nom1[i] == 'l' ){

         compteur = compteur + 1
     }
 }
  //println(compteur)



 println("")
 if(nom1.length % 2 == 0){
     print("pair")
 }
 else
     print("impair")




 // exrcice 2
 var c = 36

 for(i in 0..c){
     if(i%3 == 0 && i% 4 == 0) { // 5
         //print(i)
         //print("  ")
     }
 }
// exercice 1
 val a = 5
 val b = 10
 for(i in a..a+b){
     if(i%2 == 0) {
         // print(i)
     }
 }



 var nom : String = "anouar"

// print(nom[nom.length -1 ])


 var age = 18
 for(i in 1..3){
     age = age + i
 }

 //print(age)

*/






