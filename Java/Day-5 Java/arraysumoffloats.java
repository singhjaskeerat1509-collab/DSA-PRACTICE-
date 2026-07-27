/*Create an array of 5 floats and calculate their sum*/

public class arraysumoffloats {
    public static void main(String[] args){
      float[] array= {1.2f,2.3f,5.6f,6.7f};

      float sum=0;
      for(int i=0;i<array.length;i++){
           sum=sum+array[i];
      }
        System.out.println(sum);
    }
}
