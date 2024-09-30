package Sep24.Tasks;

public class Task_27092024_while_Vs_Do_while {
    public static void main(String[] args) {

        int i =5;
        int num =0;
        while(num<=i);
        {
            System.out.println("while loop....");
            System.out.println(num);
            num++;
        }

        do
        {
            System.out.println("do while loop....");
            System.out.println(num);
            num++;
        }while(num<=i);


    }
}
