fun main() {
    // 'backToTheWall' is initialized as a mutable list of strings.
    // The list is created by reading a line of input, splitting it by commas and spaces (", "), 
    // and then mapping each split item (string) to a list element.
    // '!!' is used after 'readLine()' to ensure the input is non-null.
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()

    // 'returnedWatchman' is initialized as a string that captures another line of input.
    // '!!' ensures the input is non-null.
    val returnedWatchman = readLine()!!

    // Add the string 'returnedWatchman' to the end of the 'backToTheWall' list.
    backToTheWall.add(returnedWatchman)

    // Print the updated 'backToTheWall' list as a single string, with each element separated by a comma and space.
    println(backToTheWall.joinToString())
}
