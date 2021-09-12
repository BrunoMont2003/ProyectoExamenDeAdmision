/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.paneles;

import java.sql.SQLException;
import presentacion.DialogPostulante;
import presentacion.DialogRespuesta;


/**
 *
 * @author Frecuencia 7
 */
public class pnlRegistroPostulante extends javax.swing.JPanel {

   
    public pnlRegistroPostulante() {
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
        btnRegistrarPostulante = new rsbuttom.RSButtonMetro();
        btnRegistroRespuestas = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 39)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DE REGISTRO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 499, -1));

        btnRegistrarPostulante.setBackground(new java.awt.Color(255, 153, 102));
        btnRegistrarPostulante.setText("REGISTRO DE  POSTULANTE");
        btnRegistrarPostulante.setColorHover(new java.awt.Color(255, 51, 51));
        btnRegistrarPostulante.setColorNormal(new java.awt.Color(255, 153, 102));
        btnRegistrarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPostulanteActionPerformed(evt);
            }
        });

        btnRegistroRespuestas.setBackground(new java.awt.Color(255, 153, 102));
        btnRegistroRespuestas.setText("REGISTRO DE  RESPUESTAS");
        btnRegistroRespuestas.setColorHover(new java.awt.Color(255, 51, 51));
        btnRegistroRespuestas.setColorNormal(new java.awt.Color(255, 153, 102));
        btnRegistroRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroRespuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistroRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnRegistrarPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 520, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ADMISION-UNT.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 650, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPostulanteActionPerformed
        try {
            DialogPostulante f = new DialogPostulante();
            f.setVisible(true);
        } catch (SQLException ex) {
    
        }
    }//GEN-LAST:event_btnRegistrarPostulanteActionPerformed

    private void btnRegistroRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroRespuestasActionPerformed
        DialogRespuesta f = new DialogRespuesta();
        f.setVisible(true);
    }//GEN-LAST:event_btnRegistroRespuestasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnRegistrarPostulante;
    private rsbuttom.RSButtonMetro btnRegistroRespuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
