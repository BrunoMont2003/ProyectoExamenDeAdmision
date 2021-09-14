/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.paneles;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentacion.DialogEstadisticoCantidadCarrerasBarras;
import presentacion.DialogEstadisticoCantidadCarrerasPie;
import presentacion.DialogEstadisticoCantidadFacultadesBarras;
import presentacion.DialogEstadisticoCantidadFacultadesPie;

/**
 *
 * @author Frecuencia 7
 */
public class pnlMenuDiagram1 extends javax.swing.JPanel {

    /**
     * Creates new form pnlMenuDiagram
     */
    public pnlMenuDiagram1() {
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

        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        btnCircular = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(520, 320));

        rSButtonMetro1.setText("Grafico De Barras");
        rSButtonMetro1.setColorHover(new java.awt.Color(255, 153, 153));
        rSButtonMetro1.setColorNormal(new java.awt.Color(255, 0, 0));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        btnCircular.setText("Grafico Circular");
        btnCircular.setColorHover(new java.awt.Color(255, 153, 153));
        btnCircular.setColorNormal(new java.awt.Color(255, 0, 0));
        btnCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCircular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnCircular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircularActionPerformed
         try {
            DialogEstadisticoCantidadCarrerasPie f = new DialogEstadisticoCantidadCarrerasPie();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportePostulante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCircularActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
          try {
            DialogEstadisticoCantidadCarrerasBarras f = new DialogEstadisticoCantidadCarrerasBarras();
            f.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(pnlReportePostulante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCircular;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}