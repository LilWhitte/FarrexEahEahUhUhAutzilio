package producto;

import java.util.ArrayList;

public class Categoria {
    private int id;
    private String nombre;
    private ArrayList<Producto> productos = new ArrayList();

    public Categoria(int id,String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public Producto buscar(int id){
        for(Producto p: productos){
            if (p.getId()==id) {
                return p;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
}
