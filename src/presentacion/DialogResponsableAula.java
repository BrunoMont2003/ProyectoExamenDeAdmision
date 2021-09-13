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

    public void habilitar() {
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnBuscarRepresentante.setEnabled(false);
    }

    public void desHabilitar() {
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscarRepresentante.setEnabled(true);
    }

    public void limpiarEntradas() {
        txtIDResponsable.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtIdAula.setText("");
        txtNumeroAula.setText("");
        txtIDResponsable.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        txtIDResponsable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscarRepresentante = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtIdAula = new javax.swing.JTextField();
        txtNumeroAula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        panel1.setBackground(new java.awt.Color(214, 217, 252));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setText("RESPONSABLE DE AULA");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        txtIDResponsable.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        txtIDResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDResponsableKeyTyped(evt);
            }
        });
        panel1.add(txtIDResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 90, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel4.setText("ID Responsable:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setText("DNI:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 30));

        txtApellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        panel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 140, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel7.setText("Apellidos:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel8.setText("Nombres:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));

        txtNombres.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
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
        panel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 140, -1));

        txtDni.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        panel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 90, -1));

        btnGuardar.setBackground(new java.awt.Color(230, 241, 245));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 90, -1));

        btnBuscarRepresentante.setBackground(new java.awt.Color(230, 241, 245));
        btnBuscarRepresentante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarRepresentante.setText("Buscar");
        btnBuscarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRepresentanteActionPerformed(evt);
            }
        });
        panel1.add(btnBuscarRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        btnModificar.setBackground(new java.awt.Color(230, 241, 245));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        btnTodos.setBackground(new java.awt.Color(204, 233, 228));
        btnTodos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        panel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(214, 217, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AULA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdAula.setEditable(false);
        txtIdAula.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jPanel1.add(txtIdAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 19, 134, 29));

        txtNumeroAula.setEditable(false);
        txtNumeroAula.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jPanel1.add(txtNumeroAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 61, 202, 31));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel9.setText("ID Aula:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 26, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel10.setText("Numero de Aula:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 69, -1, -1));

        btnSeleccionar.setBackground(new java.awt.Color(204, 233, 228));
        btnSeleccionar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 460, 110));

        jTable1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 760, 160));

        btnRestaurar.setBackground(new java.awt.Color(255, 153, 153));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        panel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 110, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtIDResponsable.getText().equals("")
                || txtApellidos.getText().equals("")
                || txtNombres.getText().equals("")
                || txtDni.getText().equals("")
                || txtIdAula.getText().equals("")
                || txtNumeroAula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo Vacio");
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRepresentanteActionPerformed
        try {
            if (txtIDResponsable.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACIO");
            } else {

                String idResponsable = txtIDResponsable.getText();
                ResponsableAula x;
                if (rd.exists(idResponsable)) {
                    x = rd.buscarResponsable(idResponsable).getResponsableAula();

                    txtNombres.setText(x.getNombres());
                    txtApellidos.setText(x.getApellidos());
                    txtDni.setText(x.getDni());
                    txtIDResponsable.setText(x.getIdResponsable());
                    aula = x.getAula();
                    txtIdAula.setText(x.getAula().getIdAula());
                    txtNumeroAula.setText(String.valueOf(x.getAula().getnAula()));
                    habilitar();
                } else {
                    JOptionPane.showMessageDialog(null, "Ese responsable no existe");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarRepresentanteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtIDResponsable.getText().equals("")
                || txtApellidos.getText().equals("")
                || txtNombres.getText().equals("")
                || txtDni.getText().equals("")
                || txtIdAula.getText().equals("")
                || txtNumeroAula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo Vacio");
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
            limpiarEntradas();
            desHabilitar();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idResponsable = txtIDResponsable.getText();
        if (idResponsable.equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE EL ID");
        } else {

            try {
                rd.eliminar(idResponsable);
                rd.mostrarResponsable(modelo);
                JOptionPane.showMessageDialog(null, "Se elimino el registro");
                desHabilitar();
                limpiarEntradas();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            rd.mostrarResponsable(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        try {
            DialogBuscarAula f = new DialogBuscarAula();
            f.setVisible(true);
            aula = f.aulaSelec;
            txtIdAula.setText(aula.getIdAula());
            txtNumeroAula.setText(String.valueOf(aula.getnAula()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

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

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRepresentante;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIDResponsable;
    private javax.swing.JTextField txtIdAula;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroAula;
    // End of variables declaration//GEN-END:variables
}
