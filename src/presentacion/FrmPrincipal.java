/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.ModalidadDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmPrincipal extends javax.swing.JFrame {

    private static FrmPrincipal instancia;
    ModalidadDAO md = new ModalidadDAO();

    public static FrmPrincipal getInstancia() {
        if (instancia == null) {
            instancia = new FrmPrincipal();
        }
        return instancia;
    }

    public FrmPrincipal() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/img/unt-reescalado.png");
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAreas = new javax.swing.JMenu();
        mnuiRegistrarAreas = new javax.swing.JMenuItem();
        mnuiReporteAreas = new javax.swing.JMenuItem();
        mnuFacultad = new javax.swing.JMenu();
        mnuiRegistrarFacultad = new javax.swing.JMenuItem();
        mnuiReporteFacultad = new javax.swing.JMenuItem();
        mnuCarreras = new javax.swing.JMenu();
        mnuiRegistrarCarreras = new javax.swing.JMenuItem();
        mnuiReporteCarreras = new javax.swing.JMenuItem();
        mnuModalidad = new javax.swing.JMenu();
        mnuiRegistrarModalidad = new javax.swing.JMenuItem();
        mnuiReporteModalidades = new javax.swing.JMenuItem();
        mnuAula = new javax.swing.JMenu();
        mnuiRegistrarAula = new javax.swing.JMenuItem();
        mnuiReporteAulas = new javax.swing.JMenuItem();
        mnuResponsableAula = new javax.swing.JMenu();
        mnuiRegistrarResponsableAula = new javax.swing.JMenuItem();
        mnuiBuscarResponsableAula = new javax.swing.JMenuItem();
        mnuExamen = new javax.swing.JMenu();
        mnuiRegistrarExamen = new javax.swing.JMenuItem();
        mnuiReporteExamens = new javax.swing.JMenuItem();
        mnuRangoPreguntas = new javax.swing.JMenu();
        mnuiRegistrarRangoPreguntas = new javax.swing.JMenuItem();
        mnuiReporteRangoPreguntas = new javax.swing.JMenuItem();
        mnuClave = new javax.swing.JMenu();
        mnuiRegistrarClave = new javax.swing.JMenuItem();
        mnuiReporteClaves = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mnuAreas.setText("AREAS");

        mnuiRegistrarAreas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarAreas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarAreas.setText("Registrar Areas");
        mnuiRegistrarAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarAreasActionPerformed(evt);
            }
        });
        mnuAreas.add(mnuiRegistrarAreas);

        mnuiReporteAreas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteAreas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteAreas.setText("Reporte Areas");
        mnuiReporteAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteAreasActionPerformed(evt);
            }
        });
        mnuAreas.add(mnuiReporteAreas);

        jMenuBar1.add(mnuAreas);

        mnuFacultad.setText("FACULTAD");

        mnuiRegistrarFacultad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarFacultad.setText("Registrar Facultad");
        mnuiRegistrarFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarFacultadActionPerformed(evt);
            }
        });
        mnuFacultad.add(mnuiRegistrarFacultad);

        mnuiReporteFacultad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteFacultad.setText("Reporte Facultad");
        mnuiReporteFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteFacultadActionPerformed(evt);
            }
        });
        mnuFacultad.add(mnuiReporteFacultad);

        jMenuBar1.add(mnuFacultad);

        mnuCarreras.setText("CARRERAS");

        mnuiRegistrarCarreras.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarCarreras.setText("Registrar Carreras");
        mnuiRegistrarCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarCarrerasActionPerformed(evt);
            }
        });
        mnuCarreras.add(mnuiRegistrarCarreras);

        mnuiReporteCarreras.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteCarreras.setText("Reporte Carreras");
        mnuiReporteCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteCarrerasActionPerformed(evt);
            }
        });
        mnuCarreras.add(mnuiReporteCarreras);

        jMenuBar1.add(mnuCarreras);

        mnuModalidad.setText("MODALIDAD");

        mnuiRegistrarModalidad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarModalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarModalidad.setText("Registrar Modalidad ");
        mnuiRegistrarModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarModalidadActionPerformed(evt);
            }
        });
        mnuModalidad.add(mnuiRegistrarModalidad);

        mnuiReporteModalidades.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteModalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteModalidades.setText("Reporte de Modalidades");
        mnuiReporteModalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteModalidadesActionPerformed(evt);
            }
        });
        mnuModalidad.add(mnuiReporteModalidades);

        jMenuBar1.add(mnuModalidad);

        mnuAula.setText("AULA");

        mnuiRegistrarAula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarAula.setText("Registrar Aula");
        mnuiRegistrarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarAulaActionPerformed(evt);
            }
        });
        mnuAula.add(mnuiRegistrarAula);

        mnuiReporteAulas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteAulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteAulas.setText("Reporte Aulas");
        mnuiReporteAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteAulasActionPerformed(evt);
            }
        });
        mnuAula.add(mnuiReporteAulas);

        jMenuBar1.add(mnuAula);

        mnuResponsableAula.setText("RESPONSABLE DE AULA");

        mnuiRegistrarResponsableAula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarResponsableAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarResponsableAula.setText("Registrar Responsable-Aula");
        mnuiRegistrarResponsableAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarResponsableAulaActionPerformed(evt);
            }
        });
        mnuResponsableAula.add(mnuiRegistrarResponsableAula);

        mnuiBuscarResponsableAula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiBuscarResponsableAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiBuscarResponsableAula.setText("Buscar Responsable-Aula");
        mnuiBuscarResponsableAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiBuscarResponsableAulaActionPerformed(evt);
            }
        });
        mnuResponsableAula.add(mnuiBuscarResponsableAula);

        jMenuBar1.add(mnuResponsableAula);

        mnuExamen.setText("EXAMEN");

        mnuiRegistrarExamen.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarExamen.setText("Registrar Examen");
        mnuiRegistrarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarExamenActionPerformed(evt);
            }
        });
        mnuExamen.add(mnuiRegistrarExamen);

        mnuiReporteExamens.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteExamens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteExamens.setText("Reporte Examenes");
        mnuiReporteExamens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteExamensActionPerformed(evt);
            }
        });
        mnuExamen.add(mnuiReporteExamens);

        jMenuBar1.add(mnuExamen);

        mnuRangoPreguntas.setText("RANGO PREGUNTAS");

        mnuiRegistrarRangoPreguntas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarRangoPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarRangoPreguntas.setText("Registrar Rango Preguntas");
        mnuiRegistrarRangoPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarRangoPreguntasActionPerformed(evt);
            }
        });
        mnuRangoPreguntas.add(mnuiRegistrarRangoPreguntas);

        mnuiReporteRangoPreguntas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteRangoPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteRangoPreguntas.setText("Reporte Rango Preguntas");
        mnuiReporteRangoPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteRangoPreguntasActionPerformed(evt);
            }
        });
        mnuRangoPreguntas.add(mnuiReporteRangoPreguntas);

        jMenuBar1.add(mnuRangoPreguntas);

        mnuClave.setText("CLAVE");

        mnuiRegistrarClave.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiRegistrarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_48px.png"))); // NOI18N
        mnuiRegistrarClave.setText("Registrar Clave");
        mnuiRegistrarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiRegistrarClaveActionPerformed(evt);
            }
        });
        mnuClave.add(mnuiRegistrarClave);

        mnuiReporteClaves.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mnuiReporteClaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit Property_48px.png"))); // NOI18N
        mnuiReporteClaves.setText("Reporte Clave");
        mnuiReporteClaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiReporteClavesActionPerformed(evt);
            }
        });
        mnuClave.add(mnuiReporteClaves);

        jMenuBar1.add(mnuClave);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiRegistrarAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarAreasActionPerformed
        try {
            DialogAreas f = new DialogAreas();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiRegistrarAreasActionPerformed

    private void mnuiRegistrarFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarFacultadActionPerformed
        try {
            DialogFacultad f = new DialogFacultad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiRegistrarFacultadActionPerformed

    private void mnuiRegistrarCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarCarrerasActionPerformed
        try {
            DialogCarreras f = new DialogCarreras();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiRegistrarCarrerasActionPerformed

    private void mnuiReporteAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteAreasActionPerformed
        try {
            DialogBuscarAreas f = new DialogBuscarAreas();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiReporteAreasActionPerformed

    private void mnuiReporteFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteFacultadActionPerformed
        try {
            DialogBuscarFacultad f = new DialogBuscarFacultad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiReporteFacultadActionPerformed

    private void mnuiReporteCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteCarrerasActionPerformed
        try {
            DialogReporteCarreras f = new DialogReporteCarreras();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiReporteCarrerasActionPerformed

    private void mnuiRegistrarModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarModalidadActionPerformed

        try {
           DialogModalidad f = new DialogModalidad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_mnuiRegistrarModalidadActionPerformed

    private void mnuiRegistrarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarAulaActionPerformed
        try {
            DialogAula f = new DialogAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiRegistrarAulaActionPerformed

    private void mnuiReporteAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteAulasActionPerformed
        try {
            DialogBuscarAula f = new DialogBuscarAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiReporteAulasActionPerformed

    private void mnuiReporteModalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteModalidadesActionPerformed
        try {
            DialogBuscarModalidad f = new DialogBuscarModalidad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiReporteModalidadesActionPerformed

    private void mnuiRegistrarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarExamenActionPerformed
        DialogExamen f = new DialogExamen();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiRegistrarExamenActionPerformed

    private void mnuiReporteExamensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteExamensActionPerformed
        DialogBuscarExmn f = new DialogBuscarExmn();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiReporteExamensActionPerformed

    private void mnuiRegistrarResponsableAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarResponsableAulaActionPerformed
        try {
            DialogResponsableAula f = new DialogResponsableAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiRegistrarResponsableAulaActionPerformed

    private void mnuiBuscarResponsableAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiBuscarResponsableAulaActionPerformed
        try {
            DialogBuscarResponsableAula f = new DialogBuscarResponsableAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuiBuscarResponsableAulaActionPerformed

    private void mnuiRegistrarRangoPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarRangoPreguntasActionPerformed
        DialogRangoPreguntas f = new DialogRangoPreguntas();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiRegistrarRangoPreguntasActionPerformed

    private void mnuiReporteRangoPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteRangoPreguntasActionPerformed
        DialogBuscarRangoPreguntas f= new DialogBuscarRangoPreguntas();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiReporteRangoPreguntasActionPerformed

    private void mnuiRegistrarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiRegistrarClaveActionPerformed
        // TODO add your handling code here:
        DialogClave f = new DialogClave();
        f.setVisible(true);
        
    }//GEN-LAST:event_mnuiRegistrarClaveActionPerformed

    private void mnuiReporteClavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiReporteClavesActionPerformed
        DialogBuscarClave f = new DialogBuscarClave();
        f.setVisible(true);
    }//GEN-LAST:event_mnuiReporteClavesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu mnuAreas;
    private javax.swing.JMenu mnuAula;
    private javax.swing.JMenu mnuCarreras;
    private javax.swing.JMenu mnuClave;
    private javax.swing.JMenu mnuExamen;
    private javax.swing.JMenu mnuFacultad;
    private javax.swing.JMenu mnuModalidad;
    private javax.swing.JMenu mnuRangoPreguntas;
    private javax.swing.JMenu mnuResponsableAula;
    private javax.swing.JMenuItem mnuiBuscarResponsableAula;
    private javax.swing.JMenuItem mnuiRegistrarAreas;
    private javax.swing.JMenuItem mnuiRegistrarAula;
    private javax.swing.JMenuItem mnuiRegistrarCarreras;
    private javax.swing.JMenuItem mnuiRegistrarClave;
    private javax.swing.JMenuItem mnuiRegistrarExamen;
    private javax.swing.JMenuItem mnuiRegistrarFacultad;
    private javax.swing.JMenuItem mnuiRegistrarModalidad;
    private javax.swing.JMenuItem mnuiRegistrarRangoPreguntas;
    private javax.swing.JMenuItem mnuiRegistrarResponsableAula;
    private javax.swing.JMenuItem mnuiReporteAreas;
    private javax.swing.JMenuItem mnuiReporteAulas;
    private javax.swing.JMenuItem mnuiReporteCarreras;
    private javax.swing.JMenuItem mnuiReporteClaves;
    private javax.swing.JMenuItem mnuiReporteExamens;
    private javax.swing.JMenuItem mnuiReporteFacultad;
    private javax.swing.JMenuItem mnuiReporteModalidades;
    private javax.swing.JMenuItem mnuiReporteRangoPreguntas;
    // End of variables declaration//GEN-END:variables
}
