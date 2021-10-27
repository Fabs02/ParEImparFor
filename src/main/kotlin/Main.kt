fun main(args: Array<String>) {
    var num = 0
    var impar = 0
    var par = 0

    print("Digite 10 números para definirmos quais são pares e quais são ímpares: ")


    for(i in 1..10) {
        num = readLine()!!.toInt()
        if (num % 2 == 0) {
            par++
        } else {
            impar++
        }
    }
    println("Os números pares foram: $par" +
            "\nOs números ímpares foram: $impar")
}