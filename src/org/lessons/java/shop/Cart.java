package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Product[] products = new Product[1];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {

            System.out.println("Definisci nome del prodotto");
            String nameProduct = input.nextLine();

            System.out.println("Definisci il modello");
            String brandProduct = input.nextLine();

            System.out.println("Definisci tipologia prodotto tra Smartphone, tv o cuffie");
            String typeProduct = input.nextLine();

            if ("Smartphone".equalsIgnoreCase(typeProduct)) {
                System.out.println("Definisci la capacità di memoria (GB):");
                int memoryCapacity = input.nextInt();
                products[i] = new Smartphone(nameProduct, brandProduct, memoryCapacity);

            } else if ("tv".equalsIgnoreCase(typeProduct)) {
                System.out.println("Definisci se la TV è Smart (true/false):");
                boolean isSmart = input.nextBoolean();
                input.nextLine(); // Consuma il newline rimasto

                System.out.println("Definisci la dimensione dello schermo (pollici):");
                String size = input.nextLine();
                products[i] = new Tv(nameProduct, brandProduct, isSmart, size);

            } else if ("cuffie".equalsIgnoreCase(typeProduct)) {
                System.out.println("Definisci il tipo di connessione (es. Bluetooth, Cablato):");
                String connectionType = input.nextLine();
                products[i] = new Headphone(nameProduct, brandProduct, connectionType);
            } else {
                System.out.println("Tipologia non valida. Prodotto non aggiunto.");
            }
        }
        input.close();

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

}
