package Oct24.exp_21102024_Exception;

public class Lab012_try {
    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //  if (condition) // handling?
    }
}
