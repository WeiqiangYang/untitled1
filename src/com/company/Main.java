package com.company;

import java.util.*;
public class Main implements Runnable {

    public static void main(String[] args) {
        Runnable r1 = new Main(); //也可写成ThreadTest r1 = new ThreadTest();
        Runnable r2 = new Main();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
            for(int i=0;i<10;i++) {
                System.out.print(" " + i);
            }
    }
}
