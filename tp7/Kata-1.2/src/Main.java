public class Main {

    public static void main(String[] args) {

        // Instanciar Tatjeta de Credito y PayPal

        TarjetaCredito tarjeta = new TarjetaCredito("3124124134");
        PayPal cuentaPayPal = new PayPal("pablo45@gmail.com");

        // Aplicar metodos

        System.out.println("Se debe abonar: $" + tarjeta.procesarPago(100) +
                ". Se debe aplicar un 10% de descuento, el monto final es de: $" + tarjeta.procesarPago(100) * tarjeta.aplicarDescuento(10));

        System.out.println("Se debe abonar: $" + cuentaPayPal.procesarPago(100) +
                ". Se debe aplicar un 10% de descuento, el monto final es de: $" + cuentaPayPal.procesarPago(100) * cuentaPayPal.aplicarDescuento(10));

    }

}