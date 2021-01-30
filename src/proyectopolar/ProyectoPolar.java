package proyectopolar;

public class ProyectoPolar {
    public static void main(String[] args) {
        //Persona p = new Persona();
        cuarto p = new cuarto();
        IVista vista = new Vista();
        Presentador present = new Presentador(vista, p);
        vista.setPresentador(present);
        vista.iniciar();
    }
}
