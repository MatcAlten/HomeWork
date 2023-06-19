package org.example.finalvariable;

import jdk.incubator.vector.VectorOperators;

import java.util.ArrayList;
import java.util.List;


class PizzaTest {
    private final List<String> listaDiCose;

    public PizzaTest(){
        listaDiCose = new ArrayList<String>();
        listaDiCose.add("Cipolla");  //Modification -1
    }




 /*  NO SETTER: Cannot assign a value to final variable 'listaDiCose' (con valore si intende un altra lista,)
                non si può settare una variabile final (già inizializzata)

 public void setListaDiCose(List listaDiCose){
        this.listaDiCose = listaDiCose;
    }*/
}