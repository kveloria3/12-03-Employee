// placeholder for your Employee class
public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  public Employee(String nombre, double wage, int hour)
  {
    name = nombre;
    hourlyWage = wage;
    hoursWorked = hour;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hourlyWage * hoursWorked;
  }
  public double getYearlySalary()
  {
    return hourlyWage * hoursWorked * 52;
  }
  public String toString()
  {
    String s = "name: "+name+",  wage: "+hourlyWage+", hours: "+hoursWorked;
    return s;
  }
  public void setName(String newname)
  {
    name = newname;
  }
  public void setWage(double newwage)
  {
    hourlyWage = newwage;
  }
  public void setHours(int h)
  {
    hoursWorked = h;
  }
  public void giveRaise()
  {
    hourlyWage = hourlyWage + 1.0;
  }
}
