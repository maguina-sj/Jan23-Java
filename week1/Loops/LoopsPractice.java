
public final class LoopsPractice {
    
    public static void main(String[] args){
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Use a for loop to print all odd numbers on the same line
        // Expected output: 13579
        for (int i =0; i< numbers.length; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
            }
        }

    }

}