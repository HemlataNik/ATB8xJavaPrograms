package Oct24.Tasks.Task_18102024;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string here: ");
        String input = sc.next().toString();
        int count= 0;
        for(char a : input.toCharArray())
        {
        count++;
        }
        System.out.println("Length of String is: "+count);
    }
}
