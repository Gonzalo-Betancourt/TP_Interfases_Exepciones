public class Cliente implements Notificable{

    // atributos de clase

    private String nombre;
    private String email;

    // constructores

    public Cliente(){}

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // metodos

    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }

}
