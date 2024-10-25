package Oct24.Tasks.Task_25102024;

public class StarPattern1LeftTriangle {
    public static void main(String[] args) {

        /* write code to print below pattern
         *****
         ****
         ***
         **
         *


         */
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
