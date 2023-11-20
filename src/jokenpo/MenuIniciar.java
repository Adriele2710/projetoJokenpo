
package jokenpo;

public class MenuIniciar extends javax.swing.JFrame {


    public MenuIniciar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnCalculadora = new javax.swing.JButton();
        btnComboBox = new javax.swing.JButton();
        btnJokenpo = new javax.swing.JButton();
        btnPlaneta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckComboBox = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnPlaneta1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCalculadora.setText("Formulário Calculadora");
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });

        btnComboBox.setText("Formulário ComboBox");
        btnComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboBoxActionPerformed(evt);
            }
        });

        btnJokenpo.setText("Jokenpô");
        btnJokenpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJokenpoActionPerformed(evt);
            }
        });

        btnPlaneta.setText("Planeta");
        btnPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPlaneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalculadora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnJokenpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCalculadora)
                .addGap(18, 18, 18)
                .addComponent(btnComboBox)
                .addGap(18, 18, 18)
                .addComponent(btnPlaneta)
                .addGap(18, 18, 18)
                .addComponent(btnJokenpo)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jMenu1.setText("Formulários");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Formulário Calculadora");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckComboBox.setSelected(true);
        jCheckComboBox.setText("Formulário ComboBox");
        jCheckComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckComboBoxActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckComboBox);

        jMenuItem1.setText("Jokenpo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        btnPlaneta1.setText("Planeta");
        btnPlaneta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneta1ActionPerformed(evt);
            }
        });
        jMenu1.add(btnPlaneta1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        jMenuSair.setText("Sair");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem3);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

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

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
       Calculadora cal1 = new Calculadora();
       cal1.setVisible(true);
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboBoxActionPerformed
      ExemploComboBox box = new ExemploComboBox();
      box.setVisible(true);
    }//GEN-LAST:event_btnComboBoxActionPerformed

    private void btnJokenpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJokenpoActionPerformed
        Jokenpo joke = new Jokenpo();
       joke.setVisible(true);
    }//GEN-LAST:event_btnJokenpoActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
         Calculadora cal1 = new Calculadora();
       cal1.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckComboBoxActionPerformed
        ExemploComboBox box = new ExemploComboBox();
      box.setVisible(true);
    }//GEN-LAST:event_jCheckComboBoxActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Jokenpo joke = new Jokenpo();
       joke.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanetaActionPerformed
       PesoPlaneta plan = new PesoPlaneta();
       plan.setVisible(true);
    }//GEN-LAST:event_btnPlanetaActionPerformed

    private void btnPlaneta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneta1ActionPerformed
       PesoPlaneta plan = new PesoPlaneta();
       plan.setVisible(true);
    }//GEN-LAST:event_btnPlaneta1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnComboBox;
    private javax.swing.JButton btnJokenpo;
    private javax.swing.JButton btnPlaneta;
    private javax.swing.JMenuItem btnPlaneta1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckComboBox;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
