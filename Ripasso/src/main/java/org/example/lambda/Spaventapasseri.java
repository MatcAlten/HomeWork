package org.example.lambda;

public class Spaventapasseri {

    public static void main(String[] args) {

        final Spaventapasseri spaventapasseri = new Spaventapasseri();

//LAMBDA 1
        SpaventoPersonal lambda =  (frase,animale) ->  System.out.printf("%s %s",frase,animale); //con un solo argomento possiamo anche rimuovere le parentesi

        //Lambda ha bisogno di un tipo da specificare,tale tipo è functional interface (in questo caso la nostra interfaccia SpaventoPersonal
        //una functional interface  è un interfaccia con un solo metodo astratto


//LAMBDA extended 2
        SpaventoPersonal lambdaAnon = new SpaventoPersonal() {

            @Override
            public void spaventa(String frase, String animale) {
                System.out.printf("%s %s",frase,animale);
            }
        };



        spaventapasseri.faiSpavento(lambda,"DIOCANE ","usignoli");
        System.out.println();
        spaventapasseri.faiSpavento(lambdaAnon,"Andate via","usignoli");

    }



    public void faiSpavento(SpaventoPersonal spaventoPersonal,String frase,String animale){
        spaventoPersonal.spaventa(frase,animale);

    }
}


/*

     lambda =

        public         //rimuoviamo l acces modifier
        void           // rimuoviamo il retunr type,è sottinteso
        spaventa       // rimuoviamo il nome del metodo non necessario ora,perhè a noi serve solo il comportamento d assegnare a lambda



        () {      //dopo le parentesi si aggiunge  '  ->  '  e se è solo 1 linea di  codice si rimuono le graffe
            System.out.println("ADDIO USIGNOLI");
        }
    */
