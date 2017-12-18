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
 * @author stenzell
 * @version 1.0
 */
public class Duplicate implements Part {
    private final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
    private Part identicalPart;
    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95; //comment here
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");

    public Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    public double getCost(){
        double cost = identicalPart.getCost() * numDuplicates;
        if(numDuplicates>=USD_THRESHOLD1 && numDuplicates<USD_THRESHOLD2) {
            cost = cost * REDUCTION_FACTOR1;
        } else if(numDuplicates>=USD_THRESHOLD2){
            cost = cost*REDUCTION_FACTOR2;
        }else{
            cost = cost;
        }
        return cost;
    }

    public String getName(){
        String name = numDuplicates + " " + identicalPart.getName() +"s";
        return name;
    }

    public double getWeight(){
        double weight = identicalPart.getWeight() * numDuplicates;
        return weight;
    }

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
