package Oct24.Tasks.Task_25102024;

public class StarPatternPyramids {
    public static void main(String[] args) {
        /* write code to print below pattern

             *
            * *
           * * *
          * * * *
         * * * * *
        * * * * * *
       * * * * * * *
      * * * * * * * *
     * * * * * * * * *

         */
        for (int i = 1; i < 9; i++)
        {
            for (int k = (9 - i); k >= 1; k--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}