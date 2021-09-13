/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.AreasDAO;
import entidades.Areas;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import reportes.GestionReportes;

public class DialogAreas extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    AreasDAO ad = new AreasDAO();

    /**
     * Creates new form DialogAreas
     */
    public DialogAreas() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/img/logo-unt1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "src/img/pdf.png");
        ad.mostrarAreas(modelo);
        desHabilitar();
        txtArea.requestFocus();
    }

    public void habilitar() {
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnBuscar.setEnabled(false);
    }

    public void desHabilitar() {
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscar.setEnabled(true);
    }
    public void limpiarEntradas(){
        txtArea.setText("");
        txtNombre.setText("");
        txtArea.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnGen = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 168));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("AREAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 186, 105, -1));

        txtArea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 233, 380, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("ID Area");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 239, 78, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Nombre Area");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 301, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 292, 380, 46));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 407, 640, 160));

        jPanel1.setBackground(new java.awt.Color(204, 247, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGen.setBackground(new java.awt.Color(255, 204, 204));
        btnGen.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnGen.setText("Generar Reporte De Areas");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });
        jPanel1.add(btnGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 225, 48));

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 70, -1));

        btnTodos.setBackground(new java.awt.Color(255, 153, 153));
        btnTodos.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 80, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 90, -1));

        btnModificar.setBackground(new java.awt.Color(168, 224, 240));
        btnModificar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(168, 224, 240));
        btnBuscar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 80, -1));

        btnGuardar.setBackground(new java.awt.Color(168, 224, 240));
        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 53, 48));

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
        GestionReportes fr = new GestionReportes();
        try {
            fr.ReporteAreas();
            dispose();
        } catch (JRException ex) {
        }


    }//GEN-LAST:event_btnGenActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtArea.getText().equals("") || txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACÍO");
        } else {

            String idArea = txtArea.getText();
            String nombreArea = txtNombre.getText();
            Areas x = new Areas(idArea, nombreArea);
            try {
                ad.insertar(x);
                ad.mostrarAreas(modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID");
        } else {
            String idArea = txtArea.getText();
            Areas x;
            try {
                x = ad.buscarArea(idArea);
                txtNombre.setText(x.getNombreArea());
                habilitar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtArea.getText().equals("") || txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACÍO");
        } else {

            String idArea = txtArea.getText();
            String nombreArea = txtNombre.getText();
            Areas x = new Areas(idArea, nombreArea);
            try {
                ad.actualizar(x);
                ad.mostrarAreas(modelo);
                desHabilitar();
                limpiarEntradas();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID");
        } else {

            String idArea = txtArea.getText();
            try {
                ad.eliminar(idArea);
                ad.mostrarAreas(modelo);
                desHabilitar();
                limpiarEntradas();
                JOptionPane.showMessageDialog(null, "Se elimino el registro");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            ad.mostrarAreas(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogAreas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
       if(txtArea.getText().length()>=6){
           evt.consume();
       }
    }//GEN-LAST:event_txtAreaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=40){
           evt.consume();
       }
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGen;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
