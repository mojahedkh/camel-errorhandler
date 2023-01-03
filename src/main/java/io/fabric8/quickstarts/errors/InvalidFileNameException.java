package io.fabric8.quickstarts.errors;

public class InvalidFileNameException extends Exception{

    public InvalidFileNameException() {
    }
    public InvalidFileNameException(String message) {
        super(message);
    }
}
