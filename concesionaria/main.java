package concesionario;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        Concesionaria concesionaria = new Concesionaria();
        
        List<Vehiculo> lista = Arrays.asList(
            new Auto( "Peugeot", "206", 200000, 4),
            new Moto( "Honda", "Titan", 60000, 125),
            new Auto( "Peugeot", "208", 250000, 5),
            new Moto( "Yamaha", "YBR", 80500.50, 160)
        );
        
        concesionaria.addProductos(lista);
        concesionaria.mostrarProductos();
        System.out.println("====================================================");
        concesionaria.mayorPrecio();
        concesionaria.menorPrecio();
        concesionaria.buscar("Y");
        System.out.println("====================================================");
        concesionaria.ordenarVehiculos();
    }
}
