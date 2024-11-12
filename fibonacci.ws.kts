fun fibonacci(x : Int){
    var a = 0
    var b = 1
    for(i in 1..x){
        println(a)
        val c = a+b
        a = b
        b = c
    }
}
fibonacci(10)