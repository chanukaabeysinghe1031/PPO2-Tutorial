public class ProductTester {
    public static void main(String[] args) {
        Product product=new Product("eewre",435);
        System.out.println(product.getProductName());
        System.out.println(product.getProductPrice());
        product.reducePrice(100);
        System.out.println(product.getProductPrice());
    }
}
