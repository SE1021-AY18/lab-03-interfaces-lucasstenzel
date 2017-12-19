/*
 * SE1021
 * Winter 2017
 * Lab 3 - Interfaces
 * Name: Lucas Stenzel
 * Created 12/14/2017
 */

/**
 * Interface for every Part made. It
 * Requires every part to include methods to
 * calculate their Costs, Names, Weights, and Bills
 * of Materials
 * @author stenzell
 * @version 1.0
 */
public interface Part {

    /**
     * Requires every Part to have a method to
     * calculate its cost. The algorithms will vary
     * between Parts.
     * @return The Part's cost
     */
    double getCost();

    /**
     * Formulates each Part's name. Because
     * different Parts' names are not created the same
     * way, each Part will implement this differently
     * @return The Part's name
     */
    String getName();

    /**
     * Calculates each Part's weight. Again,
     * each Part will implement this differently because
     * their weights are all not derived using the same formula
     * @return The Part's weight
     */
    double getWeight();

    /**
     * Prints out the Part's Bill of Materials.
     * A simple Part will just print out its own information,
     * but an Assembly has to print out its entire contents
     */
    void printBillOfMaterials();
}
