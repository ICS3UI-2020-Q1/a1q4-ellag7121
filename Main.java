import java.util.Scanner;
/**
 * asks the user for two grid coordinates and returns the slope of the line connecting them
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    double x1; //the first x coordinate
    double y1; //the first y coordinate
    double x2; //the second x coordinate
    double y2; //the second y coordinate
    double slope; //the slope of the line

    //get user input
    System.out.println("Please enter in the x coordinate of the first point"); //ask user for x1
    x1 = input.nextDouble(); //store first in x1
    System.out.println("Please enter in the y coordinate of the first point"); //ask user for y1
    y1 = input.nextDouble(); //store first in y1
    System.out.println("Please enter in the x coordinate of the second point"); //ask user for x2
    x2 = input.nextDouble(); //store second x in x2
    System.out.println("Please enter in the y coordinate of the second point"); //ask user for y2
    y2 = input.nextDouble(); //store second y in y2

    //calculate slope
    slope = (y2 - y1)/(x2 - x1); //use the slope formula on the two points, and store them in the slope variable

    //tell the user the slope of their line
    System.out.println("The slope of your line would be " + slope + ".");
  }
}
