fun main(){
    // Задача 1
    println("Введите свой возраст: ")
    val my_age = readLine()!!.toInt()
    val result = my_age >= AGE_OF_MAJORITY
    println("Совершеннолетие достигнуто: $result")


}

const val AGE_OF_MAJORITY = 18 // Задача 1