//import java.util.*;
/**
 * Write a description of class ParaCalc here.
 * 
 * @author  Kip Tatum 
 * @version 2016-07-07
 */
public class ParaCalc
{
    public static final int MIN_X = 0;
    public static final int MAX_X = 5;
    public static final double AREA = 0.0;

    /**
     * Area Estimation
     *
     * @param   minN   minimum number of rectangles
     * @param   maxN   maximum number of rectangles
     * @param   i      incriment of rectangles
     * @return  area   sum of area of all rectangles
     */
    public static double areaEst(int maxN, int inc, int numRect)
    {
        // double sum = 0.0;
        double x = 0;
        double area = 0;
        double sum = 0.0;
        
        for (double i = x; i<=numRect; i++){
            
            area = (-(x*x) + 25)*(MAX_X/numRect);
            x+=1;
            //System.out.print(area);
            sum+=area;

        }
        return sum;
    }


    /**
     * Get Y coordinate
     *
     * @param  x   x-coordiante
     * @return y   y-coordinate
     * @throws     IllegalArgumentException if X < 0 or > 5
     */
    public static double getYCoordinate(double x)
    {
        if (x < 0 || x > 5){
            throw new IllegalArgumentException("Value X must be between 0 and 5 inclusive.");
        }
        return -(x*x)+25;
    }


    /**
     * Get parabola slope
     *
     * @param  x      x coordinate
     * @return slope  slope of parabola
     */
    public static double formSlope(double x){
        if (x < 0 || x > 5){
            throw new IllegalArgumentException("Value X must be between 0 and 5 inclusive.");
        }
        return -2*x;
    }

    /**
     * Test calculation

     */
    public static void testCalculations()
    {
        double input, expected, result;
        System.out.println("\n\nCalculation tests will start here.");
        input = 4.0; expected = 9.0; result = getYCoordinate(input);
        if (result != expected) System.out.println("getYCoordinate failed to get proper result "+ input +" ; expected "+ expected+ ", but got "+result);
        input = 2.5; expected = -5.0; result = formSlope(input);
        if (result != expected) System.out.println("getYCoordinate failed to get proper result "+ input +" ; expected "+ expected+ ", but got "+result);
        //input = 4.0; expected = 9.0; result = getYCoordinate(input);
        //if (result != expected) System.out.println("getYCoordinate failed to get proper result "+ input +" ; expected "+ expected+ ", but got "+result);
        // test getYCoordinate precondition
        try{
            input = -1.0; expected = 0.0; result =  getYCoordinate(input);
            System.out.println("getYCoordinate failed to get proper result "+ input +" ; expected "+ expected+ ", but got "+result);
        }
        catch (IllegalArgumentException e) {
            // expected behavior
        }
        //test forSlope precondition
        try{
            input = -1.0; expected = 0.0; result =  formSlope(input);
            System.out.println("formSlope failed to get proper result "+ input +" ; expected "+ expected+ ", but got "+result);
        }
        catch (IllegalArgumentException e) {
            // expected behavior
        }
        
        System.out.println("Calculation test end here.");
        
    }
}
