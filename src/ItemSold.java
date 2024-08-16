// ItemSold.java
/*
 * Student Number: [St 10446180]Seonya Bokang
 * Class: ItemSold
 * Description: This class represents a generic item sold in the antique shop.
 * It contains fields for the invoice number, description, and price,
 * along with corresponding getters and setters.
 */
public class ItemSold {
    private int invoiceNumber;
    private String description;
    private double price;

    // Constructor
    public ItemSold(int invoiceNumber, String description, double price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    // Getters and Setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
