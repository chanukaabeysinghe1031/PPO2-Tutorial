public class PerimeterTester {
    public static void main(String[]args){
        Rectangle rect=new Rectangle(10,5);
        double perimeter =(rect.getHeight()+rect.getWidth())*2;
        System.out.println("Th area of this rectangle is "+perimeter);
    }
}
