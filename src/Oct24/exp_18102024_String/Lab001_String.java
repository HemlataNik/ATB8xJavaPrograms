package Oct24.exp_18102024_String;

public class Lab001_String {
    public static void main(String[] args){
        String name = "Amit";
        String name_1 = new String("Ajit");
        System.out.println(name);
        System.out.println(name_1);

        System.out.println(name.equals(name_1));

        String S1 = new String("INDIA");
        String S2 = new String("INDIA");

        System.out.println(S1.equals(S2));
        System.out.println(S1 == S2);
        System.out.println("================");

        String S3 = "DELHI";
        String S4 = "DELHI";
        System.out.println(S3 == S4);
        System.out.println(S3.equals(S4));


    }
}
