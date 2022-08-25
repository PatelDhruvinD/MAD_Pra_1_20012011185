fun main(){
    println("********** Exercises = 1_1 **********")
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
   
   
   
    println("********** Exercises = 1_2 **********") 

    val obj = ArrayList<Laptop> (6)

    obj.add(Laptop())
    obj.add(Laptop("Core i9",4,4000,"Acer Laptop",1,50000))
    obj.add(Laptop("Core i5",4,1000,"Lenovo Laptop",1,65000))
    obj.add(Laptop("Core i3",8,1000,"Asus Laptop",1,75000))
    obj.add(Laptop("Ryzen 9",18,2000,"Dell Laptop",1,85000))
    obj.add(Laptop("Ryzen 7",4,10000,"Dell Laptop",1,100000))

    for (i in obj)
    {
        i.laptop()
        println("----------------------------")
    }


open class Product(private var name: String, private var qty: Int, private var amt: Int)
{

    fun product()
    {
        println("\n Laptop Details : \n")
        println("Name : $name")
        println("Qty : $qty")
        println("Amount : $amt")
    }
}

class Laptop(
    private var cpu: String, private var ram: Int, private var hdd: Int,
    name: String, qty: Int, amt: Int
) : Product(name, qty, amt)
{

    constructor() : this("None", 0, 0, "None", 0, 0)
    {
        println("Secondary Constructor")
    }

    fun laptop()
    {
        product()
        println("CPU Name : $cpu")
        println("RAM Size : $ram GB")
        println("HDD Size : $hdd GB")
    }
}
println("********** Exercises = 1_3 **********") 
    val obj = ArrayList<Student> (6)

    obj.add(Student())
    obj.add(Student("30002001001","CE","C","AB7","Rahul","Agarwal",19))
    obj.add(Student("T20012021050","IT","D","AB14","Om","Patel", 22))
    obj.add(Student("20112022222","CE","A","AB2","Chirag","Patel",19))
    obj.add(Student("20012022123","IT","D","AB5","Droan","Acharya", 18))
    obj.add(Student("21112022010","CE-AI","B","AB6","Rohan","Patel",17))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
        println("----------------------------")
    }


open class Person(private val fname: String, private val lname: String, private val age: Int)
{
    fun details() {
        println("First Name = $fname")
        println("Last Name = $lname")
        println("Age = $age")
    }


class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }

    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}
}
