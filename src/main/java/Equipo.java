// Equipo.java
public abstract class Equipo {
    private String fabricante;
    private String modelo;
    private String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
    public String getMicroprocesador() { return microprocesador; }

    public abstract String mostrarInfo();
}
