package ProblemE7_2;

import java.util.Scanner;

public class ArrayWithRandomNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=10;
        int array[]=new int[length];
        System.out.println("enter array numbers : ");
        for (int i=0;i<length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("array element at even position :");
        for (int i=0;i<10;i++){
            if(i%2==0) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();

        System.out.println("every even element of array are :");
        for(int i=0;i<length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();

        System.out.println("array element in reverse order :");
        for(int i=9;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println("array first and last element are :");
            System.out.print(array[0]+" "+array[length-1]);
    }
}
