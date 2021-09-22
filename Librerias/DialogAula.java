/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.AulaDAO;
import entidades.Areas;
import entidades.Aula;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogAula extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    AulaDAO fd = new AulaDAO();
    Areas areas;

    /**
     * Creates new form DialogAula
     */
    public DialogAula() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        fd.mostrarAula(modelo);
        desHabilitar();

    }

    public void limpiarEntradas() {
        txtIdAula.setText("");
        txtNumAula.setText("");
        txtCapacidad.setText("");
        txtNumAus.setText("");
        txtIdArea.setText("");
        txtNombreArea.setText("");
        txtIdAula.requestFocus();
        
    }

    public void habilitar() {
        btnMostrar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnConsultar.setEnabled(false);
    }

    public void desHabilitar() {
        btnMostrar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnConsultar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdAula = new javax.swing.JTextField();
        txtNumAula = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtNumAus = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtIdArea = new javax.swing.JTextField();
        txtNombreArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSeleccionarCarrera = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new rsbuttom.RSButtonMetro();
        btnConsultar = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnMostrar = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnRestaurar = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE AULAS ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 430, 50));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel2.setText("ID AULA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel3.setText("NUMERO AULA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel4.setText("CAPACIDAD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel5.setText("NUMERO AUSENTES");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtIdAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAulaActionPerformed(evt);
            }
        });
        txtIdAula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, 30));

        txtNumAula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumAulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, 30));

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, 30));

        txtNumAus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumAusKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumAus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdArea.setEditable(false);
        jPanel1.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 29));

        txtNombreArea.setEditable(false);
        jPanel1.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 202, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("ID Area");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Nombre Area");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("AREA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnSeleccionarCarrera.setBackground(new java.awt.Color(153, 255, 153));
        btnSeleccionarCarrera.setText("SELECCIONAR");
        btnSeleccionarCarrera.setColorHover(new java.awt.Color(148, 237, 148));
        btnSeleccionarCarrera.setColorNormal(new java.awt.Color(153, 255, 153));
        btnSeleccionarCarrera.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnSeleccionarCarrera.setColorTextPressed(new java.awt.Color(153, 153, 153));
        btnSeleccionarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCarreraActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 400, 180));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 830, 330));

        btnGuardar.setText("Guardar");
        btnGuardar.setColorBorde(null);
        btnGuardar.setColorHover(new java.awt.Color(194, 210, 228));
        btnGuardar.setColorNormal(new java.awt.Color(194, 224, 228));
        btnGuardar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnGuardar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.setColorBorde(null);
        btnConsultar.setColorHover(new java.awt.Color(194, 210, 228));
        btnConsultar.setColorNormal(new java.awt.Color(194, 224, 228));
        btnConsultar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnConsultar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        btnModificar.setText("Actualizar");
        btnModificar.setColorBorde(null);
        btnModificar.setColorHover(new java.awt.Color(194, 210, 228));
        btnModificar.setColorNormal(new java.awt.Color(194, 224, 228));
        btnModificar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnModificar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        btnMostrar.setText("Mostrar");
        btnMostrar.setColorBorde(null);
        btnMostrar.setColorHover(new java.awt.Color(194, 210, 228));
        btnMostrar.setColorNormal(new java.awt.Color(194, 224, 228));
        btnMostrar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnMostrar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.setColorBorde(null);
        btnSalir.setColorHover(new java.awt.Color(228, 171, 172));
        btnSalir.setColorNormal(new java.awt.Color(237, 197, 212));
        btnSalir.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnSalir.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 760, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorBorde(null);
        btnEliminar.setColorHover(new java.awt.Color(228, 171, 172));
        btnEliminar.setColorNormal(new java.awt.Color(237, 197, 212));
        btnEliminar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnEliminar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        btnRestaurar.setText("Restaurar");
        btnRestaurar.setColorBorde(null);
        btnRestaurar.setColorHover(new java.awt.Color(194, 210, 228));
        btnRestaurar.setColorNormal(new java.awt.Color(194, 224, 228));
        btnRestaurar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRestaurar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAulaActionPerformed

    private void txtNumAusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumAusKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (txtNumAus.getText().length() >= 2 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumAusKeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char c = evt.getKeyChar();
        if (txtCapacidad.getText().length() >= 2 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtNumAulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumAulaKeyTyped
        char c = evt.getKeyChar();
        if (txtNumAula.getText().length() >= 3 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumAulaKeyTyped

    private void txtIdAulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAulaKeyTyped
        if (txtIdAula.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdAulaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idAula = txtIdAula.getText();
        int numAula = Integer.parseInt(txtNumAula.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int numAus = Integer.parseInt(txtNumAus.getText());
        Aula x = new Aula(idAula, numAula, capacidad, numAus, areas);
        try {
            fd.insertar(x);
            fd.mostrarAula(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            String idAula = txtIdAula.getText();
            Aula x;
            x = fd.buscarAula(idAula);
            if (x != null) {
                txtNumAula.setText(String.valueOf(x.getnAula()));
                txtCapacidad.setText(String.valueOf(x.getCapacidad()));
                txtNumAus.setText(String.valueOf(x.getNumeroAusentes()));
                txtIdArea.setText(x.getAreas().getIdArea());
                txtNombreArea.setText(x.getAreas().getNombreArea());
                areas = x.getAreas();
                habilitar();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String idAula = txtIdAula.getText();
        int numAula = Integer.parseInt(txtNumAula.getText());
        int capacidad = Integer.parseInt(txtCapacidad.getText());
        int numAus = Integer.parseInt(txtNumAus.getText());
        Aula x = new Aula(idAula, numAula, capacidad, numAus, areas);
        try {
            if (x != null) {
                fd.actualizar(x);
                fd.mostrarAula(modelo);
                limpiarEntradas();
                desHabilitar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try {
            fd.mostrarAula(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogAula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSeleccionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCarreraActionPerformed
        try {
            DialogBuscarAreas f = new DialogBuscarAreas();
            f.setVisible(true);
            areas = f.areasSelec;
            txtIdArea.setText(areas.getIdArea());
            txtNombreArea.setText(areas.getNombreArea());
        } catch (SQLException ex) {
            Logger.getLogger(DialogFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeleccionarCarreraActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DialogAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DialogAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DialogAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DialogAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DialogAula dialog = new DialogAula(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnConsultar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private rsbuttom.RSButtonMetro btnGuardar;
    private rsbuttom.RSButtonMetro btnModificar;
    private rsbuttom.RSButtonMetro btnMostrar;
    private rsbuttom.RSButtonMetro btnRestaurar;
    private rsbuttom.RSButtonMetro btnSalir;
    private rsbuttom.RSButtonMetro btnSeleccionarCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtIdAula;
    private javax.swing.JTextField txtNombreArea;
    private javax.swing.JTextField txtNumAula;
    private javax.swing.JTextField txtNumAus;
    // End of variables declaration//GEN-END:variables
}
