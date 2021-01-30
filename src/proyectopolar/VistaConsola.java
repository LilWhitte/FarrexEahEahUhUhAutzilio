package proyectopolar;

import java.util.Scanner;

public class VistaConsola implements IVista{

    Presentador p;
    
    @Override
    public void setPresentador(Presentador p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        System.out.println("Empezamos");
        p.crear();
    }

    @Override
    public String getNombre() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresar Nombre: ");
        return in.nextLine();
    }

    @Override
    public void setSalida(String e) {
        System.out.println(e);
    }
    
}
