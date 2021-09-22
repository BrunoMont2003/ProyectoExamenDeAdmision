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
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\img\\logo-unt1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\img\\pdf.png");
        ad.mostrarAreas(modelo);
        desHabilitar();
        txtArea.requestFocus();
    }

    public void habilitar() {
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnConsultar.setEnabled(false);
    }

    public void desHabilitar() {
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnConsultar.setEnabled(true);
    }

    public void limpiarEntradas() {
        txtArea.setText("");
        txtNombre.setText("");
        txtArea.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new rsbuttom.RSButtonMetro();
        btnConsultar = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnLimpiar1 = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnLimpiar = new rsbuttom.RSButtonMetro();
        btnTodos = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 168));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGen.setBackground(new java.awt.Color(255, 204, 204));
        btnGen.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnGen.setText("Generar Reporte De Areas");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });
        jPanel1.add(btnGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 225, 48));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 53, 48));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE AREA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ID AREA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

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
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        btnModificar.setText("Modificar");
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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.setColorBorde(null);
        btnLimpiar1.setColorHover(new java.awt.Color(228, 171, 172));
        btnLimpiar1.setColorNormal(new java.awt.Color(237, 197, 212));
        btnLimpiar1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnLimpiar1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 840, 134, -1));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 640, 160));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 380, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("AREAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 105, -1));

        txtArea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 380, 41));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(194, 224, 228));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setColorBorde(null);
        btnLimpiar.setColorHover(new java.awt.Color(228, 171, 172));
        btnLimpiar.setColorNormal(new java.awt.Color(237, 197, 212));
        btnLimpiar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnLimpiar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        btnTodos.setText("Todos");
        btnTodos.setColorBorde(null);
        btnTodos.setColorHover(new java.awt.Color(194, 210, 228));
        btnTodos.setColorNormal(new java.awt.Color(194, 224, 228));
        btnTodos.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnTodos.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 760, 620));

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

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
        if (txtArea.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAreaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID");
        } else {
            String idArea = txtArea.getText();
            Areas x;
            try {
                x = ad.buscarArea(idArea);
                if (x == null) {
                    JOptionPane.showMessageDialog(null, "Esa area no existe");
                } else {

                    txtNombre.setText(x.getNombreArea());
                    habilitar();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

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

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            ad.mostrarAreas(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogAreas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnConsultar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private javax.swing.JButton btnGen;
    private rsbuttom.RSButtonMetro btnGuardar;
    private rsbuttom.RSButtonMetro btnLimpiar;
    private rsbuttom.RSButtonMetro btnLimpiar1;
    private rsbuttom.RSButtonMetro btnModificar;
    private rsbuttom.RSButtonMetro btnSalir;
    private rsbuttom.RSButtonMetro btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
