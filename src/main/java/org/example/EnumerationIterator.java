package org.example;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

    Enumeration enumObj;

    public EnumerationIterator(Enumeration enumObj){
        this.enumObj = enumObj;
    }


    public boolean hasNext() {
        return enumObj.hasMoreElements();
    }

    public Object next(){
        return enumObj.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
