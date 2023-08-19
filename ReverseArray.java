package ProblemE7_1;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("enter array elements ");
        Scanner sc=new Scanner(System.in);
        int length=10;
        int arrayValues[]=new int[length];
        for(int i=0;i<length;i++){
            arrayValues[i]=sc.nextInt();
        }
        System.out.println("reverse elements :");
        for(int i=length-1;i>=0;i--){
            System.out.print(arrayValues[i]+" ");
        }
    }
}
