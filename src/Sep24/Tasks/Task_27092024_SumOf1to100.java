package Sep24.Tasks;

public class Task_27092024_SumOf1to100 {
    public static void main(String[] args) {
        //write code to print Sum of 1 to 100 numbers using while loop

        int i= 1;
        int sum= 0;
        while (i <= 100)
        {
            sum = sum + i;
            i++;
        }
      System.out.println(sum);
    }
}
