fun main(){
    // Задача 1
    println("Введите свой возраст: ")
    val my_age = readln()
    val age = my_age.toInt()
    val result = age >= AGE_OF_MAJORITY
    println("Совершеннолетие достигнуто: $result")


}

const val AGE_OF_MAJORITY = 18 // Задача 1