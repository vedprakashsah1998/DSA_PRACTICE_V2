class Student(val name: String) {
    init {
        println("fowieuroiwer sdfsdf")
    }

    constructor(name: String, age: Int) : this(name) {
        println("name: $name  Age: $age")
    }

}

open class Parent {
    open fun show() {
        println("Parent")
    }
}

class Child : Parent() {
    override fun show() {
        println("Child")
    }
}

fun main() {
    var student = Student("John", 20)
//    val number: Array<Int> = [1,3,5,5,]
    val nu = Array(5) { i -> i * 2 }
    println(student)
}