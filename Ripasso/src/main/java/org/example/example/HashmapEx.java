package org.example.example;

import java.util.HashMap;

public class HashmapEx {


public void printHashMao() {

    HashMap<Integer,String> //dichiarazione del oggetto Hashmap/Map da creare,specifichiamo sempre di che 'tipo' devono essere chiave e value
            hashMapMatteo //nome del nostro map
            = new HashMap<Integer,String>(); // dont have to repeat this <Integer,String >

    /*
    * map= interface ->specxifies what kind of methods a real map implementation have to support
    * hashmap= implementation
    */


    hashMapMatteo.put(1,"manga");
    hashMapMatteo.put(2,"anime");
    hashMapMatteo.put(3,"games");


    System.out.println(hashMapMatteo);

    hashMapMatteo.remove(2);

    System.out.println(hashMapMatteo);

    System.out.println(hashMapMatteo.get(2));
    System.out.println(hashMapMatteo.containsKey(2));
    System.out.println(hashMapMatteo.containsKey(3));
    System.out.println(hashMapMatteo.get(3));
    System.out.println(hashMapMatteo.containsValue("manga"));

    hashMapMatteo.replace(3,"games","anime"); //il replace avviene solo se esiste ciò che vogliamo sostituire,altrimenti no
    hashMapMatteo.replace(3,"games","anime");

    System.out.println(hashMapMatteo.containsKey(2));
    System.out.println(hashMapMatteo.containsValue("anime"));



    System.out.println("Finished HashmapEx class");
}

}
