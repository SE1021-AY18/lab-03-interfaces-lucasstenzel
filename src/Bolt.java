public class Bolt implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER = 1.00;

    public Bolt(double diameterInches, double lengthInches){

    }

    public double getCost(){
        double cost = USD_MULTIPLIER*diameterInches*lengthInches;
        return cost;
    }

    public String getName(){
        String name = ""+ diameterInches + lengthInches + " bolt";
        return name;
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER*Math.pow(diameterInches, 2)*lengthInches;
        return weight;
    }

    public void printBillOfMaterials(){

    }
}
