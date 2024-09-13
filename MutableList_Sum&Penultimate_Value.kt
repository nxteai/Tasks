fun main() {
    // This line reads a single line of input from the user, splits the input by spaces,
    // converts each part into an integer, and stores them in a mutable list called 'numbers'.
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()

    // The following line adds the sum of all elements in the 'numbers' list 
    // to the beginning (index 0) of the list.
    numbers.add(0, numbers.sum())

    // This line removes the second-to-last element from the list.
    // `numbers.lastIndex` gives the index of the last element,
    // and `numbers.lastIndex - 1` targets the second-to-last element for removal.
    numbers.removeAt(numbers.lastIndex - 1)

    // This prints the list, joining its elements into a string separated by spaces.
    println(numbers.joinToString(" "))
}
