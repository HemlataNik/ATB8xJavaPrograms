package Sep24.exp_25092024;

public class Lab004_StarPattern_Forloop {
    public static void main(String[] args) {
        /* write code to print below pattern
         *****
         ****
         ***
         **
         *


         */
        for (int i = 5; i>=1;i--)
        {
            for (int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i =1; i<5; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
