package Graphics;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
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
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import javax.swing.Action;
import javax.swing.UIManager;
import javax.swing.undo.UndoManager;
import Core.RedoAction;
import Core.UndoAction;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class AppView extends JFrame {
    
    public AppView() {
        initComponents();
        renderPages();
    }
    
    private void renderPages() {
        setWindowsConfiguration();
        setFonts();
        setFontSizes();
        configureListeners();
        this.setVisible(true);
    }
    
    public void setWindowsConfiguration() {
        AppView.setDefaultLookAndFeelDecorated(false);
        this.setLocationRelativeTo(null);
        this.pack();
        this.repaint();
    }
    
    private void configureListeners() {
        UndoManager manager = new UndoManager();
        text_editor.getDocument().addUndoableEditListener(manager);
        Action undoAction = new UndoAction(manager);
        undo_button_editor.addActionListener(undoAction);
        Action redoAction = new RedoAction(manager);
        redo_button_editor.addActionListener(redoAction);
    }
    
    public void setFonts() {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        DefaultComboBoxModel model = (DefaultComboBoxModel) this.fonts_combo.getModel();
        Font[] fonts = e.getAllFonts();
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
        bold_button_editor = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        underline_button_editor = new javax.swing.JButton();
        size_minus_button = new javax.swing.JButton();
        size_pluss_button = new javax.swing.JButton();
        undo_button_editor = new javax.swing.JButton();
        redo_button_editor = new javax.swing.JButton();
        port_papel_wrapper1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        center_button_align = new javax.swing.JButton();
        justify_button_align = new javax.swing.JButton();
        right_button_align = new javax.swing.JButton();
        left_button_align = new javax.swing.JButton();
        color_editor_button = new javax.swing.JButton();
        menu_insert_wrapper1 = new javax.swing.JPanel();
        port_papel_wrapper2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        export_word_button = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        historial_editor_button = new javax.swing.JButton();
        port_papel_wrapper3 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        editor_log_win = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        save_file_win = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button_editor = new javax.swing.JButton();
        button_files = new javax.swing.JButton();
        button_auth = new javax.swing.JButton();
        button_auth1 = new javax.swing.JButton();

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
        fonts_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonts_comboActionPerformed(evt);
            }
        });

        font_size_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                font_size_comboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setText("Fuente");

        jToolBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jToolBar1.setRollover(true);

        bold_button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bold-52.png"))); // NOI18N
        bold_button_editor.setFocusable(false);
        bold_button_editor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bold_button_editor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bold_button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bold_button_editorActionPerformed(evt);
            }
        });
        jToolBar1.add(bold_button_editor);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Italic-48.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        underline_button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Underline-52.png"))); // NOI18N
        underline_button_editor.setFocusable(false);
        underline_button_editor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        underline_button_editor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        underline_button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underline_button_editorActionPerformed(evt);
            }
        });
        jToolBar1.add(underline_button_editor);

        size_minus_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Decrease Font-52.png"))); // NOI18N
        size_minus_button.setFocusable(false);
        size_minus_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        size_minus_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        size_minus_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_minus_buttonActionPerformed(evt);
            }
        });
        jToolBar1.add(size_minus_button);

        size_pluss_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Increase Font Filled-50.png"))); // NOI18N
        size_pluss_button.setFocusable(false);
        size_pluss_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        size_pluss_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        size_pluss_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_pluss_buttonActionPerformed(evt);
            }
        });
        jToolBar1.add(size_pluss_button);

        undo_button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Undo-52.png"))); // NOI18N
        undo_button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undo_button_editorActionPerformed(evt);
            }
        });

        redo_button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Redo-52.png"))); // NOI18N
        redo_button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redo_button_editorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(undo_button_editor)
                        .addGap(37, 37, 37)
                        .addComponent(redo_button_editor)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(203, 203, 203))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fonts_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(font_size_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(font_size_combo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(fonts_combo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(undo_button_editor, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(redo_button_editor, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2))
        );

        port_papel_wrapper1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setText("Estilos");

        center_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Center-48.png"))); // NOI18N
        center_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                center_button_alignActionPerformed(evt);
            }
        });

        justify_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Justify-50.png"))); // NOI18N
        justify_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justify_button_alignActionPerformed(evt);
            }
        });

        right_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Right-64.png"))); // NOI18N
        right_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_button_alignActionPerformed(evt);
            }
        });

        left_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Left-48.png"))); // NOI18N
        left_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_button_alignActionPerformed(evt);
            }
        });

        color_editor_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fill Color-50.png"))); // NOI18N
        color_editor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_editor_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout port_papel_wrapper1Layout = new javax.swing.GroupLayout(port_papel_wrapper1);
        port_papel_wrapper1.setLayout(port_papel_wrapper1Layout);
        port_papel_wrapper1Layout.setHorizontalGroup(
            port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(left_button_align))
                    .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(color_editor_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                        .addComponent(justify_button_align)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(right_button_align, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(center_button_align))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        port_papel_wrapper1Layout.setVerticalGroup(
            port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right_button_align, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(left_button_align, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(justify_button_align, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(port_papel_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, port_papel_wrapper1Layout.createSequentialGroup()
                        .addComponent(center_button_align)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, port_papel_wrapper1Layout.createSequentialGroup()
                        .addComponent(color_editor_button)
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(port_papel_wrapper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        menu_insert_wrapperLayout.setVerticalGroup(
            menu_insert_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_insert_wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_insert_wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_sidebar.addTab("Inicio", menu_insert_wrapper);

        port_papel_wrapper2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Utilidades");

        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/XML-50.png"))); // NOI18N
        jButton23.setToolTipText("");

        export_word_button.setForeground(new java.awt.Color(255, 255, 255));
        export_word_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MS Word Filled-50.png"))); // NOI18N
        export_word_button.setToolTipText("");
        export_word_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_word_buttonActionPerformed(evt);
            }
        });

        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh-52.png"))); // NOI18N
        jButton25.setToolTipText("");

        historial_editor_button.setForeground(new java.awt.Color(255, 255, 255));
        historial_editor_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clock Filled-50.png"))); // NOI18N
        historial_editor_button.setToolTipText("");
        historial_editor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historial_editor_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout port_papel_wrapper2Layout = new javax.swing.GroupLayout(port_papel_wrapper2);
        port_papel_wrapper2.setLayout(port_papel_wrapper2Layout);
        port_papel_wrapper2Layout.setHorizontalGroup(
            port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                .addGroup(port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel4))
                    .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(export_word_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historial_editor_button)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        port_papel_wrapper2Layout.setVerticalGroup(
            port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(export_word_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historial_editor_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        port_papel_wrapper3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Print-50.png"))); // NOI18N
        jButton19.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setText("Acciones");

        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save Filled-50.png"))); // NOI18N
        jButton20.setToolTipText("");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Open Folder-50.png"))); // NOI18N
        jButton21.setToolTipText("");

        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Send File-50.png"))); // NOI18N
        jButton22.setToolTipText("");

        javax.swing.GroupLayout port_papel_wrapper3Layout = new javax.swing.GroupLayout(port_papel_wrapper3);
        port_papel_wrapper3.setLayout(port_papel_wrapper3Layout);
        port_papel_wrapper3Layout.setHorizontalGroup(
            port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22))
                    .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                        .addComponent(jButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        port_papel_wrapper3Layout.setVerticalGroup(
            port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout menu_insert_wrapper1Layout = new javax.swing.GroupLayout(menu_insert_wrapper1);
        menu_insert_wrapper1.setLayout(menu_insert_wrapper1Layout);
        menu_insert_wrapper1Layout.setHorizontalGroup(
            menu_insert_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_insert_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(port_papel_wrapper3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(port_papel_wrapper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        menu_insert_wrapper1Layout.setVerticalGroup(
            menu_insert_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_insert_wrapper1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_insert_wrapper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(port_papel_wrapper3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_sidebar.addTab("Acciones", menu_insert_wrapper1);

        javax.swing.GroupLayout editorFormLayout = new javax.swing.GroupLayout(editorForm.getContentPane());
        editorForm.getContentPane().setLayout(editorFormLayout);
        editorFormLayout.setHorizontalGroup(
            editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(menu_sidebar))
                .addContainerGap())
        );
        editorFormLayout.setVerticalGroup(
            editorFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel7.setText("Historial de Acciones");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Acción", "Usuario", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Aceptar");

        javax.swing.GroupLayout editor_log_winLayout = new javax.swing.GroupLayout(editor_log_win.getContentPane());
        editor_log_win.getContentPane().setLayout(editor_log_winLayout);
        editor_log_winLayout.setHorizontalGroup(
            editor_log_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editor_log_winLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editor_log_winLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(editor_log_winLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editor_log_winLayout.setVerticalGroup(
            editor_log_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editor_log_winLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jButton2.setText("Aceptar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Salvar Archivos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Directorio");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha");

        javax.swing.GroupLayout save_file_winLayout = new javax.swing.GroupLayout(save_file_win.getContentPane());
        save_file_win.getContentPane().setLayout(save_file_winLayout);
        save_file_winLayout.setHorizontalGroup(
            save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_winLayout.createSequentialGroup()
                .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel6))
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(save_file_winLayout.createSequentialGroup()
                                .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(165, 165, 165)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        save_file_winLayout.setVerticalGroup(
            save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_winLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, save_file_winLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
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

        button_auth1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Send File-50.png"))); // NOI18N
        button_auth1.setText("Send");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_auth1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(950, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_auth1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editorActionPerformed
        editorForm.pack();
        editorForm.setLocationRelativeTo(this);
        editorForm.setVisible(true);
    }//GEN-LAST:event_button_editorActionPerformed

    private void bold_button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bold_button_editorActionPerformed
        configurateStyle("bold");
    }//GEN-LAST:event_bold_button_editorActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        configurateStyle("italic");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void underline_button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underline_button_editorActionPerformed
        configurateStyle("underline");
    }//GEN-LAST:event_underline_button_editorActionPerformed

    private void size_pluss_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_pluss_buttonActionPerformed
        configurateStyle("size+");
    }//GEN-LAST:event_size_pluss_buttonActionPerformed

    private void size_minus_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_minus_buttonActionPerformed
        configurateStyle("size-");
    }//GEN-LAST:event_size_minus_buttonActionPerformed

    private void button_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pasteActionPerformed
        text_editor.paste();
    }//GEN-LAST:event_button_pasteActionPerformed

    private void button_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cutActionPerformed
        text_editor.cut();
    }//GEN-LAST:event_button_cutActionPerformed

    private void button_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_copyActionPerformed
        text_editor.copy();
        this.pack();
    }//GEN-LAST:event_button_copyActionPerformed

    private void text_editorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_editorKeyPressed

    }//GEN-LAST:event_text_editorKeyPressed

    private void fonts_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fonts_comboItemStateChanged
        this.text_editor.getSelectedText();
    }//GEN-LAST:event_fonts_comboItemStateChanged

    private void left_button_alignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_button_alignActionPerformed
        setAlign("left");
    }//GEN-LAST:event_left_button_alignActionPerformed

    private void undo_button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undo_button_editorActionPerformed

    }//GEN-LAST:event_undo_button_editorActionPerformed

    private void redo_button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redo_button_editorActionPerformed

    }//GEN-LAST:event_redo_button_editorActionPerformed

    private void fonts_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonts_comboActionPerformed
        configurateStyle("fontFamily");
    }//GEN-LAST:event_fonts_comboActionPerformed

    private void historial_editor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historial_editor_buttonActionPerformed
        editor_log_win.pack();
        editor_log_win.setLocationRelativeTo(this);
        editor_log_win.setVisible(true);
    }//GEN-LAST:event_historial_editor_buttonActionPerformed

    private void font_size_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_font_size_comboActionPerformed
        configurateStyle("size");
    }//GEN-LAST:event_font_size_comboActionPerformed

    private void justify_button_alignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justify_button_alignActionPerformed
        setAlign("justify");
    }//GEN-LAST:event_justify_button_alignActionPerformed

    private void right_button_alignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_button_alignActionPerformed
        setAlign("right");
    }//GEN-LAST:event_right_button_alignActionPerformed

    private void center_button_alignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_center_button_alignActionPerformed
        setAlign("center");
    }//GEN-LAST:event_center_button_alignActionPerformed

    private void color_editor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_editor_buttonActionPerformed
        configurateStyle("color");
    }//GEN-LAST:event_color_editor_buttonActionPerformed

    private void export_word_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_word_buttonActionPerformed
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out;
        try {
            out = new FileOutputStream(
                    new File("createparagraph.docx"));
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(text_editor.getText());
            document.write(out);
            out.close();
            System.out.println("createparagraph.docx written successfully");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_export_word_buttonActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        save_file_win.pack();
        save_file_win.setLocationRelativeTo(editorForm);
        save_file_win.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed
    
    private void configurateStyle(String action) {
        doc = this.text_editor.getStyledDocument();
        if (action.equals("color")) {
            colour = JColorChooser.showDialog(this, "Color", Color.blue);
        }
        int j = 0, posicion = 0;
        for (int i = this.text_editor.getSelectionStart(); i < this.text_editor.getSelectionEnd(); i++) {
            posicion = this.text_editor.getSelectionStart() + j;
            Element element = doc.getCharacterElement(posicion);
            AttributeSet as = element.getAttributes();
            if (!action.equals("color")) {
                colour = StyleConstants.getForeground(as);
            }
            bold = StyleConstants.isBold(as);
            italics = StyleConstants.isItalic(as);
            underline = StyleConstants.isUnderline(as);
            size = StyleConstants.getFontSize(as);
            fontLetter = StyleConstants.getFontFamily(as);
            if (action.equals("fontFamily")) {
                this.fontLetter = (String) this.fonts_combo.getSelectedItem();
            } else if (action.equals("bold")) {
                bold = !bold;
            } else if (action.equals("italic")) {
                italics = !italics;
            } else if (action.equals("underline")) {
                underline = !underline;
            } else if (action.equals("size")) {
                size = (int) this.font_size_combo.getSelectedItem();
            } else if (action.equals("size+")) {
                size++;
            } else if (action.equals("size-")) {
                if (size > 6) {
                    size--;
                }
            }
            Edit(posicion);
            j++;
        }
    }
    
    private void Edit(int posicion) {
        doc = this.text_editor.getStyledDocument();
        Style estilo = this.text_editor.addStyle("style", null);
        StyleConstants.setForeground(estilo, colour);
        StyleConstants.setFontFamily(estilo, fontLetter);
        StyleConstants.setFontSize(estilo, size);
        StyleConstants.setBold(estilo, bold);
        StyleConstants.setItalic(estilo, italics);
        StyleConstants.setUnderline(estilo, underline);
        doc.setCharacterAttributes(posicion, 1, this.text_editor.getStyle("style"), true);
        documento = this.text_editor.getStyledDocument();
    }
    
    public void setAlign(String action) {
        doc = this.text_editor.getStyledDocument();
        Style estilo = this.text_editor.addStyle("style", null);
        switch (action) {
            case "center":
                StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_CENTER);
                break;
            case "justify":
                StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_JUSTIFIED);
                break;
            case "left":
                StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_LEFT);
                break;
            case "right":
                StyleConstants.setAlignment(estilo, StyleConstants.ALIGN_RIGHT);
                break;
            default:
                break;
        }
        doc.setParagraphAttributes(this.text_editor.getSelectionStart(), this.text_editor.getSelectionEnd() - this.text_editor.getSelectionStart(), this.text_editor.getStyle("style"), true);
    }
    
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppView();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bold_button_editor;
    private javax.swing.JButton button_auth;
    private javax.swing.JButton button_auth1;
    private javax.swing.JButton button_copy;
    private javax.swing.JButton button_cut;
    private javax.swing.JButton button_editor;
    private javax.swing.JButton button_files;
    private javax.swing.JButton button_paste;
    private javax.swing.JButton center_button_align;
    private javax.swing.JButton color_editor_button;
    private javax.swing.JFrame editorForm;
    private javax.swing.JDialog editor_log_win;
    private javax.swing.JButton export_word_button;
    private javax.swing.JComboBox<String> font_size_combo;
    private javax.swing.JComboBox<String> fonts_combo;
    private javax.swing.JButton historial_editor_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton justify_button_align;
    private javax.swing.JButton left_button_align;
    private javax.swing.JPanel menu_insert_wrapper;
    private javax.swing.JPanel menu_insert_wrapper1;
    private javax.swing.JTabbedPane menu_sidebar;
    private javax.swing.JPanel port_papel_wrapper;
    private javax.swing.JPanel port_papel_wrapper1;
    private javax.swing.JPanel port_papel_wrapper2;
    private javax.swing.JPanel port_papel_wrapper3;
    private javax.swing.JButton redo_button_editor;
    private javax.swing.JButton right_button_align;
    private javax.swing.JDialog save_file_win;
    private javax.swing.JButton size_minus_button;
    private javax.swing.JButton size_pluss_button;
    private javax.swing.JTextPane text_editor;
    private javax.swing.JButton underline_button_editor;
    private javax.swing.JButton undo_button_editor;
    // End of variables declaration//GEN-END:variables
    StyledDocument doc;
    Document documento;
    private String fontLetter = "";
    private boolean bold = false;
    private boolean italics = false;
    private boolean underline = false;
    private int size = 12;
    private Color colour = Color.black;
    private Color background = Color.white;
    private JFileChooser fileSelect = new JFileChooser();
    public File currentFile;
    private boolean center;
    private boolean left;
    private boolean right;
    private boolean justified;
}
