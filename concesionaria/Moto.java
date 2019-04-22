package concesionario;

public class Moto extends Vehiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, double precio, int cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: "
                + this.getCilindradas() + "c // Precio: $" + String.format("%1$,.2f", this.getPrecio());

    }
}
