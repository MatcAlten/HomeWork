package org.example.example;

import java.util.Scanner;

public class ScannerEx {
    
    
    Scanner mScanner = new Scanner(System.in);
    private  String dotName;
    private String like;
    private int dotNumb;
    
    public void print() throws InterruptedException {

        System.out.println("Come ti chiami ?");
        dotName = mScanner.next();

        System.out.println("Quanti dot?");
        dotNumb = mScanner.nextInt();
        
        long delay = System.currentTimeMillis();
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(700);
        System.out.println(".  .");
        Thread.sleep(900);
        System.out.println(".  .  .");
        
        like = "\ud83d\udc4d";


        for (int x = 1; x <= dotNumb; x++){

            if (x % 20 !=0) {
                System.out.print(like);
            }else {
                System.out.println(like);
            }
        }


        
    }
    
    
    
    
}
