/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

;
import datos.ModalidadDAO;
import entidades.Modalidad;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class DialogModalidad extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    ModalidadDAO md = new ModalidadDAO();

    /**
     * Creates new form DialogModalidad
     */
    public DialogModalidad() throws SQLException {

        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/img/logo-unt1.png");
        md.mostrarModalidad(modelo);
        desHabilitar();
    }

    public void habilitar() {
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnConsultar.setEnabled(false);
    }

    public void desHabilitar() {
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnConsultar.setEnabled(true);
    }
    public void limpiarEntradas() {
        txtIdModalidad.setText("");
        txtNombreM.setText("");
        txtIdModalidad.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdModalidad = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnRestarurar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtIdModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "IDModalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        getContentPane().add(txtIdModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 146, 190, -1));

        txtNombreM.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtNombreM.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NombreModalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        getContentPane().add(txtNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 146, 226, -1));

        btnGuardar.setBackground(new java.awt.Color(168, 192, 215));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 111, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 357, 480, 260));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 551, 135));

        btnEliminar.setBackground(new java.awt.Color(234, 107, 107));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, -1));

        btnActualizar.setBackground(new java.awt.Color(168, 192, 215));
        btnActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 120, -1));

        btnConsultar.setBackground(new java.awt.Color(168, 192, 215));
        btnConsultar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, -1));

        btnRestarurar.setBackground(new java.awt.Color(234, 107, 107));
        btnRestarurar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRestarurar.setText("Restaurar");
        btnRestarurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestarurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 270, 140, -1));

        jPanel1.setBackground(new java.awt.Color(230, 229, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(234, 107, 107));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 92, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 550, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtIdModalidad.getText().equals("") || txtNombreM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACIO");
        } else {
            String idModalidad = txtIdModalidad.getText();
            String nombreM = txtNombreM.getText();
            Modalidad x = new Modalidad(idModalidad, nombreM);
            try {
                md.insertar(x);
                md.mostrarModalidad(modelo);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String idModalidad = txtIdModalidad.getText();
            md.eliminar(idModalidad);
            JOptionPane.showMessageDialog(null, "Se eliminó el registro");
            md.mostrarModalidad(modelo);

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtIdModalidad.getText().equals("") || txtNombreM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACIO");
        } else {
            String idModalidad = txtIdModalidad.getText();
            String nombreM = txtNombreM.getText();
            Modalidad x = new Modalidad(idModalidad, nombreM);
            try {
                md.actualizar(x);
                md.mostrarModalidad(modelo);
                desHabilitar();
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtIdModalidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID DE LA MODALIDAD");
        } else {
            try {
                String idModalidad = txtIdModalidad.getText();
                Modalidad x = md.buscarModalidad(idModalidad);
                txtNombreM.setText(x.getNombreM());
                habilitar();
            } catch (SQLException ex) {
                Logger.getLogger(DialogModalidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRestarurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarurarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnRestarurarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestarurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdModalidad;
    private javax.swing.JTextField txtNombreM;
    // End of variables declaration//GEN-END:variables
}
