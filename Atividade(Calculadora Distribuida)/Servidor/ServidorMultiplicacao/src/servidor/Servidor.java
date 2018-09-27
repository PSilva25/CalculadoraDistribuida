/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Renésio
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Socket socket = null;

               String host = "192.168.0.100";

               socket = new Socket(host, 5001);
          
               PrintWriter escritor = new PrintWriter(socket.getOutputStream());

               String envia = " , =";

               escritor.println(envia);
               escritor.flush();
               escritor.close();

               System.out.println("Resultado enviado!");

        
    }
    
}
