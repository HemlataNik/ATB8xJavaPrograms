package Oct24.Tasks.Task_18102024;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string here: ");
        String str = sc.next().toString();

        String rev = "";
        String temp = str;

        int len = str.length();

        for (int i = len - 1; i >=0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if (temp.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}