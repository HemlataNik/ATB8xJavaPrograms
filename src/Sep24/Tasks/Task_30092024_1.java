package Sep24.Tasks;

public class Task_30092024_1 {
    public static void main(String[] args) {

        String str = "Hemlata";
        int[] counts = {1, 2, 3, 4, 5,6,7}; // Number of times to print each character

        for (int i = 0; i < str.length(); i++)

        {
            char currentChar = str.charAt(i);
            for (int j = 0; j < counts[i]; j++)
            {
                System.out.println(currentChar);
            }
        }
    }
}
