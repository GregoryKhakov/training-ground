
package grigorykhakov.oop;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student(18, "Petr", "Ivanov");

        Employee employee = new Employee(35, "Ivan", "Petrov");

        System.out.println(student.toString());
        System.out.println(employee.toString());

        employee.work();
        employee.eat("Avokado");
    }
}
