package com.grigorykhakov;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        func4();

    }

    public static void func1()
    {
        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int parsedNumber = Integer.parseInt(inputString);

        System.out.println("Your number is " + parsedNumber);
        System.out.println("Thank you for using our program!");
    }

    public static void func2()
    {
        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.matches("[0-9]+"))
        {
            int parsedNumber = Integer.parseInt(inputString);
            System.out.println("Your number is " + parsedNumber);
            System.out.println("Thank you for using our program!");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public static void func3()
    {
        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        try
        {
            int parsedNumber = Integer.parseInt(inputString);
            System.out.println("Your number is " + parsedNumber);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
        finally
        {
            System.out.println("Thank you for using our program!");
        }
    }


    public static int parseNumber(String input) throws StringDoesNotContainANumberException
    {
        if (input.length() > 2)
            throw new NumberIsTooLongException("Number should have only two symbols");

//        try
//        {
            if (input.length() > 2)
                throw new StringDoesNotContainANumberException("There is wrong symbols is the input");
//        }
//        catch (StringDoesNotContainANumberException exception)
//        {
//            return 0;
//        }

        return Integer.parseInt(input);
    }

    public static String inputValue()
    {
        System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }

    public static void func4()
    {
        String inputString = inputValue();

        try {
            int parsedNumber = parseNumber(inputString);
            System.out.println("Your number is " + parsedNumber);
        }
        catch(NumberFormatException exception)
        {
            System.out.println("Invalid input");
        }
        catch(NumberIsTooLongException exception)
        {
            System.out.println("Number is too long");
        }
        catch(Exception exception)
        {
            System.out.println("Some other problem");
        }
        finally
        {
            System.out.println("Thank you for using our program!");
        }
    }
}
