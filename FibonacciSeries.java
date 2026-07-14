public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        int n = 10;
        int first = 0;
        int second = 1;
        int temp;

        for(int i = 0; i < n; i++) {
            System.out.print(first + " ");
            temp = first + second;
            first = second;
            second = temp;
        }

    }

}

