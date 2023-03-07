
public class Recursion {

  public void HelloWorld() {
  System.out.println("Hello World");
  HelloWorld();
  }

  public int sumNums(int num) {
    int sum = 0;
    for(int i =0; i <= num; i++) {
      sum += i;
    }
    return sum;
  }

  public int recNums(int num) {
    if (num == 1) {
      return 1;
    }
    return num + recNums(num-1);
  }

  public int factorialFor(int num) {
    int result = 1;
    for (int i =1; i <=num; i++) {
      result *= i;
    }
    return result;
  }

  public int factorialRec(int num) {
    if (num ==1) {
      return 1;
    }
    return num * factorialRec(num -1);
  }

   public String reverseString(String str)
    {
      System.out.println(str);
        if (str.isEmpty()){
            return str;
        }
        //Calling Function Recursively
        // System.out.println(str.substring(1));
        // System.out.println(str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
    }
  public static void travelR(int travel, int distance) {

      if (travel < distance) {
          System.out.println("you have traveled " + travel + " miles");
          // travel++;
          travelR(++travel, distance);
      }
      else {
        System.out.println("I'm done traveling!");
      }
    }
    
}