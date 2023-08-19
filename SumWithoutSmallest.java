package ProblemE7_4;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class SumWithoutSmallest {
    public double sumWithoutSmallest(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size :");
        int length= sc.nextInt();
        System.out.println("enter array element :");
        double array[]=new double[length];
        for(int i=0;i<length;i++){
            array[i]= sc.nextDouble();
        }
        double sum=0;
        Arrays.sort(array);

        for(int i=1;i<length;i++){
         sum=sum+array[i];
     }
     return sum-array[0];
    }

}
