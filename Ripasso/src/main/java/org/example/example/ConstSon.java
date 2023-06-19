package org.example.example;

public class ConstSon extends ConstructorEx {

    //se nella Superclasse abbiamo un ArgsConst e non abbiamo scritto un DefaultConst:
    //There is no default constructor available in 'org.example.example.ConstructorEx'
    //A. Si richiama il costruttore padre con super nella classe figlia
    //B. Si crea il costruttore di default nella classe super


    //A.
    /*public ConstSon(String newName, Integer newAge, String newNumber) {
        super(newName, newAge, newNumber);
    }*/

    public ConstSon(String newName) {
        System.out.println("ciao mi chiamo" + newName);
    }
}
