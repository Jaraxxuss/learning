package ch3.ex1;

public class Employee implements Measurable{
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ";Salary: " +salary;
    }
}
