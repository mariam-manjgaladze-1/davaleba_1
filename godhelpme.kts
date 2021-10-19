class Point(){
    var x: Float = 0.0F
    var y: Float = 0.0F
    fun converttostring(){         //toString funqcia
        x.toString()
        y.toString()
    }
    fun shedareba(){                //equals funqcia (imedia es igulisxmet)
        if (x == y){
            println("equals")
        }
        else{
            println("not equals")
        }
    }
}
class Fraction(var f: Int, var k: Int, var a: Int = 1){
    fun wiladis_shekveca(){
        //f - mricxveli, k - mnishvneli
        println("sawyisi wiladi:")
        println(f)
        println("/")
        println(k)
        while (a < 10)
        {
            if (f % a == 0 && k % a == 0)
            {
                f /= a
                k /= a
            }
            ++a
        }
        println("shekvecis shedegad migebuli wiladi")
        println(f)
        println("/")
        println(k)
    }
    fun shekreba(){
        println(f + k)
    }
    fun gamokleba(){
        println(f - k)
    }
    fun gayofa(){
        println(f / k)
    }
    fun gamravleba(){
        println(f * k)
    }
}
fun main() {
    var koord = Point()
    koord.x = 2.0F
    koord.y = 3.0F

    println("wertilis koordinatebia: ")
    println(koord.x)
    println(",")
    println(koord.y)

    //koordinatebis satavis mimart simetria
    koord.x = -1 * koord.x
    koord.y = -1 * koord.y

    println("mocemuli wertilis koordinatebis satavis mimart simetriuli gadatanit migebuli wertilis koordinatebia: ")
    println(koord.x)
    println(",")
    println(koord.y)
    //printebs ar mawerinebs ert xazze, ert frchxilshi mdzimeebit. mag: println(koord.x, ",", koord.y) ar imushava


    // davalebis fraction nawili ---------------------------------------------

    //wiladis shekveca.   mricxveli: 6, mnishvneli: 9.
    var wameba = Fraction(6, 9)
    wameba.wiladis_shekveca()
}