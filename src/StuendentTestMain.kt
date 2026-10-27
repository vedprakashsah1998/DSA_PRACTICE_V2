data class StudentMain(val name: String, val age: Int, val list: MutableList<String>)

class StuendentTestMain {


}

fun main() {
    val studentList = mutableListOf<StudentMain>()
    studentList.add(StudentMain("John", 12, mutableListOf("23", "53", "55")))
    studentList.add(StudentMain("Ved", 22, mutableListOf("23", "53")))
    studentList.add(StudentMain("Raj", 33, mutableListOf("23")))
    studentList.add(StudentMain("Raj", 10, mutableListOf("23", "77")))
    val filteredList = studentList.filter { it.age < 18 }
    studentList.forEach { student ->
        if (student.list.size < 2) {
            student.list.add("50")
            student.list.add("50")
        } else if (student.list.size == 2) {
            student.list.add("50")
        } else {

        }

    }
    println("studentList: $studentList")
    println("filteredList: $filteredList")
}