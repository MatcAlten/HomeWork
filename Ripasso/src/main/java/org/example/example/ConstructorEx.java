package org.example.example;

public class ConstructorEx {


    private String name;
    private Integer age;
    private String number;


  //  DEFAULT CONSTRUCTOR = creato implicitamente dal costruttore. Sovrascritto quanto ne creiamo uno noi,e quinid andrà scritto anchesso da noi
    /*public ConstructorEx() {

    }*/


    //NO ARGS CONSTRUCTOR
    public ConstructorEx() {
        System.out.println("No Args Constructor");
    }

    //PARAMETRIZED CONSTRUCTOR
    public ConstructorEx(String newName, Integer newAge, String newNumber) {    //PARAMETRI CHE PASSIAMO AL COSTRUTTORE
        name = newName;    //i parametri vengono assegnati alle variabili locali (i parametri li scriviamo noi nel main)
        age = newAge;
        number = newNumber;

        System.out.println("Parametrized Constructor");
        System.out.println("Name: " + newName + "  " + "Age: " + newAge + "  " + "Number: " + newAge);
    }

    //PARAMETRIZED CONSTRUCTOR 2
    public ConstructorEx(String newName) {    //PARAMETRI CHE PASSIAMO AL COSTRUTTORE
        name = newName;    //i parametri vengono assegnati alle variabili locali (i parametri li scriviamo noi nel main)

        System.out.println("Parametrized Constructor 2");
        System.out.println(String.format("Solo name: %s",newName));
    }


       /* public ConstructorEx(String name, Integer age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
    */
}
