package org.example;

public class MyThread extends Thread{


    static int broj = 0;
    final int number;
    final int m;
    final int[][] array;

    int t = 0;
    public MyThread(int number1, int m1, int[][] array1){
        this.number = number1;
        this.m = m1;
        this.array = array1;
    }

    public void run() {
        broj++;
        System.out.println("\nThread "+broj+" started\n");
        for(int i=0;i<m;i++){
            if(t < array[number][i]) {
                t = array[number][i];
            }
        }
        System.out.print("\nNajveci broj u redu "+number+" je "+t);
    }


}
