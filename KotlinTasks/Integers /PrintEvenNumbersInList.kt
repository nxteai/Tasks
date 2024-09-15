/**
 * Prints all even numbers from a given list.
 *
 * This function takes a list of integers as input, iterates through the list,
 * and prints each even number in the list, separated by spaces.
 *
 * @param numbers The list of integers to check for even numbers.
 */
fun solution(numbers: List<Int>) {
    // Loop through each number in the list
    for (num in numbers) {
        // Check if the number is even
        if (num % 2 == 0) {
            // Print the even number, followed by a space
            print("$num ")
        }
    }
}
