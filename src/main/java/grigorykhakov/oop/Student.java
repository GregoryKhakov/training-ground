package grigorykhakov.oop;

public class Student extends Person
{
    public Student(int age, String firstName, String lastName)
    {
        super(age, firstName, lastName);
    }

    private int course;
    private String universityName;

}
