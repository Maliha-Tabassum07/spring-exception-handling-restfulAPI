package com.maliha.exceptionhandlingspring.exception;

public class CustomException extends Exception{
    private static final String TEXT="Array length not supported";
    public CustomException(){
        super(TEXT);
    }
    public CustomException(String s){
        super(s);
    }
}
