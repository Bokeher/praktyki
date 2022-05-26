/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.kalkulator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Szymon
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        sr_jPanel_main = new javax.swing.JPanel();
        sr_jButton_division = new javax.swing.JButton();
        sr_jButton_sqrt = new javax.swing.JButton();
        sr_jButton_pow = new javax.swing.JButton();
        sr_jButton_delete = new javax.swing.JButton();
        sr_jButton_times = new javax.swing.JButton();
        sr_jButton_nine = new javax.swing.JButton();
        sr_jButton_eight = new javax.swing.JButton();
        sr_jButton_seven = new javax.swing.JButton();
        sr_jButton_minus = new javax.swing.JButton();
        sr_jButton_six = new javax.swing.JButton();
        sr_jButton_five = new javax.swing.JButton();
        sr_jButton_four = new javax.swing.JButton();
        sr_jButton_plus = new javax.swing.JButton();
        sr_jButton_three = new javax.swing.JButton();
        sr_jButton_two = new javax.swing.JButton();
        sr_jButton_one = new javax.swing.JButton();
        sr_jButton_equals = new javax.swing.JButton();
        sr_jButton_zero = new javax.swing.JButton();
        sr_jButton_dot = new javax.swing.JButton();
        sr_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sr_jButton_division.setText("/");
        sr_jButton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_divisionActionPerformed(evt);
            }
        });

        sr_jButton_sqrt.setText("√");
        sr_jButton_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_sqrtActionPerformed(evt);
            }
        });

        sr_jButton_pow.setText("^");
        sr_jButton_pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_powActionPerformed(evt);
            }
        });

        sr_jButton_delete.setText("C");
        sr_jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_deleteActionPerformed(evt);
            }
        });

        sr_jButton_times.setText("*");
        sr_jButton_times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_timesActionPerformed(evt);
            }
        });

        sr_jButton_nine.setText("9");
        sr_jButton_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_nineActionPerformed(evt);
            }
        });

        sr_jButton_eight.setText("8");
        sr_jButton_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_eightActionPerformed(evt);
            }
        });

        sr_jButton_seven.setText("7");
        sr_jButton_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_sevenActionPerformed(evt);
            }
        });

        sr_jButton_minus.setText("-");
        sr_jButton_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_minusActionPerformed(evt);
            }
        });

        sr_jButton_six.setText("6");
        sr_jButton_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_sixActionPerformed(evt);
            }
        });

        sr_jButton_five.setText("5");
        sr_jButton_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_fiveActionPerformed(evt);
            }
        });

        sr_jButton_four.setText("4");
        sr_jButton_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_fourActionPerformed(evt);
            }
        });

        sr_jButton_plus.setText("+");
        sr_jButton_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_plusActionPerformed(evt);
            }
        });

        sr_jButton_three.setText("3");
        sr_jButton_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_threeActionPerformed(evt);
            }
        });

        sr_jButton_two.setText("2");
        sr_jButton_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_twoActionPerformed(evt);
            }
        });

        sr_jButton_one.setText("1");
        sr_jButton_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_oneActionPerformed(evt);
            }
        });

        sr_jButton_equals.setText("=");
        sr_jButton_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_equalsActionPerformed(evt);
            }
        });

        sr_jButton_zero.setText("0");
        sr_jButton_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_zeroActionPerformed(evt);
            }
        });

        sr_jButton_dot.setText(".");
        sr_jButton_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_dotActionPerformed(evt);
            }
        });

        sr_jTextField.setEditable(false);
        sr_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout sr_jPanel_mainLayout = new javax.swing.GroupLayout(sr_jPanel_main);
        sr_jPanel_main.setLayout(sr_jPanel_mainLayout);
        sr_jPanel_mainLayout.setHorizontalGroup(
            sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                .addComponent(sr_jButton_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sr_jButton_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sr_jButton_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                    .addComponent(sr_jButton_one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(sr_jButton_two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(sr_jButton_three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(sr_jButton_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jButton_four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(sr_jButton_five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(sr_jButton_six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(sr_jButton_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                            .addComponent(sr_jButton_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(sr_jButton_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(sr_jButton_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(sr_jButton_times, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(sr_jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(sr_jButton_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(sr_jButton_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(sr_jButton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(sr_jTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        sr_jPanel_mainLayout.setVerticalGroup(
            sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sr_jPanel_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sr_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_times, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jButton_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sr_jPanel_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sr_jPanel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sr_jButton_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_equalsActionPerformed
        String text = sr_jTextField.getText();
        if(sign == "/"){
            String numbers[] = text.split(sign);
            if(numbers[1].equals("0")){
                sr_jTextField.setText("Nie można dzielić przez 0!");
            }else sr_jTextField.setText(""+corrForm(calc()));

        }else if(sr_jTextField.getText().contains(sign)){
            sr_jTextField.setText(""+corrForm(calc()));
        }

    }//GEN-LAST:event_sr_jButton_equalsActionPerformed

    private void sr_jButton_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_plusActionPerformed
        addOper("+");
    }//GEN-LAST:event_sr_jButton_plusActionPerformed

    private void sr_jButton_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_minusActionPerformed
        addOper("-");
    }//GEN-LAST:event_sr_jButton_minusActionPerformed

    private void sr_jButton_timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_timesActionPerformed
        addOper("*");
    }//GEN-LAST:event_sr_jButton_timesActionPerformed

    private void sr_jButton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_divisionActionPerformed
        addOper("/");
    }//GEN-LAST:event_sr_jButton_divisionActionPerformed

    private void sr_jButton_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_oneActionPerformed
        add("1");
    }//GEN-LAST:event_sr_jButton_oneActionPerformed

    private void sr_jButton_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_twoActionPerformed
        add("2");
    }//GEN-LAST:event_sr_jButton_twoActionPerformed

    private void sr_jButton_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_threeActionPerformed
        add("3");
    }//GEN-LAST:event_sr_jButton_threeActionPerformed

    private void sr_jButton_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_fourActionPerformed
        add("4");
    }//GEN-LAST:event_sr_jButton_fourActionPerformed

    private void sr_jButton_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_fiveActionPerformed
        add("5");
    }//GEN-LAST:event_sr_jButton_fiveActionPerformed

    private void sr_jButton_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_sixActionPerformed
        add("6");
    }//GEN-LAST:event_sr_jButton_sixActionPerformed

    private void sr_jButton_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_sevenActionPerformed
        add("7");
    }//GEN-LAST:event_sr_jButton_sevenActionPerformed

    private void sr_jButton_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_eightActionPerformed
        add("8");
    }//GEN-LAST:event_sr_jButton_eightActionPerformed

    private void sr_jButton_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_nineActionPerformed
        add("9");
    }//GEN-LAST:event_sr_jButton_nineActionPerformed

    private void sr_jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_deleteActionPerformed
        clear();
    }//GEN-LAST:event_sr_jButton_deleteActionPerformed

    private void sr_jButton_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_zeroActionPerformed
        add("0");
    }//GEN-LAST:event_sr_jButton_zeroActionPerformed

    private void sr_jButton_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_dotActionPerformed
        String text = sr_jTextField.getText();
        if(!text.contains(".")) add(".");
        else if(text.contains(sign)){
            String numbers[] = text.split("\\"+sign);
            if(!numbers[1].contains(".")) add(".");
        }
    }//GEN-LAST:event_sr_jButton_dotActionPerformed

    private void sr_jButton_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_sqrtActionPerformed
        String text = sr_jTextField.getText();
        if(text.charAt(0) == '-') sr_jTextField.setText("Nie ma pierwiastka 2 stopnia z liczby ujemnej");
        else sr_jTextField.setText(corrForm(Float.parseFloat(""+Math.sqrt(Float.parseFloat(text)))));
    }//GEN-LAST:event_sr_jButton_sqrtActionPerformed

    private void sr_jButton_powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_powActionPerformed
        addOper("^");
    }//GEN-LAST:event_sr_jButton_powActionPerformed
       
    private void addOper(String oper){
        add(oper);
        sign = oper;
    }
    
    private float calc(){
        String text = sr_jTextField.getText();
        String numbers[] = text.split("\\"+sign);
        
        float numb1 = Float.parseFloat(numbers[0]);
        float numb2 = Float.parseFloat(numbers[1]);
        
        switch (sign) {
            case "+":
                return (numb1+numb2);
            case "-":
                return (numb1-numb2);
            case "*":
                return (numb1*numb2);
            case "/":
                return (numb1/numb2);
            default:
                return (float) Math.pow(numb1, numb2);
        }
    }
    
    private void add(String text){
        String oldText = sr_jTextField.getText();
        sr_jTextField.setText(oldText+text);
    }
    
    private void clear(){
        sr_jTextField.setText("");
    }
    
    public static String corrForm(float d){
        if(d == (long) d) return String.format("%d", (long)d);
        else return String.format("%s", d);
    }
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }
    
    File f = new File("history.txt");
    String sign = " ";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sr_jButton_delete;
    private javax.swing.JButton sr_jButton_division;
    private javax.swing.JButton sr_jButton_dot;
    private javax.swing.JButton sr_jButton_eight;
    private javax.swing.JButton sr_jButton_equals;
    private javax.swing.JButton sr_jButton_five;
    private javax.swing.JButton sr_jButton_four;
    private javax.swing.JButton sr_jButton_minus;
    private javax.swing.JButton sr_jButton_nine;
    private javax.swing.JButton sr_jButton_one;
    private javax.swing.JButton sr_jButton_plus;
    private javax.swing.JButton sr_jButton_pow;
    private javax.swing.JButton sr_jButton_seven;
    private javax.swing.JButton sr_jButton_six;
    private javax.swing.JButton sr_jButton_sqrt;
    private javax.swing.JButton sr_jButton_three;
    private javax.swing.JButton sr_jButton_times;
    private javax.swing.JButton sr_jButton_two;
    private javax.swing.JButton sr_jButton_zero;
    private javax.swing.JPanel sr_jPanel_main;
    private javax.swing.JTextField sr_jTextField;
    // End of variables declaration//GEN-END:variables
}
