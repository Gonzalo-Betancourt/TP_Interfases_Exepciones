public class Main {

    public static void main(String[] args) {

        // Instanciar cliente

        Cliente cliente = new Cliente("Pedro", "pedro@gmail.com");

        // Instanciar pedido

        Pedido pedido = new Pedido("Enviado");
        pedido.setCliente(cliente);

        // notificar al cliente

        cliente.notificar("Su pedido esta por llegar...");

        // cambiar estado del pedido

        pedido.cambiarEstado("Recibido");

    }
}