package example.oop

fun main() {

    var dog = MyDog()
    println(dog.name)
    dog.eat()

}

open class MyAnimal{
    open var name: String = "no-name"
    open fun eat(){
        println("Eating")
    }
}

class MyDog: MyAnimal(){
    var bread: String = ""
    override var name: String = "james"
    fun bark(){
        println("Barking")
    }

    override fun eat() {
        super.eat()
        println("Eating")
    }
}

