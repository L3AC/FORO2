import javax.swing.*;
import java.util.ArrayList;

// Clase base abstracta Equipo
abstract class Equipo {
    private String fabricante;
    private String modelo;
    private String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    // Getters
    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
    public String getMicroprocesador() { return microprocesador; }

    // Método abstracto para mostrar información
    public abstract String mostrarInfo();
}

// Subclase Desktop
class Desktop extends Equipo {
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

// Subclase Laptop
class Laptop extends Equipo {
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

// Subclase Tablet
class Tablet extends Equipo {
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

// Clase principal con método main
public class TODOPC {
    private static ArrayList<Desktop> desktops = new ArrayList<>();
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    private static ArrayList<Tablet> tablets = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"Registrar equipo", "Ver equipos", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    registrarEquipo();
                    break;
                case 1:
                    verEquipos();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void registrarEquipo() {
        String[] tipos = {"Desktop", "Laptop", "Tablet"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo:", "Registrar Equipo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        switch (tipo) {
            case 0:
                registrarDesktop();
                break;
            case 1:
                registrarLaptop();
                break;
            case 2:
                registrarTablet();
                break;
            default:
                break;
        }
    }

    private static String validarEntrada(String mensaje) {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(mensaje);
            if (entrada == null) return null; // Si presiona Cancelar
            if (entrada.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacío. Intente nuevamente.");
            }
        } while (entrada.trim().isEmpty());
        return entrada.trim();
    }

    private static void registrarDesktop() {
        String fabricante = validarEntrada("Fabricante del Desktop:");
        if (fabricante == null) return;
        String modelo = validarEntrada("Modelo del Desktop:");
        if (modelo == null) return;
        String microprocesador = validarEntrada("Microprocesador del Desktop:");
        if (microprocesador == null) return;
        String memoria = validarEntrada("Memoria del Desktop:");
        if (memoria == null) return;
        String tarjetaGrafica = validarEntrada("Tarjeta gráfica del Desktop:");
        if (tarjetaGrafica == null) return;
        String tamanoTorre = validarEntrada("Tamaño de torre del Desktop:");
        if (tamanoTorre == null) return;
        String capacidadDiscoDuro = validarEntrada("Capacidad de disco duro del Desktop:");
        if (capacidadDiscoDuro == null) return;

        Desktop desktop = new Desktop(fabricante, modelo, microprocesador, memoria, 
                                     tarjetaGrafica, tamanoTorre, capacidadDiscoDuro);
        desktops.add(desktop);
        JOptionPane.showMessageDialog(null, "Desktop registrado exitosamente.");
    }

    private static void registrarLaptop() {
        String fabricante = validarEntrada("Fabricante del Laptop:");
        if (fabricante == null) return;
        String modelo = validarEntrada("Modelo del Laptop:");
        if (modelo == null) return;
        String microprocesador = validarEntrada("Microprocesador del Laptop:");
        if (microprocesador == null) return;
        String memoria = validarEntrada("Memoria del Laptop:");
        if (memoria == null) return;
        String tamanoPantalla = validarEntrada("Tamaño de pantalla del Laptop:");
        if (tamanoPantalla == null) return;
        String capacidadDiscoDuro = validarEntrada("Capacidad de disco duro del Laptop:");
        if (capacidadDiscoDuro == null) return;

        Laptop laptop = new Laptop(fabricante, modelo, microprocesador, memoria, 
                                  tamanoPantalla, capacidadDiscoDuro);
        laptops.add(laptop);
        JOptionPane.showMessageDialog(null, "Laptop registrado exitosamente.");
    }

    private static void registrarTablet() {
        String fabricante = validarEntrada("Fabricante del Tablet:");
        if (fabricante == null) return;
        String modelo = validarEntrada("Modelo del Tablet:");
        if (modelo == null) return;
        String microprocesador = validarEntrada("Microprocesador del Tablet:");
        if (microprocesador == null) return;
        String tamanoPantalla = validarEntrada("Tamaño diagonal de pantalla del Tablet:");
        if (tamanoPantalla == null) return;
        String tipoPantalla = validarEntrada("¿Capacitiva/Resistiva?");
        if (tipoPantalla == null) return;
        String memoriaNAND = validarEntrada("Tamaño memoria NAND del Tablet:");
        if (memoriaNAND == null) return;
        String sistemaOperativo = validarEntrada("Sistema Operativo del Tablet:");
        if (sistemaOperativo == null) return;

        Tablet tablet = new Tablet(fabricante, modelo, microprocesador, tamanoPantalla, 
                                  tipoPantalla, memoriaNAND, sistemaOperativo);
        tablets.add(tablet);
        JOptionPane.showMessageDialog(null, "Tablet registrado exitosamente.");
    }

    private static void verEquipos() {
        String[] tipos = {"Desktop", "Laptop", "Tablet"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo:", "Ver Equipos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        switch (tipo) {
            case 0:
                mostrarEquipos(desktops, "Desktops");
                break;
            case 1:
                mostrarEquipos(laptops, "Laptops");
                break;
            case 2:
                mostrarEquipos(tablets, "Tablets");
                break;
            default:
                break;
        }
    }

    private static <T extends Equipo> void mostrarEquipos(ArrayList<T> equipos, String tipo) {
        if (equipos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay " + tipo + " registrados.");
            return;
        }

        StringBuilder info = new StringBuilder();
        for (T equipo : equipos) {
            info.append(equipo.mostrarInfo()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), tipo, JOptionPane.INFORMATION_MESSAGE);
    }
}
