import java.util.Date;
fun main()
{
  //  var fecha = Date()
//var hoy = if (fecha.year == 2019) true else false

//println(hoy)
//println(fecha)
//utulice la libreia de date de java import para poder hacer eso de la clase date en kotlin


print("ingrese la edad:")
var edad = readLine()!!.toInt()
if(edad >= 20)
{
 println("eres mayor de edad")
} else {
 println("aun eres menor")
}
// para poder ejecutar este codigo debvo comentra el anterior para asi poder mostrar los resultados


}