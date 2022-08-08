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

}