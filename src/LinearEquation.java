import java.io.PrintStream;


public class LinearEquation {
    // all my instance variables -- uninitialized ones are for each part of the two coordinate points -- z is used for math to make sure no integer division happens
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double z= 1.0;

    // constructor used for initializing the instance variables and creating new "lines"
    public LinearEquation(int x1, int y1, int x2, int y2) {
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
    }
// the next three methods are just the math for the slope, distance, and y-intercept respectively -- variables added for readability
    public double findSlope() {
        double slope = (y2-y1)*z/(x2-x1);
        return slope;
    }

    public double findDistance() {
        double distance = java.lang.Math.sqrt((y2 - y1) *z*(y2 - y1) + (x2 - x1) *1.0* (x2 - x1));
        return distance;
    }
    public double findIntercept() {
        double yIntercept= y1-((findSlope()*z*x1));
        return yIntercept;
    }

    // used to do the math on the last x value the user gives
    public void finalEquation(double x) {
        double y;
        x = Math.round(x * 100.0) / 100.0 ;
        y = findSlope()*x +findIntercept();
        y = Math.round(y * 100.0) / 100.0;
        System.out.println("Corresponding coordinate point: "+"("+x+","+y+")");



    }

// Wasn't sure if I was allowed to just make toString print out everything or if I had to make it a return statement, so I just did both

    /*public String toString() {
    System.out.println("First pair: "+ "("+x1+","+y1+")");
    System.out.println("Second pair: "+ "("+x2+","+y2+")");
    System.out.print("Slope of line: ");
    System.out.format("%.2f%n",findSlope());
    System.out.print("Y-intercept: ");
    System.out.format("%.2f%n",findIntercept());
    System.out.print("Distance: ");
    System.out.format("%.2f%n",findDistance());
    System.out.print("Slope intercept form: "+ "y= " +(y2-y1)+"/"+(x2-x1)+ " x + ");
    System.out.format("%.2f%n",findIntercept());
    return;
    }*/

    public String toString() {

        return "First pair: "+ "("+x1+","+y1+")\n"
                +"Second pair: "+ "("+x2+","+y2+")\n"
                +"Slope of line: " +Math.round(findSlope() * 100.0) / 100.0 +"\n"
                +"Y-intercept: " +Math.round(findIntercept() * 100.0) / 100.0 +"\n"
                +"Distance: " +Math.round(findDistance() * 100.0) / 100.0 +"\n"
                +"Slope intercept form: " + "y= " +(y2-y1)+"/"+(x2-x1)+ " x + " +Math.round(findIntercept() * 100.0) / 100.0 +"\n";
    }








}
