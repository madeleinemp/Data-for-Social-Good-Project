import java.util.Scanner;

  /**
   User Story: “As a baker, I want to analyze a pastry data set so I can find the most 
   popular pastry, how expensive it is, and how much was bought of said pastry.”
  **/

public class UserStory {

  private Pastry[] pastries;

  /**
   Parameterized constructor
  **/

  public UserStory (String articleFile, String priceFile, String quantityFile){
    this.pastries = createPasteries(articleFile, priceFile, quantityFile);
  }

  /**
    Creating the 1D array called "pastriesArray", which stores the information from the 
    quantity.txt, article.txt, and price.txt
  **/
  
  public Pastry[] createPasteries(String articleFile, String priceFile, String quantityFile){
    String [] article = FileReader.toStringArray(articleFile);
    double [] price = FileReader.toDoubleArray(priceFile);
    int [] quantity = FileReader.toIntArray(quantityFile);
    Pastry[] pastriesArray = new Pastry[article.length];
     for (int i = 0; i<article.length; i++){
      pastriesArray[i] = new Pastry(article[i], price[i], quantity[i]);
    }
    return pastriesArray;
  }


  /**
    A method called "findMostPopular" which traverses through the pastriesArray to 
    find the pastry with the greatest quantity and return the info from each txt 
    associated with the index number
  **/
  
 public Pastry findMostPopular() {
    Pastry maxPastry = pastries[0];
        for (int i = 1; i < pastries.length; i++) {
            if (pastries[i].getQuantity() > maxPastry.getQuantity()) {
                maxPastry = pastries[i];
      }
    }
    return maxPastry;
  }
  
  /**
   toString() method
  **/

  public String toString() {
     Pastry most = findMostPopular();
     return "Most popular pastry\n____________\n" + most;
  }  

  






  
}