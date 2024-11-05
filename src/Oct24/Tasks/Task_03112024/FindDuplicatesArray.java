package Oct24.Tasks.Task_03112024;

public class FindDuplicatesArray {
    public static void main(String[] args) {
        //Using Nested Loops

        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    System.out.println(numbers[i]);
                    break; // Once we find a duplicate, no need to check further for this number
                }
            }
        }
    }
}
