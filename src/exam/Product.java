package exam;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String thumbnail, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Price can not be negative");
            return;
        }
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty<0){
            System.out.println("Quantity can not be negative");
            return;
        }
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfo(){
        System.out.println("Product details: ID: "+this.getId()+" - Name: "+this.getName()+" - Price: "+this.getPrice()+" - Quantity: "+this.getQty()+" - Description: "+this.getDescription());
    }
    public boolean checkAvailability(Integer checkAmount){
        return checkAmount <= this.getQty();
    }
    public double placeOrder(int orderedQty){
        if(!checkAvailability(orderedQty)){
            System.out.println("Quantity not enough");
            return 0;
        } else if (orderedQty<0) {
            System.out.println("Quantity can not be negativeaa");
            return 0;
        }
        this.setQty(this.getQty()-orderedQty);
        return getPrice()*orderedQty;
    }

}
