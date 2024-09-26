package Sep24.Tasks;

public class Task_25092024_FactofNum {
    public static void main(String[] args){
        //write a program to find fact of 5
        //5!= 5*4*3*2*1 = 120

        int num= 5;
        int fact =1;
        for(int i=1; i<=num; i++)
        {
            fact =fact*i;
        }
        System.out.println(fact);


/*
        int num= 5;
        int fact =1;
        int i=1;
        while (i<=num)
        {
            fact =fact*i;
            i++;
        }
        System.out.println(fact);
        *
 */
    }
}
