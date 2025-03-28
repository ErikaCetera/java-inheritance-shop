package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product{
   private boolean isSmart;
   private String size;


    //costruttore
    public Tv(int code, String name, String brand, BigDecimal price, BigDecimal vat, boolean isSmart, String size){
        super(code, name, brand, price, vat);
        this.isSmart = false;
        this.size = size;

    }

    public Tv( String name, String brand, boolean isSmart, String size){
        super( name, brand);
        this.isSmart = false;
        this.size = size;
    }


    // get e set

    public boolean getIsSmart(){
        return isSmart;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }

    public String getsize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    //altri metodi
    @Override
    public String toString(){
        return super.toString() + " - Info specifiche = Dimensioni: " + size + " Tv Smart: " + isSmart;
    }

}
