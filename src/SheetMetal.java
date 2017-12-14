import java.text.DecimalFormat;

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
    }

    public double getWeight(){
        double weight = LBS_MULTIPLIER * lengthInches * widthInches *
                thicknessInches;
        return weight;
    }

    public void printBillOfMaterials(){
        System.out.println("===============");
        System.out.println(getName());
        System.out.println("===============");
        System.out.println("Length: " + lengthInches + " inches");
        System.out.println("Width: " + widthInches + " inches");
        System.out.println("Thickness: " + thicknessInches + " inches");
        System.out.println("Cost: $" + getCost());
        System.out.println("Weight: " + getWeight() + " lbs");
    }

    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
    }
}
