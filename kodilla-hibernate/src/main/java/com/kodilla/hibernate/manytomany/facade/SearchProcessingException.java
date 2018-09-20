package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_DONT_FOUND = "Cannot find name";

    public SearchProcessingException(String message) {
        super(message);
    }
}
