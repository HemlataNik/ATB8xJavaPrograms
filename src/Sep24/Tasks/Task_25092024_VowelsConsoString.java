package Sep24.Tasks;

import javax.swing.*;
import java.util.Scanner;

public class Task_25092024_VowelsConsoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");

        String A = sc.nextLine();

        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < A.length(); i++)
        {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u')
                vowels = vowels + 1;
        else
        consonant = consonant + 1;
    }
        System.out.println("Total vowels=" +vowels);
        System.out.println("Total consonants=" +consonant);
    }
}
