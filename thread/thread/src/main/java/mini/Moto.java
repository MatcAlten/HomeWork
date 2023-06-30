package mini;

public class Moto extends Thread{ //non estende Automobile,quindi estendo Thread

    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;


    public Moto(String marca,String modello,String targa,int cilindrata){

        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
        this.cilindrata=cilindrata;
    }


    public String getMessage(){

        return "" + this + " Marca " + this.marca +
                "; Modello " + this.modello +
                "; Cilindrata " + this.cilindrata;
    }

    public String toString(){

        return "[Moto con targa: " + this.targa + " ]";
    }

    @Override
    public void run(){
        System.out.println("Il thread per la moto  " + this + "ha iniziato " + "l'esecuzione" );
        System.out.println(this.getMessage());
        System.out.println("Il thread per la moto  " + this + " sta per terminare." );
    }

}
