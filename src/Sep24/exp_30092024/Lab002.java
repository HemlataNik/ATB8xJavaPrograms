package Sep24.exp_30092024;

public class Lab002 {
    public static void main(String[] args){
        //  1.Without Parameters and Without Return Type
        function_type1();

        // 2.Without Parameters but With Return Type
        int age = function_type2();
        System.out.println(age);

        // 3.With Parameters and Without Return Type
        function_type3(12,"pramod","mr",65);

        // 4. With Parameters and With Return Type
        double result = function_type4(3,4);
        System.out.println(result);
    }

    private static double function_type4(int a,double b) {
        System.out.println("With Parameters and With Return Type");
        return a+b;
    }

    private static void function_type3(int age2,String name,String firstname,int age) {
    System.out.println("With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);
    }

    private static int function_type2() {
        System.out.println("Without Parameters but With Return Type");
        return 65;
    }

    private static void function_type1() {
        System.out.println("Without Parameters and Without Return Type");
    }
}
