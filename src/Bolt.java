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
 * @author stenzell
 * @version 1.0
 */
public class Bolt implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    public double getCost(){
        double cost = USD_MULTIPLIER*diameterInches*lengthInches;
        return cost;
    }

    public String getName(){
        String name = diameterInches + "x" + lengthInches + " bolt";
        return name;
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER*Math.pow(diameterInches, 2)*lengthInches;
        return weight;
    }

    public void printBillOfMaterials(){
        final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
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
