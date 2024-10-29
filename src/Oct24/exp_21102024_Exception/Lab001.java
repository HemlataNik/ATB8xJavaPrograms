package Oct24.exp_21102024_Exception;

public class Lab001 {
    public static void main(String[] args) {

        int c = 0;
        try {
            c = 10 / c;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e); // / by zero
        }

        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End");

//        Integer.parseInt() // String to Integer
//        Integer.valueOf() // Int -> Int, String, Integer


    }
}
