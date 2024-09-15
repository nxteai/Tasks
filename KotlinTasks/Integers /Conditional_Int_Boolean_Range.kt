fun main() {
    val numCups = readln()!!.toInt()
    val isWeekend = readln().toBoolean()

    if (isWeekend == true) {
        println(numCups in 15..25)
    } else {
        println(numCups in 10..20)
    }
}

/* This Kotlin code reads two inputs: the number of cups of coffee (numCups) and whether it's the weekend (isWeekend).
It checks if it's the weekend by converting the input to a Boolean. 
If it's the weekend, it prints whether the number of cups is between 15 and 25. 
If it's a weekday, it prints whether the number of cups is between 10 and 20. 
The program outputs true or false depending on whether the input matches these ranges. */
