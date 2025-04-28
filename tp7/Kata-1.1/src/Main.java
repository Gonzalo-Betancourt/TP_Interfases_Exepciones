public class Main {

    public static void main(String[] args) {

        // instanciar pedido

        Pedido pedido = new Pedido();

        // Añadir productos a pedido

        pedido.addProducto(new Producto("Botella de Agua", 50));
        pedido.addProducto(new Producto("Papas Fritas", 40));
        pedido.addProducto(new Producto("Celular", 1000));

        // Calcular el total a pagar

        System.out.println("Monto a pagar: $" + pedido.calcularTotal());

    }

}