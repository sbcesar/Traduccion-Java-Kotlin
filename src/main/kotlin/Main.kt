package org.example

fun multiplicar(num: Int): Int {
    return num * 2
}



fun main() {

    //Act 1
    val vida = 100
    val personaje = "Naruto"

    println("El personaje $personaje tiene $vida puntos de vida")

    //Act 3
    val cofres = arrayOf("Espada","Escudo","Poción")

    for (cofre in cofres) {
        println("Has encontrado: $cofre")
    }

    //Act 5
    val pj1 = Personaje("Goku",100,50)
    pj1.toString()

    //Act 7
    println(multiplicar(5))
    val operacion: (Int, Int) -> Int = { a, b -> a + b }

    println(operacion(3,4))

    //Actividad Final
    val goku = Personaje("Goku",100,20)
    val vegeta = Personaje("Vegeta",80,25)

    while (goku.vida > 0 && vegeta.vida > 0) {
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque

        println("Vida de Goku: ${goku.vida}")
        println("Vida de Vegeta: ${vegeta.vida}")
    }

    if (goku.vida <= 0) println("Vegeta ha ganado el combate") else println("Goku ha ganado el combate")
}