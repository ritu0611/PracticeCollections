package Lists;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class enumerationCursors {
    public static void main(String[] args){

        // Check whether number is Prime or not

        /*
        * Enumeration is used only by legacy classes in Collection framework; i.e Vector
        * Enumeration has only Read Access; we cannot perform add/ remove operation
        * Enumeration is Interface so we can't directly instantiate
        * Enum is different than Enumeration
        * Enum is datatype and Enumeration is CUrsor

*
* Enum in Java is a data type which contains a fixed set of constants.
* It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) ,
* directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL),
* colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. According to the Java naming conventions,
* we should have all constants in capital letters. So, we have enum constants in capital letters.
* We cannot remove any objects in enumeration*/

        boolean isPrime = false;
        Vector numsV = new Vector();

        System.out.println("Enter the elements : ");

        for(int i=0;i<4;i++)
        {
            Scanner sc = new Scanner(System.in);
            Integer data = sc.nextInt();
            numsV.addElement(data);
        }

        System.out.println("Input given by user is " +numsV);

        Enumeration e = numsV.elements(); // creating enumeration using vector method . elements()

        while(e.hasMoreElements()) {

            Integer element = (Integer) e.nextElement();
            for(int j=2; j<=element/2;j++) {
                if (element % j == 0) {
                    isPrime=true;
                    break;
                }
            }
            if(!isPrime)
                System.out.println("Number is Prime Number: " + element);
            else
                System.out.println("Number is not Prime Number: " + element);
        }


    }

}
