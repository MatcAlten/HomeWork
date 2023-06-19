package org.example.finalvariable;

import java.util.ArrayList;
import java.util.List;

public  class Pizza {


    public static final List<String> ingredienti = new ArrayList<String>();
    public final Ananas  ananas = new Ananas();

    public final float PI= 3.14f;          //variabili final vanno sempre inizializzate,anche nel costruttore va bene,ma una sola volta



    public Pizza(){          //tramite costruttore creo diversi oggetti,diverse pizze,ma tutte con pi=3,14
       // pi=3.14f;
    }

public final void formulaSegreta(){   //metodo final non può essere overidato,tu vuoi che il metood faccia sempre la stessa cosa per tutti
        float area = 2*PI*15;
}






}
