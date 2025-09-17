// Tablet.java
public class Tablet extends Equipo {
    private String tamanoPantalla;
    private String tipoPantalla;
    private String memoriaNAND;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador, 
                  String tamanoPantalla, String tipoPantalla, 
                  String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String mostrarInfo() {
        return "Fabricante: " + getFabricante() + "\n" +
               "Modelo: " + getModelo() + "\n" +
               "Microprocesador: " + getMicroprocesador() + "\n" +
               "Tamaño diagonal de pantalla: " + tamanoPantalla + "\n" +
               "¿Capacitiva/Resistiva? " + tipoPantalla + "\n" +
               "Tamaño memoria NAND: " + memoriaNAND + "\n" +
               "Sistema Operativo: " + sistemaOperativo;
    }
}
