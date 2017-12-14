import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part{
    private final DecimalFormat costFormat = new DecimalFormat("$#,###.00");
    private String name;
    private List<part> subParts = new ArrayList<>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat = new DecimalFormat("0.0");

    public void addPart(Part part){

    }

    public Assembly(String name){

    }

    public double getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public void printBillOfMaterials(){

    }
}
