/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class VistaTablero extends javax.swing.JFrame {
    
    private JButton[][] jButtonMatrix = new JButton[8][8];
    private JComboBox <String> comboPiezas;
    private JTextField inicioFila;
    private JTextField inicioColumna;
    //private javax.swing.JButton jButton1;
    //private javax.swing.JButton jButton2;
    private JButton botonIniciar;
    private JButton botonReiniciar;
    //private javax.swing.JPanel jPanel1;
    //private javax.swing.JPanel jPanel2;
    private JuegoDeAjedrez ajedrez;
    private JLabel[][] etiquetasTablero = new JLabel[8][8];
    /**
     * Creates new form VistaTablero
     */
    public VistaTablero() {
        initComponents();
        for (int i=0; i<8; i++){
            for (int j=0;j<8; j++){
                jButtonMatrix[i][j] = new JButton();
                jButtonMatrix[i][j].setPreferredSize(new Dimension(50,50));
                jPanelTablero.add(jButtonMatrix[i][j]);
            }
        }
        configuracionAdicional();
        this.setSize(1190, 828);
        this.setLocationRelativeTo(null);
        this.setTitle("Ajedrez");
        //inicializarTablero();
        }
        private void configuracionAdicional(){
            inicializarTablero();
            configurarBotones();
            ajedrez = new JuegoDeAjedrez();
        }
        
        //Configura el actionListener para boton iniciar PILAS AQUI
                       
        private void configurarBotones(){
        botonIniciar = new JButton("Iniciar");
        botonIniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ajedrez.iniciarJuego();
            }
        });
        //Configura el actionListener para boton reiniciar
        botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ajedrez.reiniciarJuego();
            }
        });
        //Añadir mas codigo
    }
    private void inicializarTablero() {
        JPanel panelTablero = new JPanel(new GridLayout(8, 8));
        for (int i = 0; i < etiquetasTablero.length; i++) {
            for (int j = 0; j < etiquetasTablero[i].length; j++) {
                etiquetasTablero[i][j] = new JLabel();
                etiquetasTablero[i][j].setOpaque(true);
                etiquetasTablero[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelTablero.add(etiquetasTablero[i][j]);
            }
        }
        this.add(panelTablero);
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTablero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFila = new javax.swing.JTextField();
        jTextFieldColumna = new javax.swing.JTextField();
        jComboBoxImagen = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTablero.setLayout(new java.awt.GridLayout(8, 8));

        jPanel2.setBackground(new java.awt.Color(204, 168, 126));

        jButton65.setText("Iniciar");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setText("Reiniciar");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jLabel1.setText("Inicio Fila");

        jLabel2.setText("Inicio Columna");

        jTextFieldFila.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTextFieldColumna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jTextFieldColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnaActionPerformed(evt);
            }
        });

        jComboBoxImagen.setBackground(new java.awt.Color(231, 177, 99));
        jComboBoxImagen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "AlfilBlanco", "AlfilNegro", "CaballoBlanco", "PeonBlanco", "PeonNegra", "ReinaBlanca", "ReinaNegra", "TorreBlanca", "TorreNegra" }));
        jComboBoxImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldFila, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jComboBoxImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFila, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton65)
                .addGap(33, 33, 33)
                .addComponent(jButton66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Restart");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // Configuracion del botón iniciar   
        int fila = Integer.parseInt(jTextFieldFila.getText());
        int columna = Integer.parseInt(jTextFieldColumna.getText());
        String imagenSeleccionada = (String) jComboBoxImagen.getSelectedItem();
        String rutaImagen = "/Imagenes/"+imagenSeleccionada+".png";
        jButtonMatrix[fila][columna].setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
        
        ajedrez.iniciarJuego();       
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // Configuración del botón reiniciar
        
        ajedrez.reiniciarJuego(); 
        
        //botonReiniciar.addActionListener(new ActionListener() {
    //@Override
    //public void actionPerformed(ActionEvent e) {
        //reiniciarJuego();
    //}
//});
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jTextFieldColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnaActionPerformed
        inicioColumna = new JTextField();
    }//GEN-LAST:event_jTextFieldColumnaActionPerformed

    private void jComboBoxImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxImagenActionPerformed
    String[] piezas = {"Alfil", "Torre", "Reina", "Caballo", "Peón"};
    comboPiezas = new JComboBox<>(piezas);
    comboPiezas.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String piezaSeleccionada = (String) comboPiezas.getSelectedItem();
            try {
                int fila = Integer.parseInt(inicioFila.getText());
                int columna = Integer.parseInt(inicioColumna.getText());
                List<String> movimientos;
                
                ImageIcon iconoPieza = new ImageIcon("C:\\Users\\danie\\OneDrive\\Documentos\\NetBeansProjects\\JavaGame\\src\\Imagenes\\" + piezaSeleccionada + ".png");
                
                switch (piezaSeleccionada) {
                    case "Alfil":
                        movimientos = Alfil.calcularMovimientos(fila, columna);
                        break;
                    case "Reina":
                        movimientos = Reina.calcularMovimientos(fila, columna);
                        break;
                    case "Torre":
                        movimientos = Torre.calcularMovimientos(fila, columna);
                        break;
                    case "Caballo":
                        movimientos = Caballo.calcularMovimientos(fila, columna);
                        break;
                    case "Peón":
                        movimientos = Peon.calcularMovimientos(fila, columna);
                        break;
                        
                    // Puedes agregar más casos para otras piezas aquí
                    default:
                        movimientos = new ArrayList<>();
                        break;
                }
                
                // Aquí puedes mostrar los movimientos posibles al usuario
                // Por ejemplo, podrías imprimirlos en la consola o mostrarlos en un componente de la interfaz
                System.out.println("Movimientos posibles para " + piezaSeleccionada + ": " + movimientos);
                
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el texto ingresado no es un número válido
                System.out.println("Por favor, ingresa números válidos para la fila y columna.");
            }
        }
    });
        
        
    }//GEN-LAST:event_jComboBoxImagenActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JComboBox<String> jComboBoxImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTablero;
    private javax.swing.JTextField jTextFieldColumna;
    private javax.swing.JTextField jTextFieldFila;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    // Inicialización de JComboBox para las piezas de ajedrez
    comboPiezas = new JComboBox<>(new String[]{"Peón", "Torre", "Caballo", "Alfil", "Reina", "Rey"});
    comboPiezas.setBounds(10, 10, 80, 20); // Ajusta la posición y tamaño según sea necesario

    // Inicialización de JTextField para la fila
    inicioFila = new JTextField();
    inicioFila.setBounds(100, 10, 40, 20); // Ajusta la posición y tamaño según sea necesario
    inicioFila.setToolTipText("Ingrese la fila (1-8)");

    // Inicialización de JTextField para la columna
    inicioColumna = new JTextField();
    inicioColumna.setBounds(150, 10, 40, 20); // Ajusta la posición y tamaño según sea necesario
    inicioColumna.setToolTipText("Ingrese la columna (A-H)");

    // Agregar los componentes al JFrame o a un JPanel según corresponda
    this.add(comboPiezas);
    this.add(inicioFila);
    this.add(inicioColumna);
    }
    
    //private void initComponents() {
    //}
}