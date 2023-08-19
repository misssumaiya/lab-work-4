package ProblemE7_8;

import java.util.Random;

public class RandomPermutation {
    public static void main(String[] args) {
        Random generator = new Random();
        int permutation[] = new int[10];
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int arraySize = array.length;
        for(int i=0;i<permutation.length;i++){

            int ranPos = generator.nextInt(arraySize);
            permutation[i] = array[ranPos];

            for(int j=ranPos+1;j<arraySize;j++){

                array[j-1] = array[j];
            }
            arraySize--;

        }
        printArray(permutation);

    }
    //method
    public static void printArray(int values[]){
        for(int i=0;i<values.length;i++){

            System.out.printf("%3d",values[i]);
        }
        System.out.println();

    }

}
