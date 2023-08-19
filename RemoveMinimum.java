package ProblemE7_5;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveMinimum {
        public void removeMinimum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size :");
            int length = sc.nextInt();
            System.out.println("enter array element :");
            double array[] = new double[length];
            for (int i = 0; i < length; i++) {
                array[i] = sc.nextDouble();
            }
            Arrays.sort(array);
            System.out.println("array element without minimum :");

            for (int i = 1; i < length; i++) {

                System.out.println(array[i]);
            }
        }

    public static void main(String[] args) {
        RemoveMinimum removeMin=new RemoveMinimum();
        removeMin.removeMinimum();
    }
    }

