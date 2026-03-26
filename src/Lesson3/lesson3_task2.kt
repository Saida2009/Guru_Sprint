fun main(){
    val my_password = "Password2009"
    var input_password: String

    do {
        print("Введите пароль: ")
        input_password = readln().toString().trim()

        if (input_password != my_password){
            println("Вы ввели неверный пароль! Попробуйте еще раз")
        }
    } while (input_password != my_password)
    println("Вы ввели верный пароль. Добро пожаловать!")
}