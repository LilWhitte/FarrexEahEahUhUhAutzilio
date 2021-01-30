package producto;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Categoria> categorias = new ArrayList();

    public Inventario() {
    }

    public void agregarCategoria(Categoria c){
        categorias.add(c);
    }
    public Categoria buscar(int id){
        for(Categoria c: categorias){
            if (c.getId()==id) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
}
