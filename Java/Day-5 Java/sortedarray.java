/*to check whether an array is sorted or not*/
public class sortedarray {
    public static void main(String[]args){
        int[] arr={12,23,67,11,10,67,34,20};
        boolean ascending= true;
        boolean descending=true;
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                ascending=false;
            }
             if(arr[i]< arr[i+1]){
                 descending=false;
             }
        }
        if(ascending){
            System.out.println("The array is in asscending order");
        }             
        else  if(descending){
            System.out.println("The array is in descending order");
        }
        else{
            System.out.println("NOT SORTED");
        }
    }

}
