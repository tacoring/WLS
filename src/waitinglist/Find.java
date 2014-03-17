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


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Find extends javax.swing.JFrame {
    
    /*
        Static variable
    */
    
    
    /** Creates new form Find */
    public Find() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();

        jTextField6.setText("jTextField6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jLayeredPane1Layout = new org.jdesktop.layout.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waiting List Prioritizing Software");
        setAutoRequestFocus(false);

        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("update waiting seats");

        jButton1.setActionCommand("Enroll");
        jButton1.setLabel("Enroll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Periortize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });

        jList2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jList2ComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Waiting List Prioritizing Software");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("CWID");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList3);

        jLabel5.setText("Waiting list");

        jLabel6.setText("Eligable students");

        jLabel7.setText("Course");

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("sign out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jOptionPane1.setMessage("Are you sure you want to delete this students ? ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jButton4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton2))
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 316, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(26, 26, 26)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 306, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(167, 167, 167)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel6))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(172, 172, 172)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 421, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, Short.MAX_VALUE)
                .add(jLabel4)
                .add(60, 60, 60))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton5)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 394, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(143, 143, 143)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton5)
                .add(14, 14, 14)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3)
                    .add(jLabel3)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel6)
                    .add(jLabel5))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .add(18, 23, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton2)
                    .add(jButton4)
                    .add(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    int c = 0 ;
    DefaultListModel Model = new DefaultListModel();
    /*
        This one is Add button
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {         
            jList3.setModel(Model);
            String sid = jTextField3.getText();
            Boolean findSid = false;
            
            //Check if insert sid exist in waiting list
            for (int i = 0; i < Model.getSize(); i++ ){
                String info  =  (String)Model.getElementAt(i) ;
                int dash  = info.indexOf("-");
                String temp = info.substring(dash+2);
                System.out.println("ADD - the sid: " + temp.toString() + ", input sid: " + sid.toString());
                if ( temp.toString().equals(sid.toString()) ){
                    findSid = true;
                    System.out.println("Find something same");
                }
            }
            if (findSid == false){
                String [] data = getData(sid);
                String [] info = new String[30];
                if (data[2] != null){
                    info[c]= data[0] + " , " + data[1] + " - " + data[2];
                    Model.insertElementAt(info[c], c);
                    c++;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "This cwid does not exist");
                }
                    
            }else{
                JOptionPane.showMessageDialog(rootPane, "Student already in list", 
                    "Inane error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
        String counter = Integer.toString(c) ;
        jLabel1.setText(counter);
         // getList();  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
                 
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    /*
        This is perioritize button
    */
    int w = 0 ;
    DefaultListModel eModel = new DefaultListModel();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String [] IDList = getIDList();
        try {
            //String [] data = perioritize(IDList);
//            String [] data = perioritizeNew(IDList);
//            jList2.setModel(eModel);
//            String [] eligiable = new String[30];
//            eligiable[w]= data[1]+" , "+data[2]+" - "+data[0];
//            eModel.insertElementAt(eligiable[w], w);
//            w++;
            Students [] perioritizeList = perioritizeNew(IDList);
            //Clear list first
            jList2.setModel(eModel);
            eModel.removeAllElements();
            w = 0;
            for (int i = 0; i < perioritizeList.length; i ++)
            {
                Students abc = perioritizeList[i];
                jList2.setModel(eModel);
                String [] eligiable = new String[30];
                eligiable[w]= "Weight: " + abc.getWeight() + ", INFO: " + abc.getFName() + " , " + abc.getLName() + " - " +abc.getCwid();
                eModel.insertElementAt(eligiable[w], w);
                w++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
     
     
      
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        try {
            jComboBox1.removeAllItems();
            String [] data = getCourses();
            String [] courses = new String[30];
            int z = 0 ;
            System.out.println(data.length);
            for ( int i = 0 ; i < 3 ; i++){    
                courses[i] = data[z]+" -  "+data[z+1]+" -  "+data[z+2];
                jComboBox1.addItem(courses[i]);
                z = z+3;
            }  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1FocusGained
    
    /*
        This is delete button
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int index = jList3.getSelectedIndex();
        if (index < 0){
            JOptionPane.showMessageDialog(rootPane, "YOu should choose one item", 
                    "Inane error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Model.removeElementAt(index);
            c--;
            String counter = Integer.toString(c) ;
            jLabel1.setText(counter);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jList2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ComponentHidden
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
//                //test code
//                
//                int a1 = 3;
//                int a2 = 6;
//                float f3 = (float)a1/a2;
//                System.out.println("===================" + f3);
            }
        });
        
        
    }

    public boolean Login (String user , String pass){

          return false;
    
    }
    
    public String [] getData(String sid) throws SQLException, ClassNotFoundException{
    
        String sid1 =  sid ;
        Class.forName("com.mysql.jdbc.Driver");
        String[] data = new String[10];
        try (Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword)) {
            java.sql.Statement st = con.createStatement();
            String sql = ("SELECT * FROM student WHERE cwid = "+sid1+";");
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String  a = rs.getNString("fname");
                String  b = rs.getNString("lname");
                int n = rs.getInt("cwid");
                String convid = Integer.toString(n);
//                data = ;
                data[0]= a ;
                data[1]= b ;
                data[2] = convid ;
                System.out.println("getData: " + rs.getRow());
            }
            
        }
        return data;
   
    }
 
    /*
        This method is for get waiting list
    */
    public String [] getIDList() { 
        String info = null ;
        //String [] sList = new String[Model.getSize()];
        String [] Sids = new String[Model.getSize()]; 
        for ( int i = 0 ; i < Model.getSize() ; i++){
            info  =  (String)Model.getElementAt(i) ;
            int dash  = info.indexOf("-");
            String temp = info.substring(dash+1);
            Sids[i]= temp ;
//            System.out.println("getIDList - " + Model.getElementAt(i));
//            System.out.println("getIDList - " + Sids[i]);
        }
        return Sids;
    }
    
    public  String [] perioritize (String [] IDList) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);
        String eList[] = new String[IDList.length];

        // String sql2 = ("SELECT * FROM student ;");
        int [] unitcompleted  = new int[IDList.length];
        int [] visa  = new int[IDList.length];
        int [] currentunit  = new int[IDList.length];
   
        //Query detail from waiting list
        for ( int i = 0 ; i < IDList.length ; i ++ ){
            java.sql.Statement st4 = con.createStatement();
    
            String sql4 = ("SELECT * FROM student where cwid ="+IDList[i]+";");
            ResultSet rs4 = st4.executeQuery(sql4);
            rs4.next();
            unitcompleted[i] = rs4.getInt("units_completed");
            //   visa[i] = rs4.getInt("visa");
            // currentunit[i] = rs4.getInt("current_units");
            System.out.println("ID : "+IDList[i]+"  Unitscompleted : "+unitcompleted[i]+"  Visa : "+visa[i]+"  Currentunits : "+currentunit[i]);
        }  
        java.sql.Statement stz = con.createStatement();
       
        int q = 0 ;
        for ( int x = 0 ; x < IDList.length ; x ++ ){
            int unitsperiority = 0 ; 
            for (int i =0 ; i < unitcompleted.length  ; i++){
            // unitcompleted[i] = rs4.getInt("units_completed");
                if (unitcompleted[i]>unitsperiority){  
                    unitsperiority = unitcompleted[i] ;      
                    System.out.println("Completed winner : "+unitsperiority);
                }
            }
            java.sql.Statement st5 = con.createStatement();
            String sql5 = ("SELECT * FROM student where units_completed ="+unitsperiority+";");
            ResultSet rs5 = st5.executeQuery(sql5);
            if (rs5.next() == true){
                int visaperiority = 0 ; 
                String [] visaname = new String[IDList.length];
        
                for (int i =0 ; i < visa.length  ; i++){
                    rs5.previous();
                    visa[i] = rs5.getInt("visa");
                    visaname[i] = rs5.getNString("fname");
                    if (visa[i]>visaperiority){
                        visaperiority = visa[i] ;
                        System.out.println("Visa winner : "+visaperiority+" - "+visaname[i]);
                        //rs5.next();
                    }
                }
                java.sql.Statement st6 = con.createStatement();
                String sql6 = ("SELECT * FROM student where visa ="+visaperiority+";");
                ResultSet rs6 = st6.executeQuery(sql6);
                if (rs6.next() == true){
                    int currentperiority = 12 ; 
                    for (int i =0 ; i < currentunit.length  ; i++){
                        currentunit[i] = rs6.getInt("current_units");
                        if (currentunit[i]<currentperiority){
                            currentperiority = currentunit[i] ;
                            System.out.println("Current winner : "+currentperiority);
                            // rs6.next();
                        }
    
                    }
                    java.sql.Statement st7 = con.createStatement();
                    String sql7 = ("SELECT * FROM student where current_units ="+currentperiority+";");
                    ResultSet rs7 = st7.executeQuery(sql7);
                    rs7.next();
                    int cwid = rs7.getInt("cwid");
                    eList[q] =  Integer.toString(cwid);
                    eList[q+1] =  rs7.getNString("fname"); 
                    eList[q+2] =  rs7.getNString("lname");
                    q = q+3;       
                }else{ 
                    rs6.next();
                    int cwid = rs6.getInt("cwid");
                    eList[q] =  Integer.toString(cwid);
                    eList[q+1] =  rs6.getNString("fname"); 
                    eList[q+2] =  rs6.getNString("lname");
                    q = q+3;
                }
            }
            else{
                rs5.next();
                int cwid = rs5.getInt("cwid");
                    
                eList[q] =  Integer.toString(cwid);
                eList[q+1] =  rs5.getNString("fname"); 
                eList[q+2] =  rs5.getNString("lname");
                q = q+3;
            }
        }        
        /*    int v = 0 ;    
                  for (int i =0 ; i < IDList.length  ; i++){  
        java.sql.Statement st5 = con.createStatement();
        String sql5 = ("SELECT * FROM student where units_completed ="+unitsperiority+" and visa ="+visaperiority+" and units_completed ="+currentperiority+" ;");
        ResultSet rs5 = st5.executeQuery(sql5);
        //rs5.next();
        int cwid = rs5.getInt("cwid");
          eList[v] =  Integer.toString(cwid);
            eList[v+1] =  rs5.getNString("fname"); 
              eList[v+2] =  rs5.getNString("lname");
             v = v+3;
        }
        /*   
        1 - units completed ( grad or fresh ) 
        2 - visa
        3 - current unit 
        -------------------------------------------------------    
        1- about to Graduate 
        2 - Senior
        3 - graduate ; juior ; 2nd yr
        4- sophomore ; frsh ment ; post 
        5 - all Csuf
        */ 
        //////////////comparing will be her ..////////////////
        con.close();
        return eList ;
    }
 
    /*
        This one will replaceperioritize
        Step 1: get list from waiting list
        Step 2: query detail data from list
        Step 3: calculate weight
        Step 4: return list
    */
    public  Students [] perioritizeNew (String [] IDList) throws SQLException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);
        String eList[] = new String[IDList.length];
        Students[] studentArray = new Students[IDList.length];
        
        // String sql2 = ("SELECT * FROM student ;");
        int [] id = new int[IDList.length];
        int [] unitcompleted  = new int[IDList.length];
        int [] visa  = new int[IDList.length];
        int [] currentunit  = new int[IDList.length];
        float [] weight = new float[IDList.length];
        int [] minMax = new int[6];
        for ( int i = 0 ; i < IDList.length ; i ++ ){
            java.sql.Statement st4 = con.createStatement();
            String sql4 = ("SELECT * FROM student where cwid ="+IDList[i]+";");
            ResultSet rs4 = st4.executeQuery(sql4);
            rs4.next();
            id[i] = rs4.getInt("cwid");
            unitcompleted[i] = rs4.getInt("units_completed");
            visa[i] = rs4.getInt("visa");
            currentunit[i] = rs4.getInt("current_units");
            studentArray[i] = new Students(id[i], rs4.getString("fname"), rs4.getString("lname"),
                    unitcompleted[i], visa[i], currentunit[i], weight[i] );
        }
        studentArray = calculateWeight(studentArray, unitcompleted, visa, currentunit);
        
//        Arrays.sort(studentArray, Students.UnitsCompletedComparator);
        Arrays.sort(studentArray, Students.WeightComparator);
        System.out.println("Students list sorted by unitsCompleted:\n" + Arrays.toString(studentArray));
        
        return studentArray ;
    }
    
    /*
        Calculate student's weight and store weight in student object
    */
    public Students[] calculateWeight (Students[] aStudentArray, int[] aList, int[] bList, int[] cList){
        Students[] studentArray = aStudentArray;
        int [] minMaxA = getMaxMin(aList);
        int [] minMaxB = getMaxMin(bList);
        int [] minMaxC = getMaxMin(cList);
        
        for (int i = 0; i < studentArray.length ; i++){
            Students abc = studentArray[i];
            float weightResult = 
                    ( (float)( abc.getUnitsCompleted() - minMaxA[0] ) / minMaxA[2] ) * WLConfig.unitCompletedWeight+
                    ( (float)( abc.getVisa() - minMaxB[0] ) / minMaxB[2] ) * WLConfig.visaWeight +
                    ( (float)( abc.getCurrentUnits() - minMaxC[0] ) / minMaxC[2] * WLConfig.currentUnitsWeight);
            abc.setWeight(weightResult);
        }
        
        return studentArray;
    }
    
    /*
        Tool for get min and Max value in integer array
    */
    public int [] getMaxMin (int[] aList) {
        int [] minMaxList = new int[3];
        int min = 0;
        int max = 0;
        for (int i = 0; i < aList.length; i++) {
            if (min > aList[i]){ min = aList[i]; }
            if (max < aList[i]){ max = aList[i]; }
        }
        minMaxList[0] = min;
        minMaxList[1] = max;
        minMaxList[2] = max - min;
        System.out.println("min: " + minMaxList[0] + ", max: " + minMaxList[1]);
        
        return minMaxList;
    }
    
    public  String [] getCourses() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        //  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/waiting_list", "root", "cpsc462");
        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);
        // Connection con = DriverManager.getConnection("jdbc:mysql://54.186.24.136:3306/localhost/waiting_list", "root", "qq101425");
        //java.sql.Statement st = con.createStatement();
        //String sql2 = "SELECT * FROM Tennis1294966077108.container_tbl WHERE parent_id =+"'par_id'"+ORDER BY creation_time asc";
        java.sql.Statement st2 = con.createStatement();
        String sql2 = ("SELECT * FROM course;");
        ResultSet rs2 = st2.executeQuery(sql2);
        String   cd [] = new String[30];
        for (int i = 0 ; i < 3 ; i++){
            rs2.next(); 
            
            cd[i]  =  rs2.getNString("course_number");
            cd[i+1]  =  rs2.getNString("course_name");
            cd[i+2]  =  rs2.getNString("section");
            System.out.println(cd[i]+" - "+cd[i+1]+"-"+cd[i+2]); 
            i++ ;
            i++;
        }
        con.close();
        return cd;
    }
    
    
    public String [] getSections (String sis) throws SQLException{
        
        String siss = sis;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);

        java.sql.Statement st3 = con.createStatement();
        String sql3 = ("SELECT section FROM course WHERE course_number ="+siss+";");
        ResultSet rs3 = st3.executeQuery(sql3);
        String [] sections  =  new String[3];
        for (int i = 0 ; i <= 1 ; i++){
            rs3.next();
            sections [i] = rs3.getString("section");
            System.out.println(sections[i]);
            // c++;
            // sections[1] = rs3.getNString("section"); 
            // rs2.getr
        }
        con.close();
        return sections;
    }
    
    public String [] Enroll (String [] eList){
      
        return null;
    }
    
    
    
    public void Logout (){
   
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
    
}
