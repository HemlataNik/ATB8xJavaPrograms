package Sep24.Tasks;

public class Task_20092024 {
    public static void main(String[] args) {
        //condition ? expression_if_true: expression_if_false


        //By using Ternary Operators max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c

        int a = 10;
        int b = 20;
        int c = 45;

        String max = (a > b && a > c) ? "a" : (b > a && b > c) ? "b" : (c > a && c > b) ? "c" : "Two numbers are equal";
        System.out.println(max);

//Ternary Operators to handle multiple conditions.

// Input → int score = 85

// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        int score = 85;

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println(grade);
    }
}