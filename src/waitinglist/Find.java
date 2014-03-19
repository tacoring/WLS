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


import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Find extends javax.swing.JFrame {
    
    /*
        Static variable
    */
    int waitingListCount = 0 ;
    int eligableListCount = 0 ;
    DefaultListModel waitingListModel = new DefaultListModel();
    DefaultListModel eligableListModel = new DefaultListModel();
    
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
        CWIDLabel = new javax.swing.JLabel();
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
        seatsAvailLabel = new javax.swing.JLabel();
        seatsAvailTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(700, 560));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 310, 8, 16);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setActionCommand("Enroll");
        jButton1.setLabel("Enroll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 470, 110, 29);

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setLabel("Periortize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 470, 110, 29);

        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(130, 190, 430, 27);

        jList2.setBackground(new java.awt.Color(222, 223, 255));
        jList2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jList2ComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 330, 300, 130);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 255));
        jLabel2.setText("Waiting List Prioritizing Software");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 120, 320, 24);

        jTextField3.setBackground(new java.awt.Color(222, 223, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(90, 270, 190, 28);

        CWIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        CWIDLabel.setText("CWID");
        getContentPane().add(CWIDLabel);
        CWIDLabel.setBounds(50, 270, 34, 16);

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 270, 75, 29);

        jList3.setBackground(new java.awt.Color(222, 223, 255));
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 330, 300, 132);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(655, 122, 0, 0);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Waiting list");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 310, 71, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eligable students");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 310, 108, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 170, 60, 16);

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(150, 470, 84, 29);

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sign out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(590, 10, 96, 29);

        jOptionPane1.setMessage("Are you sure you want to delete this students ? ");
        getContentPane().add(jOptionPane1);
        jOptionPane1.setBounds(0, 0, 0, 0);

        seatsAvailLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatsAvailLabel.setText("Seats available");
        getContentPane().add(seatsAvailLabel);
        seatsAvailLabel.setBounds(50, 240, 92, 16);

        seatsAvailTextField.setBackground(new java.awt.Color(222, 223, 255));
        seatsAvailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsAvailTextFieldActionPerformed(evt);
            }
        });
        seatsAvailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seatsAvailTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(seatsAvailTextField);
        seatsAvailTextField.setBounds(220, 240, 60, 28);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waitinglist/csuf-logo-header.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 20, 350, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/waitinglist/WLS-main-background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 710, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
        THis is Enroll button
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String [] EIDList = getEIDList();
        Students [] eligableList = getEligableWaitingList();
        EnrollNew(eligableList);
        for (int i = 0 ; i < Integer.parseInt(seatsAvailTextField.getText()) ; i++){
            
        }
//        JDialog errorName;
//        errorName = new JDialog();
//        errorName.setBounds(132, 132, 300, 200);
//        errorName.setTitle("Student already in list");
//        errorName.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
        This one is Add button
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {         
            jList3.setModel(waitingListModel);
            String sid = jTextField3.getText();
            Boolean findSid = false;
            
            //Check if insert sid exist in waiting list
            for (int i = 0; i < waitingListModel.getSize(); i++ ){
                Students aStudent = (Students)waitingListModel.getElementAt(i);
                if (aStudent.getCwid() == Integer.parseInt(sid)){
                    findSid = true;
                    System.out.println("Find something same");
                }
            }
            if (findSid == false){
                Students aStudents = querySidFromDatabase(sid);
                if (aStudents != null){
                    waitingListModel.insertElementAt(aStudents, waitingListCount);
                    waitingListCount++;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "CWID " + sid + " does not exist, "
                            + "please enter the correct value");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "CWID " + sid + " already in list", 
                    "Inane error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
        String counter = Integer.toString(waitingListCount) ;
        jLabel1.setText(counter);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
                 
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    /*
        This is perioritize button
    */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Students [] waitingList = getWaitingList();
        
        Classes abcTest = (Classes)jComboBox1.getSelectedItem();
        System.out.println("Perioritize - combobox : " + abcTest);
        if (jComboBox1.getSelectedItem() != null){
            Students [] perioritizeList = perioritize(waitingList);
            jList2.setModel(eligableListModel);
            eligableListModel.removeAllElements();
            eligableListCount = 0;
            for (int i = 0; i < perioritizeList.length; i ++)
            {
                Students abc = perioritizeList[i];
                jList2.setModel(eligableListModel);
                String [] eligiable = new String[30];
                eligiable[eligableListCount]= abc.getFName() + " , " + abc.getLName() + " - " +abc.getCwid();
                eligableListModel.insertElementAt(eligiable[eligableListCount], eligableListCount);
                eligableListCount++;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Choose one course", 
                    "Inane error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    dispose();
                    new LoginScreen().setVisible(true);
                }
            });      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked
    /*
        This is courses comboBox
    */
    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        try {
            jComboBox1.removeAllItems();
            Classes[] classArray = getCoursesFromDatabase();
            for ( int i = 0 ; i < classArray.length ; i++){
//                jComboBox1.addItem(classArray[i].getClassNumber() + ", " + classArray[i].getCourseName());
                jComboBox1.addItem(classArray[i]);
            }  
        } catch (ClassNotFoundException | SQLException ex) {
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
            waitingListModel.removeElementAt(index);
            waitingListCount--;
            String counter = Integer.toString(waitingListCount) ;
            jLabel1.setText(counter);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jList2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ComponentHidden

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
            System.out.println("Just number !!!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void seatsAvailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsAvailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsAvailTextFieldActionPerformed

    private void seatsAvailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatsAvailTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
            System.out.println("Just number !!!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_seatsAvailTextFieldKeyTyped
    
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
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
        
        
    }

    public boolean Login (String user , String pass){

          return false;
    
    }
    
    public Students querySidFromDatabase(String aSid) throws SQLException, ClassNotFoundException{
        Students aStudent = null;
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword)) {
            java.sql.Statement st = con.createStatement();
            String sql = ("SELECT * FROM student WHERE cwid = "+aSid+";");
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                 aStudent = new Students(
                        rs.getInt("cwid"),
                        rs.getNString("fname"),
                        rs.getNString("lname"),
                        rs.getInt("units_completed"),
                        rs.getInt("visa"),
                        rs.getInt("current_units"),
                        rs.getFloat("weight"));
            }
        }
        return aStudent;
    }
    
    /*
        This method is for get waiting list
    */
    public Students [] getWaitingList() {
        Students [] studentsArray = new Students[waitingListModel.getSize()];
        for ( int i = 0 ; i < waitingListModel.getSize() ; i++){
            studentsArray[i]  =  (Students)waitingListModel.getElementAt(i) ;
        }
        return studentsArray;
    }
    
    /*
        This method is for get eligable waiting list
    */
    public Students [] getEligableWaitingList(){
        Students[] studentsArray = new Students[eligableListModel.getSize()];
        for ( int i = 0 ; i < eligableListModel.getSize() ; i++){
            studentsArray[i] = (Students)eligableListModel.getElementAt(i);
        }
        return studentsArray;
    }
    
    public String [] getEIDList() { 
        String info = null ;
        //String [] sList = new String[Model.getSize()];
        String [] Sids = new String[eligableListModel.getSize()]; 
        for ( int i = 0 ; i < eligableListModel.getSize() ; i++){
            info  =  (String)eligableListModel.getElementAt(i) ;
            int dash  = info.indexOf("-");
            String temp = info.substring(dash+1);
            Sids[i]= temp ;
//            System.out.println("getIDList - " + Model.getElementAt(i));
//            System.out.println("getIDList - " + Sids[i]);
        }
        return Sids;
    }

    public Students [] perioritize (Students [] IDList) {
        
        Students[] studentArray = new Students[IDList.length];
        int [] unitcompleted  = new int[IDList.length];
        int [] visa  = new int[IDList.length];
        int [] currentunit  = new int[IDList.length];
        
        for ( int i = 0 ; i < IDList.length ; i ++ ){
            unitcompleted[i] = IDList[i].getUnitsCompleted();
            visa[i]          = IDList[i].getVisa();
            currentunit[i]   = IDList[i].getCurrentUnits();
        }
        studentArray = calculateWeight(IDList, unitcompleted, visa, currentunit);
        
        Arrays.sort(studentArray, Students.WeightComparator);
        System.out.println("Students list sorted by unitsCompleted:\n" + Arrays.toString(studentArray));
        
        return studentArray;
    }

    /*
        Calculate student's weight and store weight in student object
    */
    public Students[] calculateWeight (Students[] aStudentArray, int[] aList, int[] bList, int[] cList){
        Students[] studentArray = aStudentArray;
        int [] minMaxA = WLToolBox.getMaxMin(aList);
        int [] minMaxB = WLToolBox.getMaxMin(bList);
        int [] minMaxC = WLToolBox.getMaxMin(cList);
        
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
 
    public  Classes[] getCoursesFromDatabase() throws ClassNotFoundException, SQLException{
        
        int queryCount = 0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);
        java.sql.Statement st2 = con.createStatement();
        String sql2 = ("SELECT * FROM Courses;");
        ResultSet rs2 = st2.executeQuery(sql2);
        Classes[] classArray = new Classes[WLToolBox.getDatabaseRowCount(rs2)];
        while (rs2.next()){
            classArray[queryCount] = new Classes(rs2.getString("CourseName"), 
                                        rs2.getInt("Section"),
                                        rs2.getString("SectionDetail"),
                                        rs2.getInt("ClassNumber"),
                                        rs2.getString("DayTime"),
                                        rs2.getString("Room"),
                                        rs2.getString("Instructor"),
                                        rs2.getString("MeetingDate"));
            
            queryCount++;
        }
        con.close();
        return classArray;
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
        }
        con.close();
        return sections;
    }
    
    /*
        Step1. get list from eliable list
        Step2. retrieve information from db
        Step3. get selected course
        Step4. insert number of eliable students into selected course(table)
    */
    public Students [] EnrollNew (Students [] eligableList){
        Classes aClass = (Classes)jComboBox1.getSelectedItem();
        System.out.println("Enroll - selected course : " + aClass.toString());
        
        return null;
    }
    
    public String [] Enroll (String [] eList) throws ClassNotFoundException, SQLException{
        Object scourse = jComboBox1.getSelectedItem();
        String selectedcourse = scourse.toString();
        
        int cci  = selectedcourse.indexOf("-");
        String cc = selectedcourse.substring(cci+1,cci+6);
        int sni  = selectedcourse.indexOf("_");
        String sn = selectedcourse.substring(sni+2);
        String cn = selectedcourse.substring(0,3);
             
        String sclass = cc+cn+sn;
        System.out.println(sclass);
//        System.out.println(selectedcourse);
        
          //  Sids[i]= temp ;
        String [] EIDList = eList ;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://" 
                + WLConfig.serverIP +":" + WLConfig.serverPort + "/" + WLConfig.database, 
                WLConfig.databaseUser, WLConfig.databasePassword);
        java.sql.Statement st2 = con.createStatement();
        for ( int i = 0 ; i < EIDList.length ; i ++ ){
            java.sql.Statement st4 = con.createStatement();
            String sql4 = ("SELECT * FROM student where cwid ="+EIDList[i]+";");
            ResultSet rs4 = st4.executeQuery(sql4);
            rs4.next();
            int cwid = rs4.getInt("cwid");
            String fname = rs4.getString("fname");
            String lname = rs4.getString("lname");
            String visa = rs4.getString("visa");
            String uc = rs4.getString("units_completed");
            String cu = rs4.getString("current_units");
            String gs = rs4.getString("gradute_status");
            // ('cwid', 'fname', 'lname', 'visa', 'units_completed', 'current_units', 'gradute_status', 'course_id', 'weight') 
            java.sql.Statement st8 = con.createStatement();
            String sql8 = ("INSERT INTO "+sclass+" VALUES ("+cwid+", "+fname+", "+lname+", "+visa+", "+uc+", "+cu+", "+gs+", NULL, NULL);");
            st8.executeUpdate(sql8);
           
           con.close();
        }
        return null;
    }
    
    
    
    public void Logout (){
   
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CWIDLabel;
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
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JLabel seatsAvailLabel;
    private javax.swing.JTextField seatsAvailTextField;
    // End of variables declaration//GEN-END:variables
    
}
