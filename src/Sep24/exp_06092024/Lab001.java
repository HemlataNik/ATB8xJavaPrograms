package Sep24.exp_06092024;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        findEvenOdd(num);
    }
    public static void findEvenOdd(int num){

        if(num%2==0)
            System.out.println("Num is Even");
        else
            System.out.println("Num is Odd");
    }
}
