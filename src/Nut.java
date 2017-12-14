public class Nut implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;

    public double getCost(){
        double cost = USD_MULTIPLIER;
        return cost;
    }

    public String getName(){
        String name = ""+diameterInches+ " inch nut";
        return name;
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER;
        return weight;
    }

    public Nut(double diameterInches){

    }

    public void printBillOfMaterials(){

    }
}
