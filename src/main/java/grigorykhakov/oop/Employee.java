package grigorykhakov.oop;

import java.awt.*;

public class Employee extends Person implements Workable
{
    public Employee(int age, String firstName, String lastName)
    {
        super(age, firstName, lastName);
    }

    private Color color = Color.RED;
    private String workplace;

    @Override
    public void work()
    {
        System.out.println("Doing work!");
    }



    // public private protected default
}
