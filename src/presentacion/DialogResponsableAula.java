
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
       rd.mostrarResponsable(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
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
        btnBuscarFacultad = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("RESPONSABLE DE AULA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        getContentPane().add(txtIDResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("ID Responsable:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("DNI:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 30));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Apellidos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Nombres:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, -1));
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 90, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 60, -1));

        btnBuscarFacultad.setText("Buscar");
        btnBuscarFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacultadActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AULA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        txtIdAula.setEditable(false);

        txtNumeroAula.setEditable(false);

        jLabel9.setText("ID Aula:");

        jLabel10.setText("Numero de Aula:");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroAula, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnSeleccionar))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroAula, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 450, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 490, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
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
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacultadActionPerformed
        try {
            String idResponsable = txtIDResponsable.getText();
            ResponsableAula x;
            x = rd.buscarResponsable(idResponsable).getResponsableAula();
            txtNombres.setText(x.getNombres());
            txtApellidos.setText(x.getApellidos());
            txtDni.setText(x.getDni());
            txtIDResponsable.setText(x.getIdResponsable());
            txtIdAula.setText(x.getAula().getIdAula());
            txtNumeroAula.setText(String.valueOf(x.getAula().getnAula()));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarFacultadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFacultad;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
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
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIDResponsable;
    private javax.swing.JTextField txtIdAula;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroAula;
    // End of variables declaration//GEN-END:variables
}
