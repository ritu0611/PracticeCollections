package Interview;

public class subarrayLargestSum {
    /**
     *
     * Efficient Approach: Kadane’s Algorithm
     *
     * 1) Define two-variable
     *  - currSum which stores maximum sum ending here and
     *  - maxSum which stores maximum sum so far.
     *
     * 2) Initialize
     *  - currSum with 0 and
     *  - maxSum with INT_MIN.
     *
     * 3) Now, iterate over the array
     * and add the value of the current element to currSum and
     * check
     *
     * 3-i)
     * If currSum is greater than maxSum,
     *  -> update maxSum equals to currSum.
     *
     * 3-ii) If currSum is less than zero,
     *  -> make currSum equal to zero.
     *
     * 4)Finally, print the value of maxSum.
     * **/

    public static void main(String[] args) {

        int a[] = {1, 3, 8, -2, 6, -8, 5};
        System.out.print(largestSubarray(a,7));
    }

    public  static int largestSubarray(int a[], int arrLength){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<arrLength-1;i++){
            currSum = currSum + a[i];
        }

        if (currSum>maxSum){
            maxSum = currSum;}
        if (currSum<0){
            currSum=0;}

        return maxSum;
    }

}
