package org.example;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count = 0;
        int a = 12, b = 10;
        double r = 1.2;
        float f = 1.4f;
        boolean trueFalse = true;
        String str = "No";
        char cc = 'r';
        char ccc = 143;

        if (trueFalse) {
            System.out.println(str);
        } else {
            System.out.println("Yes");
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i);
//        }

        //for (; ;){}

        int i = 0;
        while (i<10){
            System.out.println(i + " ");
            i++;

        }
        
        Dvorf olegoria = new Dvorf(18, 1.7, 60.2);
        Dvorf olganatriy = new Dvorf(19, 1.8, 55);



        System.out.println("olegoria age:" + olegoria.getAge());
        System.out.println("olganatriy age:" + olganatriy.getAge());


    }
}