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
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\img\\logo-unt1.png");
        md.mostrarModalidad(modelo);
        desHabilitar();
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
        txtIdModalidad.setText("");
        txtNombreM.setText("");
        txtIdModalidad.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdModalidad = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new rsbuttom.RSButtonMetro();
        btnConsultar = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnRestaurar = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtIdModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "IDModalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtIdModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdModalidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 146, 190, -1));

        txtNombreM.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtNombreM.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "NombreModalidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 146, 226, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 551, 135));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

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
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 480, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 550, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdModalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdModalidadKeyTyped
        if(txtIdModalidad.getText().length()>=7){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdModalidadKeyTyped

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        if(txtNombreM.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMKeyTyped

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtIdModalidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID DE LA MODALIDAD");
        } else {
            try {
                String idModalidad = txtIdModalidad.getText();
                Modalidad x = md.buscarModalidad(idModalidad);
                if (x == null) {
                    JOptionPane.showMessageDialog(null, "Esa modalidad no existe");
                } else {

                    txtNombreM.setText(x.getNombreM());
                    habilitar();
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
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
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnRestaurarActionPerformed

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnConsultar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private rsbuttom.RSButtonMetro btnGuardar;
    private rsbuttom.RSButtonMetro btnModificar;
    private rsbuttom.RSButtonMetro btnRestaurar;
    private rsbuttom.RSButtonMetro btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIdModalidad;
    private javax.swing.JTextField txtNombreM;
    // End of variables declaration//GEN-END:variables
}
