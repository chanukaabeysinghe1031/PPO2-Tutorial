public class Car {
    private double efficiency;
    private double fuelLevel=0;

    public Car(double efficiency){
        this.efficiency=efficiency;
    }

    public void drive(double distance){
        double needFuel=this.efficiency*distance;
        if(needFuel<=this.fuelLevel){
            System.out.println("You can go this distance");
        }else{
            System.out.println("You can't go this distance.");
        }
    }
    public void addGas(double addFuel){
        this.fuelLevel+=addFuel;
    }
}
