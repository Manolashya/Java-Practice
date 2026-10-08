class FoodOrder {
    int orderId;
    String customerName;
    String foodName;
    int quantity;
    double price;
    FoodOrder(int orderId,String customerName,String foodName,int quantity,double price) {
        this.orderId=orderId;
        this.customerName=customerName;
        this.foodName=foodName;
        this.quantity=quantity;
        this.price=price;
    }
    public double calculateTotal() {
        return quantity*price;

    }
    void displayOrder() {
        System.out.println("OrderId: "+orderId);
        System.out.println("customerName: "+customerName);
        System.out.println("foodName: "+foodName);
        System.out.println("quantity: "+quantity);
        System.out.println("price: "+price);
    }
    void cancelOrder() {
            System.out.println("Oder cancelled successufully "+orderId);
            quantity=0;
}
}
 class PremiumOrder extends FoodOrder {
    double deliveryCharge;
    String couponCode;
    PremiumOrder(int orderId,String customerName,String foodName,int quantity,double price, double deliveryCharge,String coupenCode) {
        super(orderId, customerName, foodName, quantity, price);
        this.deliveryCharge=deliveryCharge;
        this.couponCode=coupenCode;
    }
    public double calculateDiscount() {
        if(couponCode.equals("PREMIUM20")){
            return super.calculateTotal()*0.20;
        }
        return super.calculateTotal()*0.10;
    }
    @Override 
   public double calculateTotal() {
    double baseTotal=super.calculateTotal();
    double discount = calculateDiscount();
    return (baseTotal-discount)+deliveryCharge;
   }
   void applyPriorityDelivery() {
    System.out.println("Priority delivery applied for coupon: "+couponCode);
   }
   @Override 
   void displayOrder() {
    super.displayOrder();
    System.out.println("Delivery charge: "+deliveryCharge);
    System.out.println("Discount: "+calculateDiscount());
    System.out.println("Final Total: "+calculateTotal());
    applyPriorityDelivery();

   }
}
public class FoodDelivery {
    public static void main(String[] args) {
        PremiumOrder p = new PremiumOrder(246853156, "Lashya", "Biryani", 3, 150.0, 50.0, "PREMIUM20");
        p.displayOrder();
    }
}