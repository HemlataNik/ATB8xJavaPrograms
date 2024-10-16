package Oct24.exp_09102024_Poly.Method_Overloading;

public class Main {
    public static void main(String[] args) {
        Mathoperations m = new Mathoperations();

        int result = m.add(3,4);
        System.out.println(result);


        String name = m.add("pramod","dutta");
        System.out.println(name);
    }

}
