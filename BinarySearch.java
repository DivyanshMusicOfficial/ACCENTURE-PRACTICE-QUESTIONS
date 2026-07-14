
import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
        
        int[] array = {15, 3, 7, 17, 11, 53, 57, 79, 87, 13, 37, 113, 19, 29};
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

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

        System.out.println();

        int start = 0;
        int mid;
        int end = array.length - 1;

        while(start <= end) {
            mid = (start + end) / 2;

            if(array[mid] == target) {
                System.out.println("Found Target at index: " + mid);
                break;
            }
            
            else if(array[mid] < target) {
                start = mid + 1;
            }
            
            else if(array[mid] > target) {
                end = mid - 1;
            }
            else {
                System.out.println("Target not found");
                break;
            }
        }
    }

}