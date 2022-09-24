fun main() {
    // CREATE 3 INSTANCES FOR UNIQUE EMPLOYEES
    val employee1 = Employee("Robert Smith", 1, 3)
    val employee2 = Employee("Sarah Rodriguez", 2, 1)
    val employee3 = Employee("Connor Wilson", 3, 2)

    // CALLS EACH CLASS FUNCTION FOR EVERY EMPLOYEE
    employee1.printStatement()
    employee1.printInfo()

    employee2.printStatement()
    employee2.printInfo()

    employee3.printStatement()
    employee3.printInfo()
}