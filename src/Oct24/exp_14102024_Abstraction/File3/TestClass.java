package Oct24.exp_14102024_Abstraction.File3;

public class TestClass {
    public static void main(String[] args) {

        ChromeBrowser c  = new ChromeBrowser();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FirefoxBrowser firefoxtc = new FirefoxBrowser();
        firefoxtc.openBrowser("FIREFOX");
        firefoxtc.closeBrowser("FIREFOX");


    }
}

