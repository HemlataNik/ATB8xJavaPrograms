package Sep24.Tasks;

import java.util.Scanner;

public class Task_23092024_SwitchCalculator {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        Float num1 = sc.nextFloat();
        System.out.println("Enter 2nd Number: ");
        Float num2 = sc.nextFloat();

        System.out.println("Enter Operations do you want to perform: ");
        String opts = sc.next().toString();

        switch (opts){
            default :
                System.out.println("User have not entered any operation to perform");
                break;
            case "Addition" : Float add = num1+num2;
                System.out.println("Result: "+add);
                break;
            case "Subtraction" : Float sub = num1-num2;
                System.out.println("Result: "+sub);
                break;
            case "Division" : Float div = num1/num2;
                System.out.println("Result: "+div);
                break;
            case "Multiplication" : Float mul = num1*num2;
                System.out.println("Result: "+mul);
                break;
            case "Modulus" : Float mod = num1%num2;
                System.out.println("Result: "+mod);
                break;
        }
    }
}

