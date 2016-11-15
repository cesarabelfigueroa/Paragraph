package Graphics;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jvnet.substance.SubstanceLookAndFeel;

public class AppView extends javax.swing.JFrame {

    public AppView() {
        initComponents();
        renderPages();
    }

    public void renderPages() {
        this.setDefaultLookAndFeelDecorated(false);
        this.setResizable(false);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
        this.setLocationRelativeTo(null);
        ImageIcon logoImage = new ImageIcon("./src/Icons/Paragraph.png");
        Icon logoIcon = new ImageIcon(logoImage.getImage().getScaledInstance(logoSpace.getWidth(), logoSpace.getHeight(), Image.SCALE_DEFAULT));
        logoSpace.setIcon(logoIcon);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_editor = new javax.swing.JButton();
        button_files = new javax.swing.JButton();
        button_auth = new javax.swing.JButton();
        logoSpace = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editor.png"))); // NOI18N
        button_editor.setText("Editor");
        button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editorActionPerformed(evt);
            }
        });

        button_files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/files.png"))); // NOI18N
        button_files.setText("Files");

        button_auth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        button_auth.setText("Login/Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(logoSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 294, Short.MAX_VALUE)
                        .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editorActionPerformed

    }//GEN-LAST:event_button_editorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_auth;
    private javax.swing.JButton button_editor;
    private javax.swing.JButton button_files;
    private javax.swing.JLabel logoSpace;
    // End of variables declaration//GEN-END:variables
}
