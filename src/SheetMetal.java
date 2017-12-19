/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * Class for creating SheetMetal with a specified
 * length, width, and thickness
 * and Implements the Part Interface
 * @author stenzell
 * @version 1.0
 */
public class SheetMetal implements Part {

    /**
     * The weight per cubic inch of SheetMetal
     */
    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;

    /**
     * The cost per cubic inch of SheetMetal
     */
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;

    /**
     * Constructor for a SheetMetal Part, which
     * has a length, width, and thickness
     * @param lengthInches The length of the Sheet
     * @param widthInches The width of the sheet
     * @param thicknessInches The sheet's thickness
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

    /**
     * Method for calculating a piece of
     * SheetMetal's cost, determined by its
     * length, width, and thickness
     * @return The price of the Part
     */
    public double getCost(){
        return USD_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
    }

    /**
     * Concatenates the SheetMetal's name using
     * its length, width, and thickness, then tells
     * us that it's a "sheet"
     * @return The SheetMetal Part's name
     */
    public String getName(){
        return lengthInches +"x"+ widthInches +"x"+ thicknessInches + " sheet";
    }

    /**
     * Method for calculating a piece of SheetMetal's
     * weight based on how many cubic inches of metal are present
     * @return The piece of SheetMetal's name
     */
    public double getWeight(){
        return LBS_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
    }

    /**
     * Formats a SheetMetal Part so that its name,
     * length, width, thickness, cost, and weight
     * are printed
     */
    public void printBillOfMaterials(){
        final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
        final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Length: " + lengthInches + " inches");
        System.out.println("Width: " + widthInches + " inches");
        System.out.println("Thickness: " + thicknessInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()));
    }

}
