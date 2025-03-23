package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

   protected int code;
   protected String name;
   protected String brand;
   protected BigDecimal price;
   protected BigDecimal vat;



//costruttore
 public Product (int code, String name, String brand, BigDecimal price, BigDecimal vat){
    Random r = new Random();
    this.code = r.nextInt(9999);
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.vat = vat;

 }

 // get e set

 //solo lettura
 public int getCode(){
   return code;
 }


public String getName(){
    return name;
}

public void setName(String name){
   this.name  = name;
}

public String getBrand(){
    return brand;
}

public void setBrand(String brand){
    this.brand = brand;
}

public BigDecimal getPrice(){
    return price;
}

public void setPrice(BigDecimal price){
    this.price = price;
}

public BigDecimal getVat(){
    return vat;
}

public void setVat(BigDecimal vat){
    this.vat = vat;
}


//altri metodi

public String getInfo(){
    return "Info Prodotto =  Codice: " + code + ", Nome: " + name + " Modello: " + brand + " Prezzo senza Iva: " + price;
}

}
