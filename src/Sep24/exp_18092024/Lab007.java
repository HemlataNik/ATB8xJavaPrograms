package Sep24.exp_18092024;

public class Lab007 {
    public static void main(String[] args){
        int a  = 10;
//        int b  = ++a; // a = a+1
//        //  | a |output (b)|
//        //   10
//        //   11 | 11
//        System.out.println(b); //11
//        System.out.println(a); //11

       // int a = 10;
//        System.out.println(++a); //11
//        System.out.println(a);  //11

        // Post  a++
        // Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); //10
        System.out.println(a_post); //11
    }
}
