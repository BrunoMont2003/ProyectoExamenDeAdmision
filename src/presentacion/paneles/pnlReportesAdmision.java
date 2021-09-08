/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.paneles;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentacion.DialogBuscarAreas;
import presentacion.DialogBuscarAula;
import presentacion.DialogBuscarFacultad;
import presentacion.DialogBuscarModalidad;
import presentacion.DialogBuscarResponsableAula;
import presentacion.DialogReporteCarreras;

/**
 *
 * @author Frecuencia 7
 */
public class pnlReportesAdmision extends javax.swing.JPanel {

   
    public pnlReportesAdmision() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnReporteAreas = new rsbuttom.RSButtonMetro();
        btnReporteFacultades = new rsbuttom.RSButtonMetro();
        btnReporteCarreras = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        btnReporteModalidad = new rsbuttom.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        btnReporteAula = new rsbuttom.RSButtonMetro();
        btnReporteResponsableAula = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 39)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DE REPORTES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 499, -1));

        btnReporteAreas.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteAreas.setText("REPORTE DE  AREAS");
        btnReporteAreas.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteAreas.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAreasActionPerformed(evt);
            }
        });

        btnReporteFacultades.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteFacultades.setText("REPORTES DE  FACULTADES");
        btnReporteFacultades.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteFacultades.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteFacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFacultadesActionPerformed(evt);
            }
        });

        btnReporteCarreras.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteCarreras.setText("REPORTE DE  CARRERAS");
        btnReporteCarreras.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteCarreras.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCarrerasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporteCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 77, 520, -1));

        btnReporteModalidad.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteModalidad.setText("REPORTE DE  MODALIDAD");
        btnReporteModalidad.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteModalidad.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteModalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnReporteModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReporteModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 282, 520, 66));

        btnReporteAula.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteAula.setText("REPORTE DE  AULA");
        btnReporteAula.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteAula.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAulaActionPerformed(evt);
            }
        });

        btnReporteResponsableAula.setBackground(new java.awt.Color(255, 153, 102));
        btnReporteResponsableAula.setText("REPORTE DE  RESPONSABLE AULA");
        btnReporteResponsableAula.setColorHover(new java.awt.Color(255, 51, 51));
        btnReporteResponsableAula.setColorNormal(new java.awt.Color(255, 153, 102));
        btnReporteResponsableAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteResponsableAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteResponsableAula, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteAula, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnReporteAula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnReporteResponsableAula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 354, 520, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf-file.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 650, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteResponsableAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteResponsableAulaActionPerformed
        try {
            DialogBuscarResponsableAula f = new DialogBuscarResponsableAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteResponsableAulaActionPerformed

    private void btnReporteFacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFacultadesActionPerformed
        try {
            DialogBuscarFacultad f = new DialogBuscarFacultad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteFacultadesActionPerformed

    private void btnReporteAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAreasActionPerformed
        try {
            DialogBuscarAreas f = new DialogBuscarAreas();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteAreasActionPerformed

    private void btnReporteCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCarrerasActionPerformed
        try {
            DialogReporteCarreras f = new DialogReporteCarreras();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteCarrerasActionPerformed

    private void btnReporteModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteModalidadActionPerformed
        try {
            DialogBuscarModalidad f = new DialogBuscarModalidad();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteModalidadActionPerformed

    private void btnReporteAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAulaActionPerformed
        try {
            DialogBuscarAula f = new DialogBuscarAula();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportesAdmision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteAulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnReporteAreas;
    private rsbuttom.RSButtonMetro btnReporteAula;
    private rsbuttom.RSButtonMetro btnReporteCarreras;
    private rsbuttom.RSButtonMetro btnReporteFacultades;
    private rsbuttom.RSButtonMetro btnReporteModalidad;
    private rsbuttom.RSButtonMetro btnReporteResponsableAula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}