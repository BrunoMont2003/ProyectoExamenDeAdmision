/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import datos.ExamenDAO;
import entidades.Areas;
import entidades.Examen;
import entidades.Fecha;
import entidades.Modalidad;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class DialogBuscarExamen extends javax.swing.JDialog {

    ExamenDAO examendao = new ExamenDAO();
    Examen examenSelec = new Examen();

    public DialogBuscarExamen() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        try {
            for (int i = 0; i < examendao.listarExamenes().size(); i++) {
                cboIdExamen.addItem(examendao.listarExamenes().get(i).getIdExamen());
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        cboIdExamen = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNombreArea = new javax.swing.JTextField();
        txtIdArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRestaurar = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreModalidad = new javax.swing.JTextField();
        txtIdModalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 243, 207));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("ID Examen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(234, 107, 107));
        btnCerrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        cboIdExamen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cboIdExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cboIdExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdExamenActionPerformed(evt);
            }
        });
        jPanel1.add(cboIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, 30));

        btnBuscar.setBackground(new java.awt.Color(168, 192, 215));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        btnSeleccionar.setBackground(new java.awt.Color(168, 192, 215));
        btnSeleccionar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Semestre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        txtSemestre.setEditable(false);
        txtSemestre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreKeyTyped(evt);
            }
        });
        jPanel1.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, -1));

        jPanel2.setBackground(new java.awt.Color(242, 243, 207));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreArea.setEditable(false);
        txtNombreArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombreArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAreaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, -1));

        txtIdArea.setEditable(false);
        txtIdArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAreaKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("ID AREA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 360, 150));

        btnRestaurar.setBackground(new java.awt.Color(234, 107, 107));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 120, -1));

        txtDia.setEditable(false);
        txtDia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel1.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 70, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Día");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        txtMes.setEditable(false);
        txtMes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPanel1.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 70, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Mes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 20));

        txtAño.setEditable(false);
        txtAño.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 70, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Año");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, 20));

        jPanel3.setBackground(new java.awt.Color(242, 243, 207));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreModalidad.setEditable(false);
        txtNombreModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombreModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreModalidadKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombreModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, -1));

        txtIdModalidad.setEditable(false);
        txtIdModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdModalidadKeyTyped(evt);
            }
        });
        jPanel3.add(txtIdModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("ID Modalidad");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 360, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cboIdExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIdExamenActionPerformed

    }//GEN-LAST:event_cboIdExamenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idExamen = cboIdExamen.getSelectedItem().toString();
        try {
            Examen examen = examendao.buscarExamen(idExamen);
            txtSemestre.setText(examen.getSemestre());
            txtNombreArea.setText(examen.getArea().getNombreArea());
            txtIdArea.setText(examen.getArea().getIdArea());
            txtNombreModalidad.setText(examen.getModalidad().getNombreM());
            txtIdModalidad.setText(examen.getModalidad().getIdModalidad());
            txtDia.setText(String.valueOf(examen.getFecha().getDia()));
            txtMes.setText(String.valueOf(examen.getFecha().getMes()));
            txtAño.setText(String.valueOf(examen.getFecha().getAño()));
            
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAreaKeyTyped
        if (txtNombreArea.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreAreaKeyTyped

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        examenSelec.setIdExamen(cboIdExamen.getSelectedItem().toString());
        examenSelec.setSemestre(txtSemestre.getText());
        Fecha fecha= new Fecha(Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAño.getText()));
        examenSelec.setFecha(fecha);
        Modalidad modalidad = new Modalidad(txtIdModalidad.getText(), txtNombreModalidad.getText());
        examenSelec.setModalidad(modalidad);
        Areas area = new Areas(txtIdArea.getText(), txtNombreArea.getText());
     
        examenSelec.setArea(area);
        this.dispose();

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtIdAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAreaKeyTyped
        if (txtIdArea.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdAreaKeyTyped

    private void txtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreKeyTyped
        if (txtSemestre.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSemestreKeyTyped

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
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
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogBuscarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogBuscarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogBuscarExamen dialog = new DialogBuscarExamen();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSeleccionar;
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
