import java.lang.StringBuilder;

public class Solution {
  static String toCamelCase(String s) {
    StringBuilder finalString = new StringBuilder();

    for (int i =0; i < s.length(); i++) {
      if (s.charAt(i) == '-' || s.charAt(i) == '_') {
        System.out.println(s.charAt(i));

        finalString.append(Character.toUpperCase(s.charAt(i + 1)));
        i++;
      } else {
        finalString.append(s.charAt(i));
      }
    }
    return finalString.toString();
  }

  // static String toCamelCaseAgain(String s) {
  //   StringBuilder finalString = new StringBuilder();

  //   for (String str:s) {
  //     if (s.charAt(i) == '-' || s.charAt(i) == '_') {
  //       System.out.println(s.charAt(i));

  //       finalString.append(Character.toUpperCase(s.charAt(i + 1)));
  //       i++;
  //     } else {
  //       finalString.append(s.charAt(i));
  //     }
  //   }
  //   return finalString.toString();
  // }

  public static int findIt(int[] a) {
    // counter for occurrences
    //keep track of # of ocurrences of a number
    int counter = 0;
    //iterate through the array
    for (int i =0; i < a.length; i++) {
      for (int j =0; j < a.length; j++ ) {
        if (a[i] == a[j]) {
          counter++;
        }
    //check occurrences for the odd one out
        }
        if (counter %2 != 0) {
    // return the number associated with the odd number of occurrences
          return a[i];
      } 
    }
      return 0;

  }
}