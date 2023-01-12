package Arrays;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class SingleAndMultidimentional
{
    public static void main(String[] args){

        // 1D array creation a and printing value using foreach loop
        //bydefault it will give '0'(zero) default calue of int as we haven't intialize arrqay
        int[] a = new int[4];
        for(int arr: a){
            System.out.println(arr);

        }

        //traversing 1d array with elements having value; via for loop

        for(int i=0; i<a.length;i++){
            a[i] = i+1;
            System.out.println(a[i]);

        }

        //traversing 2D array and creating them
        // 2D arrays have referneces to 1D array and 1D array at last holds the value

        int [][] b = new int[2][3];
        for (int i=0;i<b.length;i++){
            for(int j=0; j<b[i].length;j++){
                b[i][j]=i+j;
                System.out.println(b[i][j]);
            }

        }

        //traversing 3D array and creating them
        // 3D arrays have referneces to 2D array, then 2D arrays have refrences to 1D
        // and 1D array at last holds the value

        int [][][] threeDim = new int[3][2][2];

        for(int i=0;i<threeDim.length;i++){
            for(int j=0;j<threeDim[i].length;j++){
                for (int k=0;k<threeDim[j].length;k++){
                    threeDim[i][j][k]= i+j+k;
                    System.out.println(threeDim[i][j][k]);
                }
            }
        }


    }
}
