/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.kalkulatorbmi;

import javax.swing.ImageIcon;

/**
 *
 * @author Szymon
 */
public class KalkulatorBMI extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorBMI
     */
    public KalkulatorBMI() {
        initComponents();
        jLabel_bmi.setText(""); // zeruje tu, aby ladnie wygladalo na podgladzie
        jLabel_bmi2.setText(""); 
        jLabel_img.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel_calculatorBmi = new javax.swing.JLabel();
        jLabel_weight = new javax.swing.JLabel();
        jSlider_weight = new javax.swing.JSlider();
        jTextField_weight = new javax.swing.JTextField();
        jLabel_height = new javax.swing.JLabel();
        jSlider_height = new javax.swing.JSlider();
        jTextField_height = new javax.swing.JTextField();
        jButton_calculateBmi = new javax.swing.JButton();
        jLabel_bmi = new javax.swing.JLabel();
        jLabel_bmi2 = new javax.swing.JLabel();
        jLabel_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(153, 204, 255));

        jLabel_calculatorBmi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_calculatorBmi.setText("Kalkulator BMI");

        jLabel_weight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_weight.setText("Waga [kg]");

        jSlider_weight.setMajorTickSpacing(25);
        jSlider_weight.setMaximum(250);
        jSlider_weight.setMinorTickSpacing(1);
        jSlider_weight.setPaintLabels(true);
        jSlider_weight.setPaintTicks(true);
        jSlider_weight.setSnapToTicks(true);
        jSlider_weight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_weightStateChanged(evt);
            }
        });

        jTextField_weight.setText("0");
        jTextField_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_weightActionPerformed(evt);
            }
        });

        jLabel_height.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_height.setText("Wzrost [cm]");

        jSlider_height.setMajorTickSpacing(15);
        jSlider_height.setMaximum(235);
        jSlider_height.setMinimum(100);
        jSlider_height.setMinorTickSpacing(1);
        jSlider_height.setPaintLabels(true);
        jSlider_height.setPaintTicks(true);
        jSlider_height.setSnapToTicks(true);
        jSlider_height.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_heightStateChanged(evt);
            }
        });

        jTextField_height.setText("0");
        jTextField_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_heightActionPerformed(evt);
            }
        });

        jButton_calculateBmi.setText("Oblicz");
        jButton_calculateBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calculateBmiActionPerformed(evt);
            }
        });

        jLabel_bmi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bmi.setText("Twoje BMI wynosi:");

        jLabel_bmi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_bmi2.setText("stan");

        jLabel_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_img.setText("img");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 123, Short.MAX_VALUE)
                .addComponent(jLabel_calculatorBmi)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_height, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider_height, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_bmi2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_bmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider_weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jTextField_height, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jTextField_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton_calculateBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_calculatorBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_weight)
                .addGap(2, 2, 2)
                .addComponent(jSlider_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_height)
                .addGap(4, 4, 4)
                .addComponent(jSlider_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_calculateBmi)
                .addGap(35, 35, 35)
                .addComponent(jLabel_bmi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_bmi2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_weightActionPerformed
        jSlider_weight.setValue(Integer.parseInt(jTextField_weight.getText()));
    }//GEN-LAST:event_jTextField_weightActionPerformed

    private void jTextField_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_heightActionPerformed
        jSlider_height.setValue(Integer.parseInt(jTextField_height.getText()));
    }//GEN-LAST:event_jTextField_heightActionPerformed

    private void jSlider_weightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_weightStateChanged
        jTextField_weight.setText(""+jSlider_weight.getValue());
    }//GEN-LAST:event_jSlider_weightStateChanged

    private void jSlider_heightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_heightStateChanged
        jTextField_height.setText(""+jSlider_height.getValue());
    }//GEN-LAST:event_jSlider_heightStateChanged

    private void jButton_calculateBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calculateBmiActionPerformed
        String pathToSrc = "C:\\Users\\rycht\\Documents\\NetBeansProjects\\KalkulatorBmi\\src\\main\\java\\pl\\com\\szymon\\rychter\\src\\";
        float weight = Float.parseFloat(jTextField_weight.getText());
        float height = (Float.parseFloat(jTextField_height.getText())) / 100; // przez 100 aby bylo zamienione na metry z cm
        float bmi = weight /(float)(height*height);
        bmi = Math.round(bmi*100)/100;
        if(weight == 0 || height == 0) jLabel_bmi.setText("Proszę podać prawidłowe wartości!");
        else{
            String stan = "";
            //if'y bez klamer dla 1 polecenia
            if(bmi<16) stan = "1wygłodzenie";
            else if(bmi<=16.99) stan = "2wychudzenie";
            else if(bmi<=18.49) stan = "3niedowaga";
            else if(bmi<=24.99) stan = "4prawidłowa masa ciała";
            else if(bmi<=29.99) stan = "5nadwaga";
            else if(bmi<=34.99) stan = "6otyłość I stopnia";
            else if(bmi<=39.99) stan = "7otyłość II stopnia (duża)";
            else stan = "8otyłość III stopnia (chorobliwa)";
            
            String arr[] = stan.split(" "); //aby odzielic pierwszy wyraz
            jLabel_img.setIcon(new javax.swing.ImageIcon(pathToSrc+arr[0]+".png"));
            jLabel_bmi.setText("Twoje BMI wynosi: "+bmi);
            jLabel_bmi2.setText(stan.substring(1)); // wyswietla z usunieta cyfra z przodu (ktora jest aby rozroznic stopnie otylosci)
        }
    }//GEN-LAST:event_jButton_calculateBmiActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorBMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calculateBmi;
    private javax.swing.JLabel jLabel_bmi;
    private javax.swing.JLabel jLabel_bmi2;
    private javax.swing.JLabel jLabel_calculatorBmi;
    private javax.swing.JLabel jLabel_height;
    private javax.swing.JLabel jLabel_img;
    private javax.swing.JLabel jLabel_weight;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSlider jSlider_height;
    private javax.swing.JSlider jSlider_weight;
    private javax.swing.JTextField jTextField_height;
    private javax.swing.JTextField jTextField_weight;
    // End of variables declaration//GEN-END:variables
}