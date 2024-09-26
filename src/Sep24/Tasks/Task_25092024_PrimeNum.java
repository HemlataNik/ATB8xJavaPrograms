package Sep24.Tasks;

public class Task_25092024_PrimeNum {
    public static void main(String[] args) {
// prime number from 1to 100 using for loop
        //example 1, 3, 5 are prime numbers
        System.out.println("prime numbers between 1 to 100");
        for (int i = 2; i <= 100; i++)
        {
            int count = 0; //to count the number is divisible only by 1 and itself
            for (int j = i; j >= 1; j--)
            {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(""+i+"");
            }
        }
    }
}