/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.AreasDAO;
import datos.CarrerasDAO;
import datos.ExamenDAO;
import datos.ModalidadDAO;
import datos.PostulanteDAO;
import datos.VacanteDAO;
import entidades.Carreras;
import entidades.Examen;
import entidades.Modalidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import reportes.GestionReportes;

/**
 *
 * @author bruno
 */
public class DialogGenerarVacantes extends javax.swing.JDialog {

    PostulanteDAO postulanteDAO = new PostulanteDAO();
    ExamenDAO examendao = new ExamenDAO();
    Examen examen;
    DefaultTableModel modelo = new DefaultTableModel();
    PostulanteDAO postulantedao = new PostulanteDAO();
    VacanteDAO vacantedao = new VacanteDAO();
    Carreras carrera = null;

    public DialogGenerarVacantes() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        setLocation(100, 100);
        initComponents();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboSemestre = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiarSeleccion = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox<>();
        cboModalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdExamen = new javax.swing.JTextField();
        btnGenerarVacantes = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnRestaurar = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarReportePorParametro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(238, 252, 168));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SELECCIONAR EXAMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Semestre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        cboSemestre.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        cboSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2021-I", "2021-II" }));
        cboSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSemestreActionPerformed(evt);
            }
        });
        jPanel2.add(cboSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, 30));

        btnBuscar.setBackground(new java.awt.Color(168, 192, 215));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        btnLimpiarSeleccion.setBackground(new java.awt.Color(234, 107, 107));
        btnLimpiarSeleccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnLimpiarSeleccion.setText("Restaurar");
        btnLimpiarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSeleccionActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 120, -1));

        txtDia.setEditable(false);
        txtDia.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 70, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Día");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        txtMes.setEditable(false);
        txtMes.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPanel2.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 70, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Mes");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 20));

        txtAño.setEditable(false);
        txtAño.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 70, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Año");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Carrera");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        cboCarrera.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Biologia", "Biologia Pesquera", "Microbiologia y Parasitologia", "Farmacia y Bioquimica", "Ingenieria Quimica", "Ingenieria Ambiental", "Educacion Inicial", "Educacion Primaria", "Educacion Secundaria", "Ciencias De La Comunicacion", "Medicina", "Estomatologia", "Enfermeria", "Antropologia", "Arqueologia", "Trabajo Social", "Turismo", "Historia", "Arquitectura y Urbanismo", "Estadistica", "Matematica", "Fisica", "Ingenieria Informatica", "Administracion", "Contabilidad", "Economia", "Derecho", "Ciencias Politcas y Gobernabilidad", "Ingenieria Industrial", "Ingenieria Mecanica", "Ingenieria Metalurgica", "Ingenieria Materiales", "Ingenieria Sistemas", "Ingenieria Minas", "Ingenieria Mecatronica", "Ingenieria Civil", "Ingenieria Agroindustrial", "Ingenieria Agricola", "Ingenieria Agronoma", "Ingenieria Zootecnia" }));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });
        jPanel2.add(cboCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, 30));

        cboModalidad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        cboModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ORDINARIO", "EXCELENCIA", "DISCAPACITADOS", "CEPUNT" }));
        cboModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModalidadActionPerformed(evt);
            }
        });
        jPanel2.add(cboModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 240, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Id Examen");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Modalidad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtIdExamen.setEditable(false);
        txtIdExamen.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jPanel2.add(txtIdExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 210, 30));

        btnGenerarVacantes.setText("OBTENER VACANTES");
        btnGenerarVacantes.setColorBorde(null);
        btnGenerarVacantes.setColorHover(new java.awt.Color(185, 204, 214));
        btnGenerarVacantes.setColorNormal(new java.awt.Color(99, 151, 167));
        btnGenerarVacantes.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnGenerarVacantes.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnGenerarVacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVacantesActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarVacantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 200, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 520, 460));

        Tabla.setModel(modelo);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 970, 610));

        btnRestaurar.setText("Restaurar");
        btnRestaurar.setColorBorde(null);
        btnRestaurar.setColorHover(new java.awt.Color(228, 171, 172));
        btnRestaurar.setColorNormal(new java.awt.Color(237, 197, 212));
        btnRestaurar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnRestaurar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 134, 40));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 134, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 3, 48)); // NOI18N
        jLabel2.setText("INGRESANTES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, 80, 66));

        btnGenerarReportePorParametro.setBackground(new java.awt.Color(255, 51, 51));
        btnGenerarReportePorParametro.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 11)); // NOI18N
        btnGenerarReportePorParametro.setText("GENERAR REPORTE");
        btnGenerarReportePorParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReportePorParametroActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReportePorParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSemestreActionPerformed

    }//GEN-LAST:event_cboSemestreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String semestre = cboSemestre.getSelectedItem().toString();
            String nomCarrera = cboCarrera.getSelectedItem().toString();
            carrera = CarrerasDAO.getInstancia().buscarCarrerasPorNombre(nomCarrera);
            if (carrera != null) {

                System.out.println("Carrera" + carrera.getCodigoCarrera());

                String nomModalidad = cboModalidad.getSelectedItem().toString();

                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidadPorNombre(nomModalidad);

                System.out.println("Modalidad: " + modalidad.getIdModalidad());

                examen = examendao.buscarExamen(semestre, carrera.getCodigoCarrera(), modalidad.getIdModalidad());

                System.out.println("Examen: " + examen.getIdExamen());

                txtIdExamen.setText(examen.getIdExamen());
                txtDia.setText(String.valueOf(examen.getFecha().getDia()));
                txtMes.setText(String.valueOf(examen.getFecha().getMes()));
                txtAño.setText(String.valueOf(examen.getFecha().getAño()));
                examendao.setOrdenDeMerito(examen, carrera.getCodigoCarrera());
                examendao.mostrarPostulantesPorExamenDeUnaCarrera(modelo, examen.getIdExamen(), carrera.getCodigoCarrera());
            } else {
                JOptionPane.showMessageDialog(null, "Algo anda mal con la carrera");
            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSeleccionActionPerformed

        txtDia.setText("");
        txtMes.setText("");
        txtAño.setText("");
        txtIdExamen.setText("");
        cboSemestre.setSelectedIndex(0);
        cboModalidad.setSelectedIndex(0);
        cboCarrera.setSelectedIndex(0);
        cboSemestre.requestFocus();
    }//GEN-LAST:event_btnLimpiarSeleccionActionPerformed

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoKeyTyped

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed

    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCarreraActionPerformed

    private void cboModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboModalidadActionPerformed

    private void btnGenerarVacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVacantesActionPerformed
        try {
            String nomCarrera = cboCarrera.getSelectedItem().toString();
            carrera = CarrerasDAO.getInstancia().buscarCarrerasPorNombre(nomCarrera);
            vacantedao.setVacantes(examen, carrera.getCodigoCarrera());
            vacantedao.mostrarVacantesDeUnExamenEnUnaCarrera(modelo, examen.getIdExamen(), carrera.getCodigoCarrera());
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGenerarVacantesActionPerformed

    private void btnGenerarReportePorParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReportePorParametroActionPerformed
        try {
            if (examen != null && carrera != null) {
                String idExamen = examen.getIdExamen();
                String idCarrera = carrera.getCodigoCarrera();
                GestionReportes gr = new GestionReportes();
                gr.ReporteVacantes(idExamen, idCarrera);
                dispose();
            }
        } catch (JRException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGenerarReportePorParametroActionPerformed

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
            java.util.logging.Logger.getLogger(DialogGenerarVacantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogGenerarVacantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogGenerarVacantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogGenerarVacantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                try {
                    DialogGenerarVacantes dialog = new DialogGenerarVacantes();
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DialogGenerarVacantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarReportePorParametro;
    private rsbuttom.RSButtonMetro btnGenerarVacantes;
    private javax.swing.JButton btnLimpiarSeleccion;
    private rsbuttom.RSButtonMetro btnRestaurar;
    private rsbuttom.RSButtonMetro btnSalir;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboModalidad;
    private javax.swing.JComboBox<String> cboSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtIdExamen;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
