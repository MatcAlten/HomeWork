package mini;

import java.util.Random;

public class LavaggioRandom {

    //costanti utilizzate per generare valori casuali di moto,auto e caratteristiche
    private final static int MAX_NUM_AUTOS = 20;
    private final static int MAX_NUM_MOTOS = 20;
    private final static String[] MARCHE_AUTO = {"Fiat","Renault","Mercedes"};
    private final static String[] MARCHE_MOTO = {"Honda","Ducati","Kawasaki"};
    private final static String[] MODELLI = {"Mod1","Mod2","Mod3"};



    public static void main(String[] args) {

        //creazianoe numeri random per la quantità di moto e auto
        Random r = new Random(System.currentTimeMillis());
        int num_autos = r.nextInt(MAX_NUM_AUTOS);
        int num_motos = r.nextInt(MAX_NUM_MOTOS);


        //array di threads,dato dal totale di numero macchine e moto
        Thread[] threads_to_start = new Thread[num_autos+num_motos];



        for (int i=0;i< num_autos;i++) {

            boolean small = r.nextBoolean();

            String targa = "automobile" + i;

            int indice_marca = r.nextInt(MARCHE_AUTO.length);
            int indice_modello = r.nextInt(MODELLI.length);

            if(small){
                AutoPiccola autoPiccola = new AutoPiccola(MARCHE_AUTO[indice_marca],MODELLI[indice_modello],targa,2000+i);
                threads_to_start[i] = new Thread(autoPiccola);

            }else {
                AutoGrande a = new AutoGrande(MARCHE_AUTO[indice_marca],MODELLI[indice_modello],targa,2700+i);
                threads_to_start[i] = new Thread(a);
            }
          }

        for(int i=0;i< num_motos;i++){
            int indice_marca = r.nextInt(MARCHE_AUTO.length);
            int indice_modello = r.nextInt(MODELLI.length);
            String targa = "moto" + i;
            Moto moto = new Moto(MARCHE_MOTO[indice_marca],MODELLI[indice_modello],targa,3000+i);
            threads_to_start[num_autos+ i] = moto;
        }

        for (Thread t : threads_to_start){
            t.start();
        }

        for (Thread t : threads_to_start){
            try{
                 t.join();
            } catch (InterruptedException e){
                System.err.println("Thread main ha ricevuto un interruzione");
                e.printStackTrace();
            }
        }

        System.out.println("Tutti i thread hanno completato");


    }}
