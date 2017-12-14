import java.text.DecimalFormat;

public class Duplicate implements Part {
    private final DecimalFormat costFormat = new DecimalFormat("$#,###.00");
    private Part identicalPart;
    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private final DecimalFormat weightFormat = new DecimalFormat("0.0");

    public Duplicate(Part identicalPart, int numDuplicates){

    }

    public double getCost(){
        // TODO: 12/14/2017 add reduction rate and numDuplicates
        double cost = identicalPart.getCost();
        return cost;
    }

    public String getName(){
        String name = ""+ numDuplicates + identicalPart.getName() +"s";
        return name;
    }

    public double getWeight(){
        double weight = numDuplicates * identicalPart.getWeight();
        return weight;
    }

    public void printBillOfMaterials(){
        System.out.println("Duplicate stuff...");
    }
}
