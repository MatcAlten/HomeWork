package org.example.example;

public class TypeEx {

    public static void main(String[] args) {


        int myNum = cube(3);
        System.out.println( cube(2));
        System.out.println(myNum);


        boolean b = false;
        char c = 'c';
        byte b1 = 127;
        short s = 32767;
        int i = 7;
        long l = 99999999999999999L;
        float f = 1233;
        double d = 3.5;

    }

    public //access modifier: visibile da chiunque
    static //non accesso modifier: ? ? ?
    int //return statment: returna un int (numero intero)
    cube //method name
    (int numberTocube)//parameters input: number(called numberToCube)
    {

        return numberTocube * numberTocube * numberTocube; //return an int type ->numberToCube(same name of the input parameter)
    }


}
