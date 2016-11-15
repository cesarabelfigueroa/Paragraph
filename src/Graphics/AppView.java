package Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class AppView extends JFrame {
    
    public AppView() {
        initComponents();
        renderPages();
    }
    
    private void renderPages() {
        setWindowsConfiguration();
        setFonts();
        setFontSizes();
        this.setVisible(true);
    }
    
    public void setWindowsConfiguration() {
        AppView.setDefaultLookAndFeelDecorated(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.repaint();
    }
    
    public void setFonts() {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.fonts_combo.getModel();
        Font[] fonts = e.getAllFonts(); // Get the fonts
        for (Font font : fonts) {
            model.addElement(font.getName());
        }
    }
    
    public void setFontSizes() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.font_size_combo.getModel();
        for (int i = 8; i <= 72; i += 3) {
            model.addElement(i);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editorForm = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_editor = new javax.swing.JTextPane();
        menu_sidebar = new javax.swing.JTabbedPane();
        menu_insert_wrapper = new javax.swing.JPanel();
        port_papel_wrapper = new javax.swing.JPanel();
        button_paste = new javax.swing.JButton();
        button_cut = new javax.swing.JButton();
        button_copy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fonts_combo = new javax.swing.JComboBox<>();
        font_size_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        port_papel_wrapper1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        editor_color_button = new javax.swing.JButton();
        menu_insert_wrapper1 = new javax.swing.JPanel();
        port_papel_wrapper2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        button_editor = new javax.swing.JButton();
        button_files = new javax.swing.JButton();
        button_auth = new javax.swing.JButton();

        text_editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_editorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(text_editor);

        menu_sidebar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        port_papel_wrapper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        button_paste.setForeground(new java.awt.Color(255, 255, 255));
        button_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paste-50.png"))); // NOI18N
        button_paste.setToolTipText("");
        button_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pasteActionPerformed(evt);
            }
        });

        button_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cut-50.png"))); // NOI18N
        button_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cutActionPerformed(evt);
            }
        });

        button_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Copy-50.png"))); // NOI18N
        button_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_copyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setText("Portapapeles");

        javax.swing.GroupLayout port_papel_wrapperLayout = new javax.swing.GroupLayout(port_papel_wrapper);
        port_papel_wrapper.setLayout(port_papel_wrapperLayout);
        port_papel_wrapperLayout.setHorizontalGroup(
            port_papel_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(port_papel_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_cut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(port_papel_wrapperLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        port_papel_wrapperLayout.setVerticalGroup(
            port_papel_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(port_papel_wrapperLayout.createSequentialGroup()
                        .addComponent(button_cut, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N

        fonts_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fonts_comboItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setText("Fuente");

        jToolBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jToolBar1.setRollover(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bold-52.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Italic-48.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Underline-52.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Decrease Font-52.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton15);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Increase Font Filled-50.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton14);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fonts_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(font_size_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fonts_combo)
                    .addComponent(font_size_combo))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2))
        );

        port_papel_wrapper1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setText("Estilos");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Center-48.png"))); // NOI18N

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Justify-50.png"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Right-64.png"))); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Left-48.png"))); // NOI18N

        editor_color_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fill Color-50.png"))); // NOI18N
        editor_color_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editor_color_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout port_papel_wrapper1Layout = new javax.swing.GroupLayout(port_papel_wrapper1);
        port_papel_wrapper1.setLayout(port_papel_wrapper1Layout);
        port_papel_wrapper1Layout.setHorizontalGroup(
            port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, port_papel_wrapper1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, port_papel_wrapper1Layout.createSequentialGroup()
                        .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editor_color_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        port_papel_wrapper1Layout.setVerticalGroup(
            port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editor_color_button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu_insert_wrapperLayout = new javax.swing.GroupLayout(menu_insert_wrapper);
        menu_insert_wrapper.setLayout(menu_insert_wrapperLayout);
        menu_insert_wrapperLayout.setHorizontalGroup(
            menu_insert_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_insert_wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(port_papel_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(port_papel_wrapper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_insert_wrapperLayout.setVerticalGroup(
            menu_insert_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_insert_wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_insert_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_sidebar.addTab("Inicio", menu_insert_wrapper);

        port_papel_wrapper2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Print-50.png"))); // NOI18N
        jButton13.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Acciones");

        javax.swing.GroupLayout port_papel_wrapper2Layout = new javax.swing.GroupLayout(port_papel_wrapper2);
        port_papel_wrapper2.setLayout(port_papel_wrapper2Layout);
        port_papel_wrapper2Layout.setHorizontalGroup(
            port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                .addGroup(port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        port_papel_wrapper2Layout.setVerticalGroup(
            port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout menu_insert_wrapper1Layout = new javax.swing.GroupLayout(menu_insert_wrapper1);
        menu_insert_wrapper1.setLayout(menu_insert_wrapper1Layout);
        menu_insert_wrapper1Layout.setHorizontalGroup(
            menu_insert_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_insert_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(port_papel_wrapper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_insert_wrapper1Layout.setVerticalGroup(
            menu_insert_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_insert_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(port_papel_wrapper2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu_sidebar.addTab("Editar", menu_insert_wrapper1);

        javax.swing.GroupLayout editorFormLayout = new javax.swing.GroupLayout(editorForm.getContentPane());
        editorForm.getContentPane().setLayout(editorFormLayout);
        editorFormLayout.setHorizontalGroup(
            editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_sidebar)
                    .addComponent(jScrollPane1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        editorFormLayout.setVerticalGroup(
            editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_sidebar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

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
                .addContainerGap(759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editorActionPerformed
        editorForm.pack();
        editorForm.setLocationRelativeTo(this);
        editorForm.setVisible(true);

    }//GEN-LAST:event_button_editorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void button_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pasteActionPerformed
        text_editor.paste();
    }//GEN-LAST:event_button_pasteActionPerformed

    private void button_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cutActionPerformed
        text_editor.cut();
    }//GEN-LAST:event_button_cutActionPerformed

    private void button_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_copyActionPerformed
        text_editor.copy();
    }//GEN-LAST:event_button_copyActionPerformed

    private void text_editorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_editorKeyPressed

    }//GEN-LAST:event_text_editorKeyPressed

    private void editor_color_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editor_color_buttonActionPerformed
        JColorChooser choose = new JColorChooser();
        Color current = Color.BLACK;
        Color newColor = JColorChooser.showDialog(null, "Choose a color", current);
        editor_color_button.setBackground(newColor);
    }//GEN-LAST:event_editor_color_buttonActionPerformed

    private void fonts_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fonts_comboItemStateChanged
       this.text_editor.getSelectedText();
    }//GEN-LAST:event_fonts_comboItemStateChanged
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppView();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_auth;
    private javax.swing.JButton button_copy;
    private javax.swing.JButton button_cut;
    private javax.swing.JButton button_editor;
    private javax.swing.JButton button_files;
    private javax.swing.JButton button_paste;
    private javax.swing.JFrame editorForm;
    private javax.swing.JButton editor_color_button;
    private javax.swing.JComboBox<String> font_size_combo;
    private javax.swing.JComboBox<String> fonts_combo;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel menu_insert_wrapper;
    private javax.swing.JPanel menu_insert_wrapper1;
    private javax.swing.JTabbedPane menu_sidebar;
    private javax.swing.JPanel port_papel_wrapper;
    private javax.swing.JPanel port_papel_wrapper1;
    private javax.swing.JPanel port_papel_wrapper2;
    private javax.swing.JTextPane text_editor;
    // End of variables declaration//GEN-END:variables
}
