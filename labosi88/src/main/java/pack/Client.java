/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;  

/**
 *
 * @author student
 */
public class Client {
    public static void main(String args[]){
        String host = "127.0.0.1";
    int port = 9999;
    Scanner stringScanner = new Scanner(System.in);
    int stop = 1;
    String endword = "BYE";
    try{
 // kreiramo soket za komunikaciju sa serverom
        Socket klijent = new Socket(host, port);
        System.out.println("Klijent: "+klijent);
 //input i output strimovi
        InputStream in = klijent.getInputStream();
        OutputStream out = klijent.getOutputStream();
        BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        PrintWriter ps = new PrintWriter(new PrintStream(out), true /* autoflush */);
 //poruke koje će nam posluživač vratiti nazad
      //  while(stop != 0){
            //String[] eho = {"Hello world", "majmune", "BYE"};
            //for(int i=0;i<eho.length; ++i) ps.println(eho[i]);
            String input = stringScanner.next();
            ps.println(input);
           
        //}
        
        
 //sad nam tu istu poruku vraća posluzivač
    String linija=null;
    while((linija=bis.readLine()) != null) {
            System.out.println(linija);
            input = stringScanner.next();
            ps.println(input);
        }
    }catch (Exception e){
      e.printStackTrace();
 }
}
}
