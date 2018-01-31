public class InvoiceItem {
    
    // Static Variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // 1st constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for id
    public String getID() {
        return this.id;
    }

    // Getter for description (desc)
    public String getDesc() {
        return this.desc;
    }

    // Getter for quantity (qty)
    public int getQty() {
        return this.qty;
    }

    // Setter for qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unitPrice
    public double getUnitPrice() {
        return this.unitPrice;
    }

    // Setter for unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // getter for total
    public double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
    }

}