/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jokenpo;

import javax.swing.JOptionPane;

/**
 *
 * @author 931166
 */
public class PesoPlaneta extends javax.swing.JFrame {

    /**
     * Creates new form PesoPlaneta
     */
    public PesoPlaneta() {
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
        jlPesoPlaneta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfPeso = new javax.swing.JTextField();
        jcbPlaneta = new javax.swing.JComboBox<>();
        jcbCalcularPeso = new javax.swing.JButton();
        txfResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlPesoPlaneta.setText("Peso Planeta");

        jLabel1.setText("Peso");

        jcbPlaneta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planetas", "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno. Lua" }));

        jcbCalcularPeso.setText("Calcular Peso");
        jcbCalcularPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCalcularPesoActionPerformed(evt);
            }
        });

        txfResultado.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txfPeso)
                .addGap(18, 18, 18)
                .addComponent(jcbPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jlPesoPlaneta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jcbCalcularPeso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlPesoPlaneta)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jcbCalcularPeso)
                .addGap(37, 37, 37)
                .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCalcularPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCalcularPesoActionPerformed
        double Peso = Double.parseDouble(txfPeso.getText());
        String planeta = jcbPlaneta.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "Você escolheu: " + jcbPlaneta.getSelectedItem().toString());
        
        if (planeta == "Mercúrio") {
            double resultado = (Peso / 10) * 3.6;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Vênus") {
            double resultado = (Peso / 10) * 8.7;
            txfResultado.setText("0 peso é: " + resultado);
            
        }
        else if (planeta == "Terra") {
            double resultado = (Peso / 10) * 9.8;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Marte") {
            double resultado = (Peso / 10) * 3.7;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Júpiter") {
            double resultado = (Peso / 10) * 24.79;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Saturno") {
            double resultado = (Peso / 10) * 10.44;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Urano") {
            double resultado = (Peso / 10) * 8.69;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Netuno") {
            double resultado = (Peso / 10) * 11.15;
            txfResultado.setText("0 peso é: " + resultado);
        }
        else if (planeta == "Lua") {
            double resultado = (Peso / 10) * 1.6;
            txfResultado.setText("0 peso é: " + resultado);
        }
    }//GEN-LAST:event_jcbCalcularPesoActionPerformed

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
            java.util.logging.Logger.getLogger(PesoPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesoPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesoPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesoPlaneta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesoPlaneta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jcbCalcularPeso;
    private javax.swing.JComboBox<String> jcbPlaneta;
    private javax.swing.JLabel jlPesoPlaneta;
    private javax.swing.JTextField txfPeso;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}