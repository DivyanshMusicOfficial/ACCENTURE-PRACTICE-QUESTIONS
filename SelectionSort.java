public class SelectionSort {
    
    // O(n^2)
    public static void main(String[] args) {
        
        int[] array = {15, 3, 7, 17, 11, 53, 57, 79, 87, 13, 37, 113, 19, 29};

        int minIndex = -1;
        int temp = 0;

        for(int i = 0; i < array.length - 1; i++) {
            minIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for(int num : array) {
            System.out.print(num + " ");
        }

    }

}
