package mini;

public class AutoGrande extends  Automobile implements Runnable{   //dovendo estendere automobile qui conviene implementare runnable


    public AutoGrande(String marca, String modello, String targa, int cilindrata) {
        super(marca, modello, targa, cilindrata);
    }

    @Override
    public String getType() {
        return "Auto Grande";
    }

    @Override
    public void run(){
        System.out.println("Il thread per l'automobile " + this + "ha iniziato " + "l'esecuzione" );
        System.out.println(this.getMessage());
        System.out.println("Il thread per l'automobile " + this + " sta per terminare." );
    }
}
