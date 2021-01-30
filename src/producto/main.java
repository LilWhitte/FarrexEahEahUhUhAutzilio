package producto;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Producto p1= new Producto(1,"producto1", 100, 100);
        Producto p2= new Producto(2,"producto2", 40, 240);
        Producto p3= new Producto(3,"producto3", 500, 300);
        Producto p4= new Producto(4,"producto4", 20, 200);
        Producto p5= new Producto(5,"producto5", 230, 20);
        Producto p6= new Producto(6,"producto6", 123, 2100);
        
        Categoria c1 = new Categoria(1,"categoria 1");
        Categoria c2 = new Categoria(2,"categoria 2");
        
        c1.agregarProducto(p1);
        c1.agregarProducto(p2);
        c1.agregarProducto(p3);
        c2.agregarProducto(p4);
        c2.agregarProducto(p5);
        c2.agregarProducto(p6);
        
        
        Inventario inventario = new Inventario();
        inventario.agregarCategoria(c1);
        inventario.agregarCategoria(c2);
        
        inventario(inventario);
        Scanner in = new Scanner(System.in);
        
        System.out.print("Buscar: ");
        Categoria ct =inventario.buscar(in.nextInt());
        if (ct!=null) {
            System.out.println("Categoria encontrada..");
            switch (eleccion(in)){
                case 1:
                    System.out.print("id: ");
                    int id = in.nextInt();
                    System.out.print("nombre: ");
                    String nombre =in.next();
                    System.out.print("Costo: ");
                    int costo = in.nextInt();
                    System.out.print("cantidad:");                    
                    int cantidad = in.nextInt();
                    ct.agregarProducto(new Producto(id,nombre,costo,cantidad));
                    productosCat(ct);
                    break;
                case 2:
                    productosCat(ct);
                    break;
            }
        }else{
            System.out.println("no existe...");
        }       
    }
    public static void mostrar(Inventario i){
        for(Categoria c: i.getCategorias()){
            System.out.println("-----------------------------");
            System.out.println("Categoria: "+c.getNombre());
            for(Producto p: c.getProductos()){
                System.out.println("- ["+p.getId()+"] "+p.getNombre()+"\t"+p.getCosto());
            }
        }
    }
    public static int eleccion(Scanner in){
        System.out.println("[1] agregar");
        System.out.println("[2] mostrar");
        System.out.print("Eleccion: ");
        return in.nextInt();
    }
    public static void inventario(Inventario i){
        for(Categoria c: i.getCategorias()){
            System.out.println("["+c.getId()+"]"+c.getNombre());            
        }
    }
    public static void productosCat(Categoria c){
        for(Producto p: c.getProductos()){
            System.out.println("["+p.getId()+"]"+p.getNombre()+"\t"+p.getCosto());            
        }
    }
}
