/**
 * Counts the number of occurrences of a specific string in a list of strings.
 *
 * @param strings The list of strings to search through.
 * @param str The string to count the occurrences of.
 * @return The number of times the specified string appears in the list.
 */
fun solution(strings: List<String>, str: String): Int {
    // Initialize a counter to keep track of occurrences
    var counter = 0

    // Iterate through each string in the list
    for (x in strings) {
        // Check if the current string matches the specified string
        if (x == str) {
            // Increment the counter for each match found
            counter++
        }
    }

    // Return the total count of occurrences
    return counter
}
