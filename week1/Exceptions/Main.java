

public class Main {
    public static void main(String[] args){
        int[] numbers = {5, 10, 50, 0, 2};

        // Use a for loop to divide 100 by each number and print the quotient
        for ( int i =0; i < numbers.length; i++) {
            try {
                System.out.println(100 / numbers[i]);
            }
             catch (Exception e) {
                if (numbers[i] == 0) {
                    System.out.println("Cannot divide by zero");
                }
            }
        }
        // Use a try/catch block to prevent a crash due to a zero division error (ArithmeticException)
        // Handle the exception by printing 'Cannot divide by zero.'

    }
}