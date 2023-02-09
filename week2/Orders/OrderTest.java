import java.util.ArrayList;
public class OrderTest {
    public static void main(String[] args) {
    
        // Menu items
        Item fries = new Item();
        fries.name = "fries";
        fries.price = 2.5;

        Item doubleDouble = new Item();
        doubleDouble.name = "double-double";
        doubleDouble.price = 4.5;

        Item milkshake = new Item();
        milkshake.name = "milkshake";
        milkshake.price = 2.0;

        Item animalFries = new Item();
        animalFries.name = "animal fries";
        animalFries.price = 3.5;
    
        // Order variables -- order1, order2 etc.
        Order stephsOrder= new Order();
        stephsOrder.name = "steph";
        System.out.println(stephsOrder); //shows the object in memory
        System.out.println(stephsOrder.total); // default is 0.0
        Order marcsOrder = new Order();
        marcsOrder.name = "marc";
        Order limasOrder = new Order();
        limasOrder.name = "lima";
        Order jazzysOrder = new Order();
        jazzysOrder.name = "jazzy";

        marcsOrder.items.add(fries);
        marcsOrder.total += fries.price;
        String output =String.format("%s %s", marcsOrder.items.get(0).name, marcsOrder.total);
        System.out.println(output);

        limasOrder.items.add(milkshake);
        limasOrder.total += milkshake.price;
        String limaOutput = String.format("%s %s", limasOrder.items.get(0).name, limasOrder.total);
        System.out.println(limaOutput);

        marcsOrder.ready = true;
        if ( marcsOrder.ready) {
            System.out.println("Hey Marc your " + marcsOrder.items.get(0).name + " order is ready");
        }
        
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
