fun main(){
    val applePrice: Double = 50.0
    val applesAmount: Int = 10
    var totalPrice = applePrice + applesAmount
    totalPrice += totalPrice * 0.5
    println("Цена одного яблока: $applesAmount")
    println("Количество яблок: $applePrice")
    println("Результат с налогом в 5%: $totalPrice")


}