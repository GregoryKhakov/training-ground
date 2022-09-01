package grigorykhakov.modificators;

public class Test
{
    static Integer test;

    public static void main(String[] args)
    {
        String message = "123";

        Printer printerOne = new Printer(1);

        if (printerOne.getSupportedMediaType() == "String")
        {
            printerOne.printDocument("test");
        }
        else
        {
            System.out.println("Unable to print");
        }

        Printer printerTwo = new Printer(2);
        if (printerTwo.getSupportedMediaType() == "String")
        {
            printerTwo.printDocument("test");
        }
        else
        {
            System.out.println("Unable to print");
        }

    }
}
