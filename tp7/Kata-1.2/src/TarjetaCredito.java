public class TarjetaCredito implements PagoConDescuento{

    // atributos de clase

    private String numeroTarjeta;

    // constructores

    public TarjetaCredito(){}

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
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
