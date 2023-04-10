package com.example.les_12_televisions_services.exceptions;

public class TelevisionNameTooLongException extends RuntimeException{
    public TelevisionNameTooLongException(String message){
        super(message);
    }

    public TelevisionNameTooLongException(){
        super();
    }
}
