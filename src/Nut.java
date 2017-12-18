import java.text.DecimalFormat;

public class Nut implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;

    public double getCost(){
        double cost = USD_MULTIPLIER*diameterInches;
        return cost;
    }

    public String getName(){
        String name = diameterInches+ " inch nut";
        return name;
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER * Math.pow(diameterInches, 2);
        return weight;
    }

    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

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
