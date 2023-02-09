import java.util.ArrayList;
// Change the program to utilize exception handling to print out the error messages, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.
public class Main {
    public static void main (String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
            for(int i = 0; i < myList.size(); i++) {
                try {
                    Integer castedValue = (Integer) myList.get(i);
                    System.out.println(castedValue);
                }
                catch (Exception e) {
                    System.out.println("Errored out at this index " + i + " with the following value " + myList.get(i));
                    System.out.println(e);
            }
        }
        

    }
}