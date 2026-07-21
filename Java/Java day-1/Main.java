import java.util.*;
public class Main {
  public static String Intro(String input){
    return "Dear "+input+",Thanks a lot";
  }
  public static void main(String[] args){
    System.out.println("Enter your name");
    Scanner sc = new Scanner(System.in);
    String a=sc.nextLine();
    String result=Intro(a);
    System.out.println(result);


  }
}

