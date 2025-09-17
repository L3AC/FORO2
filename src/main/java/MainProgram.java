
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainProgram extends javax.swing.JFrame {
        private static ArrayList<Desktop> desktops = new ArrayList<>();
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    private static ArrayList<Tablet> tablets = new ArrayList<>();

    // Componentes de la interfaz
    private JButton registrarButton;
    private JButton verButton;
    private JButton salirButton;
    private JPanel mainPanel;
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainProgram.class.getName());
    public MainProgram() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JPanel = new javax.swing.JPanel();
        lb2Laptops = new javax.swing.JLabel();
        lb2Tablets = new javax.swing.JLabel();
        lb2Desktops = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb2Laptops.setText("Laptops");

        lb2Tablets.setText("Tablets");

        lb2Desktops.setText("Desktops");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Bienvenido a TODOPC");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Productos");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lb2Desktops, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lb2Laptops, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb2Tablets, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2Desktops)
                    .addComponent(lb2Laptops)
                    .addComponent(lb2Tablets))
                .addGap(42, 42, 42)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void registrarEquipo() {
        String[] tipos = {"Desktop", "Laptop", "Tablet"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo a registrar:", "Registrar Equipo",
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
        
        String[] tiposPantalla = {"Capacitiva", "Resistiva"};
        int tipoPantallaIndex = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pantalla:", "Tipo de Pantalla",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposPantalla, tiposPantalla[0]);
        if (tipoPantallaIndex == -1) return; // Si presiona Cancelar
        String tipoPantalla = tiposPantalla[tipoPantallaIndex];
        
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
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de equipo a visualizar:", "Ver Equipos",
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
            info.append("=== ").append(tipo.toUpperCase()).append(" ===\n");
            info.append(equipo.mostrarInfo()).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null, info.toString(), "Listado de " + tipo, JOptionPane.INFORMATION_MESSAGE);
    }


    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        verEquipos();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarEquipo();
    }//GEN-LAST:event_btnRegistrarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainProgram().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb2Desktops;
    private javax.swing.JLabel lb2Laptops;
    private javax.swing.JLabel lb2Tablets;
    // End of variables declaration//GEN-END:variables
}
