public class PayPal implements PagoConDescuento{

    // atributos de clase

    private String email;

    // constructores

    public PayPal(){}

    public PayPal(String email) {
        this.email = email;
    }

    // metodos

    @Override
    public double procesarPago(double monto){
        return monto;
    }

    @Override
    public double aplicarDescuento(double porcentaje){
        return 1 - (porcentaje / 100);
    }

}
