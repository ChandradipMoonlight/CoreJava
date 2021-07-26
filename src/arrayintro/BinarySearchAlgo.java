package arrayintro;
import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,4,5,6,7,8,9,10,11,13};
        System.out.print("Enter the element to be searched: ");
        int value = input.nextInt();
        int leftIndex = 0, rightIndex = arr.length-1, midIndex;
        int index = -1;

        while (leftIndex<=rightIndex) {
            midIndex = leftIndex + (rightIndex-leftIndex)/2;
            if (arr[midIndex]>value)
                rightIndex = midIndex - 1;
            else if (arr[midIndex]<value)
                leftIndex = midIndex + 1;
            else {
                index = midIndex;
                break;
            }
        }
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at Index: "+ index);
    }
}
