package proyectopolar;

import java.util.ArrayList;


public class cuarto {    
    private ArrayList<Persona> personas = new ArrayList();

    public cuarto() {
    }
    
    public void agregar(Persona p){
        personas.add(p);
    }
    public void quitar(Persona p){
        personas.remove(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
    
}
