/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * Class for creating and keeping track of
 * Duplicates of pre-made Parts
 * and Implements the Part Interface
 * @author stenzell
 * @version 1.0
 */
public class Duplicate implements Part {
    private final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
    private Part identicalPart;
    private int numDuplicates;

    /**
     * The 5% cost discount if five to ten Duplicates are made
     */
    public static final double REDUCTION_FACTOR1 = 0.95;

    /**
     * The 10% cost discount if ten or more Duplicates are made
     */
    public static final double REDUCTION_FACTOR2 = 0.9;

    /**
     * The minimum number of Duplicates needed to get the first discount
     */
    public static final int USD_THRESHOLD1 = 5;

    /**
     * The minimum number of Duplicates needed to get the second discount
     */
    public static final int USD_THRESHOLD2 = 10;
    private final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");

    /**
     * Constructor for multiple Duplicate Parts
     * @param identicalPart The Part to make more of
     * @param numDuplicates How many copies of the Part to make
     */
    public Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    /**
     * Getter for the Duplicates' total cost,
     * based on the individual part's cost, how
     * many there are, and any reduction rates received
     * @return cost The total cost of the Duplicate Parts
     */
    public double getCost(){
        double cost;
        cost = identicalPart.getCost() * numDuplicates;
        if(numDuplicates>=USD_THRESHOLD1 && numDuplicates<USD_THRESHOLD2) {
            cost = cost * REDUCTION_FACTOR1;
        } else if(numDuplicates>=USD_THRESHOLD2){
            cost = cost*REDUCTION_FACTOR2;
        }else{
            cost = cost*1; //no Reduction Factor
        }
        return cost;
    }

    /**
     * Getter for the Duplicates' names, which
     * is created by the number of Duplicates, then
     * their names, and an "s" to make them plural
     * @return The Duplicates' names
     */
    public String getName(){
        return numDuplicates + " " + identicalPart.getName() +"s";
    }

    /**
     * Getter for the Duplicates' weights,
     * which multiplies the number of Duplicate
     * Parts by how many there are
     * @return The Duplicates' total weight
     */
    public double getWeight(){
        return identicalPart.getWeight() * numDuplicates;
    }

    /**
     * Method for creating a Bill of Materials for Duplicate
     * Parts. Starts by printing the number of Duplicates and their name,
     * followed by information on the cost and weight of each Part and then the
     * total cost of all the Duplicates.
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(numDuplicates + " " + identicalPart.getName() + "s");
        System.out.println("==========================");
        System.out.println("Duplicate part: " + identicalPart.getName());
        System.out.println("Copies: " + numDuplicates);
        System.out.println("Individual cost: " + costFormat.format(identicalPart.getCost()));
        System.out.println("Individual weight: " + weightFormat.format(identicalPart.getWeight()));
        System.out.println("Total cost: " + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()));
        identicalPart.printBillOfMaterials();
    }
}
