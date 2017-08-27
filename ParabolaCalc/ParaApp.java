import java.util.Scanner;
/**
 * UI to display Est area of parabola using rectangles and delta from actual, the slope of the tangent line
 * or Y coordinate for a given X value.
 * 
 * @author  Kip Tatum
 * @version 2016-07-07
 */
public class ParaApp{
    
    public static void main(String[] args){
        int menuChoice;
        do{

            System.out.println("\n\nParabola Calculations Menu");
            System.out.println("1. Calculate area estimates");
            System.out.println("2. Find the slope of the tangent line at a given X");
            System.out.println("3. Find Y for a given X");
            System.out.println("4. Exit the program");

            //Scanner and get the user input
            Scanner conIn = new Scanner(System.in);
            System.out.print("\nEnter your choice: ");
            //check to make sure we have integer choice
            while (!conIn.hasNextInt()){
                conIn.next();
                System.out.println("\nParabola Calculations Menu");
                System.out.println("1. Calculate area estimates");
                System.out.println("2. Find the slope of the tangent line at a given X");
                System.out.println("3. Find Y for a given X");
                System.out.println("4. Exit the program");

                System.out.print("\nEnter your choice: ");
            }
            
            menuChoice = conIn.nextInt();
            if (menuChoice == 1){
                System.out.print("\nEnter the minimum number are rectangles you need: ");
                int minN = conIn.nextInt();
                System.out.print("Enter the maximum number are rectangles you need: ");
                int maxN = conIn.nextInt();
                System.out.print("Enter the incriment would you like to use: ");
                int inc = conIn.nextInt();
                int numRect=minN;
                double sumRect = 0;
                for (int i = minN; i <= maxN; i+=inc){
                    
                    System.out.println("The estimated area of the parabola using " +(numRect)+ 
                        " rectangles is "+ParaCalc.areaEst(maxN, inc, numRect));
                    numRect+=inc;
                }
            }

            else if (menuChoice == 2){
                System.out.println("Please enter a coordinate value for X: ");
                double x = conIn.nextDouble();
                while (x <0 || x >5){
                    System.out.print("Please enter a valid value between 0 and 5 inclusive: ");
                    x = conIn.nextDouble();
                }
                System.out.print("The slope of your parabola is: "+ParaCalc.formSlope(x));
            }

            else if (menuChoice == 3){
                System.out.println("Please enter a coordinate value for X: ");
                double x = conIn.nextDouble();
                while(x < 0 || x > 5){
                    System.out.print("Please enter a valid value between 0 and 5 inclusive: ");
                    x = conIn.nextDouble();
                }
                System.out.print("The y coordinate for the given X value is: "+ParaCalc.getYCoordinate(x));
            }

        }while (menuChoice != 4);
        System.out.println("\n\nGoodbye");

    }
}
