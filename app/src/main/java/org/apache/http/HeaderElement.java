package org.apache.http;

/**
 * @deprecated
 */
@java.lang.Deprecated
public interface HeaderElement {
    java.lang.String getName();

    java.lang.String getValue();

    org.apache.http.NameValuePair[] getParameters();

    org.apache.http.NameValuePair getParameterByName(java.lang.String s);

    int getParameterCount();

    org.apache.http.NameValuePair getParameter(int i);
}