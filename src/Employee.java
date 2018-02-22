public class Employee {
    private String name;
    private double currSalary;

    public Employee(String name,double currSalary){
        this.name=name;
        this.currSalary=currSalary;
    }

    public String getName() {
        return name;
    }

    public double getCurrSalary() {
        return currSalary;
    }
    public void raiseSalary(double byPercent){
        System.out.println("The employee's new salary is " +(this.currSalary*byPercent+this.currSalary));
    }
}
