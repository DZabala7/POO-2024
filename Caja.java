public class Caja extends Producto {
    private int cantidadUnidades;
    private double precioUnitario;

    public Caja(int cantidadUnidades, double precioUnitario) {
        this.cantidadUnidades = cantidadUnidades;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double precio() {
        return cantidadUnidades * precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }
}
