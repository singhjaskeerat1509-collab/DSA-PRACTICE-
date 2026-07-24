/*Program to print multiplication table of a given number n*/

import java.util.Scanner;
public class tableofnnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number you want multiplication table of:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int table = 0;
        while (i <= 10) {
            table = n * i;
            System.out.println(n+"x"+i+":"+table);
            i++;
        }

    }

}
