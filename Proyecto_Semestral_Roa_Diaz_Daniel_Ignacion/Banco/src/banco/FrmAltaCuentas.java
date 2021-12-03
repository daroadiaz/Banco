package banco;
import BD.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FrmAltaCuentas extends javax.swing.JFrame {
    
    Cuenta obj= new Cuenta();

    public FrmAltaCuentas() {
        initComponents();
        LlenarTabla();
        this.getContentPane().setBackground(Color.lightGray);
    }
    
    private  void LlenarTabla(){                
        DefaultTableModel modelo = (DefaultTableModel) TablaClientes.getModel(); 
        while(modelo.getRowCount()>0)modelo.removeRow(0);
        for(int i=2;i<=obj.x-1;i++) 
        {
            modelo.addRow(new Object[]{obj.cuenta[i].Cuenta, obj.cuenta[i].Titular, obj.cuenta[i].Saldo,obj.cuenta[i].NIP});                           
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        TxtPassword = new javax.swing.JPasswordField();
        BtnAgregar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta de Cuentas");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setText("RUN de Cliente:");

        jLabel2.setText("Nombre del Cliente:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Deposito Inicial:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password:");

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUN", "Cliente", "Saldo", "Password"
            }
        ));
        jScrollPane1.setViewportView(TablaClientes);

        BtnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        BtnAgregar.setForeground(new java.awt.Color(51, 51, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nelson Soto Romero\\Desktop\\agregar-usuario.png")); // NOI18N
        BtnAgregar.setText("Agregar Cuenta");
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(204, 255, 204));
        BtnSalir.setForeground(new java.awt.Color(51, 51, 255));
        BtnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nelson Soto Romero\\Desktop\\cerrar-sesion.png")); // NOI18N
        BtnSalir.setText("Cerrar Sesión");
        BtnSalir.setBorderPainted(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("(Sin dígito verificador)");

        eliminar.setText("VistaEliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtSaldo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(BtnAgregar)
                            .addGap(29, 29, 29)
                            .addComponent(BtnSalir))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnSalir))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
    if (TxtCuenta.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Falta RUN de Cliente");
    else if (this.TxtNombre.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Falta Nombre del cliente");
    else if (this.TxtSaldo.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Falta Saldo");
    else if (this.TxtPassword.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Falta Password");
    else {       
        obj.Crear(this.TxtCuenta.getText(), this.TxtNombre.getText(),  Integer.parseInt(this.TxtSaldo.getText()), this.TxtPassword.getText());

        LlenarTabla();
        
    }
    //agregar a base de datos
    try {
        Cuenta cuenta=new Cuenta();
        Conexion conexion1= new Conexion();
        Connection cnx = conexion1.obtenerConexion();
        String query = "INSERT INTO cliente(rutCliente, nombreCliente, password, saldo) VALUES(?,?,?,?)";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, this.TxtCuenta.getText());
        stmt.setString(2, this.TxtNombre.getText());
        stmt.setString(3, this.TxtPassword.getText());
        stmt.setString(4, this.TxtSaldo.getText());
        stmt.executeUpdate();
        stmt.close();
        cnx.close();
    } catch (SQLException e) {
        System.out.println("Error SQL al agregar libro"+ e.getMessage());
    }
    this.TxtCuenta.setText("");
    this.TxtNombre.setText("");
    this.TxtSaldo.setText("");
    this.TxtPassword.setText("");
}//GEN-LAST:event_BtnAgregarActionPerformed

private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
    this.dispose();
    Login FrmLogin = new Login();
    FrmLogin.setVisible(true);
}//GEN-LAST:event_BtnSalirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        ControlBD bd = new ControlBD();
        bd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAltaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmAltaCuentas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTextField TxtCuenta;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtSaldo;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
