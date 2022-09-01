package grigorykhakov;

import grigorykhakov.oop.*;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {


        Entity entity = new Entity();
        if (entity.getClass() == Entity.class)
        {
            System.out.println("yes");
        }



















        //System.out.println("hello");
//        String login = "";
//        String password = "";
//        String confirmPassword = "";
//
//        boolean validation = validate(login, password, confirmPassword);
//        System.out.println(validation ? "Validation successful" : "Validation Error");
    }

//    public static boolean validate(String login, String password, String confirmPassword)
//    {
//        // ...
//        // Пример использования регулярного выражения
//        // Регулярное выражение "[a-zA-Z]+\\.?" проверяет, содержатся ли только буквы латинского алфавита в строке.
//        // Соответственно, возвращает true если да, и false в противном случае.
//        boolean isLoginContainsOnlyLatinLetters = login.matches ("[a-zA-Z]+\\.?");
//        // ...
//
//    }


//    public static void main(String[] args)
//    {
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.add("Hello!");
//        arrayList.add("Hello 2");
//        arrayList.add("Hello 3");
//        System.out.println(arrayList.size());
//
//
//
//        Stack<String> stack = new Stack<>();
//        stack.push("Hello!");
//        stack.pop();
//        stack.peek();
//
//
//
//        PriorityQueue<String> queue = new PriorityQueue();
//        queue.peek();
//
//
//        System.out.println();
//    }







    public static void drawRhombus() {
        int size = 5;
        for (int i = 1; i <= (size + 2); i += 2) {

            for (int k = i; k <= size; k += 2) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();

        }

        for (int i = 1; i <= size; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print("  ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

//        char[] arr = new char[5];
//
//        arr[0] = 'a';
//        arr[1] = 'a';
//        arr[2] = 'a';
//        arr[3] = 'a';
//        arr[4] = 'a';
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = scanner.next().toCharArray()[0];
//        }
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
















//        drawRhombus();
//        char[] arr = new char[5];
//
//        arr[0] = 'a';
//        arr[1] = 'a';
//        arr[2] = 'a';
//        arr[3] = 'b';
//        arr[4] = 'b';
//
//
//        char[] result = compress(arr);
//
//        for (int i = 0; i < result.length; i++)
//        {
//            System.out.print(result[i]);
//        }
//        System.out.println();
//    }
//
//    public static void drawRhombus2()
//    {
//        int size = 5;
//
//        for (int i = 0; i < size; i++)
//        {
//
//        }
//
//    }
//


    public static char[] compress(char[] input)
    {
        char[] compressed = new char[0];

        for (int i = 0; i < input.length; i++)
        {
            if (i + 1> input.length)
                break;

            char currentSymbol = input[i];
            int sameSymbolsCount = 0;
            for (int j = i; j < input.length; j++)
            {
                if (j + 2 > input.length)
                    break;

                boolean nextSymbolSame = input[j] == input[j+1];

                if (nextSymbolSame)
                {
                    sameSymbolsCount++;
                }
                else
                {
                    break;
                }
            }

            compressed = addCompressed(compressed, currentSymbol, sameSymbolsCount);
        }

        return input;
    }

    public static char[] addCompressed(char[] arr, char symbol, int count)
    {
        if (count == 1)
        {
            char[] newArr = copyAndExtendArray(arr,1);
            newArr[newArr.length - 1] = symbol;
            return newArr;
        }

        if (count > 1)
        {
            char[] newArr =  copyAndExtendArray(arr, 2);
            newArr[newArr.length - 2] = (char)(count + '0');
            newArr[newArr.length - 1] =  symbol;
            return newArr;
        }
        return arr;
    }

    public static char[] copyAndExtendArray(char[] inputArray, int extendCount)
    {
        char[] newArray = new char[inputArray.length + extendCount];

        for (int i = 0; i < inputArray.length; i++)
        {
            newArray[i] = inputArray[i];
        }
        return newArray;
    }

    public static void ma(String[] args) {

        Entity entity = new Entity();
        entity.setField1("old");
        entity.setField2(1);
        String test = "oldddd";

        func(test, entity);


        System.out.println(test);
        System.out.println();

//
//        final int[] test = new int[5];
//        test[0] = 1;
//        test[1] = 2;
//        test[2] = 3;
//        test[3] = 4;
//        test[4] = 5;
//
//
//        test[4] = 6;
        //test = new int[6];

//        func4();
//        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        for (int i = 0; i < length; i++)
//        {
//            for (int j = 1; j < length - i; j++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= 2*i - 1; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    public static void func(String a, Entity e)
    {
        a = "eneww";
        e = new Entity();
        e.setField1("new value");
        e.setField2(2);
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
