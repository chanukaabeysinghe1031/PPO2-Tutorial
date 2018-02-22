public class EmployeeTester {
    public static void main(String[]args){
        String name="Chanuka Abeysinghe";
        double currSalary=50000.0;
        Employee employee=new Employee(name,currSalary);
        double byPercent=0.15;
        System.out.println("The emolyee's name is " +employee.getName());
        System.out.println("The employee's current salary is "+employee.getCurrSalary());
        employee.raiseSalary(byPercent);
    }
}
