public class Producto implements Pagable{

    // atributos de clase

    private String nombre;
    private double precio;

    // constructores

    public Producto(){}

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // getter and setter

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

    // metodos

    @Override
    public double calcularTotal(){
        return precio;
    }

}
