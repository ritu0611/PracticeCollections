package Interview;

public class reverseStringusingIterativemethod {
    /*
    * Step-1 : Convert String to char array using 'tocharArray()'
    * step-2 : Iterate that char array from step-1 in reverse order using for loop
    *
    * */
    public  static void main(String args[]){
        String s = "Reverse me India";
        char[] ch = s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){

            System.out.print(ch[i]);

        }

    }
}
