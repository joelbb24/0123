import java.util.*;

public class Array2DPrac
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,4,5,6},{3,7,2,6},{23,42,4,34},{21,35,56,63}};

        int[] innerSumArray = new int[4];
        

        for(int i=0; i<arr.length;i++)
        {
            int sum = 0;    
            for(int j=0; j<arr[i].length;j++)
            {
                sum = sum + arr[i][j];
            }

            innerSumArray[i] = sum;
        }

        int outerSum = 0;

        for(int i=0; i<innerSumArray.length; i++)
        {
            outerSum = outerSum + innerSumArray[i];
        }


        System.out.println("The inner sums are: ");
        for(int i: innerSumArray)
            System.out.print(i+" ");

        System.out.println();
        System.out.println("The outer sum is: "+outerSum);
    }
}
