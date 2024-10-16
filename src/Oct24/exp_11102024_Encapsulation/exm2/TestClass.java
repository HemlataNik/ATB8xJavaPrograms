package Oct24.exp_11102024_Encapsulation.exm2;

public class TestClass {

    public static void main(String[] args) {
        GoodVWOLogin vwoLogin = new GoodVWOLogin("goodadmin", "admin123");
        // System.out.println(vwoLogin1.password);
        // vwoLogin1.password = "pass123";>?
        System.out.println(vwoLogin.getPassword());

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vwoLogin.setPassword("newpassword", isAdmin);
        System.out.println(vwoLogin.getPassword());
    }
}
