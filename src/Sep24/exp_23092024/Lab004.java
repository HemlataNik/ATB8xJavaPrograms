package Sep24.exp_23092024;

public class Lab004 {
    public static void main(String[] args){
        int itemcode= 003;
        switch (itemcode) {
            default -> System.out.println("None");
            case 001, 002, 003 ->System.out.println("All are electronics devices");
            case 004,005,006 ->System.out.println("All are mechanical devices");
        }
    }
}
