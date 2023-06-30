package mini;

public abstract class Automobile {

    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;


    public Automobile(String marca,String modello,String targa,int cilindrata){

        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
        this.cilindrata=cilindrata;
    }

    public abstract String getType();

    public String getMessage(){

        return "" + this + " Tipo " + getType() + " Marca " + this.marca +
                "; Modello " + this.modello + "; Cilindrata " + this.cilindrata;
    }

    public String toString(){

        return "[Automobile con targa: " + this.targa + " ]";
    }


}
