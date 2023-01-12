package basics;

public class swapTwoNos {
    public static void main(String[] args) {
        swap(20,10);
        swapWithoutThirdVariable(30,40);
    }

    public static void swap(int x, int y){

        int temp=x;
        x=y;
        y=temp;
        System.out.println("Swapped numbers are " +x  +" and " +y);


    }

    public static void swapWithoutThirdVariable(int a, int b){
        a = a-b; //30-40 = -10
        b = a+b;//-10 +40 =30
        a = b-a;//30-(-10) = 40
        System.out.println("Swapped numbers without third variable is " +a  +" and " +b);
    }

}

