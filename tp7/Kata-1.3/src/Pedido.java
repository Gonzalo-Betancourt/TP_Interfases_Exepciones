public class Pedido {

    // Atributo de clase

    private String estado;

    // atributo de relacion

    private Cliente cliente;

    // constructores

    public Pedido(){}

    public Pedido(String estado) {
        this.estado = estado;
    }

    // getter y setter

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // metodos

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        if (cliente != null) cliente.notificar("Estado de su pedido: " + nuevoEstado);
    }

}
