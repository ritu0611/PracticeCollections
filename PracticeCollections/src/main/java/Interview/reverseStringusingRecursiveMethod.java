package Interview;

public class reverseStringusingRecursiveMethod {

    /*
    Step-1 : First, remove the first character from the string and
    append that character at the end of the string.
   Step-2: Repeat the above step until the input string becomes empty.

    * */

    public static String reverseString(String str){
        if((null == str) || (str.length()<=1)){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }

    public static void main(String args[]){

        String s = "ritu";

        String output = reverseString(s);

        System.out.println(output);

    }
}
