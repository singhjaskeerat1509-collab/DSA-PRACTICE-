/*To find maximum element in a given array*/
import java.util.*;
public class maximumelement {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 36, 56, 90, 13};
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element of an array is:" + max);
    }
}
