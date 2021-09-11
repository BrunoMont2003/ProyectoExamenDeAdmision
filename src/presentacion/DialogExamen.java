/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

//import datos.ArchivoCliente;
//import entidad.Cliente;
import datos.ExamenDAO;
import entidades.Areas;
import entidades.Examen;
import entidades.Fecha;
import entidades.Modalidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class DialogExamen extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();

    Modalidad modalidad;
    Areas area;
    ExamenDAO examendao = new ExamenDAO();

    public DialogExamen() {
        super(FrmPrincipal.getInstancia(), true);
        try {
            initComponents();
            setLocationRelativeTo(null);
            desHabilitar();
            txtIdExamen.requestFocus();
            examendao.mostrarExamen(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogExamen.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        txtSemestre.setText("");
        txtIdExamen.setText("");
        txtAño.setText("");

        txtIdArea.setText("");
        txtNombreArea.setText("");

        txtIdModalidad.setText("");
        txtNombreModalidad.setText("");

        txtDia.setText("");
        txtMes.setText("");

        txtIdExamen.requestFocus();

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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdExamen = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtSemestre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdArea = new javax.swing.JTextField();
        txtNombreArea = new javax.swing.JTextField();
        btnCancelarArea = new javax.swing.JButton();
        btnBuscarArea = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdModalidad = new javax.swing.JTextField();
        txtNombreModalidad = new javax.swing.JTextField();
        btnCancelarModalidad = new javax.swing.JButton();
        btnBuscarModalidad = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(155, 202, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Examen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("ID Examen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtIdExamen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdExamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdExamenKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 230, -1));

        txtAño.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, -1));

        Tabla.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Tabla.setModel(modelo);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 910, 210));

        txtSemestre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreKeyTyped(evt);
            }
        });
        jPanel1.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 230, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Semestre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(155, 202, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ÁREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("ID AREA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        txtIdArea.setEditable(false);
        txtIdArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel2.add(txtIdArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        txtNombreArea.setEditable(false);
        txtNombreArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel2.add(txtNombreArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 310, -1));

        btnCancelarArea.setBackground(new java.awt.Color(234, 107, 107));
        btnCancelarArea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCancelarArea.setText("Cancelar");
        btnCancelarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAreaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btnBuscarArea.setBackground(new java.awt.Color(168, 192, 215));
        btnBuscarArea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarArea.setText("...");
        btnBuscarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAreaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 530, 230));

        jPanel3.setBackground(new java.awt.Color(155, 202, 238));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha del Exámen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Mes");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtMes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPanel3.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        txtDia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel3.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Día");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, 120));

        jPanel5.setBackground(new java.awt.Color(155, 202, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MODALIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("ID MODALIDAD");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("NOMBRE");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        txtIdModalidad.setEditable(false);
        txtIdModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel5.add(txtIdModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, -1));

        txtNombreModalidad.setEditable(false);
        txtNombreModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jPanel5.add(txtNombreModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 290, -1));

        btnCancelarModalidad.setBackground(new java.awt.Color(234, 107, 107));
        btnCancelarModalidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCancelarModalidad.setText("Cancelar");
        btnCancelarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModalidadActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelarModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        btnBuscarModalidad.setBackground(new java.awt.Color(168, 192, 215));
        btnBuscarModalidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarModalidad.setText("...");
        btnBuscarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModalidadActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 480, 230));

        btnGuardar.setBackground(new java.awt.Color(168, 192, 215));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 120, -1));

        btnConsultar.setBackground(new java.awt.Color(168, 192, 215));
        btnConsultar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 130, -1));

        btnActualizar.setBackground(new java.awt.Color(168, 192, 215));
        btnActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 140, -1));

        btnSalir.setBackground(new java.awt.Color(234, 107, 107));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 90, -1));

        btnRestaurar.setBackground(new java.awt.Color(234, 107, 107));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 140, -1));

        btnEliminar.setBackground(new java.awt.Color(234, 107, 107));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdExamenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdExamenKeyTyped
        if (txtIdExamen.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdExamenKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        char c = evt.getKeyChar();
        if (txtAño.getText().length() >= 4 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreKeyTyped
        if (txtSemestre.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSemestreKeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        char c = evt.getKeyChar();

        if (txtDia.getText().length() >= 2 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (txtMes.getText().length() >= 2 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMesKeyTyped

    private void btnBuscarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAreaActionPerformed
        try {
            // TODO add your handling code here:
            DialogBuscarAreas f = new DialogBuscarAreas();
            f.setVisible(true);
            area = f.areasSelec;
            txtIdArea.setText(area.getIdArea());
            txtNombreArea.setText(area.getNombreArea());
        } catch (SQLException ex) {
            Logger.getLogger(DialogExamen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarAreaActionPerformed

    private void btnCancelarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAreaActionPerformed
        txtIdArea.setText("");
        txtNombreArea.setText("");

    }//GEN-LAST:event_btnCancelarAreaActionPerformed

    private void btnCancelarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModalidadActionPerformed
        txtIdModalidad.setText("");
        txtNombreModalidad.setText("");
    }//GEN-LAST:event_btnCancelarModalidadActionPerformed

    private void btnBuscarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModalidadActionPerformed
        try {
            // TODO add your handling code here:
            DialogBuscarModalidad f = new DialogBuscarModalidad();
            f.setVisible(true);
            modalidad = f.modalidadSelec;
            txtIdModalidad.setText(modalidad.getIdModalidad());
            txtNombreModalidad.setText(modalidad.getNombreM());
        } catch (SQLException ex) {
            Logger.getLogger(DialogExamen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarModalidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIdExamen.getText().equals("")
                || txtAño.getText().equals("")
                || txtSemestre.getText().equals("")
                || txtDia.getText().equals("")
                || txtMes.getText().equals("")
                || txtIdModalidad.getText().equals("")
                || txtNombreModalidad.getText().equals("")
                || txtIdArea.getText().equals("")
                || txtNombreArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {

            try {
                String idExamen = txtIdExamen.getText();
                int año = Integer.parseInt(txtAño.getText());
                String semestre = txtSemestre.getText();
                int dia = Integer.parseInt(txtDia.getText());
                int mes = Integer.parseInt(txtMes.getText());

                Fecha fecha = new Fecha();
                fecha.setDia(dia);
                fecha.setMes(mes);
                fecha.setAño(año);
                Examen x = new Examen(idExamen, semestre, fecha, area, modalidad);
                examendao.insertar(x);

                limpiarEntradas();
                examendao.mostrarExamen(modelo);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idExamen = txtIdExamen.getText();
        if (idExamen.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DEL EXAMEN");
        } else {
            try {
                Examen x;
                x = examendao.buscarExamen(idExamen);
                if (x != null) {
                    System.out.println("FORMATO NORMAL: " + x.getFecha().toString());
                    txtSemestre.setText(x.getSemestre());
                    txtAño.setText(String.valueOf(x.getFecha().getAño()));
                    txtMes.setText(String.valueOf(x.getFecha().getMes()));
                    txtDia.setText(String.valueOf(x.getFecha().getDia()));
                    txtIdArea.setText(x.getArea().getIdArea());
                    txtNombreArea.setText(x.getArea().getNombreArea());
                    txtIdModalidad.setText(x.getModalidad().getIdModalidad());
                    txtNombreModalidad.setText(x.getModalidad().getNombreM());
                    habilitar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró dicho examen");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());

            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtIdExamen.getText().equals("")
                || txtAño.getText().equals("")
                || txtSemestre.getText().equals("")
                || txtDia.getText().equals("")
                || txtMes.getText().equals("")
                || txtIdModalidad.getText().equals("")
                || txtNombreModalidad.getText().equals("")
                || txtIdArea.getText().equals("")
                || txtNombreArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {

            try {
                String idExamen = txtIdExamen.getText();
                int año = Integer.parseInt(txtAño.getText());
                String semestre = txtSemestre.getText();
                int dia = Integer.parseInt(txtDia.getText());
                int mes = Integer.parseInt(txtMes.getText());

                Fecha fecha = new Fecha(dia, mes, año);
                Examen x = new Examen(idExamen, semestre, fecha, area, modalidad);
                examendao.actualizar(x);

                limpiarEntradas();
                desHabilitar();
                examendao.mostrarExamen(modelo);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // TODO add your handling code here:
        limpiarEntradas();
        desHabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String id = txtIdExamen.getText();
        if (!id.equals("")) {
            try {
                examendao.eliminar(id);
                JOptionPane.showMessageDialog(this, "Se eliminó el registro");
                examendao.mostrarExamen(modelo);
                limpiarEntradas();
                desHabilitar();
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Este id no existe");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                DialogExamen dialog = new DialogExamen();
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
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarArea;
    private javax.swing.JButton btnBuscarModalidad;
    private javax.swing.JButton btnCancelarArea;
    private javax.swing.JButton btnCancelarModalidad;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtIdArea;
    private javax.swing.JTextField txtIdExamen;
    private javax.swing.JTextField txtIdModalidad;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombreArea;
    private javax.swing.JTextField txtNombreModalidad;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
