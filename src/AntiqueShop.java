
// AntiqueShop.java
/*
 * Student Number: [St 10446180]Seonya Bokang
 * Application: AntiqueShop
 * Description: This application tests the ItemSold and LampSold classes.
 * It creates instances of each class, sets their properties, and prints the details
 * to verify that all methods function correctly.
 */
public class AntiqueShop {
    public static void main(String[] args) {
        // Create objects of ItemSold
        ItemSold item1 = new ItemSold(101, "Victorian Vase", 150.00);
        ItemSold item2 = new ItemSold(102, "Renaissance Painting", 1200.00);

        // Create objects of LampSold
        LampSold lamp1 = new LampSold(201, "Tiffany Lamp", 3000.00, true, true);
        LampSold lamp2 = new LampSold(202, "Art Deco Lamp", 200.00, false, false);

        // Display information about ItemSold objects
        System.out.println("Item 1: " + item1.getDescription() + " | Invoice: " + item1.getInvoiceNumber() + " | Price: $" + item1.getPrice());
        System.out.println("Item 2: " + item2.getDescription() + " | Invoice: " + item2.getInvoiceNumber() + " | Price: $" + item2.getPrice());

        // Display information about LampSold objects
        System.out.println("Lamp 1: " + lamp1.getDescription() + " | Invoice: " + lamp1.getInvoiceNumber() + " | Price: $" + lamp1.getPrice() +
                " | Antique: " + lamp1.isAntique() + " | In Good Condition: " + lamp1.isInGoodCondition());
        System.out.println("Lamp 2: " + lamp2.getDescription() + " | Invoice: " + lamp2.getInvoiceNumber() + " | Price: $" + lamp2.getPrice() +
                " | Antique: " + lamp2.isAntique() + " | In Good Condition: " + lamp2.isInGoodCondition());
    }
}


