package org.example.lambda;

@FunctionalInterface
public interface SpaventoPersonal {


   //unico metodo astratto
    void spaventa(String frase,String animale);  //diamo dei parametri string quali frase e animale

   

    default void cane(){

        System.out.println("Bau");

    }

    static void gatto(){

        System.out.println("Miao");

    }



}
