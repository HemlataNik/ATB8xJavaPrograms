package Oct24.Tasks.Task_04102024;

public class Person {
    String name;
    int age;
    float height;
    String job;
    Boolean is_married;
    String color;
    String nationality;
    String blood_group;
    int years_exp;
    String address;

    Person()
    {
        System.out.println("Default Constructor");

    }

    Person(String name)
    {
        System.out.println("I'm parameterized");
        this.name = name;
        System.out.println("The name is " +name);
    }
    Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    Person(String name, float height, String color, String nationality)
    {
        this.name = name;
        this.height = height;
        this.color = color;
        this.nationality = nationality;
    }
    Person(boolean is_married)
    {
        this.is_married = is_married;
    }
    void function1()
    {
        System.out.println("NRNA");
    }
    public static int function2()
    {
        System.out.println("WRNA");
        return 45;
    }

    public void function3(String name)
    {
        System.out.println("WANR");
        System.out.println("The person name is " + name);
    }

    public static String function4(String address)
    {
        System.out.println("WAWR");
        System.out.println("The Address is " +address);
        return "Hello";
    }

    void display()
    {
        System.out.println("Person name is " +name);
        System.out.println("the address is " +address);
    }

    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person("Arul");
        Person obj3 = new Person("Arul", 35, "123 main st");
        obj1.function3("JK");
        obj1.function2();
        obj1.function4("123 main road");
        obj3.display();
    }
}