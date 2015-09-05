package org.apache.http;


public interface Header {
    java.lang.String getName();

    java.lang.String getValue();

    org.apache.http.HeaderElement[] getElements() throws org.apache.http.ParseException;
}
