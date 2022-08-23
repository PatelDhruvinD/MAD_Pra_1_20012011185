import com.sun.xml.internal.bind.v2.util.CollisionCheckStack
class Car(var brand: String, var owner: String, var mile: Int, var Price: Int, var CPrice: Int) {
 init{
  println("Class and object are created")
 }
 fun info() {
  println("Brand: "+brand)
  println("Owner of Car: "+owner)
  println("Mile Drive: "+mile)
  println("Car's actule price: "+Price)
  println("Car's Current Price: "+CPrice)
 }
}
fun Fact(no: Int):Long{
    return if(no==1) no.toLong()        // terminate condition
    else no*Fact(no-1)
}
fun main() {
    println("Hello World!")

    println("********** Practical = 1_1 **********")

    val a: Int = 22
    println("integer value = $a")

    val b: Float = 1.5F
    println("Float value = $b")

    val c: Char = 'T'
    println("Character value = $c")

    val d: String = "Malay"
    println("String value = $d")

    val e: Boolean = true
    println("Boolean  value = $e")

    val f: Double = 31.102002
    println("Double value = $f")

    val g: Long = 1234567890
    println("Long value = $g")

    val h: Short = -2
    println("Short value = $h")

    val i: Byte = 127
    println("Byte value = $i")

    println("********** Practical = 1_2 **********")
    val intNo: Int = 10
    val doubleNo: Double =intNo.toDouble()
    println("Type conversion integer to double = $doubleNo")

    val stringNo: String = "10"
    val intNo1: Int = stringNo.toInt()
    val doubleNo1: Double =stringNo.toDouble()
    println("Type conversion String to Integer = $intNo1")
    println("Type conversion String to Double = $doubleNo1")


    println("********** Practical = 1_3 **********")
    print("Enter your E_no: ")
    val Eno: Long= readLine()!!.toLong()
    print("Enter your Name: ")
    val name: String= readLine()!!
    print("Enter your Branch: ")
    val branch: String= readLine()!!
    print("Enter your Class: ")
    val cls: String= readLine()!!
    print("Enter your CLG name: ")
    val clg: String= readLine()!!
    print("Enter your UNI name: ")
    val uni: String= readLine()!!
    print("Enter your Age: ")
    val Age: Int= readLine()!!.toInt()

    println("")
    println("")
    println("Student's Data")
    println("Your name: $Eno")
    println("Your name: $name")
    println("Your name: $branch")
    println("Your name: $cls")
    println("Your name: $clg")
    println("Your name: $uni")
    println("Your name: $Age")

    println("********** Practical = 1_4 **********")
    println("Enter no to Find ODD or EVEN")
    val no:Int = readLine()!!.toInt()
    if (no % 2 ==0)
        println("$no is Even")
    else
        println("$no is Odd")


    println("********** Practical = 1_5 **********")
    println("Enter Month no")
    val monthno:Int = readLine()!!.toInt()
    if (monthno == 1)
        println("$monthno is January")
    else if(monthno == 2)
        println("$monthno is February")
    else if(monthno == 3)
        println("$monthno is March")
    else if(monthno == 4)
        println("$monthno is April")
    else if(monthno == 5)
        println("$monthno is May")
    else if(monthno == 6)
        println("$monthno is June")
    else if(monthno == 7)
        println("$monthno is July")
    else if(monthno == 8)
        println("$monthno is August")
    else if(monthno == 9)
        println("$monthno is September")
    else if(monthno == 10)
        println("$monthno is October")
    else if(monthno == 11)
        println("$monthno is November")
    else if(monthno == 12)
        println("$monthno is December")
    else
        println("$monthno is not valid no")

    println("********** Practical = 1_6 **********")
    println("Enter Value A ")
    val x: Int = readLine()!!.toInt()
    println("Enter Value B ")
    val y: Int = readLine()!!.toInt()
    println("Enter Value C ")
    val z: Int= readLine()!!.toInt()
    val sum: Int =x+y+z
    val SUB: Int =x-y-z
    val MUL: Int =x*y*z
    val DIV: Int =x/y/z
    println(" Addition $x + $y +$z = $sum")
    println(" Subtraction $x - $y - $z = $SUB")
    println(" Multiplication $x * $y * $z = $MUL")
    println(" Division $x / $y / $z = $DIV")

    println("********** Practical = 1_7 **********")
    println("Enter no to find Factorial = ")
    val No: Int = readLine()!!.toInt()
    println("Factorial of $No is: "+Fact(No))

    println("********** Practical = 1_8 **********")
    val myArray1 = arrayOf<String>("Malay","Dhrumil","Hilag","Vidhi","Radhe")
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    var myArray3 = arrayOf(5,10,20,12,15)
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    println("Created Array-1 using arrayOf<String>")
    for(element in myArray1){
        print(element)
        print(" ")
    }
    println()
    println("Created Array-2 using arrayOf<INT>")
    for(element in myArray2){
        print(element)
        print(" ")
    }
    println()
    println("Created Array-3 using arrayOf()")
    for(element in myArray3){
        print(element)
        print(" ")
    }
    println()
    println("Created Array-4 using arrayOf(int and string)")
    for(element in myArray4){
        print(element)
        print(" ")
    }
    println()
    println("Created Array-5 using intArrayOf()")
    for(element in myArray5){
        print(element)
        print(" ")
    }
    val matrix = arrayOf(
        intArrayOf(3, 7),
        intArrayOf(0, 1),
        intArrayOf(2, 4)
    )
    println()
    println("Created 2D Array-6 and use .contentDeepToString()")
    println(matrix.contentDeepToString())

    print("Please enter size of array:")
    val input1 = readLine()!!
    val array_size: Int = input1.toInt()
    val myarray6 = Array<Int>(array_size) { 0 }
    val myarray7 = myarray6
    println("Please enter elements")
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        myarray6.set(i, readLine()!!.toInt())
    }
    var temp: Int
    for (i in 0..array_size - 1) {
        for (j in 0..array_size - 1) {
            if (myarray6[i] <= myarray6[j]) {
                temp = myarray6[i]
                myarray6[i] = myarray6[j]
                myarray6[j] = temp
            }
        }
    }
    println("#Method 1 - Without using inbuilt function")
    println("----Sorted Array---- ")
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + myarray6[i])
    }
    println("#Method 2 - Using inbuilt function")
    println("----Sorted Array---- ")
    myarray7.sort()
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + myarray7[i])
    }



     println("********** Practical = 1_9 **********")
      val numArray = doubleArrayOf(23.0, 9.5, 50.0, 90.0, 55.5, 43.7, 5.7, -66.5)
      var largest = numArray[0]
      for (num in numArray) {
        if (largest < num) {
            largest = num
        }
      }
      println("Largest element = %.2f".format(largest))


     println("********** Practical = 1_10 **********")
     val car1 = Car("BMW", "Malay", 50000,5000000,4500000)
     val car2 = Car("Hyundai", "Dhrumil",50000, 1000000,8000000)
     val car3 = Car("Maruti Suzuki", "Hilag",70000,1000000,9000000)

     println("")
     println("Car 1 information")
     car1.info()
     println("")
     println("Car 2 information")
     car2.info()
     println("")
     println("Car 3 information")
     car3.info()


    println("********** Practical = 1_11 **********")
    println("Please enter the elements in Array A")
    val A = Array(3) { IntArray(3) }
    val B = Array(3) { IntArray(3) }
    val C = Array(3) { IntArray(3) }
    val D = Array(3) { IntArray(3) }
    for (i in 0..2) {
        for (j in 0..2) {
            print("A[$i][$j]=")
            A[i][j] = readLine()!!.toInt()
        }
    }
    println("---------------------------------")
    println("Please enter the elements in Array B")
    for (i in 0..2) {
        for (j in 0..2) {
            print("B[$i][$j]=")
            B[i][j] = readLine()!!.toInt()
        }
    }
    for (i in 0..2) {
        for (j in 0..2) {
            C[i][j] = A[i][j] + B[i][j]
        }
    }
    for (i in 0..2) {
        for (j in 0..2) {
            D[i][j] = A[i][j] - B[i][j]
        }
    }
    println("-----------------Addition----------------------")
    for (i in 0..2) {
        for (j in 0..2) {
            print(A[i][j])
            print(" ")
        }
        print("\n")
    }
    println("  + ")
    for (i in 0..2) {
        for (j in 0..2) {
            print(B[i][j])
            print(" ")
        }
        print("\n")
    }
    println("------")
    println("------")
    for (i in 0..2) {
        for (j in 0..2) {
            print(C[i][j])
            print(" ")
        }
        print("\n")
    }
    println("-----------------Subtraction----------------------")
    for (i in 0..2) {
        for (j in 0..2) {
            print(A[i][j])
            print(" ")
        }
        print("\n")
    }
    println("  -  ")
    for (i in 0..2)
    {
        for (j in 0..2) {
            print(B[i][j])
            print(" ")
        }
        print("\n")
    }
    println("------")
    println("------")
    for (i in 0..2) {
        for (j in 0..2) {
            print(D[i][j])
            print(" ")
        }
        print("\n")
    }


    println("-----------------Multiplication----------------------")
    val r1 = 2
    val c1 = 3
    val r2 = 3
    val c2 = 2
    val firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
    val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))

    // Mutliplying Two matrices
    val product = Array(r1) { IntArray(c2) }
    for (i in 0..r1 - 1) {
        for (j in 0..c2 - 1) {
            for (k in 0..c1 - 1) {
                product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }

    // Displaying the result
    for (row in firstMatrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
    println("  *  ")
    for (row in secondMatrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }

    println("------")
    println("------")
    println("Product of two matrices is: ")

    for (row in product) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}



