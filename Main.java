public class Main {
    public static void main(String[] args) {
        // Crear cajas
        Caja caja1 = new Caja(10, 5.0);  // 10 unidades a 5.0 cada una
        Caja caja2 = new Caja(5, 7.5);   // 5 unidades a 7.5 cada una

        // Crear bolsa y agregar productos
        Bolsa bolsa = new Bolsa();
        bolsa.agregarProducto(caja1);
        bolsa.agregarProducto(caja2);

        // Mostrar el precio total de la bolsa
        System.out.println("Precio de la bolsa: " + bolsa.precio());
    }
}
