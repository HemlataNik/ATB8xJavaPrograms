package Sep24.exp_23092024;

public class Lab003 {
    public static void main(String[] args) {
       int itemcode= 010;
        switch (itemcode) {
            default:
                System.out.println("None");
                break;
            case 001, 002, 003:
                System.out.println("All are electronics devices");
                break;
            case 004,005,006:
                System.out.println("All are mechanical devices");
                break;
        }
    }
}