import java.util.Scanner;
public class RecursionTest {
  public static void main (String[] args) {

      // int sum = 0;
      // for (int i = 0; i <= 5; i ++) {
      //   sum += i;
      // }
      // System.out.println(sum);
    Recursion test = new Recursion();
    // System.out.println(test.sumNums(5));

    // System.out.println(test.recNums(5));

    // System.out.println(test.factorialFor(5));

    // System.out.println(test.factorialRec(5));

    // System.out.println(test.reverseString("hello"));
    // test.HelloWorld();
  
    Scanner scan = new Scanner(System.in);
    System.out.println("How far do you want me to travel? ");
    int distance = scan.nextInt();

    
    test.travelR(0,distance);
  }
}
