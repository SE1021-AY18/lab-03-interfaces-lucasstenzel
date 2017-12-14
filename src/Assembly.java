import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part{
    private final DecimalFormat costFormat = new DecimalFormat("$#,###.00");
    private String name;
    private List<Part> subParts = new ArrayList<>();
    public static final double USD_PER_SUB_PART = 0.25;
    private final DecimalFormat weightFormat = new DecimalFormat("0.0");

    public void addPart(Part part){
        subParts.add(part);
    }

    public Assembly(String name){
        
    }

    public double getCost(){
        double totalCost = 0;
        for(int i = 0; i < subParts.size(); i++){
            totalCost+=subParts.get(i).getCost();
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
        // TODO: 12/14/2017 (also) add in the decimal fomats n' stuff 
        System.out.print("");

    }
}
