/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Pocetak");
         
         String message = "Ovo je pocetak";
         Car fiat = new Car();
//fiat.model = "Fiat Punto";
         fiat.setModel("Fiat Punto");
         fiat.setBuildYear (2010);
         fiat.setColor ("black");
         fiat.setConsumption(6);
         fiat.setMaxSpeed (180);
         fiat.setCurrentFuel(20);
         fiat.setMaxFuel(45);
         
         fiat.showData();
         
         System.out.println("--------------------");
         
         Car ford = new Car();
 //        ford.model = "Ford Fiesta";
         ford.setModel("Ford Fiesta");
         ford.setBuildYear(2015);
         
          ford.showData();
//          System.out.println("Model: " + ford.getModel());
    }
}