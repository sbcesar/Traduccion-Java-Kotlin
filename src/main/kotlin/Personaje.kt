package org.example

class Personaje(
    var nombre: String,
    var vida: Int,
    var ataque: Int
) {
    override fun toString(): String {
        return "Nombre: $nombre Vida: $vida Ataque: $ataque"
    }
}