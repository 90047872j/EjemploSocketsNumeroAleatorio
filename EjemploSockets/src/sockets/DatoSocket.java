package sockets;

/*
 * Javier Abell�n. 1 de diciembre de 2003
 *
 * DatoSocket.java
 *
 */

import java.io.*;

/**
 * Dato para enviar por el socket. Sus atributos son simples y una Clase Atributo
 */
public class DatoSocket implements Serializable
 {

    /** Primer atributo, un int */
    public DatoSocket(int edad, String nombre, int numero, boolean correcto) {
        this.edad = edad;
        this.nombre = nombre;
        this.numero = numero;
        
    }

    public DatoSocket() {
    }


    public int edad;
    
    private int numero;
    
    
    
    
    
        private boolean acertado;

    public boolean isAcertado() {
        return acertado;
    }

    public void setAcertado(boolean correcto) {
        this.acertado = correcto;
    }

    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
     /** Segundo atributo, un String */
     public String nombre;
     
     /** Tercer atributo, una clase Serializable */
     Atributo e = new Atributo();
     
     /** M�todo para devolver un String en el que se represente el valor de
      * todos los atributos. */
     public String toString ()
     {
         String msg;
         
         if (acertado) {
         
         msg="Correcto";
         
         } else {
         
         msg = "Has Fallado";
         }
         String resultado;
         resultado = "Edad " + Integer.toString(edad) +
            "  -- " + "Nombre: " + nombre + " -- Has adivinado? "+ msg;
            
         return resultado;
     }

     /*******
      *
      * LOS SIGUIENTES M�TODOS SON INNECESARIOS SALVO QUE QUERAMOS QUE SE
      * ENVIEN Y RECIBAN LOS DATOS DE FORMA NO STANDARD.
      * Puedes descomentarlos y todo funcionar� exactamente igual
      *
      *******/
     /*
     private void writeObject(java.io.ObjectOutputStream out)
         throws IOException
     {
         out.writeInt (edad);
         out.writeUTF (nombre);
         out.writeInt (e.a);
         out.writeUTF (e.b);
     }*/
     
     /*
     private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException
     {
         edad = in.readInt();
         nombre = in.readUTF();
         if (e==null) e = new Atributo();
         e.a = in.readInt();
         e.b = in.readUTF();
     }*/
}
