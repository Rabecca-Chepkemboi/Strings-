fun main(){
    val institution = "akirachix"
    println(institution[0])
    println(institution[2])
    println(institution[3])

    println(printfullname("Rabecca" , 24))
    putlength("I love tech")
    call("Chepkemboi")
    call("Aluel")

}
fun printfullname(name:String,age:Int):String{
    val sentence = "Hi, my name is $name and Iam $age years old"
    return sentence

}
fun putlength(len:String):String{
    val length = len.length
    return len

}
fun call(tag:String) {
    var a = "Chepkemboi"
    if (tag==(a)) {
        println("That's me")

    }
            else {
        println("I don't know who that is")
    }
    }



