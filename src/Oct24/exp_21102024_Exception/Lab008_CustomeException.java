package Oct24.exp_21102024_Exception;

public class Lab008_CustomeException {
    public static void main(String[] args) throws Exception {
        Lab009_Bank sbi = new Lab009_Bank ("INR",100);
        Lab009_Bank icici = new Lab009_Bank("INR",123);
        Lab009_Bank jp_chase = new Lab009_Bank("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));
    }
}
