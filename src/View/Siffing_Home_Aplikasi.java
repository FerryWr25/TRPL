package View;

import java.awt.event.ActionListener;

public class Siffing_Home_Aplikasi extends javax.swing.JFrame {

    public Siffing_Home_Aplikasi() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
     public void tombolLogin(ActionListener action){
        this.loginButton.addActionListener(action);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Register1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Register2.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 200, 80));

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login1.png"))); // NOI18N
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setDefaultCapable(false);
        loginButton.setFocusPainted(false);
        loginButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login2.png"))); // NOI18N
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 190, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Beranda.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siffing_Home_Aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
