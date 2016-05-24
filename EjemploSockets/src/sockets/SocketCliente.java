package sockets;

/*
 * Javier Abell�n. 27 de noviembre de 2003
 *
 * SocketCliente.java
 *
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 * Clase que crea un socket cliente, establece la conexi�n y lee los datos
 * del servidor, escribi�ndolos en pantalla.
 */
public class SocketCliente
 {
     /** Programa principal, crea el socket cliente */
     public static void main (String [] args)
     {
         new SocketCliente();
         
         
     }
     ObjectOutputStream oos = null;
     /**
      * Crea el socket cliente y lee los datos
      */
     public SocketCliente()
     {
         try
         {
             /* Se crea el socket cliente */
             Socket socket = new Socket ("192.168.21.106", 35557);
             System.out.println ("conectado");
             
             oos = new ObjectOutputStream(socket.getOutputStream());
             System.out.println("Sending Request to Socket Server");
             
             DatoSocket message = new DatoSocket();
             
             message.setEdad(51);
             message.setNombre("Juan");

             
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean error;
        
             System.out.println("Introduce un numero (con el scanner)");
        Scanner scan = new Scanner (System.in);
       message.setNumero (scan.nextInt()); 
        
//        do {
//            try {
//                System.out.println("Introduce un entero");
//                num = Integer.parseInt(br.readLine());
//                error = false;
//            } catch (IOException ex) {
//                System.out.println("Error de entrada / salida.");
//                error = true;
//            } catch (NumberFormatException ex) {
//                System.out.println("Debes introducir un número entero.");
//                error = true;
//            }
//        } while (error);
//             
//        message.setNumero(num); 
        
             oos.writeObject(message);
                     
             
             
             /* Se obtiene un stream de lectura para leer tipos simples de java */
             DataInputStream buffer = new DataInputStream (socket.getInputStream());

             
             /**Se lee un entero y un String que nos env�a el servidor, 
              escribiendo el resultado en pantalla */
             System.out.println("Recibido " + buffer.readInt());
             System.out.println ("Recibido " + buffer.readUTF());
             
             /* Se obtiene un stream de lectura para leer objetos */
             ObjectInputStream bufferObjetos =
                new ObjectInputStream (socket.getInputStream());
             DatoSocket message2 = (DatoSocket) bufferObjetos.readObject();
             
             /* Se lee un Datosocket que nos env�a el servidor y se muestra 
              * en pantalla */

             System.out.println ("Recibido " + message2.toString());
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
}
