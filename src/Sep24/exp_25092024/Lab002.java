package Sep24.exp_25092024;

public class Lab002 {
    public static void main(String[] args){
        //write a program to print even and odd numbers between 1 t0 50
        //using continue

        for(int i =1; i<=50; i++)
        {
            if(i%2==0) {
                System.out.println("Even number: " +i);
                continue;
            }
            System.out.println("Odd number: " +i);

        }
    }
}
