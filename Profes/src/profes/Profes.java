/*
 *
 */
package profes;

import utilidades.Fichero;

/**
 *
 * @author usu21
 */
public class Profes {
    
    public static Fichero miFichero;
    public static ListaProfesores misProfesores;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    miFichero = new Fichero("profesores.xml");
    misProfesores = (ListaProfesores) miFichero.leer();
    
        if (misProfesores==null) {
            misProfesores = new ListaProfesores();
        }
    
    Menu m = new Menu();
    m.setLocationRelativeTo(null);
    m.setVisible(true);
    }
    
}
