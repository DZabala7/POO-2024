import java.util.ArrayList;
import java.util.List;

public class Bolsa extends Producto {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double precio() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.precio();
        }
        return total * 0.9;  // Aplica el 10% de descuento
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
