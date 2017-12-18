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
 * @author stenzell
 * @version 1.0
 */
public class Assembly implements Part{
    private final DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
    private String name;
    private List<Part> subParts = new ArrayList<>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat = new DecimalFormat("0.### lbs");

    public void addPart(Part part){
        subParts.add(part);
    }

    public Assembly(String name){
        this.name = name;

    }

    public double getCost(){
        double totalCost = 0;
        for(int i = 0; i < subParts.size(); i++){
            totalCost+=subParts.get(i).getCost();
            totalCost+=USD_PER_SUB_PART;
        }
        return totalCost;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        double totalWeight = 0;
        for(int i = 0; i < subParts.size(); i++){
            totalWeight+=subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        for(int i = 0; i < subParts.size(); i++){
            System.out.println("Part: "+subParts.get(i).getName());
            System.out.println("Cost: "+ costFormat.format(subParts.get(i).getCost()));
            System.out.println("Weight: "+ weightFormat.format(subParts.get(i).getWeight()));
        }
        System.out.println("Total cost: " + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()));
        for(int i = 0; i < subParts.size(); i++){
            subParts.get(i).printBillOfMaterials();
        }
    }
}
