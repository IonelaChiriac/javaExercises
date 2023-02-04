package homeworkChapter_3;

//3.12 (Invoice Class)
//        Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
//        An Invoice should include four pieces of information as
//        instance variables—a part number (type String), a part description (type String),
//        a quantity of the item being purchased (type int) and a price per item (double).
//        Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable.
//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,multiplies the quantity by the price per item)
//        then returns the amount as a double value. If the quantity is not positive, it should be set to 0.
//        If the price per item is not positive, it should be set to 0.0.
//        Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
public class Exercise12InvoiceTest {
    public static void main(String[] args) {
        Exercise12Invoice exercise12Invoice1 = new Exercise12Invoice("1001", "Monitor", 2, 600.00);
        Exercise12Invoice exercise12Invoice2 = new Exercise12Invoice("1002", "Laptop", 1, 3000.00);

        System.out.printf(
                "First invoice %nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
                exercise12Invoice1.getNumber(), exercise12Invoice1.getDescription(), exercise12Invoice1.getQuantityPurchased(),
                exercise12Invoice1.getPricePerItem(), exercise12Invoice1.getInvoiceAmount());

        System.out.printf(
                "Second invoice %nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f",
                exercise12Invoice2.getNumber(), exercise12Invoice2.getDescription(), exercise12Invoice2.getQuantityPurchased(),
                exercise12Invoice2.getPricePerItem(), exercise12Invoice2.getInvoiceAmount());
    }
}

//output
//        First invoice
//        Number: 1001
//        Description: Monitor
//        Quantity: 2
//        Price per item: $ 600.00
//        Invoice amount: $ 1,200.00
//
//        Second invoice
//        Number: 1002
//        Description: Laptop
//        Quantity: 1
//        Price per item: $ 3,000.00
//        Invoice amount: $ 3,000.00
//        Process finished with exit code 0