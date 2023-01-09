/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Server {
    public static void main(String[] args){
        //ovaj soket čeka klijenta da se spoji 
        ServerSocket echoServer = null;
        String linija;
        BufferedReader is;
        PrintWriter os;
        Socket clientSocket = null;
        String psovka1 = "patka";
        String psovka2 = "guska";
        String psovka3 = "gavran";
        String uvreda1 = "majmune";
        String uvreda2 = "konju";
        String uvreda3 = "zivotinjo";
        try {
            echoServer = new ServerSocket();
            echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
            System.out.println("Postavljeni posluzitelj:"+echoServer.toString());
        }catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        try {
            // kreiramo sada običan Socket i čekamo klijenta da zatraži
            // vezu
            clientSocket = echoServer.accept();
            System.out.println("Server>> Imamo klijenta: "+clientSocket.getInetAddress());
            //otvaramo kanale za komunikaciju
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);
            //čitamo i pišemo podatke nazad klijentu // sve dok on ne pošalje poruku BYE. 
            boolean done = false;
            while (!done && (linija = is.readLine()) != null) {
                if((linija.equals(psovka1)) == true || (linija.equals(psovka2)) == true || (linija.equals(psovka3)) == true || (linija.equals(uvreda1)) == true || (linija.equals(uvreda2)) == true || (linija.equals(uvreda3)) == true){
                    linija = "*".repeat(linija.length());
                }
                
                os.println("Echo: "+linija.toUpperCase());
                if(linija.trim().equals("BYE") || (linija.trim().equals("bye") )) done=true;
  
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
