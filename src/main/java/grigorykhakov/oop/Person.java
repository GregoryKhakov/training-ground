package grigorykhakov.oop;

public class Person
{
    public Person(int age, String firstName, String lastName)
    {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected void eat(String foodName)
    {
        System.out.println("I'm eating " + foodName);
    }

    private String firstName;
    private String lastName;

    private int age;

    public int getAge()
    {
        return age;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "; " + "Age: " + getAge();
    }
}
