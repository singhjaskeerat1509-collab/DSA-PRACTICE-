import java.util.Scanner;

public class coverttolowercase {
    public static String toLower(String answer){
        return answer.toLowerCase();
    }

    public static void main(String[] args){
        System.out.println("Enter your sentence to be converted to lower case:");
        Scanner sc=new Scanner(System.in);
         String a=sc.nextLine();
          String result=toLower(a);
        System.out.println("Your word in lower cases will be:");
        System.out.println(result);


    }

}
