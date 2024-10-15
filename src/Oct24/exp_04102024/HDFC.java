package Oct24.exp_04102024;

public class HDFC {
 String Customer_Name;
 int Customer_ID;
 String City;
 String Bank_Name;
 String Branch_Name;
 int Account_Number;
 String Account_Type;
//defualt constructor
 HDFC(){
  System.out.println("I will called when object is created");
 }
 //parameterized constructor
 HDFC(String Customer_Name){
  System.out.println("Hi, Do you need any help");
  this.Customer_Name = Customer_Name;
 }
//methods
 int Withdraw(){
  System.out.println("Hi, Do you want to Withdraw money?");
  return 5000;
 }

 int Deposit(){
  System.out.println("Hi, Do you want to deposit money?");
  return 10000;
 }

 int interest(){
  System.out.println("Interest rate");
  return 8;
 }


}
