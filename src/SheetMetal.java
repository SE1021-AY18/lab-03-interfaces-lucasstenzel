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
        String name = "" + lengthInches +"x"+ widthInches +"x"+ thicknessInches + " sheet";
        return name;
        //sheet+dimensions?
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
        return weight;
    }

    public void printBillOfMaterials(){

    }

    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
    }
}
