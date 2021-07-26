package arrayintro;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        /**
         * this is an example for selection sorting algorithm
         */
        int[] arr = {45,78,-98,-12,3,3,2,0,12,123,-456};
        int lengthOfArray = arr.length;
        for (int i = 0; i<lengthOfArray-1; i++) {
            int minIndex = i;
            for (int j = i+1; j<lengthOfArray; j++) {
                if (arr[j]<arr[minIndex]) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted Array is: "+ Arrays.toString(arr));
    }
}
