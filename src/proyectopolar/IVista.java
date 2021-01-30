package proyectopolar;

public interface IVista {
    public void setPresentador(Presentador p);
    public void iniciar();
    public String getNombre();
    public void setSalida(String e);    
    static final String crear = "Crear";
}
