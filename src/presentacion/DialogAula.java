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
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnBuscarAula.setEnabled(false);
    }

    public void desHabilitar() {
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscarAula.setEnabled(true);
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
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnBuscarAula = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(131, 231, 157));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE AULAS ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 400, 50));

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

        jPanel1.setBackground(new java.awt.Color(131, 231, 157));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdArea.setEditable(false);
        jPanel1.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 19, 200, 29));

        txtNombreArea.setEditable(false);
        jPanel1.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 59, 202, 31));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel6.setText("ID Area");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 26, -1, -1));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        jLabel7.setText("Nombre Area");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 67, -1, -1));

        btnSeleccionar.setBackground(new java.awt.Color(87, 170, 226));
        btnSeleccionar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 450, 110));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 830, 330));

        btnGuardar.setBackground(new java.awt.Color(153, 189, 213));
        btnGuardar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        btnBuscarAula.setBackground(new java.awt.Color(153, 189, 213));
        btnBuscarAula.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnBuscarAula.setText("Buscar");
        btnBuscarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAulaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        btnModificar.setBackground(new java.awt.Color(153, 189, 213));
        btnModificar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(240, 112, 132));
        btnEliminar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        btnTodos.setBackground(new java.awt.Color(87, 170, 226));
        btnTodos.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        btnSalir.setBackground(new java.awt.Color(240, 112, 132));
        btnSalir.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, -1, -1));

        btnRestaurar.setBackground(new java.awt.Color(240, 112, 132));
        btnRestaurar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        try {
            DialogBuscarAreas f = new DialogBuscarAreas();
            f.setVisible(true);
            areas = f.areasSelec;
            txtIdArea.setText(areas.getIdArea());
            txtNombreArea.setText(areas.getNombreArea());
        } catch (SQLException ex) {
            Logger.getLogger(DialogFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

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

    private void btnBuscarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAulaActionPerformed
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
    }//GEN-LAST:event_btnBuscarAulaActionPerformed

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idAula = txtIdAula.getText();
        try {
            fd.eliminar(idAula);
            fd.mostrarAula(modelo);
            JOptionPane.showMessageDialog(null, "Se elimino el registro");
            limpiarEntradas();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            fd.mostrarAula(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogAula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAulaActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
        desHabilitar();
// TODO add your handling code here:
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
    private javax.swing.JButton btnBuscarAula;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
