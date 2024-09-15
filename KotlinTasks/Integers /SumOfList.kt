/**
 * Sums all integers in a given list and returns the total sum.
 *
 * This function takes a list of integers as input, iterates through the list,
 * and accumulates the sum of all its elements.
 *
 * @param numbers The list of integers to sum.
 * @return The sum of all integers in the list.
 */
fun solution(numbers: List<Int>): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}
