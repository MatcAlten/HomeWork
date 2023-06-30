package mini;

public class LavaggioSemplice {

    public static void main(String[] args) {
        AutoPiccola aP = new AutoPiccola("FIAT","Panda","XB720ZY",1200);  //implements Runnable
        AutoGrande aG = new AutoGrande("AUDI","A2","DF456TO",3000);       //implements Runnable
        Moto mM = new Moto("kawasaki","Ninja","RTFGH",3700);              //extends Thread

        Thread thr1 = new Thread(aP); //creo gli oggetti thread con il costruttore della classe Thread(perchè le istanze di aueste classi non sono thread)
        Thread thr2 = new Thread(aG); //come paramentro gli passo le istanze delle mie classi ( oggetti runnable)

        thr1.start();
        thr2.start();
        mM.start();   //la classe moto estende la classe Thread quindi è già un thread di per se
    }
}
