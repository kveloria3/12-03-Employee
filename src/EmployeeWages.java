// placeholder for your main method
public class EmployeeWages 
{
    public static void main(String[] args) 
    {
        // replace <put your name here> with your name!
        System.out.println("Student: <put your name here>");
        
        Employee emp1 = new Employee("Arjun", .10, 12);
        Employee emp2 = new Employee("Kaitlyn", 100000000000000000.00, 18);
        
        System.out.println(emp1.toString()+"\t weekly salary: $"+emp1.getWeeklySalary()+"\t annual salary: $"+emp1.getYearlySalary());
        System.out.println(emp2.toString());
        
        emp2.setName("Elyse");
        
        emp2.setWage(100000.00);
        
        emp2.setHours(10);
        
        System.out.println(emp2.toString()+"\t weekly salary: $"+emp2.getWeeklySalary()+"\t annual salary: $"+emp2.getYearlySalary());
       
        
        emp2.giveRaise();
       
        
        System.out.println(emp2.toString());
        
    }
}
