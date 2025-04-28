import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable{

    // atributo de relacion

    private List<Producto> productos;

    // constructor

    public Pedido(){}

    // metodos

    public void addProducto(Producto producto){
        if (productos == null) productos = new ArrayList<>();
        productos.add(producto);
    }

    @Override
    public double calcularTotal(){

        double montoFinal = 0;

        for (Producto p : productos){
            montoFinal += p.getPrecio();
        }

        return montoFinal;
    }



}
