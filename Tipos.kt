fun main ()
{
    //numeros
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b10101010101

    println (" los valores de las variables son entero $int entero mas largo $long variable doble $double variable decimal $float variable hexadecimal $hexadecimal variable binaria $binary")

    //codigo numero 2
    //boleanos
    val x = 1
    val y = 2
    val z = 2
    val esTrue = x < y && x < z
    val otroTrue = x == y || y == z

    println(esTrue)
    println(otroTrue)

    //cadenas
    val string = "string con \n una linea nueva"
    val rawString = """
    raw string es útil para
    cadenas con muchas líneas
    """

    println(string)
    println(rawString)

}