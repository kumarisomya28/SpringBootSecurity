package com.movieflix.MovieAPI.exceptions;

public class EmptyFileException extends Throwable {
    public EmptyFileException(String message) {
        super(message);
    }
}