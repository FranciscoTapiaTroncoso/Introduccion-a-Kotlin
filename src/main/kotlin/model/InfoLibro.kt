package model

import java.text.DecimalFormat

class InfoLibro (var nombreLibro:String,
                      var ISBN:String,
                      var anhoPublicacion: Int,
                      var editorial:String,
                      var cantidadPaginas:Int,
                      var precio:Int,
                      var autorLibro:String,
                      var tipoLibro:String)

fun Number.precioFormateado():String{
    var aplicarMiles = DecimalFormat("###,###")
    return "$${aplicarMiles.format(this)}"
}