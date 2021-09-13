/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.CarrerasDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Frecuencia 7
 */
public class DialogEstadisticoCantidadCarrerasPie extends javax.swing.JDialog {
    CarrerasDAO car = new CarrerasDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
    public DialogEstadisticoCantidadCarrerasPie() throws SQLException {
        super(FrmPrincipal.getInstancia(), true);
        initComponents();
        car.mostrarCarreras(modelo);
        setLocationRelativeTo(null);
    }

    public void Barras(){
        int f1=0, f2=0, f3=0, f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f12=0,f13=0,f14=0,f15=0;
       try{
           DefaultPieDataset cd = new  DefaultPieDataset();
           for(int i=0; i<table.getRowCount();i++){
            if(table.getValueAt(i, 2).equals("FACD-01")){
                  f1++;
              }
            if(table.getValueAt(i, 2).equals("FACD-02")){
                  f2++;
              }
            if(table.getValueAt(i, 2).equals("FACD-03")){
                  f3++;
              }
            if(table.getValueAt(i, 2).equals("FACD-04")){
                  f4++;
              }
            if(table.getValueAt(i, 2).equals("FACD-05")){
                  f5++;
              }
            if(table.getValueAt(i, 2).equals("FACD-06")){
                  f6++;
              }
            if(table.getValueAt(i, 2).equals("FACD-07")){
                  f7++;
              }
            if(table.getValueAt(i, 2).equals("FACD-08")){
                  f8++;
              }
            if(table.getValueAt(i, 2).equals("FACD-09")){
                  f9++;
              }
             if(table.getValueAt(i, 2).equals("FACD-10")){
                  f10++;
              }
             if(table.getValueAt(i, 2).equals("FACD-11")){
                  f11++;
              }
             if(table.getValueAt(i, 2).equals("FACD-12")){
                  f12++;
              }
             if(table.getValueAt(i, 2).equals("FACD-13")){
                  f13++;
              }
             if(table.getValueAt(i, 2).equals("FACD-14")){
                  f14++;
              }
              if(table.getValueAt(i, 2).equals("FACD-15")){
                  f15++;
              }
           }
           cd.setValue("FACD-01", f1);
           cd.setValue("FACD-02",f2);
           cd.setValue("FACD-03",f3);
           cd.setValue("FACD-04",f4);
           cd.setValue("FACD-05",f5);
           cd.setValue("FACD-06",f6);
           cd.setValue("FACD-07",f7);
           cd.setValue("FACD-08",f8);
           cd.setValue("FACD-09",f9);
           cd.setValue("FACD-10",f10);
           cd.setValue("FACD-11",f11);
           cd.setValue("FACD-12",f12);
           cd.setValue("FACD-13",f13);
           cd.setValue("FACD-14",f14);
           cd.setValue("FACD-15",f15);
           JFreeChart fc = ChartFactory.createPieChart("CANTIDAD DE FACULTADES POR AREA", cd);
           ChartFrame cf = new ChartFrame("Cantidad De Carreras Por Facultad", fc);
           cf.setSize(1500, 800);
           
           cf.setLocationRelativeTo(null);
           cf.setVisible(true);
           cf.setAlwaysOnTop(true);
       }catch(Exception e){
           
       }     
  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnGenerar = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        table.setModel(modelo);
        jScrollPane1.setViewportView(table);

        btnGenerar.setText("GENERAR GRAFICO");
        btnGenerar.setColorHover(new java.awt.Color(255, 0, 0));
        btnGenerar.setColorNormal(new java.awt.Color(255, 153, 153));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("GRAFICO DE CANTIDAD DE CARRERAS SEGUN FACULTAD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       Barras();
        dispose();
    }//GEN-LAST:event_btnGenerarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}