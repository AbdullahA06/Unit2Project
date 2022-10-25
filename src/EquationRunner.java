import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args){

    // used to collect user input, more specfically the coordinate points
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first set of coordinate points: ");
    String coord1 = input.next();

    Scanner input2 = new Scanner(System.in);
    System.out.print("Enter your second set coordinate points: ");
    String coord2 = input.next();
    System.out.println();

    // sets up the new Linear Equation object, which initializes the instance variables and allows for all the methods to run.
    LinearEquation first= new LinearEquation(LinearEquation.findX(coord1),LinearEquation.findY(coord1),LinearEquation.findX(coord2),LinearEquation.findY(coord2));

    //prints out and displays all the important information of the line
    System.out.println(first.toString());

    // collects user input for a new point on the line
    Scanner input3 = new Scanner(System.in);
    System.out.print("Enter a x value for the corresponding point on the line: ");
    double x = input.nextDouble();

    // calls the method that prints out and does the math for the new point
    first.finalEquation(x);





}
}