/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author emakm
 */
public class SlotMachine extends javax.swing.JFrame {
      private SetGet obj = new SetGet();
     // private double sumichka = Double.parseDouble(labelPari.getText());

      
    /**
     * Creates new form SlotMachine
     */
    
    
    public void Shuffle(int icon){
        Random rand = new Random();
    icon = rand.nextInt(5)+1;
      
       String slotStr = Integer.toString(icon) ;
       slot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/ikona"+slotStr+".png")));
       
    }
    public SlotMachine() {
        initComponents();
                labelPari.setText(nachalo.suma);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        izbSedem = new javax.swing.JRadioButton();
        btnClover = new javax.swing.JRadioButton();
        izbCash = new javax.swing.JRadioButton();
        btnCherry = new javax.swing.JRadioButton();
        izbDiamond = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        slot1 = new javax.swing.JLabel();
        slot2 = new javax.swing.JLabel();
        slot3 = new javax.swing.JLabel();
        slot4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        labelPari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/all_in_one.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(400, 80));

        buttonGroup1.add(izbSedem);
        izbSedem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbSedemActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnClover);
        btnClover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloverActionPerformed(evt);
            }
        });

        izbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbCashActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCherry);
        btnCherry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCherryActionPerformed(evt);
            }
        });

        buttonGroup1.add(izbDiamond);
        izbDiamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbDiamondActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(izbSedem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnClover)
                .addGap(92, 92, 92)
                .addComponent(btnCherry)
                .addGap(92, 92, 92)
                .addComponent(izbCash)
                .addGap(91, 91, 91)
                .addComponent(izbDiamond)
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClover, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(izbSedem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCherry, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(izbCash, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(izbDiamond, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
        );

        btnStart.setBackground(new java.awt.Color(102, 102, 102));
        btnStart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/handle_up.png"))); // NOI18N
        btnStart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStart.setFocusPainted(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Slot machine");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 100));

        slot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/question_mark.png"))); // NOI18N
        slot1.setPreferredSize(new java.awt.Dimension(100, 100));

        slot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/question_mark.png"))); // NOI18N
        slot2.setPreferredSize(new java.awt.Dimension(100, 100));

        slot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/question_mark.png"))); // NOI18N
        slot3.setPreferredSize(new java.awt.Dimension(100, 100));

        slot4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/question_mark.png"))); // NOI18N
        slot4.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(slot1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slot4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(slot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(slot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(slot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        labelPari.setBackground(new java.awt.Color(102, 102, 102));
        labelPari.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStart)
                                .addGap(0, 55, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPari, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(labelPari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStart)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
    double sumichka = Double.parseDouble(labelPari.getText());
        double zalog=0.0;
        do{
      String zalogString =  JOptionPane.showInputDialog(null, "Заложете сума!");
      zalog =Double.parseDouble(zalogString);
     //labelZalog.setText(zalogString);
      }while(zalog>sumichka);
      
        obj.setBroi(0);
        Random rand = new Random();
         int mas[] = new int[4];
     int icon = rand.nextInt(5)+1;
     mas[0]=icon;
     //if(icon==obj.getIzbor()) obj.setBroi(obj.getBroi()+1);
        System.out.println(obj.getBroi()+", "+icon+", "+obj.getIzbor());
     String slotStr = Integer.toString(icon) ;
     slot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/ikona"+slotStr+".png")));
     
     icon = rand.nextInt(5)+1;
     mas[1]=icon;
     slotStr = Integer.toString(icon) ;
     slot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/ikona"+slotStr+".png")));
     
     icon = rand.nextInt(5)+1;
     mas[2]=icon;
     slotStr = Integer.toString(icon) ;
     slot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/ikona"+slotStr+".png")));
     
     icon = rand.nextInt(5)+1;
     mas[3]=icon;
     slotStr = Integer.toString(icon) ;
     slot4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snimki/ikona"+slotStr+".png")));
     
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]==obj.getIzbor()) obj.setBroi(obj.getBroi()+1);
        }
         System.out.println("broq e:"+obj.getBroi());
         if(obj.getBroi()==0) {
             zalog*=0.75;
             sumichka=sumichka-zalog;
         }
         if(obj.getBroi()==1) {
             zalog*=0.5;
             sumichka=sumichka-zalog;
         }
         if(obj.getBroi()==2) {
             zalog*=1.25;
             sumichka=sumichka+zalog;
         }
         if(obj.getBroi()==3) {
             zalog*=1.5;
             sumichka=sumichka+zalog;
         }
         if(obj.getBroi()==4) {
             zalog*=2;
             sumichka=sumichka+zalog;
         }
         System.out.println("zalog:"+zalog);
         System.out.println("suma:"+sumichka);
         
         
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new nachalo().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void izbSedemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbSedemActionPerformed
     obj.setIzbor(1);
    }//GEN-LAST:event_izbSedemActionPerformed

    private void btnCloverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloverActionPerformed
     obj.setIzbor(2);
    }//GEN-LAST:event_btnCloverActionPerformed

    private void btnCherryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCherryActionPerformed
     obj.setIzbor(3);
    }//GEN-LAST:event_btnCherryActionPerformed

    private void izbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbCashActionPerformed
     obj.setIzbor(4);
    }//GEN-LAST:event_izbCashActionPerformed

    private void izbDiamondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbDiamondActionPerformed
     obj.setIzbor(5);
    }//GEN-LAST:event_izbDiamondActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        nachalo obekt = new nachalo();
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
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnCherry;
    private javax.swing.JRadioButton btnClover;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton izbCash;
    private javax.swing.JRadioButton izbDiamond;
    private javax.swing.JRadioButton izbSedem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPari;
    private javax.swing.JLabel slot1;
    private javax.swing.JLabel slot2;
    private javax.swing.JLabel slot3;
    private javax.swing.JLabel slot4;
    // End of variables declaration//GEN-END:variables
}
