package model

class LibrosEscolares {

       companion object{

        fun getPosition(position : Int):InfoLibro{
            return infoLibro[position-1]
        }



    private val infoLibro = listOf(
        InfoLibro("El Señor de los Anillos Trilogia Completa",
            "8445070320",
            1985,
            "Minotauro Ediciones Avd",
            1200,
            400000,
            "J.R.R. Tolkien",
            "I:Impreso"),

        InfoLibro ("Cine años de soledad",
            "0307474720",
            2009,
            "Vintage Espanol",
            498,
            8000,
            "Gabriel Garcia Marquez",
            "I:Impreso"),

        InfoLibro("El Hombre Bincentenario y otros cuentos",
            "0307474435",
            1976,
            "Doubleday; Book Club",
            211,
            16000,
            "Isaac Asimov",
            "I:Impreso"),

        InfoLibro("El Hobbit",
            "0307474234",
            2010,
            "Minotauro",
            342,
            40000,
        "J.R.R. Tolkien",
        "I: Impreso")

    )
       }
}