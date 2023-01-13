import org.omg.CORBA.UShortSeqHelper;

public class Item {
    public String shippingWeight;
    public String description;

    public Item(String shippingWeight,String description){
        this.shippingWeight=shippingWeight;
        this.description=description;
    }
    public String getPriceFoQuantity(){
        return this.shippingWeight;
    }
    public String getTax(){
        return this.description;
    }
    public void inStock(){
        System.out.println("Stok="+getTax());
    }

}
