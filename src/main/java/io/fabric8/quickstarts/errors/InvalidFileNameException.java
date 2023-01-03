package io.fabric8.quickstarts.errors;

public class FileErrorException extends Exception{

    public FileErrorException() {
    }
    public FileErrorException(String message) {
        super(message);
    }
}
