/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.AreasDAO;
import datos.AulaDAO;
import entidades.Aula;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class DialogBuscarAula extends javax.swing.JDialog {
DefaultTableModel modelo = new DefaultTableModel();
    Aula aulaSelec = new Aula();
    AulaDAO ad = new AulaDAO();
    /**
     * Creates new form DialogBuscarAula
     */
    public DialogBuscarAula() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        ad.mostrarAula(modelo);
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
        txtIdAula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("IDAULA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        getContentPane().add(txtIdAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 270, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jButton2.setText("Todos");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jButton3.setText("Salir");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        Tabla.setModel(modelo);
        jScrollPane2.setViewportView(Tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String idAula = txtIdAula.getText();
        try {
            ad.mostrarAulaPorArea(idAula, modelo);
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int i = Tabla.getSelectedRow();
        if (i != -1) {
            aulaSelec.setIdAula(modelo.getValueAt(i, 0).toString());
            aulaSelec.setnAula(Integer.parseInt(modelo.getValueAt(i, 1).toString()));
            aulaSelec.setCapacidad(Integer.parseInt(modelo.getValueAt(i, 2).toString()));
            aulaSelec.setNumeroAusentes(Integer.parseInt(modelo.getValueAt(i, 3).toString()));
            String IDArea = modelo.getValueAt(i, 4).toString();
            AreasDAO a = new AreasDAO();
            try {
                aulaSelec.setAreas(a.buscarArea(IDArea));
            } catch (SQLException ex) {
                Logger.getLogger(DialogBuscarAula.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un elemento");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DialogBuscarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DialogBuscarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DialogBuscarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DialogBuscarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DialogBuscarAula dialog = new DialogBuscarAula(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtIdAula;
    // End of variables declaration//GEN-END:variables
}