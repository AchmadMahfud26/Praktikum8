public class customer {
    private String Nama;
    private address address ;

    public customer(String Nama, address address){
        this.Nama = Nama;
        this.address = address;
    }
    public Order Order (date date,String status){
        return new Order(this,date,status);
    }
    public String getNama(){
        return this.Nama;
    }
    public String getAddress() {
        return this.address.toString();
    }


}


