/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.FacultadDAO;
import entidades.Areas;
import entidades.Facultad;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import reportes.GestionReportes;

public class DialogFacultad extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    FacultadDAO fd = new FacultadDAO();
    Areas areas;

    /**
     * Creates new form DialogAreas
     */
    public DialogFacultad() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/img/logo-unt1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "src/img/pdf.png");
        fd.mostrarFacultad(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDFacultad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomFacultad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtIdArea = new javax.swing.JTextField();
        txtNombreArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnBuscarFacultad = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnGen = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(950, 612));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 11, 509, 170));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("FACULTAD");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 192, 164, -1));

        txtIDFacultad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDFacultadKeyTyped(evt);
            }
        });
        jPanel3.add(txtIDFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 227, 256, 37));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("ID Facultad");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 242, 127, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Nombre Facultad");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 292, 164, -1));

        txtNomFacultad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomFacultadKeyTyped(evt);
            }
        });
        jPanel3.add(txtNomFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 292, 256, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdArea.setEditable(false);
        jPanel1.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 19, 202, 29));

        txtNombreArea.setEditable(false);
        jPanel1.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 63, 202, 31));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel6.setText("ID Area");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 24, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel7.setText("Nombre Area");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 69, -1, -1));

        btnSeleccionar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 43, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 343, 450, 110));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 213, 510, 240));

        btnGuardar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 471, -1, -1));

        btnBuscarFacultad.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnBuscarFacultad.setText("Buscar");
        btnBuscarFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacultadActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 471, -1, -1));

        btnModificar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 471, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 511, -1, -1));

        btnTodos.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel3.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 511, -1, -1));

        btnGen.setBackground(new java.awt.Color(255, 51, 51));
        btnGen.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnGen.setText("Generar Reporte De Facultades");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });
        jPanel3.add(btnGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, 48));

        btnSalir.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 90, 30));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 53, 48));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
        GestionReportes fr = new GestionReportes();
        try {
            fr.ReporteFacultad();
            dispose();
        } catch (JRException ex) {
            Logger.getLogger(DialogFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGenActionPerformed

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
        if (txtIDFacultad.getText().equals("") || txtNomFacultad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idFacultad = txtIDFacultad.getText();
            String nombreFacultad = txtNomFacultad.getText();
            String idArea = txtNombreArea.getText();
            Facultad x = new Facultad(idFacultad, nombreFacultad, areas);
            try {
                fd.insertar(x);
                fd.mostrarFacultad(modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacultadActionPerformed
        try {
            String idFacultad = txtIDFacultad.getText();
            Facultad x;
            x = fd.buscarFacultad(idFacultad);
            if(x !=null){
                
            txtNomFacultad.setText(x.getNombreFacultad());
            txtIdArea.setText(x.getAreas().getIdArea());
            txtNombreArea.setText(x.getAreas().getNombreArea());
            areas = x.getAreas();
            }else{
                JOptionPane.showMessageDialog(null, "ESA FACULTAD NO EXISTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarFacultadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtIDFacultad.getText().equals("") || txtNomFacultad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idFacultad = txtIDFacultad.getText();
            String nombreFacultad = txtNomFacultad.getText();
            String idArea = txtNombreArea.getText();
            Facultad x = new Facultad(idFacultad, nombreFacultad, areas);
            try {
                fd.actualizar(x);
                fd.mostrarFacultad(modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idFacultad = txtIDFacultad.getText();
        try {
            fd.eliminar(idFacultad);
            fd.mostrarFacultad(modelo);
            JOptionPane.showMessageDialog(null, "Se elimino el registro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            fd.mostrarFacultad(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIDFacultadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDFacultadKeyTyped
        if(txtIDFacultad.getText().length()>=7){
            evt.consume();
        }
    }//GEN-LAST:event_txtIDFacultadKeyTyped

    private void txtNomFacultadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomFacultadKeyTyped
        if(txtNomFacultad.getText().length()>=40){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomFacultadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFacultad;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGen;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIDFacultad;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtNomFacultad;
    private javax.swing.JTextField txtNombreArea;
    // End of variables declaration//GEN-END:variables
}
