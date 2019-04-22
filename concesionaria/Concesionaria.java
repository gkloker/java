package concesionario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Concesionaria {    
    
    private List<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void mostrarProductos(){
        this.vehiculos.forEach(System.out::println);
    }

    public void addProductos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void mayorPrecio(){
        Comparator<Vehiculo> comparator = Comparator.comparing( Vehiculo::getPrecio );
        Vehiculo maxObject = vehiculos.stream().max(comparator).get();
        System.out.println("Vehiculo más caro: " + maxObject.getMarca() + " " + maxObject.getModelo());
    }
    
    public void menorPrecio(){
        Comparator<Vehiculo> comparator = Comparator.comparing( Vehiculo::getPrecio );
        Vehiculo minObject = vehiculos.stream().min(comparator).get();
        System.out.println("Vehiculo más barato: " + minObject.getMarca() + " " + minObject.getModelo());
    }
    
    public void buscar(String valor){
        vehiculos.stream().filter(f -> f.getModelo().contains(valor))
                            .forEach(f -> System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + f.getMarca() + " " + f.getModelo() + " $" + f.getPrecio()));
    }
    
    public void ordenarVehiculos(){
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
        for(Vehiculo v:vehiculos){
            System.out.println(v.getMarca() + " " + v.getModelo());
        }
    }    
}
