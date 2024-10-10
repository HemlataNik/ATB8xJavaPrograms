package Oct24.Tasks;

public class Task_02102024_ATBStudent {

    //(3)Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
    int roll_no=03, age=23;
    String firstname="Hemlata";
    String lastname="Nikam";
    String std="12th";
    String Email="HemlNik@gmail.com";
    String address ="Wagholi";

    public void display_roll_no()
    {
        System.out.println("Student Information");
        System.out.println("==========================================");
        System.out.println("Student Roll Number: "+roll_no);
    }
    public void display_name()
    {
        System.out.println("Student_Name: "+firstname+" " +lastname);
    }
    public void display_address()
    {
        System.out.println("Student_Adress: "+address);
    }
    public void display_age()
    {
        System.out.println("Student_Age : "+age);
    }
    public void display_email()
    {
        System.out.println("Student_Email : "+Email);
    }
    public static void main (String [] args)
    {

        //object 1
        Task_02102024_ATBStudent get_roll_no = new Task_02102024_ATBStudent();
        get_roll_no.display_roll_no();

        //object 2
        Task_02102024_ATBStudent get_name = new Task_02102024_ATBStudent();
        get_name.display_name();

        //object 3
        Task_02102024_ATBStudent get_address = new Task_02102024_ATBStudent();
        get_address.display_address();

        //object 4
        Task_02102024_ATBStudent get_age = new Task_02102024_ATBStudent();
        get_age.display_age();

        //object 5
        Task_02102024_ATBStudent get_email = new Task_02102024_ATBStudent();
        get_email.display_email();
    }
}