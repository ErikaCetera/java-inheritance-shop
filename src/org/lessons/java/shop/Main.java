package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
 public static void main(String[] args) {
    
    Smartphone S = new Smartphone(0, "OnePlus 7T", "OnePlus", new BigDecimal(590.00), null, null, 128);
    Tv T = new Tv(0, "Samsung", "Samsung", new BigDecimal(229.00), null, false, "30'");
    Headphone H = new Headphone(0, "Galaxy Buds", "Samsung", new BigDecimal(79.00), null, "Nero", "Wirless");


    System.out.println(S.getInfo());
    System.out.println(T.getInfo());
    System.out.println(H.getInfo());
 }




}


