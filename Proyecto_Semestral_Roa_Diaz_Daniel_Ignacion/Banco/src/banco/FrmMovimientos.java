
package banco;

import javax.swing.JOptionPane;

public class FrmMovimientos extends javax.swing.JFrame {

    Cuenta ClaseCuenta = new Cuenta();
    String cta;
    
    public FrmMovimientos(String NumCuenta) {
        initComponents();
        cta=NumCuenta;    
        ActualizarEncabezado(cta);
           
    }

    void ActualizarEncabezado(String NumCuenta){
     for(int i=1;i<=ClaseCuenta.x-1;i++)  
            {            
                if (NumCuenta.equals(ClaseCuenta.cuenta[i].Cuenta))
                {
                    this.LblCuenta.setText("Cuenta: "+ClaseCuenta.cuenta[i].Cuenta);               
                    this.LblNombre.setText("Cliente: "+ClaseCuenta.cuenta[i].Titular);
                    this.LblSaldo.setText("Saldo: "+String.valueOf(ClaseCuenta.cuenta[i].Saldo));
                    break;
                }
            }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAbonar = new javax.swing.JButton();
        BtnRetirar = new javax.swing.JButton();
        TxtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblCuenta = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblSaldo = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAbonar.setText("Abonar");
        BtnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbonarActionPerformed(evt);
            }
        });

        BtnRetirar.setText("Retirar");
        BtnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetirarActionPerformed(evt);
            }
        });

        jLabel1.setText("Monto");

        LblCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCuenta.setText("cuenta");

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNombre.setText("cliente");

        LblSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSaldo.setText("Saldo");

        BtnSalir.setBackground(new java.awt.Color(204, 255, 204));
        BtnSalir.setForeground(new java.awt.Color(51, 51, 255));
        BtnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nelson Soto Romero\\Desktop\\cerrar-sesion.png")); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setBorderPainted(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAbonar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRetirar)
                        .addGap(26, 26, 26)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNombre)
                .addGap(27, 27, 27)
                .addComponent(LblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAbonar)
                    .addComponent(BtnSalir)
                    .addComponent(BtnRetirar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void BtnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbonarActionPerformed
    ClaseCuenta.Abonar(cta, Integer.parseInt(this.TxtMonto.getText()));
    ActualizarEncabezado(cta);
    this.TxtMonto.setText("");
}//GEN-LAST:event_BtnAbonarActionPerformed

private void BtnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetirarActionPerformed
    ClaseCuenta.Retirar(cta, Integer.parseInt(this.TxtMonto.getText()));
    ActualizarEncabezado(cta);
    this.TxtMonto.setText("");
}//GEN-LAST:event_BtnRetirarActionPerformed

private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
    this.dispose();
    Login FrmLogin = new Login();
    FrmLogin.setVisible(true);
}//GEN-LAST:event_BtnSalirActionPerformed


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
            java.util.logging.Logger.getLogger(FrmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
/*
         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMovimientos().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbonar;
    private javax.swing.JButton BtnRetirar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblCuenta;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblSaldo;
    private javax.swing.JTextField TxtMonto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
