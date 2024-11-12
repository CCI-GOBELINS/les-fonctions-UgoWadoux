fun factoriel(x : Int = 10): Int {
   var result = 1
    for(i in 1..x){
        result *= i
    }
    return result
}
factoriel()
factoriel(5)