/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.paneles;

import presentacion.DialogBuscarClave;
import presentacion.DialogBuscarExmn;
import presentacion.DialogBuscarRangoPreguntas;


public class pnlReporteExamen extends javax.swing.JPanel {

   
    public pnlReporteExamen() {
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
        btnRegistroExamen = new rsbuttom.RSButtonMetro();
        btnRegistroRango = new rsbuttom.RSButtonMetro();
        btnRegistroClave = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 39)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DE REPORTES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 499, -1));

        btnRegistroExamen.setBackground(new java.awt.Color(255, 153, 102));
        btnRegistroExamen.setText("REPORTE EXAMEN");
        btnRegistroExamen.setColorHover(new java.awt.Color(255, 51, 51));
        btnRegistroExamen.setColorNormal(new java.awt.Color(255, 153, 102));
        btnRegistroExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroExamenActionPerformed(evt);
            }
        });

        btnRegistroRango.setBackground(new java.awt.Color(255, 153, 102));
        btnRegistroRango.setText("REPORTE RANGO PREGUNTA");
        btnRegistroRango.setColorHover(new java.awt.Color(255, 51, 51));
        btnRegistroRango.setColorNormal(new java.awt.Color(255, 153, 102));
        btnRegistroRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroRangoActionPerformed(evt);
            }
        });

        btnRegistroClave.setBackground(new java.awt.Color(255, 153, 102));
        btnRegistroClave.setText("REPORTE CLAVES");
        btnRegistroClave.setColorHover(new java.awt.Color(255, 51, 51));
        btnRegistroClave.setColorNormal(new java.awt.Color(255, 153, 102));
        btnRegistroClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroClave, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroRango, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistroExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistroRango, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistroClave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 520, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf-file.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 650, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroRangoActionPerformed
        DialogBuscarRangoPreguntas f = new DialogBuscarRangoPreguntas();
        f.setVisible(true);
    }//GEN-LAST:event_btnRegistroRangoActionPerformed

    private void btnRegistroExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroExamenActionPerformed
        DialogBuscarExmn f = new DialogBuscarExmn();
        f.setVisible(true);
    }//GEN-LAST:event_btnRegistroExamenActionPerformed

    private void btnRegistroClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClaveActionPerformed
        DialogBuscarClave f = new DialogBuscarClave();
       f.setVisible(true);
    }//GEN-LAST:event_btnRegistroClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnRegistroClave;
    private rsbuttom.RSButtonMetro btnRegistroExamen;
    private rsbuttom.RSButtonMetro btnRegistroRango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
