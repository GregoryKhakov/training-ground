package com.grigorykhakov;

public class StringDoesNotContainANumberException extends Exception
{
    public StringDoesNotContainANumberException() {    }

    public StringDoesNotContainANumberException(String errorMessage){
        super(errorMessage);
    }
}
