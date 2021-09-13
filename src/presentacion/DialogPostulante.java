/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.AulaDAO;
import datos.CarrerasDAO;
import datos.ExamenDAO;
import datos.ListaPostulante_Examen;
import datos.ModalidadDAO;
import datos.PostulanteDAO;
import entidades.Aula;
import entidades.Carreras;
import entidades.Examen;
import entidades.Modalidad;
import entidades.Postulante;
import entidades.Postulante_Examen;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frecuencia 7
 */
public class DialogPostulante extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    Carreras carreras;
    Aula aula;
    Modalidad modalidad;
    Postulante postulante;
    PostulanteDAO pd = new PostulanteDAO();
    ExamenDAO examendao = new ExamenDAO();
    Examen examen;
    Postulante_Examen pe = null;
    ListaPostulante_Examen examenes = new ListaPostulante_Examen();

    /**
     * Creates new form DialogPostulante
     */
    public DialogPostulante() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        setLocationRelativeTo(null);
        String nombreColumnas[] = {"ID EXAMEN", "SEMESTRE", "FECHA", "AREA", "MODALIDAD"};
        modelo.setColumnIdentifiers(nombreColumnas);
        desHabilitar();
        deshabilitarExamen();
        deshabilitarAula();

    }

    public void deshabilitarAula() {
        btnSeleccionarAula.setEnabled(false);

    }

    public void habilitarAula() {
        btnSeleccionarAula.setEnabled(true);
    }

    public void habilitarExamen() {
        btnBuscarExamen.setEnabled(true);
        btnAgregarExamen.setEnabled(true);
        btnEliminarExamen.setEnabled(true);
    }

    public void deshabilitarExamen() {
        btnBuscarExamen.setEnabled(false);
        btnAgregarExamen.setEnabled(false);
        btnEliminarExamen.setEnabled(false);
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

    public void limpiarEntradasExamen() {
        txtIdExamen.setText("");
        txtSemestre.setText("");
        txtFecha.setText("");
        txtArea.setText("");
        txtModalidad.setText("");
    }

    public void limpiarEntradas() {
        txtIdPostulante.setText("");
        txtNombres.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtDni.setText("");
        txtIdCarrera.setText("");
        txtNCarrera.setText("");
        txtIDAULA.setText("");
        txtNAula.setText("");
        txtIdModalidad.setText("");
        txtNomModalidad.setText("");
        limpiarEntradasExamen();
        modelo.setColumnCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdCarrera = new javax.swing.JTextField();
        txtNCarrera = new javax.swing.JTextField();
        btnSeleccionarCarrera = new rsbuttom.RSButtonMetro();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIDAULA = new javax.swing.JTextField();
        btnSeleccionarAula = new rsbuttom.RSButtonMetro();
        txtNAula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnModalidad = new rsbuttom.RSButtonMetro();
        txtIdModalidad = new javax.swing.JTextField();
        txtNomModalidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtIdPostulante = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtIdExamen = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSemestre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnEliminarExamen = new rsbuttom.RSButtonMetro();
        btnLimpiarExamen = new rsbuttom.RSButtonMetro();
        btnAgregarExamen = new rsbuttom.RSButtonMetro();
        btnBuscarExamen = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        btnLimpiar = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnConsultar = new rsbuttom.RSButtonMetro();
        btnGuardar = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE POSTULANTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 526, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("CARRERAS");

        txtIdCarrera.setEditable(false);
        txtIdCarrera.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        txtNCarrera.setEditable(false);
        txtNCarrera.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ID CARRERA");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NOMBRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnSeleccionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnSeleccionarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("AULA");

        txtIDAULA.setEditable(false);
        txtIDAULA.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        btnSeleccionarAula.setBackground(new java.awt.Color(153, 255, 153));
        btnSeleccionarAula.setText("SELECCIONAR");
        btnSeleccionarAula.setColorHover(new java.awt.Color(148, 237, 148));
        btnSeleccionarAula.setColorNormal(new java.awt.Color(153, 255, 153));
        btnSeleccionarAula.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnSeleccionarAula.setColorTextPressed(new java.awt.Color(153, 153, 153));
        btnSeleccionarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarAulaActionPerformed(evt);
            }
        });

        txtNAula.setEditable(false);
        txtNAula.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ID AULA");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Numero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNAula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(txtIDAULA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDAULA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNAula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addComponent(btnSeleccionarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 280));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("MODALIDAD");

        btnModalidad.setBackground(new java.awt.Color(153, 255, 153));
        btnModalidad.setText("SELECCIONAR");
        btnModalidad.setColorHover(new java.awt.Color(148, 237, 148));
        btnModalidad.setColorNormal(new java.awt.Color(153, 255, 153));
        btnModalidad.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnModalidad.setColorTextPressed(new java.awt.Color(153, 153, 153));
        btnModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModalidadActionPerformed(evt);
            }
        });

        txtIdModalidad.setEditable(false);
        txtIdModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        txtNomModalidad.setEditable(false);
        txtNomModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ID MODALIDAD");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("NOMBRE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, -1, 280));

        Tabla.setModel(modelo);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 1210, 220));

        txtIdPostulante.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtIdPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPostulanteActionPerformed(evt);
            }
        });
        txtIdPostulante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPostulanteKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdPostulante, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 82, 179, 40));

        txtNombres.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 146, 179, 40));

        txtPaterno.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });
        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 207, 179, 40));

        txtMaterno.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 263, 179, 40));

        txtDni.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 329, 179, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID POSTULANTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 92, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 156, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("A. PATERNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 217, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("A. MATERNO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 273, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DNI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 339, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setText("EXAMEN");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 86, -1));

        txtIdExamen.setEditable(false);
        txtIdExamen.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel5.add(txtIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, 37));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel5.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 210, 37));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ID EXAMEN");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("FECHA");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        txtSemestre.setEditable(false);
        txtSemestre.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel5.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 210, 37));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("SEMESTRE");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("ÁREA");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtArea.setEditable(false);
        txtArea.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel5.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 210, 37));

        txtModalidad.setEditable(false);
        txtModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel5.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 210, 37));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("MODALIDAD");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        btnEliminarExamen.setText("ELIMINAR");
        btnEliminarExamen.setColorHover(new java.awt.Color(230, 58, 58));
        btnEliminarExamen.setColorNormal(new java.awt.Color(255, 0, 0));
        btnEliminarExamen.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnEliminarExamen.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarExamenActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 134, -1));

        btnLimpiarExamen.setText("LIMPIAR");
        btnLimpiarExamen.setColorHover(new java.awt.Color(230, 58, 58));
        btnLimpiarExamen.setColorNormal(new java.awt.Color(255, 0, 0));
        btnLimpiarExamen.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnLimpiarExamen.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnLimpiarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarExamenActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpiarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 134, -1));

        btnAgregarExamen.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarExamen.setText("AGREGAR");
        btnAgregarExamen.setColorHover(new java.awt.Color(148, 237, 148));
        btnAgregarExamen.setColorNormal(new java.awt.Color(153, 255, 153));
        btnAgregarExamen.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnAgregarExamen.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAgregarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarExamenActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 134, -1));

        btnBuscarExamen.setText("...");
        btnBuscarExamen.setColorBorde(null);
        btnBuscarExamen.setColorHover(new java.awt.Color(194, 210, 228));
        btnBuscarExamen.setColorNormal(new java.awt.Color(194, 224, 228));
        btnBuscarExamen.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnBuscarExamen.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnBuscarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExamenActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 50, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1230, 200));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 134, -1));

        btnLimpiar.setText("Restaurar");
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
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 840, 134, -1));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 840, 134, -1));

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
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 840, 134, -1));

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
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 840, 134, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 840, 134, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPostulanteActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void btnSeleccionarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCarreraActionPerformed
        try {
            DialogReporteCarreras f = new DialogReporteCarreras();
            f.setVisible(true);
            carreras = f.carrerasSelec;
            txtIdCarrera.setText(carreras.getCodigoCarrera());
            txtNCarrera.setText(carreras.getNombreCarrera());
            habilitarAula();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnSeleccionarCarreraActionPerformed

    private void btnSeleccionarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarAulaActionPerformed
        try {
            DialogBuscarAula f = new DialogBuscarAula(txtIdCarrera.getText());
            f.setVisible(true);
            aula = f.aulaSelec;
            txtIDAULA.setText(aula.getIdAula());
            txtNAula.setText(String.valueOf(aula.getnAula()));
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnSeleccionarAulaActionPerformed

    private void btnModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModalidadActionPerformed
        try {
            DialogBuscarModalidad f = new DialogBuscarModalidad();
            f.setVisible(true);
            modalidad = f.modalidadSelec;
            txtIdModalidad.setText(modalidad.getIdModalidad());
            txtNomModalidad.setText(modalidad.getNombreM());
            habilitarExamen();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnModalidadActionPerformed

    private void btnAgregarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarExamenActionPerformed
        if (txtIdExamen.getText().equals("") || txtSemestre.getText().equals("")
                || txtFecha.getText().equals("") || txtArea.getText().equals("")
                || txtModalidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO DEJE EL CAMPO VACÍO");
        } else {

            String idExamen = txtIdExamen.getText();
            String semestre = txtSemestre.getText();
            String fecha = txtFecha.getText();
            String area = txtArea.getText();
            String mod = txtModalidad.getText();
            Examen aux = new Examen();
            aux.setIdExamen(idExamen);

            Object[] fila = {idExamen, semestre, fecha, area, mod};
            modelo.addRow(fila);
            btnAgregarExamen.setEnabled(false);

        }
    }//GEN-LAST:event_btnAgregarExamenActionPerformed

    private void btnEliminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarExamenActionPerformed
        int i = Tabla.getSelectedRow();
        if (i != -1) {
            int rpta = JOptionPane.showConfirmDialog(null, "Esta seguro?", "Eliminar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (rpta == JOptionPane.OK_OPTION) {
                try {
                    String idExamen = modelo.getValueAt(i, 0).toString();
                    postulante = pd.buscarPostulante(txtIdPostulante.getText());
                    pe = postulante.getL().getElemento(i);
                    examenes.eliminar(i);
                    pd.eliminarExamen(idExamen);
                } catch (SQLException ex) {
                    System.out.println("ERROR: " + ex.getMessage());
                }
                modelo.removeRow(i);

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un examen");
            }

        }

    }//GEN-LAST:event_btnEliminarExamenActionPerformed

    private void btnLimpiarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarExamenActionPerformed
        limpiarEntradasExamen();
        btnAgregarExamen.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarExamenActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();
        deshabilitarAula();
        deshabilitarExamen();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String idPostulante = txtIdPostulante.getText();
        if (!idPostulante.equals("")) {
            try {
                pd.eliminar(idPostulante);
                pd.mostrarPostulantes(modelo);
                JOptionPane.showMessageDialog(null, "Se elimino el registro");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Este id no existe");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtIdPostulante.getText().equals("") || txtNombres.getText().equals("")
                || txtPaterno.getText().equals("") || txtMaterno.getText().equals("")
                || txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No DEJE EL CAMPO VACIO");
        } else {
            String idPostulante = txtIdPostulante.getText();
            String nombre = txtNombres.getText();
            String apellido_paterno = txtPaterno.getText();
            String apellido_materno = txtMaterno.getText();
            String dni = txtDni.getText();
            try {
                String idCarrera = txtIdCarrera.getText();
                Carreras c = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);

                String idAula = txtIDAULA.getText();
                Aula a = AulaDAO.getInstancia().buscarAula(idAula);

                String idModalidad = txtIdModalidad.getText();
                Modalidad m = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);

                Postulante x = new Postulante(idPostulante, nombre, apellido_paterno, apellido_materno, dni, c, a, m);
                x.setL(examenes);
                pd.actualizar(x);
                desHabilitar();
                pd.mostrarExamenes(idPostulante, modelo);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtIdPostulante.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DEL POSTULANTE");
        } else {

            String idPostulante = txtIdPostulante.getText();
            try {
                Postulante x;
                x = pd.buscarPostulante(idPostulante);
                if(x!=null){
                    
                    txtNombres.setText(x.getNombres());
                    txtPaterno.setText(x.getApellido_paterno());
                    txtMaterno.setText(x.getApellido_materno());
                    txtDni.setText(x.getDni());
                    txtIdCarrera.setText(x.getCarrera().getCodigoCarrera());
                    txtNCarrera.setText(x.getCarrera().getNombreCarrera());
                    txtIDAULA.setText(x.getAula().getIdAula());
                    txtNAula.setText(String.valueOf(x.getAula().getnAula()));
                    txtIdModalidad.setText(x.getModalidad().getIdModalidad());
                    txtNomModalidad.setText(x.getModalidad().getNombreM());

                    pd.mostrarExamenes(idPostulante, modelo);
                    habilitar();
                    habilitarAula();
                    habilitarExamen();
                }else{
                    JOptionPane.showMessageDialog(null, "Ese postulante no existe");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en SQL " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnBuscarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExamenActionPerformed
        DialogBuscarExmn f = new DialogBuscarExmn(txtIdModalidad.getText(), txtIdCarrera.getText());
        f.setVisible(true);
        try {

            examen = f.examenSelec;
            if (examen == null) {

            } else {

                txtIdExamen.setText(examen.getIdExamen());
                txtSemestre.setText(examen.getSemestre());
                txtFecha.setText(examen.getFecha().toStringFormatSql());
                txtArea.setText(examen.getArea().getNombreArea());
                txtModalidad.setText(examen.getModalidad().getNombreM());
                pe = new Postulante_Examen(examen);
                examenes.agregar(pe);

            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnBuscarExamenActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIdPostulante.getText().equals("") || txtNombres.getText().equals("")
                || txtPaterno.getText().equals("") || txtMaterno.getText().equals("")
                || txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No DEJE EL CAMPO VACIO");
        } else {
            try {
                if (pd.exists(txtIdPostulante.getText())) {
                    JOptionPane.showMessageDialog(null, "Ese id ya existe ingrese otro");
                    txtIdPostulante.setText("");
                    txtIdPostulante.requestFocus();
                } else {

                    String idPostulante = txtIdPostulante.getText();
                    String nombre = txtNombres.getText();
                    String apellido_paterno = txtPaterno.getText();
                    String apellido_materno = txtMaterno.getText();
                    String dni = txtDni.getText();
                    Postulante x = new Postulante(idPostulante, nombre, apellido_paterno, apellido_materno, dni, carreras, aula, modalidad);
                    System.out.println("A punto de insertar, hay examenes : " + examenes.getN());
                    x.setL(examenes);
                    System.out.println("Supuestamente insertados examenes: " + x.getL().getN());
                    pd.insertar(x);
                    limpiarEntradas();
                    deshabilitarExamen();
                    deshabilitarAula();

                }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdPostulanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPostulanteKeyTyped
        if (txtIdPostulante.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdPostulanteKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyTyped
        if (txtPaterno.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPaternoKeyTyped

    private void txtMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyTyped
        if (txtMaterno.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMaternoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char c = evt.getKeyChar();
        if (txtDni.getText().length() >= 8 || (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private rsbuttom.RSButtonMetro btnAgregarExamen;
    private rsbuttom.RSButtonMetro btnBuscarExamen;
    private rsbuttom.RSButtonMetro btnConsultar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private rsbuttom.RSButtonMetro btnEliminarExamen;
    private rsbuttom.RSButtonMetro btnGuardar;
    private rsbuttom.RSButtonMetro btnLimpiar;
    private rsbuttom.RSButtonMetro btnLimpiarExamen;
    private rsbuttom.RSButtonMetro btnModalidad;
    private rsbuttom.RSButtonMetro btnModificar;
    private rsbuttom.RSButtonMetro btnSalir;
    private rsbuttom.RSButtonMetro btnSeleccionarAula;
    private rsbuttom.RSButtonMetro btnSeleccionarCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDAULA;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtIdExamen;
    private javax.swing.JTextField txtIdModalidad;
    private javax.swing.JTextField txtIdPostulante;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNAula;
    private javax.swing.JTextField txtNCarrera;
    private javax.swing.JTextField txtNomModalidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
