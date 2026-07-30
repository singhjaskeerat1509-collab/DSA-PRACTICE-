/*Porgram to reverse an array*/

public class reverseanarray {
    public static void main(String[]args ){
        int[] array= {12,23,34,45,56};
        System.out.println("The correct array is");
        for (int element:array){
            System.out.print(element+ " ");
        }
        int l=array.length;
        for(int i=0;i<l/2;i++){
             int temp=array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        System.out.println();
        System.out.println("The reverse array is");
        for (int element:array){
            System.out.print(element+" ");
        }
    }
}
