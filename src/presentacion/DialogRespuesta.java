/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.ExamenDAO;
import datos.PostulanteDAO;
import datos.RespuestaDAO;
import entidades.Respuesta;
import entidades.Examen;
import entidades.Postulante;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class DialogRespuesta extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    RespuestaDAO dao = new RespuestaDAO();
    Examen examen;
    Postulante postulante;

    public DialogRespuesta() {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        desHabilitar();
        setLocationRelativeTo(null);
        txtIdRespuesta.requestFocus();
        try {
            dao.mostrarRespuestas(modelo);
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
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
        txtIdRespuesta.setText("");
        cboNumero.setSelectedIndex(0);
        cboLetra.setSelectedIndex(0);
        txtIdExamen.setText("");
        txtSemestre.setText("");
        txtFecha.setText("");
        txtArea.setText("");
        txtModalidad.setText("");
        txtIdPostulante.setText("");
        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtDni.setText("");
        txtIdRespuesta.requestFocus();
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
        txtIdRespuesta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cboNumero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboLetra = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdExamen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtModalidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIdPostulante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        btnSeleccionarPostulante = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 246, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setText("RESPUESTAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Id Respuesta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Numero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 172, -1, 20));

        txtIdRespuesta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdRespuestaKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 230, -1));

        btnGuardar.setBackground(new java.awt.Color(168, 192, 215));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 120, -1));

        btnConsultar.setBackground(new java.awt.Color(168, 192, 215));
        btnConsultar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 130, -1));

        btnActualizar.setBackground(new java.awt.Color(168, 192, 215));
        btnActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 140, -1));

        btnSalir.setBackground(new java.awt.Color(234, 107, 107));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 730, 90, -1));

        btnRestaurar.setBackground(new java.awt.Color(234, 107, 107));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 730, 140, -1));

        btnEliminar.setBackground(new java.awt.Color(234, 107, 107));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 140, -1));

        jTable1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 500, 300));

        cboNumero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        jPanel1.add(cboNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Letra");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        cboLetra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboLetra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "a", "b", "c", "d" }));
        jPanel1.add(cboLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, 30));

        jPanel2.setBackground(new java.awt.Color(227, 246, 233));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EXAMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("ID EXAMEN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtIdExamen.setEditable(false);
        txtIdExamen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdExamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdExamenKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 210, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Semestre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtSemestre.setEditable(false);
        txtSemestre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreKeyTyped(evt);
            }
        });
        jPanel2.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Fecha");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Area");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtArea.setEditable(false);
        txtArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        jPanel2.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 310, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Modalidad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtModalidad.setEditable(false);
        txtModalidad.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtModalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModalidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 430, 340));

        jPanel3.setBackground(new java.awt.Color(227, 246, 233));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "POSTULANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("ID Postulante");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        txtIdPostulante.setEditable(false);
        txtIdPostulante.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtIdPostulante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPostulanteKeyTyped(evt);
            }
        });
        jPanel3.add(txtIdPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Nombres");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, -1));

        txtApellidoPaterno.setEditable(false);
        txtApellidoPaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Apellido Paterno");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Apellido Materno");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        txtApellidoMaterno.setEditable(false);
        txtApellidoMaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, -1));

        btnSeleccionarPostulante.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSeleccionarPostulante.setText("Seleccionar");
        btnSeleccionarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarPostulanteActionPerformed(evt);
            }
        });
        jPanel3.add(btnSeleccionarPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setText("DNI");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 430, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1010, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIdRespuesta.getText().equals("") || cboLetra.getSelectedIndex() == 0 || cboNumero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idRespuesta = txtIdRespuesta.getText();
            int numero = Integer.parseInt(cboNumero.getSelectedItem().toString());
            char letra = cboLetra.getSelectedItem().toString().charAt(0);
            Respuesta x = new Respuesta(idRespuesta, numero, letra, postulante, examen);

            try {
                dao.insertar(x);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
            limpiarEntradas();
            try {
                dao.mostrarRespuestas(modelo);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idRespuesta = txtIdRespuesta.getText();
        if (idRespuesta.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE LA Respuesta");
        } else {
            Respuesta x;
            try {
                x = dao.buscarRespuesta(idRespuesta);
                if (x != null) {
                    int numero = x.getNumero();

                    cboNumero.setSelectedIndex(numero);

                    char letra = x.getLetra();
                    switch (letra) {
                        case 'a':
                            cboLetra.setSelectedIndex(1);
                            break;
                        case 'b':
                            cboLetra.setSelectedIndex(2);
                            break;
                        case 'c':
                            cboLetra.setSelectedIndex(3);
                            break;
                        case 'd':
                            cboLetra.setSelectedIndex(4);
                            break;
                        default:
                            break;
                    }

                    cboLetra.setSelectedItem(x.getLetra());
                    txtIdExamen.setText(x.getExamen().getIdExamen());
                    txtSemestre.setText(x.getExamen().getSemestre());
                    txtFecha.setText(x.getExamen().getFecha().toStringFormatSql());
                    txtArea.setText(x.getExamen().getArea().getNombreArea());
                    txtModalidad.setText(x.getExamen().getModalidad().getNombreM());
                    examen = x.getExamen();
                    txtIdPostulante.setText(x.getPostulante().getIdPostulante());
                    txtNombre.setText(x.getPostulante().getNombres());
                    txtApellidoPaterno.setText(x.getPostulante().getApellido_paterno());
                    txtApellidoMaterno.setText(x.getPostulante().getApellido_materno());
                    txtDni.setText(x.getPostulante().getDni());
                    postulante = x.getPostulante();
                    habilitar();
                } else {
                    JOptionPane.showMessageDialog(this, "Dicha Respuesta no existe");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());

            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtIdRespuesta.getText().equals("") || cboLetra.getSelectedIndex() == 0 || cboNumero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No deje el campo vacio");
        } else {
            String idRespuesta = txtIdRespuesta.getText();
            int numero = Integer.parseInt(cboNumero.getSelectedItem().toString());
            char letra = cboLetra.getSelectedItem().toString().charAt(0);
            System.out.println("letra "+letra);
            try {

                Respuesta x = new Respuesta(idRespuesta, numero, letra, postulante, examen);

                dao.actualizar(x);
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
            limpiarEntradas();
            desHabilitar();
            try {
                dao.mostrarRespuestas(modelo);
            } catch (SQLException ex) {
                Logger.getLogger(DialogRespuesta.class.getName()).log(Level.SEVERE, null, ex);
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
        String id = txtIdRespuesta.getText();
        if (!id.equals("")) {
            try {
                dao.eliminar(id);
                JOptionPane.showMessageDialog(this, "Se eliminó el registro");
                dao.mostrarRespuestas(modelo);
                limpiarEntradas();
                desHabilitar();
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Este id no existe");

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdRespuestaKeyTyped
        if (txtIdRespuesta.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdRespuestaKeyTyped

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        DialogBuscarExmn f = new DialogBuscarExmn();
        f.setVisible(true);
        examen = f.examenSelec;
        txtIdExamen.setText(examen.getIdExamen());
        txtSemestre.setText(examen.getSemestre());
        txtFecha.setText(examen.getFecha().toStringFormatSql());
        txtArea.setText(examen.getArea().getNombreArea());
        txtModalidad.setText(examen.getModalidad().getNombreM());
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtIdExamenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdExamenKeyTyped

    }//GEN-LAST:event_txtIdExamenKeyTyped

    private void txtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreKeyTyped

    }//GEN-LAST:event_txtSemestreKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped

    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped

    }//GEN-LAST:event_txtAreaKeyTyped

    private void txtModalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModalidadKeyTyped

    }//GEN-LAST:event_txtModalidadKeyTyped

    private void txtIdPostulanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPostulanteKeyTyped

    }//GEN-LAST:event_txtIdPostulanteKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void btnSeleccionarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarPostulanteActionPerformed
        DialogBuscarPostulante f = new DialogBuscarPostulante();
        f.setVisible(true);
        postulante = f.postulanteSelec;
        txtIdPostulante.setText(postulante.getIdPostulante());
        txtNombre.setText(postulante.getNombres());
        txtApellidoPaterno.setText(postulante.getApellido_paterno());
        txtApellidoMaterno.setText(postulante.getApellido_materno());
        txtDni.setText(postulante.getDni());

    }//GEN-LAST:event_btnSeleccionarPostulanteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

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
            java.util.logging.Logger.getLogger(DialogRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                DialogRespuesta dialog = new DialogRespuesta();
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSeleccionarPostulante;
    private javax.swing.JComboBox<String> cboLetra;
    private javax.swing.JComboBox<String> cboNumero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdExamen;
    private javax.swing.JTextField txtIdPostulante;
    private javax.swing.JTextField txtIdRespuesta;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
