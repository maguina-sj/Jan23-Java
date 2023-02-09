import java.util.Arrays; //don't forget the imports
import java.util.ArrayList;
import java.text.*;
public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum += i;
        }
        return sum;
    }
//NINJA BONUS - ADD numWeeks

    public double getOrderTotal(double[] prices) {
        double total = 0; 
        for (int i = 0; i < prices.length; i++ ){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i , menuItems.get(i));
        }
    }

    // public void addCustomer(ArrayList<String>customers) {
    //     System.out.println("Please enter your name: ");
    //     String username = System.console().readLine();
    //     customers.add(username);
    //     System.out.printf("Hello %s! \n", username);
    //     System.out.printf("There are %d people in front of you \n", customers.size()-1);

    //     System.out.println(customers);
    // }
//NINJA BONUS
    // public void printPriceChart(String product, double price, int maxQuantity) {
    //     System.out.println(product);
    //     for(int i = 1; i<= maxQuantity; i++) {
    //         double newPrice = price * i;
    //         System.out.printf("%s - $%.2f \n", i,  newPrice);
    //     }
// SENSEI BONUS
    public void printPriceChart(String product, String pattern, double price, int maxQuantity) {
    DecimalFormat myFormatter = new DecimalFormat(pattern);
    System.out.println(product);

    for(int i = 1; i<= maxQuantity; i++) {
        String output = myFormatter.format(price * i);
        double newPrice = price * i;
        // System.out.printf("%s - $%.2f \n", i,  newPrice);
        System.out.println(i + "  " + output );
        }
    }

//SENPAI BONUS
    public void printPriceChart(String product, double price, int maxQuantity) {
    System.out.println(product);
    double discount = 0;
    double total = 0;
    double discountedTotal = 0;
    for(int i = 1; i<= maxQuantity; i++) {
        total = price *i;
        if (i > 1) {
            discount += .5;
            discountedTotal = total -discount;
        }
        else {
            discountedTotal = total;
        }
        System.out.printf("%s - $%.2f \n", i,  discountedTotal);
        }
    } 
}