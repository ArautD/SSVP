/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SSVP;

import javax.swing.JOptionPane;
import java.sql.*;
//import SSVP.login_screen;

/**
 *
 * @author ARAUTO
 */
public class Login extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null; //Vai aceitar os códigos de SQL dentro do java
    ResultSet rs = null;

    public void logar() {
        //Aqui ele irá fazer o comando ao mysql
        String sql = "select distinct * from usuariologin where login=? and senha=?";
        try {
            //as linhas a seguir preparam a consulta ao BD para o login
            // o ? será substituido pelo que for escrito nos campos de texto de login e senha
            pst = conexao.prepareStatement(sql);
            pst.setString(1, Login_p.getText());
            //Captura de senha de forma segura, caracter por caracter
            String captura_senha = new String(Senha_p.getPassword());
            pst.setString(2, captura_senha);
            //A seguir iremos consultar a Query do SQL
            
            rs = pst.executeQuery();
            //Caso exista o usuario e senha correspondente
            if (rs.next()) {
                Main Telamain = new Main();
                Telamain.setVisible(true); //Abre a tela main
                this.dispose(); //fecha a aba de login
                
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "informações de login não encontradas, tente novamente!",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) { //Exibe o erro "posso por apenas o e que informa detalhadamente"
            JOptionPane.showMessageDialog(null, "Sistema se encontra Offline!");
        }
    }

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        conexao = login_screen.conector();
        //A linha a seguir informa os status de conexao
        if (conexao != null) {
            Status.setText("*Conectado*");
            Status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/verification.png")));
        } else {
            Status.setText("*Não Conectado*");
            Status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/database.png")));
        }
        System.out.println(conexao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login_p = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Senha_p = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ExitB = new javax.swing.JButton();
        LoginB = new javax.swing.JButton();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(21, 25, 28));
        jPanel3.setPreferredSize(new java.awt.Dimension(80, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pizza (1).png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel3.add(jLabel4);

        painel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(34, 40, 44));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Faça o Login");

        jLabel2.setBackground(new java.awt.Color(20, 25, 28));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chefe-de-cozinha_1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(20, 25, 28));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadeado (1).png"))); // NOI18N

        Senha_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Senha_pActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("By: Araut");

        ExitB.setText("SAIR");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });

        LoginB.setText("LOGIN");
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("STATUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Login_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Senha_p, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ExitB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Status)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_p, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Senha_p))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        painel1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(painel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(964, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Senha_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Senha_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Senha_pActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBActionPerformed

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed
        //Chamando metodo Logar
        logar();
       
    }//GEN-LAST:event_LoginBActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitB;
    private javax.swing.JButton LoginB;
    private javax.swing.JTextField Login_p;
    private javax.swing.JPasswordField Senha_p;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel painel1;
    // End of variables declaration//GEN-END:variables
}
