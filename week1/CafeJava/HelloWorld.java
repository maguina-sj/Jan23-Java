
public class HelloWorld {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        // Create 3 more drink price variables, for drip coffee, latte and cappuccino following the same camel case naming convention.
        double mochaPrice = 3.5;
        double dripCoffee = 3.0;
        double latte = 4.5;
        double cappuccino = 4.0;
    
        // Customer name variables (add yours below)
        // Create 3 more customer variables for Sam, Jimmy and Noah, following the same variable naming convention in the example.
        String customer1 = "Cindhuri";
        String customer2 = "Sam ";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        // Create the order status flag (true/false) for each customer, following the variable naming convention in the example.
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false; 
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(customer1 + pendingMessage);
        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);        
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(customer2 + displayTotalMessage + (latte * 2));
        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);     
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }
        // Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println("Sorry for the mistake! Here's your change $" + (latte - dripCoffee));
        // 

    }
}
