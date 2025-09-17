// Laptop.java
public class Laptop extends Equipo {
    private String memoria;
    private String tamanoPantalla;
    private String capacidadDiscoDuro;

    public Laptop(String fabricante, String modelo, String microprocesador, 
                  String memoria, String tamanoPantalla, String capacidadDiscoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String mostrarInfo() {
        return "Fabricante: " + getFabricante() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Microprocesador: " + getMicroprocesador() + "\n" +
               "Memoria: " + memoria + "\n" +
               "Tamaño pantalla: " + tamanoPantalla + "\n" +
               "Capacidad de disco duro: " + capacidadDiscoDuro;
    }
}