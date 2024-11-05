package Oct24.Tasks.Task_03112024;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        // HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();

        // HashSet to store duplicate elements
        HashSet<Integer> duplicates = new HashSet<>();

        // Loop through the array
        for (int num : numbers) {
            // If the number is already in the 'seen' set, it's a duplicate
            if (!seen.add(num)) {
                duplicates.add(num);  // Add it to duplicates set
            }
        }

        // Print the duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}

/*
Array Initialization: The array numbers contains the elements we want to check for duplicates.

HashSet seen: This set stores the elements that we've already encountered. If we try to add an element that's already in this set, add() will return false, which indicates a duplicate.

HashSet duplicates: This set stores the duplicate elements that we find during the loop.

Loop Through the Array: We loop through the array, and for each element, we try to add it to the seen set. If the element is already in seen, we add it to the duplicates set.

Display Duplicates: After the loop, we check if there are any duplicates in the duplicates set and print them.
 */
