package com.company;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    volatile static LongAdder adder = new LongAdder();
    public static boolean thatsAll;
    public static void main(String[] args) {
        Store someStore = new Store(10, "Starbucks to homeless people");
        Store someStore1 = new Store(15, "Starbucks to cats");
        Store someStore2 = new Store(23, "Starbucks to pirates");
        ThreadToMakeOperetaion thread1 = new ThreadToMakeOperetaion(someStore);
        ThreadToMakeOperetaion thread2 = new ThreadToMakeOperetaion(someStore1);
        ThreadToMakeOperetaion thread3 = new ThreadToMakeOperetaion(someStore2);
        thread1.start();
        thread2.start();
        thread3.start();
        while (true) {
            if (!(thread1.isAlive() && thread2.isAlive() && thread3.isAlive())){
                thatsAll = false;
                break;
            }
        }

        System.out.println("Состояние общего счета на конец дня: " + adder + ".");
    }
}

