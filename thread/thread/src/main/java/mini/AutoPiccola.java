package mini;

import mini.Automobile;

public class AutoPiccola extends Automobile implements Runnable{   //dovendo estendere automobile qui conviene implementare runnable


    public AutoPiccola(String marca, String modello, String targa, int cilindrata) {
        super(marca, modello, targa, cilindrata);
    }

    @Override
    public String getType() {
        return "Auto Piccola";
    }

    @Override
    public void run(){
        System.out.println("Il thread per l'automobile " + this + "ha iniziato " + "l'esecuzione" );
        System.out.println(this.getMessage());
        System.out.println("Il thread per l'automobile " + this + " sta per terminare." );
    }
}
