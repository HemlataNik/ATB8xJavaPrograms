package Oct24.Tasks.Task_14102024;

public class PrintMyBook extends Book {
    @Override
    void getDetails(String name, String author, float price) {
        System.out.println("Name:" + name);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
    }
}