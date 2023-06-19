package org.example.heapstack;

public class MainTwo {

    public static void main(String[] args) {

       Renna rupert = new Renna("Rupert");
       Renna piomboNero = new Renna("Piombo Nero");


       rupert.saluta();
       piomboNero.saluta();

       Renna lavazza = piomboNero;
       lavazza.saluta();

       piomboNero = rupert;
       piomboNero.saluta();

       rupert = null;   //rupert non punta a nulla
       piomboNero.saluta(); //piomboNero ancora punta all oggetto di referenza di rupert
       rupert.saluta();  //null perchè punta a nulla
       lavazza.saluta();
    }
}
