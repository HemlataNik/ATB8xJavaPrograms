import java.util.HashMap;

    public class FrequencyCounter {
        public static void main(String[] args) {
            // Given array
            Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

            // Create a hashmap to store frequency of each element
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Iterate through the array
            for (Integer num : numbers) {
                // If the element is already in the hashmap, increment its frequency
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Print the frequency of each element
            for (Integer key : frequencyMap.keySet()) {
                System.out.println("Element: " + key + " | Frequency: " + frequencyMap.get(key));
            }
        }
    }

    /*

 HashMap Initialization:
 We initialize a HashMap<Integer, Integer> where the key is the element from the array, and the value is the count of occurrences of that element.

Iterating the Array:
We loop through the array and update the count for each element using the getOrDefault() method of HashMap.
This method returns the value of the key if it exists, or 0 if the key is not found in the map.

Output:
After populating the hashmap, we iterate over the keys of the hashmap to print each element and its frequency.

     */


