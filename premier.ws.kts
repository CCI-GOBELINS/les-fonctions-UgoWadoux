fun isPrimeNumber(x: Int): Boolean {
    if ((x == 0)||(x==1)){
        return false
    }
    for (i in 2..Math.sqrt(x.toDouble()).toInt()){
        if ( x % i == 0){
            return false
        }
    }
    return true
}

fun listPrimeNumber( x: Int){
    var count = 0
    var number = 0
    while (count < x){
        if (isPrimeNumber(number)){
            println(number)
            count ++
        }
        number ++
    }
}
listPrimeNumber(5)
