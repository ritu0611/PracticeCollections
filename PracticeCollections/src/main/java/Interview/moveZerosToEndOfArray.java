package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZerosToEndOfArray {



    /**
     * Move all zeroes to end of array
     *
     *    input - "3,6,1,11,32,0,4,0,22,15,7"
     *
     * output should be - "3,6,1,11,32,4,22,15,7,0,0"
     * */

    /**
     *
     * Traverse the given array ‘arr’ from left to right. While traversing, maintain count of non-zero elements in array.
     * Let the count be ‘count’. For every non-zero element arr[i], put the element at ‘arr[count]’ and increment ‘count’.
     * After complete traversal, all non-zero elements have already been shifted to front end and ‘count’ is set as index of first 0.
     * Now all we need to do is that run a loop which makes all elements zero from ‘count’ till end of the array.
     *

    **/

    public static void main(String[] args) {

        int []inputArr = new int[]{3,6,1,11,32,0,4,0,22,15,7};
        int length = inputArr.length;

        pushZeroToEnd(inputArr,length);

        for (int j=0; j<length;j++){
            System.out.println(inputArr[j]+ "");
        }

    }

    public static void pushZeroToEnd(int []arr, int arr_Len){

        int count = 0; // count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for(int i =0;i<arr_Len;i++)
            if (arr[i]!=0)
                arr[count++]=arr[i]; // incrementing a count after inserting the nonzero element at count's index

            // Now all non-zero elements have been shifted to
            // front and 'count' is set as index of first 0.
            // Make all elements 0 from count to end.

            while (count<arr_Len){
                arr[count++] = 0;
            }

    }
}
