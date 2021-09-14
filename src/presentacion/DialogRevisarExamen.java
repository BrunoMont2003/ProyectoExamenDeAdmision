/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.ExamenDAO;
import datos.PostulanteDAO;
import entidades.Examen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class DialogRevisarExamen extends javax.swing.JDialog {

    PostulanteDAO postulanteDAO = new PostulanteDAO();
    ExamenDAO examendao = new ExamenDAO();
    Examen examen;
    DefaultTableModel modelo = new DefaultTableModel();
    PostulanteDAO postulantedao = new PostulanteDAO();

    public DialogRevisarExamen() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        setLocation(100,100);
        initComponents();
        try {
            for (int i = 0; i < examendao.listarExamenes().size(); i++) {
                cboIdExamen.addItem(examendao.listarExamenes().get(i).getIdExamen());
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        postulanteDAO.mostrarPostulantes(modelo);

//        deshabilitar();

    }

    public void deshabilitar() {
        btnOrdenMerito.setEnabled(false);
        btnCalificar.setEnabled(false);
    }

    public void habilitarCalificar() {
        btnCalificar.setEnabled(true);
    }

    public void habilitarOrdenar() {
        btnOrdenMerito.setEnabled(true);
        btnCalificar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboIdExamen = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtNombreArea = new javax.swing.JTextField();
        txtIdArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiarSeleccion = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNombreModalidad = new javax.swing.JTextField();
        txtIdModalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnRestaurar = new rsbuttom.RSButtonMetro();
        btnCalificar = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        btnOrdenMerito = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(233, 252, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SELECCIONAR EXAMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("ID Examen");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        cboIdExamen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cboIdExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cboIdExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdExamenActionPerformed(evt);
            }
        });
        jPanel2.add(cboIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, 30));

        btnBuscar.setBackground(new java.awt.Color(168, 192, 215));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Semestre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        txtSemestre.setEditable(false);
        txtSemestre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreKeyTyped(evt);
            }
        });
        jPanel2.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreArea.setEditable(false);
        txtNombreArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombreArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAreaKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 290, -1));

        txtIdArea.setEditable(false);
        txtIdArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAreaKeyTyped(evt);
            }
        });
        jPanel3.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("ID AREA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 420, 150));

        btnLimpiarSeleccion.setBackground(new java.awt.Color(234, 107, 107));
        btnLimpiarSeleccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnLimpiarSeleccion.setText("Restaurar");
        btnLimpiarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSeleccionActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 120, -1));

        txtDia.setEditable(false);
        txtDia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Día");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        txtMes.setEditable(false);
        txtMes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPanel2.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 70, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Mes");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 20));

        txtAño.setEditable(false);
        txtAño.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 70, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Año");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Modalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreModalidad.setEditable(false);
        txtNombreModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombreModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreModalidadKeyTyped(evt);
            }
        });
        jPanel4.add(txtNombreModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 280, -1));

        txtIdModalidad.setEditable(false);
        txtIdModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdModalidadKeyTyped(evt);
            }
        });
        jPanel4.add(txtIdModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 250, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("ID Modalidad");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 420, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 520, 620));

        Tabla.setModel(modelo);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 970, 610));

        btnRestaurar.setText("Restaurar");
        btnRestaurar.setColorBorde(null);
        btnRestaurar.setColorHover(new java.awt.Color(228, 171, 172));
        btnRestaurar.setColorNormal(new java.awt.Color(237, 197, 212));
        btnRestaurar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRestaurar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, 134, 40));

        btnCalificar.setBackground(new java.awt.Color(111, 180, 189));
        btnCalificar.setText("CALIFICAR");
        btnCalificar.setColorBorde(null);
        btnCalificar.setColorHover(new java.awt.Color(194, 210, 228));
        btnCalificar.setColorNormal(new java.awt.Color(111, 180, 189));
        btnCalificar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnCalificar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 134, 40));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 134, 40));

        btnOrdenMerito.setBackground(new java.awt.Color(111, 180, 189));
        btnOrdenMerito.setText("Orden De Mérito");
        btnOrdenMerito.setColorBorde(null);
        btnOrdenMerito.setColorHover(new java.awt.Color(194, 210, 228));
        btnOrdenMerito.setColorNormal(new java.awt.Color(111, 180, 189));
        btnOrdenMerito.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnOrdenMerito.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnOrdenMerito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenMeritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenMerito, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, 134, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIdExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIdExamenActionPerformed

    }//GEN-LAST:event_cboIdExamenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idExamen = cboIdExamen.getSelectedItem().toString();
        try {
            examen = examendao.buscarExamen(idExamen);

            txtSemestre.setText(examen.getSemestre());
            txtNombreArea.setText(examen.getArea().getNombreArea());
            txtIdArea.setText(examen.getArea().getIdArea());
            txtNombreModalidad.setText(examen.getModalidad().getNombreM());
            txtIdModalidad.setText(examen.getModalidad().getIdModalidad());
            txtDia.setText(String.valueOf(examen.getFecha().getDia()));
            txtMes.setText(String.valueOf(examen.getFecha().getMes()));
            txtAño.setText(String.valueOf(examen.getFecha().getAño()));

            postulantedao.mostrarPostulantesPorExamen(modelo, idExamen);
//            habilitarCalificar();

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreKeyTyped
        if (txtSemestre.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSemestreKeyTyped

    private void txtNombreAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAreaKeyTyped
        if (txtNombreArea.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreAreaKeyTyped

    private void txtIdAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAreaKeyTyped
        if (txtIdArea.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdAreaKeyTyped

    private void btnLimpiarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSeleccionActionPerformed
        // TODO add your handling code here:
        txtNombreArea.setText("");
        txtIdArea.setText("");
        txtIdModalidad.setText("");
        txtSemestre.setText("");
        txtNombreModalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAño.setText("");
        cboIdExamen.setSelectedIndex(0);
        cboIdExamen.requestFocus();
    }//GEN-LAST:event_btnLimpiarSeleccionActionPerformed

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtNombreModalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreModalidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModalidadKeyTyped

    private void txtIdModalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdModalidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdModalidadKeyTyped

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        try {
            examendao.RevisarExamen(examen);
            examendao.mostrarResultadoDeExamen(modelo, examen.getIdExamen());
//            habilitarOrdenar();
        } catch (SQLException ex) {
            System.out.println("ERROR desde el dialog:" + ex.getMessage());
        }
    }//GEN-LAST:event_btnCalificarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed

    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenMeritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenMeritoActionPerformed
        try {
            examendao.setOrdenDeMerito(examen);
            examendao.mostrarResultadoDeExamenOrden(modelo, examen.getIdExamen());
            deshabilitar();
        } catch (SQLException ex) {
            System.out.println("ERROR :" + ex.getMessage());

        }
    }//GEN-LAST:event_btnOrdenMeritoActionPerformed

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
            java.util.logging.Logger.getLogger(DialogRevisarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRevisarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRevisarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRevisarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DialogRevisarExamen dialog = new DialogRevisarExamen();
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DialogRevisarExamen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private rsbuttom.RSButtonMetro btnCalificar;
    private javax.swing.JButton btnLimpiarSeleccion;
    private rsbuttom.RSButtonMetro btnOrdenMerito;
    private rsbuttom.RSButtonMetro btnRestaurar;
    private rsbuttom.RSButtonMetro btnSalir;
    private javax.swing.JComboBox<String> cboIdExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtIdModalidad;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombreArea;
    private javax.swing.JTextField txtNombreModalidad;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
