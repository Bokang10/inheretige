// LampSold.java
/*
 * Student Number: [St 10446180]Seonya Bokang
 * Class: LampSold
 * Description: This subclass extends ItemSold to represent a specific type of item, a lamp.
 * It includes additional fields to indicate whether the lamp is an antique and if it's in good condition.
 * The class provides getters and setters for these additional fields.
 */
public class LampSold extends ItemSold {
    private boolean isAntique;
    private boolean isInGoodCondition;

    // Constructor
    public LampSold(int invoiceNumber, String description, double price, boolean isAntique, boolean isInGoodCondition) {
        super(invoiceNumber, description, price);
        this.isAntique = isAntique;
        this.isInGoodCondition = isInGoodCondition;
    }

    // Getters and Setters
    public boolean isAntique() {
        return isAntique;
    }

    public void setAntique(boolean isAntique) {
        this.isAntique = isAntique;
    }

    public boolean isInGoodCondition() {
        return isInGoodCondition;
    }

    public void setInGoodCondition(boolean isInGoodCondition) {
        this.isInGoodCondition = isInGoodCondition;
    }
}
