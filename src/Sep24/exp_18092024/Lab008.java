package Sep24.exp_18092024;

public class Lab008 {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line No. | Exp  |  a
        //  5       |      |  10
        //  6       |  result = 11   |  11
        //  7       |  result = 11   |  11

        int c = 10;
        System.out.println(c++ + c);
        //  A = c++
        // +
        // B = c
        // Line No. |  c |  Exp
        //  5 | 10 | NA
        // 6    10

    }
}
