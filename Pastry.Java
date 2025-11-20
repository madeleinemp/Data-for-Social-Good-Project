import java.util.Scanner;

public class Pastry {

  private String name; // name of the pastry
  private double price; // price of the pastry (in euros) 
  private int quantity; // the total amount bought in the store

  /**
   Parameterized constructor
  **/
  
  public Pastry(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  /**
   get methods
  **/
  
  public String getName(){
    return name;
  }

  public double getPrice(){
    return price;
  }

  public int getQuantity(){
    return quantity;
  }

  /**
   toString() method
  **/

  public String toString() {
    return "\nName: " + name + "\nPrice: $" + price + "\nAmount bought: " + quantity;
  }

}