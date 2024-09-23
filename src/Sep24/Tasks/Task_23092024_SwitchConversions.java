package Sep24.Tasks;

import java.util.Scanner;

public class Task_23092024_SwitchConversions {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Enter kilometers: ");
                double kilo_to_miles= sc.nextDouble();
                double out1= kilo_to_miles * 0.62137119;
                System.out.println("Result: "+out1);
                break;
            case 2:
                System.out.println("Enter Celcius: ");
                double Cel_to_Feh= sc.nextDouble();
                double out2= ((Cel_to_Feh*9/5)+32);
                System.out.println("Result: "+out2);
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
