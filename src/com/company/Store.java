package com.company;

public class Store implements Runnable {
    int howMuchTime;
    String nameOfStore;

    public Store(int howMuchTime, String nameOfStore) {
        this.howMuchTime = howMuchTime;
        this.nameOfStore = nameOfStore;
    }

    public String getNameOfStore() {
        return nameOfStore;
    }

    @Override
    public void run() {
        for (int i = 0; i < howMuchTime; i++) {
            double sum = Math.random() * 1000;
            Math.round(sum);
            Main.adder.add((long) (sum));
            System.out.printf(nameOfStore + " получил выручку в размере : " + sum + "\n");
        }

    }
}
