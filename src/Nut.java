public class Nut implements Part {
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;

    public double getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public Nut(double diameterInches){

    }

    public void printBillOfMaterials(){

    }
}
