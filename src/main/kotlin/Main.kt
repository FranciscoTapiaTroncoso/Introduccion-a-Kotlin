import model.InfoLibro
import model.LibrosEscolares
import model.precioFormateado

fun main(args: Array<String>) {

//    Deficinicion de variables
// El numero otorgsdo a la posicion empeiza desde el n° = 1
    val libroescolaruno = LibrosEscolares.getPosition(1)
    var libroescolardos = LibrosEscolares.getPosition(2)
    var librosescolartres = LibrosEscolares.getPosition(3)
    var librosEscolares = LibrosEscolares.getPosition(4)


//    Funciones exigidas
    imprimir(libroescolaruno)
    println(libroescolaruno.precio.precioFormateado())

}


fun imprimir(libro : InfoLibro){
    println()
    println("INFORMACIÓN COMPLETA")
    println("Nombre del libro: ${libro.nombreLibro}")
    println("ISBN: ${libro.ISBN}")
    println("Año de publicación: ${libro.anhoPublicacion}")
    println("Editorial: ${libro.editorial}")
    println("Cantidad de páginas: ${libro.cantidadPaginas}")
    println("Precio: ${libro.precio.precioFormateado()}")
    println("Autor del libro: ${libro.autorLibro}")
    println("Tipo de libro (D: Digital / I: Impreso): ${libro.tipoLibro}")
}

