/*
 *Entidad Lista de Profesores
 */
package profes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaProfesores implements Serializable {

    private ArrayList<Profesor> lista;

    public ListaProfesores() {
        lista = new ArrayList<>();
    }

    public void altaProfesor(Profesor p) {
        lista.add(p);
    }

    public boolean existe(Profesor p) {
        return lista.contains(p);

    }

    //Metodo que devuelve la lista de especialidades
    //de los profesores que hay en la lista
    public ArrayList<String> especialidades() {

        ArrayList<String> esp = new ArrayList<>();
        for (Profesor p : lista) {
            if (!esp.contains(p.getEspecialidad())) {
                esp.add(p.getEspecialidad());
            }
        }
        return esp;
    }

    
    public ListaProfesores profesoresPorEspecialidad (String especialidad){
    
        ListaProfesores profesEsp = new ListaProfesores();
        
    for (Profesor p : lista)
        
        if (especialidad.equalsIgnoreCase(p.getEspecialidad())) {
            
            profesEsp.altaProfesor(p);
            
        }
    
    return profesEsp;
    
    }
    
    
    
    
    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }

}
