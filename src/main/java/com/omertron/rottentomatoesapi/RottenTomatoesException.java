/*
 *      Copyright (c) 2004-2012 Stuart Boston
 *
 *      This software is licensed under a Creative Commons License
 *      See the LICENCE.txt file included in this package
 *
 *      For any reuse or distribution, you must make clear to others the
 *      license terms of this work.
 */
package com.omertron.rottentomatoesapi;

public class RottenTomatoesException extends Exception {

    private static final long serialVersionUID = -8952129102483143278L;

    public enum RottenTomatoesExceptionType {

        UNKNOWN_CAUSE, INVALID_URL, HTTP_404_ERROR, MAPPING_FAILED, CONNECTION_ERROR, NO_API_KEY;
    }
    private final RottenTomatoesExceptionType exceptionType;
    private final String response;

    public RottenTomatoesException(final RottenTomatoesExceptionType exceptionType, final String response) {
        super(response);
        this.exceptionType = exceptionType;
        this.response = response;
    }

    public RottenTomatoesException(final RottenTomatoesExceptionType exceptionType, final String response, final Throwable cause) {
        super(cause);
        this.exceptionType = exceptionType;
        this.response = response;
    }

    public RottenTomatoesException(final RottenTomatoesExceptionType exceptionType, final Throwable cause) {
        super(cause);
        this.exceptionType = exceptionType;
        this.response = cause.getMessage();
    }

    public RottenTomatoesExceptionType getExceptionType() {
        return exceptionType;
    }

    public String getResponse() {
        return response;
    }
}
