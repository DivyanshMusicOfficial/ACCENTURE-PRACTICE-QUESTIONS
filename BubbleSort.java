import java.util.Scanner;

public class BubbleSort {

    // O(n^2)
    public static void main(String[] args) {
        
        int[] array = {15, 3, 7, 17, 11, 53, 57, 79, 87, 13, 37, 113, 19, 29};

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int num : array) {
            System.out.print(num + " ");
        }

    }

}
