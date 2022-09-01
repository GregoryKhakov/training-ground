package grigorykhakov;

public class NumberIsTooLongException extends RuntimeException
{
    public NumberIsTooLongException(){}
    public NumberIsTooLongException(String errorMessage){
        super(errorMessage);
    }
}
