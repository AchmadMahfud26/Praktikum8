public class Order {
    public date date;
    public String Status;

    public void setdate(date e){
        date = e;
    }
    public Order(customer customer, date date, String Status) {
        this.date = date;
        this.Status = Status;

    }
    public String setStatus(String status){
        return this.Status=Status;

    }
    public date getDate(){
        return this.date;

    }
    public String getStatus() {
        return this.Status ;
    }

    public void SubTotal() {
        System.out.println("subTotal = "+getStatus());
    }

    public void Tax() {
        System.out.println("Tax = "+getDate());

    }

    public void Total() {
        System.out.println("Total = "+getStatus());

    }

    public void TotalWeight() {
        System.out.println("TotalWeight = "+getDate());
    }


}
