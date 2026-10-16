package com.seller.kotlindevoam26


interface vehicule{
    var nombreRoue : Int
    var coleur : String
    var poids : Double

    fun demarer()

    fun gitNombreRoue(): Int

    fun gitColor() : String
}
// une classe peut hériter une seule classe mais elle peut implémenter plusieur interfaces
class voiture(
    override var nombreRoue: Int,
    override var coleur: String,
    override var poids: Double
) : vehicule {
    override fun demarer() {
        println("la voiture à démarer")
    }

    override fun gitNombreRoue(): Int {
        return this.nombreRoue
    }

    override fun gitColor(): String {
        var c = this.coleur
        return c
    }

}

fun main(){
    var c = voiture(4,"noir",4000.0)


}