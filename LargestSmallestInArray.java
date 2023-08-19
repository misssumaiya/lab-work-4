package ProblemE7_3;

import java.util.Scanner;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size :");
        int length= sc.nextInt();
        System.out.println("enter array element :");
        double array[]=new double[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextDouble();
        }
        double largest=array[0];
        double smallest=array[0];
        for(int i=0;i<length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("largest number :"+largest);
        System.out.println("smallest number :"+smallest);
    }
}
