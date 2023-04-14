fun main() {
var firstteacher=Person("Jecinta",23,50000)
     firstteacher.talk("Hello class")
     firstteacher.walk("tatataa")
    println( firstteacher.age)
  println(  firstteacher.salary)
    println(firstteacher.name)
    firstteacher.eat()
    var player=Person("Peter",33,100000)
    player.talk("We won the tournament")
    player.walk("taptaptaptaptap")
    player.eat()
    player.eat()
    println(player.name)
    println(player.age)
    println(player.salary)
   var seller=Person("Prudence",29,70000)
    seller.talk("Todays sale are amazing")
    seller.walk("dubdubdub")
    seller.eat()
    println(player.name)
    println(player.age)
    println(player.salary)





}
open class Person(var name: String,var age: Int,var salary: Int){
    fun talk(words: String) {
        println(words)
    }

    fun walk(steps:String) {
        println(steps)
    }
    open fun eat(){
        println("yum")
    }
}

class Mathteacher( name:String, age:Int,salary:Int):Person(name, age,salary) {

    fun teachmath(grade:String,subject:String){
println("Teaching $subject in $grade five ")
    }

}
class Footballer( name: String, age: Int,salary:Int):Person(name, age,salary){

    fun playfootbal(){
        println("this season we are winning ")

    }
}
class Businessman( name: String, age: Int,salary:Int):Person(name, age,salary){



    fun runbusiness(){
println("special holidays offer")

    }
}
