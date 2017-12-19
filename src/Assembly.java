/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for creating an Assembly, which is
 * an ArrayList of combinations of the Parts
 * and Implements the Part Interface
 * @author stenzell
 * @version 1.0
 */
public class Assembly implements Part{
    private final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
    private String name;
    private List<Part> subParts = new ArrayList<>();

    /**
     * The base cost for every Part in the Assembly
     */
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");

    public Assembly(String name){
        this.name = name;
    }

    /**
     * Method for adding more Parts to the Assembly
     * @param part The Part to be added
     */
    public void addPart(Part part){
        subParts.add(part);
    }

    /**
     * Getter for the entire Assembly's cost
     * @return The cost of all the Parts
     * of the Assembly added together,
     * plus the base cost per Part
     */
    public double getCost(){
        double totalCost = 0;
        for(Part part: subParts){
            totalCost += part.getCost();
            totalCost += USD_PER_SUB_PART;
        }
        return totalCost;
    }

    public String getName(){
        return name;
    }

    /**
     * Getter for the entire Assembly's weight
     * @return The weight of all the Parts
     * of the Assembly added together
     */
    public double getWeight(){
        double totalWeight = 0;
        for(Part part : subParts){
            totalWeight += part.getWeight();
        }
        return totalWeight;
    }

    /**
     * Formats the Assembly so that the Assembly name is printed
     * then the name, cost, and weight of each Part in it.
     * After that it prints the total cost and weight of the Parts,
     * followed by each Part's respective Bill of Materials
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        for(Part part : subParts){
            System.out.println("Part: "+ part.getName());
            System.out.println("Cost: "+ costFormat.format(part.getCost()));
            System.out.println("Weight: "+ weightFormat.format(part.getWeight()));
        }
        System.out.println("Total cost: " + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()));
        for(Part part : subParts){
            part.printBillOfMaterials();
        }
    }
}
