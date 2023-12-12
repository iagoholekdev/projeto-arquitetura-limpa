package org.example.utils.interfaces;


public interface Crudable<D, T> {

    T create (D obj);

}
