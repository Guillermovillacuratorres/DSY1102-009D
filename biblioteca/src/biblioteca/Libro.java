/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Guillermo Villacura
 */
public class Libro {
    //1- Crear la clase
    //2- Identificar atributos
    //3- Crear los constructores
    //4- Crear get y set
    //5- Sobrecarega (toString() )
    
    private String titulo, idioma, editorial;
    private int cantidadPaginas, precio, cantidad;
    private boolean disponibilidad;
    private float calificacion;


    
    //Control + espacio

    public Libro() {
    }
                
    public Libro(String titulo, String idioma, String editorial, int cantidadPaginas, int precio, int cantidad, boolean disponibilidad, float calificacion) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.editorial = editorial;
        this.cantidadPaginas = cantidadPaginas;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", idioma=" + idioma + ", editorial=" + editorial + ", cantidadPaginas=" + cantidadPaginas + ", precio=" + precio + ", cantidad=" + cantidad + ", disponibilidad=" + disponibilidad + ", calificacion=" + calificacion + '}';
    }


    
    
    public void prestarLibro(){
        if(this.cantidad > 0){
            setCantidad(cantidad-1);
        }else{
            System.out.println("No tenemos stock de este libro: " + this.titulo);
        }      
    }
    
    
        
    
    
    
    
    
    
    
}
