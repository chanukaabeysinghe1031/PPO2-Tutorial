public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName,double productPrice){
        this.setProductName(productName);
        this.setProductPrice(productPrice);
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void reducePrice(double price){
        this.productPrice-=price;
    }
}
