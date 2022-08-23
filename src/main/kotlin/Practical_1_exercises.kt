fun main(){
    var a=10
    var b=20
    var c=a
    var d=b
    var temp:Int
    println("Swap value using Third variable")
    println("Before Swapping:")
    println("The value of a is:$a and Value of B is:$b")
    temp=a
    a=b
    b=temp
    println("After swapping")
    println("The value of a is:$a and Value of B is:$b")
    println(" ")
    println("Swap value without using Third variable")
    println("Before Swapping:")
    println("The value of a is:$c and Value of B is:$d")
    c=c+d
    d=c-d
    c=c-d
    println("After swapping")
    println("The value of a is:$c and Value of B is:$d")


}