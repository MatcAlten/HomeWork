package org.example.finalvariable;

import java.util.Arrays;

public class Pizzeria {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.ananas.foglie += +5;          //pizza.ananas.foglie = pizza.ananas.foglie +5;
        System.out.println(pizza.ananas.foglie);

    //  pizza.ananas = new Ananas()   ananas è static,quindi rimarrà sempre la referenza al oggetto ananas,ma si può cambiare il valore


        Pizza.ingredienti.add("cane");
        Pizza.ingredienti.add("pomodoro");
        Arrays.stream(Pizza.ingredienti.toArray()).forEach(System.out::println);
    }


}
