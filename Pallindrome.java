public class Pallindrome {

    public static void main(String[] args) {
        
        int target = 12321;

        int temp = target;
        int reversedNumber = 0, reminder;

        while (temp != 0) {

            reminder = temp % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            temp = temp / 10;

        }

        if (target == reversedNumber) {
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not A Pallindrome");
        }

    }

}