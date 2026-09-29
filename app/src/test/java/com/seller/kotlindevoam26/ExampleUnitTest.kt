package com.example.myappview

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun somme() {
        var a = 4
        var b  =5
        var somme = a + b
        println("**********************************")
        println(somme)
        println("**********************************")
    }

    @Test
    fun taillechaine() {
        var a = "aymen"
        var taille = a.length
        println("**********************************")
        println(" la taille du a = $taille")
        println("**********************************")
    }

    @Test
    fun exer3() {
        var a = "aymen"
        var taille = a.length
        println("**********************************")
        println(" la taille du a = $taille")
        println("**********************************")
    }

    @Test
    fun afficher_pair() {
        println("**********************************")
        for(i in 1 until 100){
            if(i%2 == 0 ){
                println(i)
            }

        }
        println("**********************************")
    }

    @Test
    fun somme_pair() {
        var somme = 1
        println("**********************************")
        for(i in 1 .. 3){
            somme = somme * i
        }
        println("la somme est s = $somme")
        println("**********************************")
    }

    @Test
    fun factorielle() {
        var fact = 451/10
        // reda :  exception kotlin
        // ayman :  sealed class kotlin
        // abdessamad : création d'un objet kotlin ( définition d'une classe)
        var n = fact
        var i = 1
        println("**********************************")

        while ( i <= 4){
            fact = fact * i
            i = i + 1
        }
        println("le factoreille est 4 ! = $fact")
        println("**********************************")
    }

    @Test
    fun elvisoperator() {
        var nom : String? = ""
        var c : Int? = null
        var k : Double? = null

        var taille = nom?.length ?: 10
        println(taille)
        println("**********************************")
        var somme = 0

        for(i in 1..4){
            somme = somme + i
            println(i)
        }

        println("**********************************")
        println(somme)
        println("**********************************")
    }

    @Test
    fun elvis_exemple3() {
        var nom : String? = ""
        var c : Int? = null
        var k : Double? = null

        var taille = nom?.length ?: 10
        println(taille)
        println("**********************************")
        var somme = 0

        for(i in 1..4){
            somme = somme + i
            println(i)
        }

    }



}