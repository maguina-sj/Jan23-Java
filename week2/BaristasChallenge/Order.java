import java.util.ArrayList;

public class Order {

  private String name; 
  private boolean ready;
  private ArrayList<Item> items;

  public void Order() {
    this.name = "Guest";
    this.items = new ArrayList<Item>();
  }
  public void Order(String name) {
    this.name = name;
    his.items = new ArrayList<Item>();
  }

  public String getName() {
    return this.name;
  }

  public void setName() {
    this.name = name;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public String getStatusMessage() {
    
  }
}