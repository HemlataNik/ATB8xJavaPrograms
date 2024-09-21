package Sep24.Tasks;

public class Task_TriangleClassifier_20092024 {
    public static void main(String[] args) {

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
        int a = 7;
        int b = 5;
        int c = 8;
        if (a == b && b == c)
        {
            System.out.println("Equilateral triangle");
        }
        else if (a == b || a == c || b == c)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
