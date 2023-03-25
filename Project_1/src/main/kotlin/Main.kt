fun main() {
    val ladies1 = Ladies()
    ladies1.gender = "Females"
    println("There are 24 ${ladies1.gender} in a class of 57 students.")
    ladies1.course = "Kotlin course"
    println("There are 20 ladies doing the ${ladies1.course} in a class of 57 students.")
    ladies1.curriculum()
    ladies1.hockey()

    val boys1 = Boys()
    boys1.gender = "Male"
    println("There are 33 ${boys1.gender} in a class of 57 students.")
    boys1.course = "Kotlin course"
    println("There are 37 ladies doing the ${boys1.course} in a class of 57 students.")
    boys1.curriculum()
    boys1.football()
}
open class Students{
    var gender : String = ""
    var course : String = ""

    fun curriculum(){
        println("The students are liking the Android Developer Curriculum.")
    }
}
class Ladies:Students(){

    fun hockey(){
        println("There are 19 ladies playing hockey.")
    }

}
class Boys:Students(){

    fun football(){
        println("There are 24 boys playing football.")
    }

}