package arrayintro;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,9,1,11};
        boolean swap = false;
        int lengthOfArray = arr.length;
        for (int i = 0; i<lengthOfArray-1; i++) {
            for (int j = 0; j<lengthOfArray-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp;
                    temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) // or we can use (swap==false)
                break;
        }
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
