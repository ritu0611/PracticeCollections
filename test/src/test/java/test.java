import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        //reverse string without SBR

        String s = "interview";

        System.out.println("Reversed String is: " +reverseString(s));


        // find a second highest in array

        int arr[] = {12,35,1,10,33};
        int n = arr.length;
        secondLargest(arr,n);
    }

    public static String reverseString(String input){

        if(input==null | input.length()<1){
            //System.out.println("String is empty");
            return input;
        }
        else
        return reverseString(input.substring(1))+input.charAt(0);
    }

    public  static  void secondLargest(int[] arr, int arr_Size){

        int first, second;

        if(arr_Size<2){
            System.out.println("Minimun array should have 2 elements");
            return;
        }

        Arrays.sort(arr);

        for (int i=arr_Size-2;i>=0;i--){
            if(arr[i]!=arr[arr_Size-1]){

                System.out.println("Second largest element is: " +arr[i]);
                return;
            }

        }

    }

}
