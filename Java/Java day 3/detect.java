import java.util.Scanner;
public class detect {
    public static void main(String[]args){
        System.out.println("Enter the name of website you want to check");
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b=a.toLowerCase();
        if(b.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (b.endsWith(".org")) {
            System.out.println("This is an organisational website");
        } else if (b.endsWith(".in")) {
            System.out.println("This is a Indian Website");
        }
        else {
            System.out.println("This is not in the identified set of databases");
        }
    }


}
