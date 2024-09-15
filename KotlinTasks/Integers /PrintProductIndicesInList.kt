fun solution(products: List<String>, product: String) {
    // Iterate through the list with index and value
    for ((index, prod) in products.withIndex()) {
        // Check if the current product matches the specified product
        if (prod == product) {
            // Print the index of the matching product followed by a space
            print("$index ")
        }
    }
}
