fun main(){
    println("Введите свой возраст: ")
    val age = readLine()!!.toInt()

    if(age >= 18){
        println("Добро пожаловать!")
    }
    else{
        println("Вход запрещен!")
    }
}