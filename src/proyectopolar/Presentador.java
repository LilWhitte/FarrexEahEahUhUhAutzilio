package proyectopolar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presentador implements ActionListener{
    private IVista vista;
    private cuarto c;

    public Presentador(IVista vista, cuarto c) {
        this.vista = vista;
        this.c = c;
    }
    
    public void crear(){
        c.agregar(new Persona(vista.getNombre()));
        mostrar();
    }
    public void mostrar(){
        String lista ="";
        for(Persona p: c.getPersonas()){
            lista+=p.getNombre()+"\n";
        }
        vista.setSalida(lista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equals(IVista.crear)){
            crear();
        }
    }
    
}
