//Q1. Create a class Employee with:
//
//Salary (int) — property
//getSalary() — returns int
//name (String) — property
//getName() — returns String
//setName() — changes name

class Employee{
    int Salary;
    String name;


     public int getSalary(){

        return Salary;
    }
    public  String getName(){
       return name;
    }
    public void setName(String n){
         name=n;
    }


}
public class CreateClass {
     public static void main(String[] args) {
         Employee Jaskeerat=new Employee();
         Jaskeerat.Salary=12000;
         Jaskeerat.name="Jaskeerat Singh" ;
         Jaskeerat.setName("gurjot");
         System.out.println("Salary: " + Jaskeerat.getSalary());
         System.out.println("Name: " + Jaskeerat.getName());


    }
}
