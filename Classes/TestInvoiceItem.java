public class TestInvoiceItem {
    public static void main(String[] args) {
        // declare instance
        InvoiceItem i1 = new InvoiceItem("id:1234", "item description", 100, 2.99);

        // implict toString call
        System.out.println(i1);

        // Testing the public methods
        // Getters
        System.out.println("The id is " + i1.getID() + " and the descirption is " + i1.getDesc());
        System.out.println("There are " + i1.getQty() + " at the price of each at " + i1.getUnitPrice());
        
        // Setters
        i1.setQty(111);
        System.out.println("the new qty is " + i1.getQty());
        i1.setUnitPrice(4.56);
        System.out.println("The new unit price is " + i1.getUnitPrice());
        
    }
}