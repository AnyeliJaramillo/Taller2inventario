
package Producto;

/**
 *
 * @author 54Y1
 */
public class Producto {
    /**
 * @author ANYELI JARAMILLO
 * @author DANNA LAGOS
 */

    
    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private int cantidad;
    
    //Metodos 
    public Producto(){  
    }
    public Producto(int idProducto, String nombre, double precio, int cantidad){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }
    
    //Getter ans Setter
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
          
    
}

