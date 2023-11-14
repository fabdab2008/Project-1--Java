/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.lines;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hp
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new java.awt.TextField();
        qual = new java.awt.TextField();
        at = new java.awt.TextField();
        contact = new java.awt.TextField();
        location = new java.awt.TextField();
        button1 = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new java.awt.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ADD DOCTOR DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 0));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 260, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 51, 0));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 660, 310, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Search Doctor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 100, 30));

        jButton2.setText("Delete Selected Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, -1, -1));

        jLabel11.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ongoing Appointments");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Search");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 660, -1, -1));

        jButton4.setText("Delete Appointment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 700, -1, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 700, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 171, 213));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qualification", "Available", "Contact", "Location", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 430, 590));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 40, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Qualification");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 20));

        jButton5.setText("MAINPAGE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Available Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Location");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 60, 20));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 300, -1));

        qual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualActionPerformed(evt);
            }
        });
        getContentPane().add(qual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 300, -1));
        getContentPane().add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 300, -1));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 300, -1));
        getContentPane().add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 300, -1));

        button1.setLabel("Update");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Available Doctors");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Create ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 300, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dr Name", "Patient Name", "Visiting Date", "Time", "Location"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, 600));

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 700, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        // TODO add your handling code here:
        String Name = name.getText();
        String Qual = qual.getText();
        String AT = at.getText();
        String Con = contact.getText();
        String Loc = location.getText();
        String ID = id.getText();

        try {
            FileWriter Writer = new FileWriter("DocDatabase.txt", true);
            Writer.write("" + Name + "   " + Qual + "   " + AT + "   " + Con + "   " + Loc + "   " + ID + "");
            Writer.write(System.getProperty("line.separator"));
            Writer.close();

            if (Name.isEmpty() || Qual.isEmpty() || AT.isEmpty() || Con.isEmpty() || Loc.isEmpty() || ID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Dont keep any field empty");
                // AdminDashboard temp = new AdminDashboard();
                // temp.show();
            } else {
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                AdminDashboard tmp = new AdminDashboard();
                tmp.show();
            }

        } catch (IOException e) {
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed
    int flag = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String filepath = "F:\\EYECARE\\DocDatabase.txt";
        File file = new File(filepath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] lines = br.lines().toArray();
            if (flag == 0) {
                for (int i = 0; i < lines.length; i++) {
                    String[] row = lines[i].toString().split("   ");
                    model.addRow(row);
                }
                flag = 1;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRowCount() == 1) {

            String filePath = "F:\\EYECARE\\DocDatabase.txt"; // Replace with the actual file path

            // Define the string to check (e.g., the selected row as a string)
            if (jTable1.getSelectedRowCount() == 1) {

                int selectedRow = jTable1.getSelectedRow();
                int columnCount = jTable1.getColumnCount();

                StringBuilder rowString = new StringBuilder();

                for (int i = 0; i < columnCount; i++) {
                    String value = (String) jTable1.getValueAt(selectedRow, i);
                    rowString.append(value);
                    if (i < columnCount - 1) {
                        rowString.append("   "); // Add a space or any separator between values
                    }
                }

                String stringToCheck = rowString.toString();
                tblModel.removeRow(jTable1.getSelectedRow());
                // Read the original file content and remove the line that matches the string to be deleted
                List<String> updatedLines = new ArrayList<>();

                                    
                try {
                    Scanner scanner = new Scanner(new File("F:\\EYECARE\\DocDatabase.txt"));
                                        System.out.println("hello");
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (!line.equals(stringToCheck)) {
                            updatedLines.add(line);
                        }
                    }
                    scanner.close();

                    FileWriter fw = new FileWriter(filePath);
                    for (String updatedLine : updatedLines) {
                        fw.write(updatedLine + System.lineSeparator()); // Use System.lineSeparator() for platform-independent line separators
                    }
                    fw.close();
                } catch (IOException e) {
                    System.out.println("hello");
                    e.printStackTrace(); // Handle the IOException
                }

            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No Data Available");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Any Row to Delete");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String filepath = "F:\\EYECARE\\DoctorAppointment.txt";
        File file = new File(filepath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            Object[] lines = br.lines().toArray();
            if (flag == 0) {
                for (int i = 0; i < lines.length; i++) {
                    String[] row = lines[i].toString().split("   ");
                    model.addRow(row);
                }
                flag = 1;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable2.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField2.getText()));
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();

        if (jTable2.getSelectedRowCount() == 1) {

            String filePath = "F:\\EYECARE\\DoctorAppointment.txt"; // Replace with the actual file path

            // Define the string to check (e.g., the selected row as a string)
            if (jTable2.getSelectedRowCount() == 1) {

                int selectedRow = jTable2.getSelectedRow();
                int columnCount = jTable2.getColumnCount();

                StringBuilder rowString = new StringBuilder();

                for (int i = 0; i < columnCount; i++) {
                    String value = (String) jTable2.getValueAt(selectedRow, i);
                    rowString.append(value);
                    if (i < columnCount - 1) {
                        rowString.append("   "); // Add a space or any separator between values
                    }
                }

                String stringToCheck = rowString.toString();
                tblModel.removeRow(jTable2.getSelectedRow());
                // Read the original file content and remove the line that matches the string to be deleted
                List<String> updatedLines = new ArrayList<>();
                               
                try {
                     System.out.println(stringToCheck);
                    Scanner scanner = new Scanner(new File(filePath));
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                         System.out.println(line);
                        if (!line.equals(stringToCheck)) {
                            updatedLines.add(line);
                        }
                    }
                    scanner.close();

                    FileWriter fw = new FileWriter(filePath);
                    for (String updatedLine : updatedLines) {
                        fw.write(updatedLine + System.lineSeparator()); // Use System.lineSeparator() for platform-independent line separators
                    }
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace(); // Handle the IOException
                }

            }
        } else {
            if (jTable2.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No Data Available");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Any Row to Delete");
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
     mainpage mpg =new mainpage();
      mpg.show();
      dispose();   
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField at;
    private java.awt.Button button1;
    private java.awt.TextField contact;
    private java.awt.TextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.TextField location;
    private java.awt.TextField name;
    private java.awt.TextField qual;
    // End of variables declaration//GEN-END:variables
}
