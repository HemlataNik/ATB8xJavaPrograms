package Oct24.Tasks.Task_18102024;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        //by using char array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user input: ");
        String name = sc.next().toString();
        String rev = "";
        char[] a = name.toCharArray();

        for(int i=a.length-1 ; i>=0 ; i--)
        {
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
