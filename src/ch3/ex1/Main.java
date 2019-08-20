package ch3.ex1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                                                new Employee("John",1000),
                                                new Employee("Nikita",1100),
                                                new Employee("Rick",900)
                                             };
        Employee richestEmployeer = (Employee)Measurable.largest(employees);
        System.out.println(richestEmployeer +"\nAverage: " + Measurable.average(employees));
    }
}
