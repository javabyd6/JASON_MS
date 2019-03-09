package com.sda.json;

import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.txw2.TypedXmlWriter;

import javax.xml.namespace.QName;

/**
 * @author marek swietlik
 */
public class Address implements com.sun.xml.internal.ws.wsdl.writer.document.http.Address {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public com.sun.xml.internal.ws.wsdl.writer.document.http.Address location(String s) {
        return null;
    }

    @Override
    public void commit() {

    }

    @Override
    public void commit(boolean b) {

    }

    @Override
    public void block() {

    }

    @Override
    public Document getDocument() {
        return null;
    }

    @Override
    public void _attribute(String s, Object o) {

    }

    @Override
    public void _attribute(String s, String s1, Object o) {

    }

    @Override
    public void _attribute(QName qName, Object o) {

    }

    @Override
    public void _namespace(String s) {

    }

    @Override
    public void _namespace(String s, String s1) {

    }

    @Override
    public void _namespace(String s, boolean b) {

    }

    @Override
    public void _pcdata(Object o) {

    }

    @Override
    public void _cdata(Object o) {

    }

    @Override
    public void _comment(Object o) throws UnsupportedOperationException {

    }

    @Override
    public <T extends TypedXmlWriter> T _element(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(String s, String s1, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(QName qName, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _cast(Class<T> aClass) {
        return null;
    }
}
