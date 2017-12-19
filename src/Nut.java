/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * Class for creating a Nut with a specific diameter
 * and Implements the Part Interface
 * @author stenzell
 * @version 1.0
 */
public class Nut implements Part {
    private double diameterInches;

    /**
     * The weight of each Nut, based on its diameter
     */
    public static final double LBS_MULTIPLIER = 0.01;

    /**
     * The cost of each Nut based on its size
     */
    public static final double USD_MULTIPLIER = 0.5;

    /**
     * Constructor for a Nut, which only depends
     * on the inner diameter
     * @param diameterInches The inner diameter of the Nut
     */
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    /**
     * Method for calculating the cost of each Nut, based
     * on its diameter
     * @return How much the Nut costs
     */
    public double getCost(){
        return USD_MULTIPLIER*diameterInches;
    }

    /**
     * Creates the Nut's name using its diameter and labeling it
     * as a Nut
     * @return The Nut's name
     */
    public String getName(){
        return diameterInches+ " inch nut";
    }

    /**
     * Calculates how much each Nut weighs
     * @return The Nut's weight
     */
    public double getWeight(){
        return LBS_MULTIPLIER * Math.pow(diameterInches, 2);
    }

    /**
     * Formats a Nut Part so that its name,
     * diameter, cost, and weight
     * are printed
     */
    public void printBillOfMaterials(){
        final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
        final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: " + diameterInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()));
    }
}
