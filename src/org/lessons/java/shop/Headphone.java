package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product {
 private String color;
 private String connectionType;


 //costruttore
    public Headphone(int code, String name, String brand, BigDecimal price, BigDecimal vat, String color, String connectionType){
        super(code, name, brand, price, vat);
        this.color = color;
        this.connectionType = connectionType;

    }

    public Headphone( String name, String brand, String connectionType){
        super( name, brand);
        this.connectionType = connectionType;
    }

 
    //get e set

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getConnectionType(){
        return connectionType;
    }

    public void setConnectionType(String connectionType){
        this.connectionType = connectionType;
    }

    //altri metodi
    @Override
    public String toString(){
       return  super.toString() +" - Info specifiche = Colore: " + color + " Connessione: " + connectionType;
        
    }
}
