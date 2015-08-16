/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomemorama;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author T-101
 */
public class MemoramaInterfaz extends javax.swing.JFrame {
private otra log = new otra();
     private boolean caraUp = false;
     private ImageIcon im1;
     private ImageIcon im2;
     private JButton[] pbtn = new JButton[2];
     private boolean primerc = false;
     private int puntaje = 0;
     /*Creates new form MemoramaInterfaz
     */
    public MemoramaInterfaz() {
        initComponents();
        setCarta();
    }
     private void setCarta() {
        int[] numbers = log.getCardNumbers();
        C1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[0]+".png")));
        C2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[1]+".png")));
        C3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[2]+".png")));
        C4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[3]+".png")));
        C5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[4]+".png")));
        C6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[5]+".png")));
        C7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[6]+".png")));
        C8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[7]+".png")));
        C9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[8]+".png")));
     
     }
         private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar() {
        
        C1.setEnabled(true);
        C2.setEnabled(true);
        C3.setEnabled(true);
        C4.setEnabled(true);
        C5.setEnabled(true);
        C6.setEnabled(true);
        C7.setEnabled(true);
        C8.setEnabled(true);
        C10.setEnabled(true);
        primerc = false;
        caraUp = false;
        puntaje = 0;
        private void pregwin() {
        if(!C1.isEnabled() && !C2.isEnabled() && !C3.isEnabled() && !C4.isEnabled() && !C5.isEnabled() && !C6.isEnabled() 
                && !C7.isEnabled() && !C8.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades Su puntaje es: "+puntaje, "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I1.png"))); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I2.png"))); // NOI18N

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I3.png"))); // NOI18N

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I4.png"))); // NOI18N

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I1.png"))); // NOI18N

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I2.png"))); // NOI18N
        C6.setText("jButton6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I3.png"))); // NOI18N

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomemorama/I4.png"))); // NOI18N

        C10.setText("Reinicia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(C10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C10))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(276, 276, 276))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        
    }//GEN-LAST:event_C1ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoramaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoramaInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
