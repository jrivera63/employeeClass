class Employee (var name: String , var number: Int, var shift: Int){

    // CREATES A FUNCTION THAT PUTS THE EMPLOYEE INFO INSIDE OF A STATEMENT AND PRINTS IT
    fun printStatement(){
        println("Employee number $number, $name, works during shift $shift")
    }

    // CREATES A FUNCTION THAT DISPLAYS THE EMPLOYEE INFO NEATLY
    fun printInfo(){
        println("Name: $name\nNumber: $number\nShift: $shift\n")
    }
}