package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int M;

        Scanner sc = new Scanner(System.in);
        //MyThread th1 = new MyThread();

        do{
            System.out.println("Unesi M koji se nalazi u intervali 2-10 ");
            M = sc.nextInt();
        }while(M < 2 || M > 10);
        System.out.println("M = "+M);

        int[][] array = new int[M][M];

        for(int i = 0;i < M; i++){
            for(int j = 0;j < M; j++){
                array[i][j] = i + j;
            }
        }
        for(int i = 0;i < M; i++){
            for(int j = 0;j < M; j++){
                System.out.print(array[i][j] );
            }
            System.out.print("\n");
        }



        for(int i = 0;i < M; i++){
            MyThread t1 = new MyThread(i, M, array);
            t1.start();
        }

    }
}