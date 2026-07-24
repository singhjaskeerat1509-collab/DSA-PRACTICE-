/*print table of 10 in reverse order*/

public class tableinreverse {
    public static void main(String[] args) {
        int n = 10;
        int i = 10;
        int table;
        while (i >= 0) {
            table = n * i;
            System.out.println(n + "x" + i + ":" + table);
            i--;
        }
    }
}