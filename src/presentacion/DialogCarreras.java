/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.CarrerasDAO;
import entidades.Carreras;
import entidades.Facultad;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import reportes.GestionReportes;

/**
 *
 * @author Frecuencia 7
 */
public class DialogCarreras extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    CarrerasDAO cd = new CarrerasDAO();
    Facultad facultad;

    /**
     * Creates new form DialogCarreras
     */
    public DialogCarreras() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel7, "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\img\\pdf.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\img\\logo-unt1.png");
        cd.mostrarCarreras(modelo);
    }

    public void limpiarEntradas() {
        txtCodigoCarrera.setText("");
        txtNombreCarrera.setText("");
        txtIdFacu.setText("");
        txtNombreF.setText("");
        txtCodigoCarrera.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoCarrera = new javax.swing.JTextField();
        txtNombreCarrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdFacu = new javax.swing.JTextField();
        txtNombreF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSeleccionarCarrera = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReporteCarreras = new javax.swing.JButton();
        btnGuardar1 = new rsbuttom.RSButtonMetro();
        jLabel7 = new javax.swing.JLabel();
        btnConsultar1 = new rsbuttom.RSButtonMetro();
        btnModificar1 = new rsbuttom.RSButtonMetro();
        btnEliminar1 = new rsbuttom.RSButtonMetro();
        btnMostrar = new rsbuttom.RSButtonMetro();
        btnSalir1 = new rsbuttom.RSButtonMetro();
        btnLimpiar = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Carreras Universitarias");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CODIGO CARRERA");

        txtCodigoCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoCarreraKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE CARRERA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txtIdFacu.setEditable(false);

        txtNombreF.setEditable(false);
        txtNombreF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("NOMBRE FACULTAD");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("ID FACULTAD");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("FACULTAD");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnSeleccionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(22, 22, 22)
                .addComponent(btnSeleccionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        btnReporteCarreras.setBackground(new java.awt.Color(255, 51, 51));
        btnReporteCarreras.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnReporteCarreras.setText("GENERAR REPORTE DE CARRERAS");
        btnReporteCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCarrerasActionPerformed(evt);
            }
        });

        btnGuardar1.setText("Guardar");
        btnGuardar1.setColorBorde(null);
        btnGuardar1.setColorHover(new java.awt.Color(194, 210, 228));
        btnGuardar1.setColorNormal(new java.awt.Color(194, 224, 228));
        btnGuardar1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnGuardar1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnConsultar1.setText("Consultar");
        btnConsultar1.setColorBorde(null);
        btnConsultar1.setColorHover(new java.awt.Color(194, 210, 228));
        btnConsultar1.setColorNormal(new java.awt.Color(194, 224, 228));
        btnConsultar1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnConsultar1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });

        btnModificar1.setText("Actualizar");
        btnModificar1.setColorBorde(null);
        btnModificar1.setColorHover(new java.awt.Color(194, 210, 228));
        btnModificar1.setColorNormal(new java.awt.Color(194, 224, 228));
        btnModificar1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnModificar1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.setColorBorde(null);
        btnEliminar1.setColorHover(new java.awt.Color(228, 171, 172));
        btnEliminar1.setColorNormal(new java.awt.Color(237, 197, 212));
        btnEliminar1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnEliminar1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

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

        btnSalir1.setText("Salir");
        btnSalir1.setColorBorde(null);
        btnSalir1.setColorHover(new java.awt.Color(228, 171, 172));
        btnSalir1.setColorNormal(new java.awt.Color(237, 197, 212));
        btnSalir1.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnSalir1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btnReporteCarreras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReporteCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFActionPerformed

    private void btnReporteCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCarrerasActionPerformed
        GestionReportes fr = new GestionReportes();
        try {
            fr.ReporteCarreras();
            dispose();
        } catch (JRException ex) {
            Logger.getLogger(DialogFacultad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnReporteCarrerasActionPerformed

    private void btnSeleccionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCarreraActionPerformed
        try {
            DialogBuscarFacultad f = new DialogBuscarFacultad();
            f.setVisible(true);
            facultad = f.facultadSelec;
            txtIdFacu.setText(facultad.getIdFacultad());
            txtNombreF.setText(facultad.getNombreFacultad());
        } catch (SQLException ex) {
            Logger.getLogger(DialogCarreras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeleccionarCarreraActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String codigoCarrera = txtCodigoCarrera.getText();
        String nombreCarrera = txtNombreCarrera.getText();
        String idFacultad = txtIdFacu.getText();
        Carreras x = new Carreras(codigoCarrera, nombreCarrera, facultad);
        try {
            cd.insertar(x);
            cd.mostrarCarreras(modelo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        try {
            String idCarreras = txtCodigoCarrera.getText();
            Carreras x;
            x = cd.buscarCarreras(idCarreras);
            if (x == null) {
                JOptionPane.showMessageDialog(null, "Esa carrera no existe");
            } else {

                txtNombreCarrera.setText(x.getNombreCarrera());
                txtIdFacu.setText(x.getFacultad().getIdFacultad());
                txtNombreF.setText(x.getFacultad().getNombreFacultad());
                facultad=x.getFacultad();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        String idCarrera = txtCodigoCarrera.getText();
        String nombreCarrera = txtNombreCarrera.getText();
        Carreras x = new Carreras(idCarrera, nombreCarrera, facultad);
        try {
            cd.actualizar(x);
            cd.mostrarCarreras(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        String idCarrera = txtCodigoCarrera.getText();
        try {
            cd.eliminar(idCarrera);
            cd.mostrarCarreras(modelo);
            JOptionPane.showMessageDialog(null, "Se elimino el registro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try {
            cd.mostrarCarreras(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(DialogCarreras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtCodigoCarreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCarreraKeyTyped
      
        if(txtCodigoCarrera.getText().length()>=7){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoCarreraKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnConsultar1;
    private rsbuttom.RSButtonMetro btnEliminar1;
    private rsbuttom.RSButtonMetro btnGuardar1;
    private rsbuttom.RSButtonMetro btnLimpiar;
    private rsbuttom.RSButtonMetro btnModificar1;
    private rsbuttom.RSButtonMetro btnMostrar;
    private javax.swing.JButton btnReporteCarreras;
    private rsbuttom.RSButtonMetro btnSalir1;
    private rsbuttom.RSButtonMetro btnSeleccionarCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigoCarrera;
    private javax.swing.JTextField txtIdFacu;
    private javax.swing.JTextField txtNombreCarrera;
    private javax.swing.JTextField txtNombreF;
    // End of variables declaration//GEN-END:variables
}
