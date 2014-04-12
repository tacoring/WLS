/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package waitinglist;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class LoginScreen extends javax.swing.JFrame {
    
    /** Creates new form Find */
    
    JDialog errorName;
    
    public LoginScreen() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waiting List Priortizing Software");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(100, 100, 550, 550));
        setMaximumSize(new java.awt.Dimension(550, 550));
        setMinimumSize(new java.awt.Dimension(700, 541));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 236, 253));
        jLabel2.setText("Waiting List Prioritizing Software");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 220, 485, 32);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(694, 399, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waitinglist/csuf-logo-header.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 150, 299, 77);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 290, 220, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 290, 70, 17);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(270, 330, 220, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 330, 70, 17);

        signInButton.setBackground(new java.awt.Color(0, 51, 102));
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signInButton);
        signInButton.setBounds(400, 370, 90, 25);

        jButton7.setBackground(new java.awt.Color(0, 51, 102));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("?");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(620, 20, 50, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waitinglist/WLS-main-background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 700, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        
        final String user = jTextField1.getText();
        String pass = new String(jPasswordField1.getPassword());
        int approved = WLConfig.LOGIN_START;
        
        try {
            approved = Login(user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Cannot connect to database server");
        }
      
        if (approved == WLConfig.LOGIN_SUCCESS)
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                    Find screen = new Find();
//                    screen.jLabel9.setText(user);
                    screen.setVisible(true);
                }
            });
        }else if (approved == WLConfig.LOGIN_PASSWORD_NOTMATCH){ 
            JOptionPane.showMessageDialog(rootPane, "Username-Password mismatch", 
                    "Inane error", JOptionPane.ERROR_MESSAGE);
        }else if (approved == WLConfig.LOGIN_NOMATCH_USER){
            JOptionPane.showMessageDialog(rootPane, "Username does not exist", 
                    "Inane error", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Check your network status!!", 
                    "Inane error", JOptionPane.ERROR_MESSAGE);
        }
            

    }//GEN-LAST:event_signInButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                    new Forgotpasswordscreen().setVisible(true);
                }
            });
    }//GEN-LAST:event_jButton7ActionPerformed

    
    public int Login (String username , String password) throws ClassNotFoundException, SQLException{

        System.out.println("Login Username: " + username);
        System.out.println("Login Password: " + password);
        
        int approved = WLConfig.LOGIN_START ;
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword)) {
            java.sql.Statement st = con.createStatement();
            String sql = ("SELECT * FROM user WHERE user_id = '" + username + "';");
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next())
            {
                if (rs.getNString("password").matches(password)){
//                    System.out.println("got something: ");
                    approved = WLConfig.LOGIN_SUCCESS ;
                }else{
                    System.out.println("No match : password wrong");
                    approved = WLConfig.LOGIN_PASSWORD_NOTMATCH ;
                }
                
            }else{
                System.out.println("No match");
                approved = WLConfig.LOGIN_NOMATCH_USER ;
            }
        }
      
          return approved;
    
    }
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables
    
}
