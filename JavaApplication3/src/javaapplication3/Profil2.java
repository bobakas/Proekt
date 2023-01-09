package javaapplication3;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emakm
 */
public class Profil2 extends javax.swing.JFrame {
    
      private int pic;
     public int getPic(){
         return pic;
     }
     public void setPic(int pic){
         this.pic=pic;
     }
    /**
     * Creates new form Profil2
     */
    
    public Profil2() {
        initComponents();
        
    }
    
    public JLabel getLabelProfilna() {
        return labelProfilna;
    }

    public void setLabelProfilna(JLabel labelProfilna) {
        this.labelProfilna = labelProfilna;
    }

boolean namesCheck(String names){
     Pattern name = Pattern.compile("[A-ZА-Я]{1}[a-zа-я]{1,20} [A-ZА-Я]{1}[a-zа-я]{1,20}");
     Matcher name1 = name.matcher(names);
     return name1.matches();
}
boolean userCheck(String User){
    Pattern user = Pattern.compile("\\w+{5,15}");
    Matcher user1 = user.matcher(User);
    return user1.matches();
}

boolean emailCheck(String email){
    Pattern Email=Pattern.compile("\\w+@\\w+.\\w+{2,5}");
    Matcher email1=Email.matcher(email);
    return email1.matches();
}

boolean passCheck(String pass){
    Pattern Pass=Pattern.compile("[!-~]{6,30}");
    Matcher pass1=Pass.matcher(pass);
    return pass1.matches();
    
}

public void write_in_file(String username, String email)
{
       try
       {
            File myObj = new File("data.txt");
            myObj.createNewFile();
       }
       catch(IOException e)
       {
            System.out.println("Can't create file!!!");
       }
       
        try
        {   
            FileWriter myWriter = new FileWriter("data.txt", true);
            myWriter.write(username + " " + email + "\n");         
            myWriter.close();
        }
            
        catch (IOException e)
        {
            System.out.println("An error occurred.");
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelNames = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        labelPass2 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();
        labelProfilna = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        errorNames = new javax.swing.JLabel();
        errorUsername = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorPass = new javax.swing.JLabel();
        errorPass2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        btnBack.setBackground(new java.awt.Color(95, 95, 95));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(250, 250, 250));
        btnBack.setText("← Назад");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        btnBack.setFocusPainted(false);
        btnBack.setOpaque(false);
        btnBack.setRolloverEnabled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        labelNames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNames.setForeground(new java.awt.Color(250, 250, 250));
        labelNames.setText("Име и фамилия:");

        labelUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(250, 250, 250));
        labelUsername.setText("Потребителско име:");

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(250, 250, 250));
        labelEmail.setText("Имейл:");

        labelPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPass.setForeground(new java.awt.Color(250, 250, 250));
        labelPass.setText("Парола:");

        labelPass2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPass2.setForeground(new java.awt.Color(250, 250, 250));
        labelPass2.setText("Потвърди парола:");

        txtNames.setBackground(new java.awt.Color(180, 180, 180));
        txtNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNames.setSelectionColor(new java.awt.Color(51, 51, 51));

        txtUsername.setBackground(new java.awt.Color(180, 180, 180));
        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEmail.setBackground(new java.awt.Color(180, 180, 180));
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConfirm.setText("Потвърди!");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(180, 180, 180));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtPass2.setBackground(new java.awt.Color(180, 180, 180));
        txtPass2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername)
                    .addComponent(labelEmail)
                    .addComponent(labelNames)
                    .addComponent(labelPass)
                    .addComponent(labelPass2))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtNames)
                    .addComponent(txtUsername)
                    .addComponent(txtPass)
                    .addComponent(txtPass2))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNames))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPass2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelProfilna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/profile_pic_big.png"))); // NOI18N
        labelProfilna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelProfilna.setDisabledIcon(null);
        labelProfilna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelProfilnaMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        errorNames.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorNames.setForeground(new java.awt.Color(242, 148, 50));

        errorUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorUsername.setForeground(new java.awt.Color(242, 148, 50));

        errorEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorEmail.setForeground(new java.awt.Color(242, 148, 50));

        errorPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorPass.setForeground(new java.awt.Color(242, 148, 50));

        errorPass2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorPass2.setForeground(new java.awt.Color(242, 148, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(errorPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorNames, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorNames, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(errorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(labelProfilna, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProfilna, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(659, 659, 659)
                .addComponent(jLabel5)
                .addContainerGap(141, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
       
        System.out.println(namesCheck(txtNames.getText()));
        System.out.println(userCheck(txtUsername.getText()));
        System.out.println(emailCheck(txtEmail.getText()));
        System.out.println(passCheck(txtPass.getText()));
        
        boolean check = true;
        
        if(namesCheck(txtNames.getText())==false) 
        {
            errorNames.setText("*Невалидно име");
            check = false;
        }
        if(userCheck(txtUsername.getText())==false)
        {
            errorUsername.setText("*Невалидно потребителско име");
            check = false;
        }
        if(emailCheck(txtEmail.getText())==false)
        {
            errorEmail.setText("*Невалиден имейл");
            check = false;
        }
        if(passCheck(txtPass.getText())==false) 
        {
            errorPass.setText("*Невалидна парола");
            check = false;
        }
        if((!txtPass2.getText().equals(txtPass.getText()))) 
        {
            errorPass2.setText("*Паролата не съвпада");
            check = false;
        }
        
        //check && 
       
        if(check==false) {
            try{
            JOptionPane.showMessageDialog(null, "Въведете валидни данни!", "Грешка", JOptionPane.WARNING_MESSAGE);
            errorNames.setText(" ");
            errorUsername.setText(" ");
            errorEmail.setText(" ");
            errorPass.setText(" ");
            errorPass2.setText(" ");
            
        } catch(ArrayIndexOutOfBoundsException e){
        txtNames.setText(" ");
        }
        }
        if(check_from_file(txtUsername.getText(), txtEmail.getText()))
            write_in_file(txtUsername.getText(), txtEmail.getText());
        else  
        {
        JOptionPane.showMessageDialog(null, "Потребителското име или имейлът вече съществуват!", "Грешка", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    public boolean check_from_file(String username, String email)
    {
      try {
      File myObj = new File("data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) 
      {
        String data = myReader.nextLine();        

        String[] splited = data.split(" ");
        if(splited[0].equals(username) || splited[1].equals(email))
        {
            //System.out.println("ako");
            return false;
        }
        
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      return true;
    }
    
    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void labelProfilnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProfilnaMouseClicked
       this.dispose();
        new Avatars().setVisible(true);
     // new chsPhoto.setVisible(true);
    }//GEN-LAST:event_labelProfilnaMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new nachalo().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Profil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Profil2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorNames;
    private javax.swing.JLabel errorPass;
    private javax.swing.JLabel errorPass2;
    private javax.swing.JLabel errorUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNames;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPass2;
    private javax.swing.JLabel labelProfilna;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNames;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
