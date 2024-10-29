package Oct24.exp_21102024_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab010_Throws {

    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException {

        extracted();
    }

    private static void extracted() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("dasda.txt");
    }
}

