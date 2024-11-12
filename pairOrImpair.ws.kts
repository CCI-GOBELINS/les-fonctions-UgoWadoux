fun listPairOrImpair(x: Int, type: String) {

    var count = 0
    var number = 0

    while (count < x) {
        if ((type == "pair" && number % 2 == 0) || (type == "impair" && number % 2 != 0)) {
            println(number)
            count++
        }
        number++
    }
}


println("Les 5 premiers nombres pairs :")
listPairOrImpair(5, "pair")

println("Les 5 premiers nombres impairs :")
listPairOrImpair(5, "impair")

