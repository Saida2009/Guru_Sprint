fun main(){
    println("Введите свой возраст: ")
    val my_age = readln()
    val age = my_age.toInt()

    if(age >= 18){
        println("Добро пожаловать!")
    }
    else{
        println("Вход запрещен!")
    }
}