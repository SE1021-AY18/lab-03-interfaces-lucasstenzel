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
 * @author stenzell
 * @version 1.0
 */
public class SheetMetal implements Part {
    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;

    public double getCost(){
        double cost = USD_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
        return cost;
    }

    public String getName(){
        String name = lengthInches +"x"+ widthInches +"x"+ thicknessInches + " sheet";
        return name;
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
        return weight;
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

    /**
     * Constructor for a SheetMetal Part
     * @param lengthInches The length of the SheetMetal
     * @param widthInches The width of the SheetMetal
     * @param thicknessInches How thick the SheetMetal is
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }
}
