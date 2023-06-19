package org.example.example;

import java.util.*;
import java.util.stream.*;

public class StreamEx {


    //un insieme di dati,facilità di eseguibilità di operazioni su questi dati
    //su tutte le collection (map,list,arraylist,array) esiste il metodo .stream(),restituisce lo stream dalla collection


    public static void generateStream() {


    //steam.of
        Stream  //interfaccia stream
                <Integer>   //indichiamo il tipo di dati che conterrà
                streamOf = Stream.of(1,3,5,7,9);  //richiamo il metodo .of,ci restiurà quello che gli passiamo (numero di elementi fissi)

        System.out.print("STREAM OF: ");
        streamOf.forEach(number -> System.out.print("  " + number));
        System.out.println();




    //stream builder

       // Stream<String> streamBuilder =  Stream.<String>builder().add("lun").add("mar").add("mer").add("giov").add("ven").add("sab").add("dom");

        Stream.Builder<String> streamBuilder =  Stream.<String>builder().add("lun").add("mar").add("mer").add("giov").add("ven").add("sab").add("dom");

       // System.out.println(streamBuilder);



    //stream generate

        Stream<Integer> randomNumbers = Stream.generate(()-> //il metodo generate prende in ingresso una funzione lambda
                (new Random()).nextInt(100))          //ogni volta che viene richiamata ci restiuisce un numero random tra 1 e 100
                .limit(7);                          //generate genera all infinito quindi si usa per limitare

        //nello stream quindi ci saranno numeri random tra 1 e 100

        System.out.print("STREAM GENERATE: ");
        randomNumbers.forEach(p ->  System.out.print("  " + p));
        System.out.println();

    //stream iterate

        Stream<Integer> streamIterate = Stream.iterate(4, n -> n + 2).limit(7);

    //crea uno stream di interi,partendo dal numero 4,e goni volta richiama questa funzione ( aggiungere al numero n 2),con un limite di massimo tot elementi
            // in tierate la 'n' assume il valore del numero precedente ( n=4 ; n+2 = 6   then n=6;n+2 = 8 )
        System.out.print("STREAM ITERATE: ");
        streamIterate.forEach(i -> System.out.print("  " + i));
        System.out.println();



    //list

        List<Integer> list = new ArrayList<Integer>();
            for (int i=1;i<=10;i++){
                list.add(i);
            }  //list.forEach(integer -> list.add(integer));

        Stream<Integer>  streamList = list.stream();

        System.out.print("STREAM LIST: ");
        streamList.forEach(l -> System.out.print(" " + l));
        System.out.println();



    // array

        //l array di string giorni viene trasmormato in uno stream di string.
        // tramite il metodo stream di arrays  'java.util.Arrays.stream()' che prende in ingresso l array interessato


        String [] giorni = new String[] {"lun","mar","mer","giov","ven","sab","dom"};

        Stream<String> streamArray = java.util.Arrays.stream(giorni);

        System.out.print("STREAM ARRAY: ");
        streamArray.forEach(giorno ->  System.out.print("  " + giorno));
        System.out.println();



    //da tipi primitivi

        IntStream intStream = IntStream.range(1,10);
        LongStream longStream = LongStream.range(10,20);
        DoubleStream doubleStream = intStream.asDoubleStream();


    }

    public static void intermediateOperations(){

        //filter
        List<Integer> numbersStream = Arrays.asList(2,6,3,20,10,30,-6,50); // creo una lista ,arraylist  di integer

        Stream<Integer> res = numbersStream.stream().filter(x -> x>10); //'streammo' la lista in uno stream ,applico un filtro con il metodo filter(x>10) i filtri possono essere aggiunti in sequenza
        //STREAM: Returns a sequential Stream with this collection as its source.
        //FILTER:Returns a stream consisting of the elements of this stream that match the given predicate.

        res.forEach(System.out::println);  //res conterrà solo i numeri filtrati,non tutti quelli dell araylist
        System.out.println();




        //map
        List<Integer> numbersMap = Arrays.asList(1,2,3,4,5); // creo una lista ,arraylist  di integer

        Stream<Object> resTwo = numbersMap.stream().map(n -> n * 2);//gli elementi della lista,messi nello stream e con il metodo map vengono moltiplicati per 2
        //MAP:Returns a stream consisting of the results of applying the given function to the elements of this stream.
        resTwo.forEach(System.out::println);

    }

    public void terminalOperstions(){

        List<String> memberNames = new ArrayList<>();
        memberNames.add("matteo");
        memberNames.add("antonio");
        memberNames.add("davide");


        //collect

        //trasformiamo la lista in un insieme(Collection)
        Set<String> memNamesCollection= memberNames.stream().collect(Collectors.toSet());
        System.out.println(memNamesCollection);




        //match  Restituisce un boolean se viene soddisfatta al condizione indicata dalla funzione lambda

        //anyMatch() almeno uno della lista soddisfa la condizione (iniziare on 'a')
        boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("a"));
        System.out.println(matchedResult);//true

        //allMatch() tutti della lista soddisfa la condizione (iniziare on 'a')
        boolean matchedResult2 = memberNames.stream().allMatch((s)->s.startsWith("a"));
        System.out.println(matchedResult2);//false

        //noneMatch() nessuno della lista soddisfa la condizione (iniziare on 'a')
        boolean matchedResult3 = memberNames.stream().noneMatch((s)->s.startsWith("a"));
        System.out.println(matchedResult3);//false



        //count

        long totalMateched = memberNames.stream().filter((s)-> s.startsWith("a")).count();  //filtra una condizione e conta solo i filtrati
        System.out.println(totalMateched); //1




    }





}
