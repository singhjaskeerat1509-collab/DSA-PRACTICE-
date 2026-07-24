/*sum of numbers occuring in the table of 8*/

public class sumoftables {
    public static void main(String[] args){
            int n=8;
            int i=0;
            int table = 0;
            while(i<=10) {

                table=table+(n*i);
                i++;

            }
        System.out.println("sum of all occuring is:"+table);


    }

}
