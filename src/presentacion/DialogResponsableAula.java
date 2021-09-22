package presentacion;

import datos.ResponsableAulaDAO;
import entidades.Aula;
import entidades.ResponsableAula;
import entidades.adapter.ResponsableAulaAdapter;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogResponsableAula extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    ResponsableAulaDAO rd = new ResponsableAulaDAO();
    Aula aula;

    public DialogResponsableAula() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        rd.mostrarResponsable(modelo);
    }
    
    public void limpiarEntradas() {
        txtIDResponsable.setText("");
        txtApellidos.setText("");
        txtNombres.setText("");
        txtDni.setText("");
        txtIdAula.setText("");
        txtNumeroAula.setText("");
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

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdAula = new javax.swing.JTextField();
        txtNumeroAula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSeleccionarCarrera = new rsbuttom.RSButtonMetro();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtIDResponsable = new javax.swing.JTextField();
        btnSalir = new rsbuttom.RSButtonMetro();
        btnGuardar = new rsbuttom.RSButtonMetro();
        btnConsultar = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnMostrar = new rsbuttom.RSButtonMetro();
        btnRestaurar = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("RESPONSABLE DE AULA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("DNI");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdAula.setEditable(false);
        jPanel1.add(txtIdAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 202, 29));

        txtNumeroAula.setEditable(false);
        jPanel1.add(txtNumeroAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 202, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("ID Aula");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Numero de Aula");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("AULA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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
        jPanel1.add(btnSeleccionarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 360, 190));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Apellidos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("ID Responsable");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, 30));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 510, 180));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Nombres");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, 30));

        txtIDResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDResponsableKeyTyped(evt);
            }
        });
        jPanel2.add(txtIDResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 30));

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
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, -1, -1));

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
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

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
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

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
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

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
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

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
        jPanel2.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtIDResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDResponsableKeyTyped
        if (txtIDResponsable.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDResponsableKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if (txtApellidos.getText().length() >= 60) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length() >= 60) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
         char c = evt.getKeyChar();
        if (txtDni.getText().length() >= 8 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnSeleccionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCarreraActionPerformed
        try {
            DialogBuscarAula f = new DialogBuscarAula();
            f.setVisible(true);
            aula = f.aulaSelec;
            txtIdAula.setText(aula.getIdAula());
            txtNumeroAula.setText(String.valueOf(aula.getnAula()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSeleccionarCarreraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIDResponsable.getText().equals("") || txtApellidos.getText().equals("") || txtNombres.getText().equals("") || txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idResponsable = txtIDResponsable.getText();
            String apellidos = txtApellidos.getText();
            String nombres = txtNombres.getText();
            String DNI = txtDni.getText();
            ResponsableAula x = new ResponsableAula(idResponsable, nombres, apellidos, DNI, aula);
            ResponsableAulaAdapter a = new ResponsableAulaAdapter();
            a.setResponsableAula(x);
            try {
                rd.insertar(a);
                rd.mostrarResponsable(modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
          try {
            String idResponsable = txtIDResponsable.getText();
            ResponsableAula x;
            x = rd.buscarResponsable(idResponsable).getResponsableAula();
            if (x != null) {

                txtNombres.setText(x.getNombres());
                txtApellidos.setText(x.getApellidos());
                txtDni.setText(x.getDni());
                txtIDResponsable.setText(x.getIdResponsable());
                txtIdAula.setText(x.getAula().getIdAula());
                txtNumeroAula.setText(String.valueOf(x.getAula().getnAula()));
                aula = x.getAula();
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra dicho responsable");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtIDResponsable.getText().equals("") || txtApellidos.getText().equals("") || txtNombres.getText().equals("") || txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idResponsable = txtIDResponsable.getText();
            String apellidos = txtApellidos.getText();
            String nombres = txtNombres.getText();
            String DNI = txtDni.getText();
            ResponsableAula x = new ResponsableAula(idResponsable, nombres, apellidos, DNI, aula);
            ResponsableAulaAdapter a = new ResponsableAulaAdapter();
            a.setResponsableAula(x);
            try {
                rd.actualizar(a);
                rd.mostrarResponsable(modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idResponsable = txtIDResponsable.getText();
        try {
            rd.eliminar(idResponsable);
            rd.mostrarResponsable(modelo);
            JOptionPane.showMessageDialog(null, "Se elimino el registro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try {
            rd.mostrarResponsable(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnConsultar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private rsbuttom.RSButtonMetro btnGuardar;
    private rsbuttom.RSButtonMetro btnModificar;
    private rsbuttom.RSButtonMetro btnMostrar;
    private rsbuttom.RSButtonMetro btnRestaurar;
    private rsbuttom.RSButtonMetro btnSalir;
    private rsbuttom.RSButtonMetro btnSeleccionarCarrera;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIDResponsable;
    private javax.swing.JTextField txtIdAula;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroAula;
    // End of variables declaration//GEN-END:variables
}
