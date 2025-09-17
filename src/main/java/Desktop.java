// Desktop.java
public class Desktop extends Equipo {
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String capacidadDiscoDuro;

    public Desktop(String fabricante, String modelo, String microprocesador, 
                   String memoria, String tarjetaGrafica, String tamanoTorre, 
                   String capacidadDiscoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    @Override
    public String mostrarInfo() {
        return "Fabricante: " + getFabricante() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Microprocesador: " + getMicroprocesador() + "\n" +
               "Memoria: " + memoria + "\n" +
               "Tarjeta gráfica: " + tarjetaGrafica + "\n" +
               "Tamaño de torre: " + tamanoTorre + "\n" +
               "Capacidad de disco duro: " + capacidadDiscoDuro;
    }
}
