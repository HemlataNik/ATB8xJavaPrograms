package Sep24.Tasks;

public class Task_27092024_EvenNos {
    public static void main(String[] args){
        //write code that prints the first 5 even numbers using do while loop
        int first_num=1;
        int last_num=10;

        int num=first_num;

        do{
            if (num % 2 == 0)
                System.out.println(num);
            num++;
        }while(num<=last_num);
    }
}
