/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * Class for creating a Bolt with a specific diameter
 * and Implements the Part Interface
 * @author stenzell
 * @version 1.0
 */
public class Bolt implements Part {
    private double diameterInches;

    /**
     * The weight of each Bolt, per cubic inch
     */
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;

    /**
     * The cost of each Bolt, based on its size
     */
    public static final double USD_MULTIPLIER = 1.00;

    /**
     * Constructor for a new Bolt Part
     * @param diameterInches The Bolt's diameter
     * @param lengthInches The Bolt's length
     */
    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    /**
     * Method for calculating how much a Bolt
     * with the given dimensions costs
     * @return The Bolt's Cost
     */
    public double getCost(){
        return USD_MULTIPLIER*diameterInches*lengthInches;
    }

    /**
     * Method that concatenates the Bolt's dimensions and the label
     * "bolt" into the Bolt's name
     * @return The Bolt's name
     */
    public String getName(){
        return diameterInches + "x" + lengthInches + " bolt";
    }

    /**
     * Calculates the Bolt's weight using its
     * diameter and length
     * @return The Bolt's weight
     */
    public double getWeight(){
        return LBS_MULTIPLIER*Math.pow(diameterInches, 2)*lengthInches;
    }

    /**
     * Formats a Bolt Part so that its name,
     * diameter, length, cost, and weight
     * are printed
     */
    public void printBillOfMaterials(){
        final DecimalFormat costFormat = new DecimalFormat("$#,##0.00"); //Not included in the URL
        final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: "+ diameterInches + " inches");
        System.out.println("Length: " + lengthInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()));
    }
}
