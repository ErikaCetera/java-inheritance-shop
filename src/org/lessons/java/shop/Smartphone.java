package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    private String codeIMEI;
    private int storage;


    //costruttori
    public Smartphone(int code, String name, String brand, BigDecimal price, BigDecimal vat, String codeIMEI, int storage){
        super(code, name, brand, price, vat);
        this.codeIMEI = codeIMEI;
        this.storage = storage;
    }

    public Smartphone( String name, String brand, int storage){
        super( name, brand);
        this.storage = storage;
    }


    // get e set
    public String getCodeIMEI(){
        return codeIMEI;
    }

    public void setCodeIMEI(String codeIMEI){
        this.codeIMEI = codeIMEI;
    }

    public int getStorage(){
        return storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }
 
    //altri metodi
    @Override
    public String toString(){
       return super.toString() +" - Informazioni specifiche = Memoria Interna: " + storage;
        
    }
}
