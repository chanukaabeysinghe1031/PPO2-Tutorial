public class CarTester {
    public static void main(String[]args){
        double efficiency=50;
        double addFuel=1000;
        double distance=100;
        Car car=new Car(efficiency);
        car.addGas(addFuel);
        car.drive(distance);
    }
}
