import java.util.Scanner;


public class encrypt {
    public static void main(String[] args) {
        System.out.println("enter your grade to be encrypted:");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char c = (char) (a + 8);

        System.out.println("here is your encrypted:");
        System.out.println(c);
        System.out.println("press D for decryption:");
        Scanner st = new Scanner(System.in);
        char b = st.next().charAt(0);
        if (b == 'D' || b == 'd') {
            System.out.println("here is decrypted:");
            char decrypted = (char) ( c -8);
            System.out.println(decrypted);
        }
        else{
            System.out.println("wrong input!Try Again");
        }
    }
}
