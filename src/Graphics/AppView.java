package Graphics;

import Core.FTPClientExample;
import Core.FileSystem;
import Core.Model;
import Core.Paragraph;
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
import Core.ThreadRelay;
import Core.UndoAction;
import Core.ExportExcel;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class AppView extends JFrame {

    public Model modelAction = new Model();
    XStream xStream = getXstreamObject();
    private RTFEditorKit kitrtf;
    public int idUser = -1;
    public int idOpenFile = -1;
    String usernameAll = "";

    public AppView() {
        initComponents();
        renderPages();
    }

    private void renderPages() {
        setWindowsConfiguration();
        setFonts();
        setFontSizes();
        this.button_editor.setEnabled(false);
        this.button_files.setEnabled(false);
        button_editor_files.setEnabled(false);
        configureListeners();
        configureRichEditor();
        this.setVisible(true);

    }

    public void setWindowsConfiguration() {
        AppView.setDefaultLookAndFeelDecorated(false);
        this.setLocationRelativeTo(null);
        this.pack();
        this.repaint();
        // this.setExtendedState(MAXIMIZED_BOTH);
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

    public void configureRichEditor() {
        text_editor.setContentType("text/rtf");
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
        jLabel5 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        open_file_show = new javax.swing.JButton();
        editor_log_win = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historial_table = new javax.swing.JTable();
        action_historil = new javax.swing.JButton();
        save_file_win = new javax.swing.JDialog();
        file_save_name = new javax.swing.JTextField();
        file_save_directory = new javax.swing.JTextField();
        file_save_action = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        log_window = new javax.swing.JDialog();
        ttf_username = new javax.swing.JTextField();
        loggin_button_action = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ttf_password = new javax.swing.JPasswordField();
        save_file_export = new javax.swing.JDialog();
        rtf_export_name = new javax.swing.JTextField();
        export_button_to_rtf = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        open_file_selector = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        files_selection_list = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        permission_window = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        my_files_permission = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        user_permission_selector = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        read_permission_value = new javax.swing.JCheckBox();
        write_permission_value = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        send_file_window = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        files_selection_list1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        save_file_export_xml = new javax.swing.JDialog();
        xml_export_name = new javax.swing.JTextField();
        export_button_to_rtf1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        all_files_content = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        my_files_tree = new javax.swing.JTree();
        jScrollPane5 = new javax.swing.JScrollPane();
        my_sharing_files = new javax.swing.JTree();
        jScrollPane6 = new javax.swing.JScrollPane();
        report_table = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        export_excel_button = new javax.swing.JButton();
        menu_table = new javax.swing.JPopupMenu();
        order_by_size = new javax.swing.JMenuItem();
        order_by_directory = new javax.swing.JMenuItem();
        send_ftp_item = new javax.swing.JMenuItem();
        button_editor = new javax.swing.JButton();
        button_files = new javax.swing.JButton();
        button_auth = new javax.swing.JButton();
        button_editor_files = new javax.swing.JButton();

        editorForm.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                editorFormComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                editorFormComponentShown(evt);
            }
        });

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
        button_paste.setToolTipText("Pegar");
        button_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pasteActionPerformed(evt);
            }
        });

        button_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cut-50.png"))); // NOI18N
        button_cut.setToolTipText("Cortar");
        button_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cutActionPerformed(evt);
            }
        });

        button_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Copy-50.png"))); // NOI18N
        button_copy.setToolTipText("Copiar");
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

        fonts_combo.setToolTipText("Tipo de Letra");
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
        bold_button_editor.setToolTipText("Negrita");
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
        jButton7.setToolTipText("Cursiva");
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
        underline_button_editor.setToolTipText("Subrayado");
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
        size_minus_button.setToolTipText("Reducir");
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
        size_pluss_button.setToolTipText("Agrandarr");
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
        undo_button_editor.setToolTipText("Atrás");
        undo_button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undo_button_editorActionPerformed(evt);
            }
        });

        redo_button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Redo-52.png"))); // NOI18N
        redo_button_editor.setToolTipText("Adelante");
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
        center_button_align.setToolTipText("Centrar");
        center_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                center_button_alignActionPerformed(evt);
            }
        });

        justify_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Justify-50.png"))); // NOI18N
        justify_button_align.setToolTipText("Justificar");
        justify_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justify_button_alignActionPerformed(evt);
            }
        });

        right_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Right-64.png"))); // NOI18N
        right_button_align.setToolTipText("Derecha");
        right_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_button_alignActionPerformed(evt);
            }
        });

        left_button_align.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Align Left-48.png"))); // NOI18N
        left_button_align.setToolTipText("Izquierda");
        left_button_align.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_button_alignActionPerformed(evt);
            }
        });

        color_editor_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fill Color-50.png"))); // NOI18N
        color_editor_button.setToolTipText("Colorear");
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
                    .addComponent(port_papel_wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(port_papel_wrapper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_sidebar.addTab("Inicio", menu_insert_wrapper);

        port_papel_wrapper2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setText("Utilidades");

        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/XML-50.png"))); // NOI18N
        jButton23.setToolTipText("Exportar a XML");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        export_word_button.setForeground(new java.awt.Color(255, 255, 255));
        export_word_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MS Word Filled-50.png"))); // NOI18N
        export_word_button.setToolTipText("Exportar a RTF");
        export_word_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_word_buttonActionPerformed(evt);
            }
        });

        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh-52.png"))); // NOI18N
        jButton25.setToolTipText("Actualizar");

        historial_editor_button.setForeground(new java.awt.Color(255, 255, 255));
        historial_editor_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clock Filled-50.png"))); // NOI18N
        historial_editor_button.setToolTipText("Historial de Acciones");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        port_papel_wrapper3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setText("Acciones");

        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save Filled-50.png"))); // NOI18N
        jButton20.setToolTipText("Crear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        open_file_show.setForeground(new java.awt.Color(255, 255, 255));
        open_file_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Open Folder-50.png"))); // NOI18N
        open_file_show.setToolTipText("Abrir");
        open_file_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_file_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout port_papel_wrapper3Layout = new javax.swing.GroupLayout(port_papel_wrapper3);
        port_papel_wrapper3.setLayout(port_papel_wrapper3Layout);
        port_papel_wrapper3Layout.setHorizontalGroup(
            port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                .addGroup(port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(open_file_show))
                    .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel5)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        port_papel_wrapper3Layout.setVerticalGroup(
            port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(port_papel_wrapper3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(port_papel_wrapper3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(open_file_show, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
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

        historial_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Acción", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historial_table);

        action_historil.setText("Aceptar");
        action_historil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_historilActionPerformed(evt);
            }
        });

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
                .addComponent(action_historil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(action_historil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        file_save_action.setText("Aceptar");
        file_save_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_save_actionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Salvar Archivos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Directorio");

        javax.swing.GroupLayout save_file_winLayout = new javax.swing.GroupLayout(save_file_win.getContentPane());
        save_file_win.getContentPane().setLayout(save_file_winLayout);
        save_file_winLayout.setHorizontalGroup(
            save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_winLayout.createSequentialGroup()
                .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(file_save_name)
                                .addComponent(file_save_directory, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel6))
                    .addGroup(save_file_winLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(file_save_action, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        save_file_winLayout.setVerticalGroup(
            save_file_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_winLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(file_save_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file_save_directory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(file_save_action, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        log_window.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                log_windowKeyPressed(evt);
            }
        });

        loggin_button_action.setText("Aceptar");
        loggin_button_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggin_button_actionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Sesión");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nombre de Usuario");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Contraseña");

        ttf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttf_passwordActionPerformed(evt);
            }
        });
        ttf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttf_passwordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout log_windowLayout = new javax.swing.GroupLayout(log_window.getContentPane());
        log_window.getContentPane().setLayout(log_windowLayout);
        log_windowLayout.setHorizontalGroup(
            log_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(log_windowLayout.createSequentialGroup()
                .addGroup(log_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(log_windowLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(log_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ttf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(ttf_password)))
                    .addGroup(log_windowLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(loggin_button_action, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(log_windowLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel11)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        log_windowLayout.setVerticalGroup(
            log_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(log_windowLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ttf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ttf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(loggin_button_action, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        export_button_to_rtf.setText("Aceptar");
        export_button_to_rtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_button_to_rtfActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Exportar Archivos");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nombre");

        javax.swing.GroupLayout save_file_exportLayout = new javax.swing.GroupLayout(save_file_export.getContentPane());
        save_file_export.getContentPane().setLayout(save_file_exportLayout);
        save_file_exportLayout.setHorizontalGroup(
            save_file_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, save_file_exportLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(rtf_export_name, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(save_file_exportLayout.createSequentialGroup()
                .addGroup(save_file_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(save_file_exportLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel14))
                    .addGroup(save_file_exportLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(export_button_to_rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        save_file_exportLayout.setVerticalGroup(
            save_file_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_exportLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(save_file_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtf_export_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(70, 70, 70)
                .addComponent(export_button_to_rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Seleccionar Archivo");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Lista");

        jButton2.setText("Abrir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout open_file_selectorLayout = new javax.swing.GroupLayout(open_file_selector.getContentPane());
        open_file_selector.getContentPane().setLayout(open_file_selectorLayout);
        open_file_selectorLayout.setHorizontalGroup(
            open_file_selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(open_file_selectorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(files_selection_list, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(open_file_selectorLayout.createSequentialGroup()
                .addGroup(open_file_selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(open_file_selectorLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel16))
                    .addGroup(open_file_selectorLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        open_file_selectorLayout.setVerticalGroup(
            open_file_selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(open_file_selectorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addGap(40, 40, 40)
                .addGroup(open_file_selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(files_selection_list, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Asignar Permisos");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Archivo");

        my_files_permission.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Directorio", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        my_files_permission.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        my_files_permission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                my_files_permissionMouseClicked(evt);
            }
        });
        my_files_permission.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                my_files_permissionPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(my_files_permission);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Usuario");

        user_permission_selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_permission_selectorActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Permiso");

        read_permission_value.setText("Leer");

        write_permission_value.setText("Escribir");

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout permission_windowLayout = new javax.swing.GroupLayout(permission_window.getContentPane());
        permission_window.getContentPane().setLayout(permission_windowLayout);
        permission_windowLayout.setHorizontalGroup(
            permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permission_windowLayout.createSequentialGroup()
                .addGroup(permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(permission_windowLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(user_permission_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(permission_windowLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(read_permission_value)
                        .addGap(31, 31, 31)
                        .addComponent(write_permission_value)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, permission_windowLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, permission_windowLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(408, 408, 408))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, permission_windowLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))))
        );
        permission_windowLayout.setVerticalGroup(
            permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permission_windowLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addGap(50, 50, 50)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(user_permission_selector, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(permission_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(read_permission_value)
                    .addComponent(write_permission_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Enviar Archivo");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Lista");

        jButton4.setText("Enviar");

        javax.swing.GroupLayout send_file_windowLayout = new javax.swing.GroupLayout(send_file_window.getContentPane());
        send_file_window.getContentPane().setLayout(send_file_windowLayout);
        send_file_windowLayout.setHorizontalGroup(
            send_file_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_file_windowLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(send_file_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, send_file_windowLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(files_selection_list1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        send_file_windowLayout.setVerticalGroup(
            send_file_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_file_windowLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(send_file_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(files_selection_list1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        export_button_to_rtf1.setText("Aceptar");
        export_button_to_rtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_button_to_rtf1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Exportar Archivos");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Nombre");

        javax.swing.GroupLayout save_file_export_xmlLayout = new javax.swing.GroupLayout(save_file_export_xml.getContentPane());
        save_file_export_xml.getContentPane().setLayout(save_file_export_xmlLayout);
        save_file_export_xmlLayout.setHorizontalGroup(
            save_file_export_xmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_export_xmlLayout.createSequentialGroup()
                .addGroup(save_file_export_xmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(save_file_export_xmlLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel25)
                        .addGap(65, 65, 65)
                        .addComponent(xml_export_name, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(save_file_export_xmlLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(export_button_to_rtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(save_file_export_xmlLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel24)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        save_file_export_xmlLayout.setVerticalGroup(
            save_file_export_xmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_file_export_xmlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(save_file_export_xmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(xml_export_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(export_button_to_rtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mis Archivos");
        my_files_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        my_files_tree.setToolTipText("Archivos Propios");
        jScrollPane4.setViewportView(my_files_tree);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Archivos Compartidos");
        my_sharing_files.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        my_sharing_files.setToolTipText("Archivos Propios");
        jScrollPane5.setViewportView(my_sharing_files);

        report_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Directorio", "Tamaño", "Contenido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        report_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_tableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(report_table);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Archivos");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Reporte");

        export_excel_button.setText("Exportar Reporte");
        export_excel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_excel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout all_files_contentLayout = new javax.swing.GroupLayout(all_files_content.getContentPane());
        all_files_content.getContentPane().setLayout(all_files_contentLayout);
        all_files_contentLayout.setHorizontalGroup(
            all_files_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_files_contentLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(all_files_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addGroup(all_files_contentLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(export_excel_button))
                    .addComponent(jLabel26)
                    .addGroup(all_files_contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        all_files_contentLayout.setVerticalGroup(
            all_files_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_files_contentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel26)
                .addGap(37, 37, 37)
                .addGroup(all_files_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(all_files_contentLayout.createSequentialGroup()
                        .addGroup(all_files_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel27))
                    .addComponent(export_excel_button))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        order_by_size.setText("Ordenar por tamaño");
        order_by_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_by_sizeActionPerformed(evt);
            }
        });
        menu_table.add(order_by_size);

        order_by_directory.setText("Ordenar por directorio");
        order_by_directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_by_directoryActionPerformed(evt);
            }
        });
        menu_table.add(order_by_directory);

        send_ftp_item.setText("Enviar por ftp");
        send_ftp_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ftp_itemActionPerformed(evt);
            }
        });
        menu_table.add(send_ftp_item);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        button_editor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editor.png"))); // NOI18N
        button_editor.setText("Editor");
        button_editor.setToolTipText("Editor de Texto");
        button_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editorActionPerformed(evt);
            }
        });

        button_files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User Shield-50.png"))); // NOI18N
        button_files.setText("Permisos");
        button_files.setToolTipText("Gestionar Archivos");
        button_files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_filesActionPerformed(evt);
            }
        });

        button_auth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        button_auth.setText("Login");
        button_auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_authActionPerformed(evt);
            }
        });

        button_editor_files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/files.png"))); // NOI18N
        button_editor_files.setText("Archivos");
        button_editor_files.setToolTipText("Editor de Texto");
        button_editor_files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editor_filesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editor_files, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(957, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(button_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_editor_files, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_files, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_auth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editorActionPerformed
        this.setVisible(false);
        historial("ha abierto el editor", "");
        editorForm.pack();
        editorForm.setLocationRelativeTo(this);
        //editorForm.setExtendedState(MAXIMIZED_BOTH);
        Thread relay = new ThreadRelay(this);
        relay.start();
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
        DefaultTableModel model = (DefaultTableModel) historial_table.getModel();
        model.setRowCount(0);
        ResultSet result = modelAction.customQuery("SELECT * from action");
        try {
            if (result.first()) {
                String description = result.getString("description");
                String date = result.getString("date");
                Object[] row = {description, date};
                model.addRow(row);
                while (result.next()) {
                    description = result.getString("description");
                    date = result.getString("date");
                    Object[] row2 = {description, date};
                    model.addRow(row2);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
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
        this.save_file_export.pack();
        this.save_file_export.setLocationRelativeTo(this.editorForm);
        this.save_file_export.setVisible(true);
    }//GEN-LAST:event_export_word_buttonActionPerformed

    private void historial(String description, String file) {
        String action = "El usuario " + this.usernameAll + " " + description + " " + file;
        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        String[] values = {"" + idUser, action, format};
        String[] columnsFile = {"idUser", "description", "date"};
        modelAction.insert("poa", "action", columnsFile, values);
        modelAction.close();
    }

    private void exportRTF() {
        try {
            String content = getRTFContentText();
            String name = this.rtf_export_name.getText();
            String rute = "./files/example.rtf";
            if (!name.equals("")) {
                rute = "./files/" + name + ".rtf";
            }
            File file = new File(rute);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content);
            bw.close();
            JOptionPane.showMessageDialog(editorForm, "Se ha exportado el archivo");
            this.save_file_export.setVisible(false);
            historial("ha exportado el archivo", rute);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void exportXML() {
        try {
            String rute = "./xmls/example.xml";
            ArrayList<Paragraph> Paragraphs = getContent();
            String name = this.xml_export_name.getText();
            FileSystem File = new FileSystem(name, "", idUser, 0);
            File.setParagraphs(Paragraphs);
            String xml = xStream.toXML(File);
            if (!name.equals("")) {
                rute = "./xmls/" + name + ".xml";
            }
            File file = new File(rute);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(xml);
            bw.close();
            this.save_file_export.setVisible(false);
            JOptionPane.showMessageDialog(editorForm, "Se ha exportado el archivo");
            historial("ha exportado el archivo", rute);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getPlaineContentText() {
        try {
            return text_editor.getDocument().getText(0, text_editor.getDocument().getLength());
        } catch (BadLocationException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    private String getRTFContentText() {
        try {
            ByteArrayOutputStream str = new ByteArrayOutputStream();
            RTFEditorKit kitrtf = new RTFEditorKit();
            kitrtf.write(str, text_editor.getDocument(), 0, text_editor.getDocument().getLength());
            return str.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (this.idOpenFile == -1) {
            save_file_win.pack();
            save_file_win.setLocationRelativeTo(editorForm);
            save_file_win.setVisible(true);
        } else {
            this.autoSaveFile();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    public void enterToPlatform() {
        String username = this.ttf_username.getText();
        String password = new String(this.ttf_password.getPassword());
        String[] columns = {"*"};
        String[] conditions = {"username = \"" + username + "\"", "password = \"" + password + "\""};
        ResultSet result = modelAction.select("poa", "user", columns, conditions);
        int id = 0;
        try {
            if (result.first()) {
                id = result.getInt("id");
                usernameAll = result.getString("firstname") + " " + result.getString("lastname");
            }
        } catch (SQLException ex) {

        }
        if (id != 0) {
            idUser = id;
            this.idOpenFile = -1;
            this.button_editor.setEnabled(true);
            this.button_files.setEnabled(true);
            button_editor_files.setEnabled(true);
            this.log_window.setVisible(false);
            historial("se ha logueado", "");
        } else {
            JOptionPane.showMessageDialog(this, "Información incorrecta.");
        }
        modelAction.close();
    }
    private void ttf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttf_passwordActionPerformed
        enterToPlatform();
    }//GEN-LAST:event_ttf_passwordActionPerformed

    private void button_authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_authActionPerformed
        this.log_window.pack();
        this.log_window.setLocationRelativeTo(this);
        this.log_window.setVisible(true);
    }//GEN-LAST:event_button_authActionPerformed

    private void loggin_button_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggin_button_actionActionPerformed
        enterToPlatform();
    }//GEN-LAST:event_loggin_button_actionActionPerformed

    private void file_save_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_save_actionActionPerformed
        if (idOpenFile == -1) {
            FileSystem file = getNewFile();
            String name = file.getName();
            String directory = file.getDirectory();
            int size = file.getSize();
            String xml = xStream.toXML(file);
            String[] columns = {"*"};
            String[] conditions = {"name = \"" + name + "\""};
            ResultSet result = modelAction.select("poa", "file", columns, conditions);
            int id = 0;
            int user = 0;
            try {
                if (result.first()) {
                    id = result.getInt("id");
                    user = result.getInt("autor");
                    idOpenFile = id;
                }
            } catch (SQLException ex) {
            }
            modelAction.close();
            if (id == 0) {
                String[] values = {name, directory, "" + this.idUser, xml, "" + size};
                String[] columnsFile = {"name", "directory", "autor", "content", "size"};
                modelAction.insert("poa", "file", columnsFile, values);
                modelAction.close();
            } else {
                JOptionPane.showMessageDialog(editorForm, "El archivo ya existe, no puede ser creado.");
            }
            save_file_win.setVisible(false);
        }
    }//GEN-LAST:event_file_save_actionActionPerformed

    public void autoSaveFile() {
        if (this.idOpenFile != -1) {
            ArrayList<Paragraph> currents = getContent();
            String[] columns = {"*"};
            String[] conditions = {"id = \"" + idOpenFile + "\""};
            ResultSet result = modelAction.select("poa", "file", columns, conditions);
            String content = "";
            String filename = "";
            try {
                if (result.first()) {
                    content = result.getString("content");
                    filename = result.getString("name");
                }
            } catch (SQLException ex) {
            }
            modelAction.close();

            if (!content.equals("")) {
                FileSystem contentFile = (FileSystem) xStream.fromXML(content);
                ArrayList<Paragraph> oldParagraphs = contentFile.getParagraphs();
                ArrayList<Paragraph> newParagraphs = getContent();
                int number = getEditedParagrapth(newParagraphs, oldParagraphs);
                System.out.println("editar " + number);
                if (number != -1 && !isBlocked(oldParagraphs, number)) {
                    clearBlock(oldParagraphs, number);
                    if (number != -1) {
                        oldParagraphs.get(number).setContent(newParagraphs.get(number).getContent());
                        oldParagraphs.get(number).setEditor(idUser);
                    }
                }

                String xml = xStream.toXML(contentFile);
                String[] values = {xml};
                String[] columnsFile = {"content"};
                String[] conditionsFile = {"id = " + idOpenFile};
                modelAction.update("poa", "file", columnsFile, values, conditionsFile);
                modelAction.close();
            }

            String[] columns2 = {"*"};
            String[] conditions2 = {"id = \"" + idOpenFile + "\""};
            ResultSet result2 = modelAction.select("poa", "file", columns2, conditions2);
            String content2 = "";
            try {
                if (result2.first()) {
                    content2 = result2.getString("content");
                    FileSystem contentFile = (FileSystem) xStream.fromXML(content2);
                    String resultRTF = transformToRTF(contentFile.getParagraphs());
                    this.text_editor.setText(resultRTF);
                }
            } catch (SQLException ex) {
            }
            modelAction.close();
        }
    }

    public int getEditedParagrapth(ArrayList<Paragraph> newParagraphs, ArrayList<Paragraph> oldParagraphs) {
        for (int i = 0; i < oldParagraphs.size(); i++) {
            if (i < newParagraphs.size()) {
                if (!oldParagraphs.get(i).getContent().equals(newParagraphs.get(i).getContent())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void clearBlock(ArrayList<Paragraph> oldParagraphs, int number) {
        for (int i = 0; i < oldParagraphs.size(); i++) {
            if (oldParagraphs.get(i).getEditor() != number && oldParagraphs.get(i).getEditor() == idUser) {
                oldParagraphs.get(i).setEditor(-1);
            }
        }
    }

    public boolean isBlocked(ArrayList<Paragraph> oldParagraphs, int number) {
        if (oldParagraphs.get(number).getEditor() != -1 && oldParagraphs.get(number).getEditor() != idUser) {
            return true;
        }
        return false;
    }

    private String transformToRTF(ArrayList<Paragraph> Paragraph) {
        String rtf = "{\\rtf1\\ansi\n"
                + "{\\fonttbl\\f0\\fnil Monospaced;\\f1\\fnil Segoe UI;}\n"
                + "{\\colortbl\\red0\\green0\\blue0;\\red34\\green34\\blue34;}\n"
                + "\n"
                + "\\f1\\fs24\\i0\\b0\\cf1 ";
        for (int i = 0; i < Paragraph.size(); i++) {
            rtf += Paragraph.get(i).getContent();
            rtf += "\\";
            rtf += "par \n";
        }
        rtf += "}";
        return rtf;
    }

    private FileSystem getNewFile() {
        String name = file_save_name.getText();
        String directory = file_save_directory.getText();
        ArrayList<Paragraph> paragraph = getContent();
        int size = (int) paragraph.size();
        FileSystem file = new FileSystem(name, directory, this.idUser, size);
        file.setParagraphs(paragraph);
        return file;
    }

    private ArrayList<Paragraph> getContent() {
        ArrayList<Paragraph> paragraphsContent = new ArrayList();
        String content = this.getPlaineContentText();
        String[] paragraphs = content.split("\n");
        for (int i = 0; i < paragraphs.length; i++) {
            Paragraph line = new Paragraph(paragraphs[i]);
            paragraphsContent.add(line);
        }
        return paragraphsContent;
    }

    private void export_button_to_rtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_button_to_rtfActionPerformed
        this.exportRTF();
        this.save_file_export.setVisible(false);
    }//GEN-LAST:event_export_button_to_rtfActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        this.save_file_export_xml.pack();
        this.save_file_export_xml.setLocationRelativeTo(this.editorForm);
        this.save_file_export_xml.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void open_file_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_file_showActionPerformed
        files_selection_list.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel model = (DefaultComboBoxModel) files_selection_list.getModel();
        String[] conditions = {"autor = " + idUser};
        String[] columns = {"*"};
        ResultSet result = modelAction.select("poa", "file", columns, conditions);
        try {
            if (result.first()) {
                model.addElement(result.getString("name"));
                while (result.next()) {
                    model.addElement(result.getString("name"));
                }
            }
        } catch (SQLException ex) {
        }

        modelAction.close();
        result = modelAction.customQuery("SELECT poa.file.name\n"
                + "FROM poa.permission \n"
                + "            Inner Join poa.user ON poa.permission.user_id = poa.user.id\n"
                + "            Inner Join poa.file ON poa.permission.file_id = poa.file.id\n"
                + "where poa.permission.user_id = " + this.idUser);
        try {
            if (result.first()) {
                model.addElement(result.getString("name"));
                while (result.next()) {
                    model.addElement(result.getString("name"));
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
        open_file_selector.pack();
        open_file_selector.setLocationRelativeTo(editorForm);
        open_file_selector.setVisible(true);
    }//GEN-LAST:event_open_file_showActionPerformed

    private void editorFormComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_editorFormComponentShown
        if (!editorForm.isVisible()) {
            this.setVisible(true);
        }
    }//GEN-LAST:event_editorFormComponentShown

    private void editorFormComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_editorFormComponentHidden
        if (!editorForm.isVisible()) {
            this.setVisible(true);
            int confirm = JOptionPane.showConfirmDialog(editorForm, "¿Desea guardar su archivo?", "", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                if (idOpenFile == -1) {
                    save_file_win.pack();
                    save_file_win.setLocationRelativeTo(editorForm);
                    save_file_win.setVisible(true);

                } else {
                    this.autoSaveFile();
                }
            }

            this.text_editor.setText("");
            this.idOpenFile = -1;
        }
    }//GEN-LAST:event_editorFormComponentHidden

    private void button_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_filesActionPerformed
        DefaultTableModel model = (DefaultTableModel) my_files_permission.getModel();
        model.setRowCount(0);
        String[] conditions = {"autor = " + idUser};
        String[] columns = {"*"};
        ResultSet result = modelAction.select("poa", "file", columns, conditions);
        try {
            if (result.first()) {
                String id = result.getString("id");
                String name = result.getString("name");
                String directory = result.getString("directory");
                String size = result.getString("size");
                Object[] row = {id, name, directory, size};
                model.addRow(row);
                while (result.next()) {
                    id = result.getString("id");
                    name = result.getString("name");
                    directory = result.getString("directory");
                    size = result.getString("size");
                    Object[] row2 = {id, name, directory, size};
                    model.addRow(row2);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
        user_permission_selector.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel modelActual = (DefaultComboBoxModel) user_permission_selector.getModel();
        String[] conditionsUser = {"1 = 1"};
        String[] columnsUser = {"*"};
        result = modelAction.select("poa", "user", columnsUser, conditionsUser);
        try {
            if (result.first()) {
                if (result.getInt("id") != idUser) {
                    modelActual.addElement(result.getString("firstname") + " " + result.getString("lastname"));
                }
                while (result.next()) {
                    if (result.getInt("id") != idUser) {
                        modelActual.addElement(result.getString("firstname") + " " + result.getString("lastname"));
                    }
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
        this.permission_window.pack();
        this.permission_window.setLocationRelativeTo(this);
        this.permission_window.setVisible(true);
    }//GEN-LAST:event_button_filesActionPerformed

    private void my_files_permissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_files_permissionMouseClicked
        chargePermission();
    }//GEN-LAST:event_my_files_permissionMouseClicked

    private void user_permission_selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_permission_selectorActionPerformed
        chargePermission();
    }//GEN-LAST:event_user_permission_selectorActionPerformed

    private void my_files_permissionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_my_files_permissionPropertyChange

    }//GEN-LAST:event_my_files_permissionPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        savePermissionChange();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String filename = files_selection_list.getSelectedItem().toString();
        String[] columns = {"*"};
        String[] conditions = {"name = \"" + filename + "\""};
        ResultSet result = modelAction.select("poa", "file", columns, conditions);
        String content = "";
        String description = "";
        int file = -1;
        try {
            if (result.first()) {
                file = result.getInt("id");
                if (result.getInt("autor") == idUser) {
                    content = result.getString("content");
                    text_editor.setEnabled(true);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
        if (content.equals("") && file != 0) {
            result = modelAction.customQuery("SELECT * \n"
                    + "FROM poa.permission \n"
                    + "            Inner Join poa.user ON poa.permission.user_id = poa.user.id\n"
                    + "            Inner Join poa.file ON poa.permission.file_id= poa.file.id\n"
                    + "where poa.permission.user_id = " + this.idUser + " and poa.permission.file_id = " + file);
            try {
                if (result.first()) {
                    content = result.getString("content");
                    description = result.getString("description");
                    if (description.contains("W")) {
                        text_editor.setEnabled(true);
                    } else {
                        text_editor.setEnabled(false);
                    }
                }
            } catch (SQLException ex) {
            }
            modelAction.close();
        }
        idOpenFile = file;
        historial("ha abierto el archivo", filename);
        FileSystem currentFileBase = (FileSystem) xStream.fromXML(content);
        ArrayList<Paragraph> paragraphBase = currentFileBase.getParagraphs();
        if (!content.equals("")) {
            String resultRTF = transformToRTF(paragraphBase);
            this.text_editor.setText(resultRTF);
        }
        open_file_selector.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void log_windowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_log_windowKeyPressed

    }//GEN-LAST:event_log_windowKeyPressed

    private void ttf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttf_passwordKeyPressed

    }//GEN-LAST:event_ttf_passwordKeyPressed

    private void export_button_to_rtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_button_to_rtf1ActionPerformed
        this.exportXML();
        this.save_file_export_xml.setVisible(false);
    }//GEN-LAST:event_export_button_to_rtf1ActionPerformed

    private void button_editor_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editor_filesActionPerformed
        chargeMyFiles();
        all_files_content.pack();
        all_files_content.setLocationRelativeTo(this);
        all_files_content.setVisible(true);
    }//GEN-LAST:event_button_editor_filesActionPerformed

    private void order_by_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_by_sizeActionPerformed
        DefaultTableModel model = (DefaultTableModel) report_table.getModel();
        model.setRowCount(0);
        ResultSet result = modelAction.customQuery("SELECT * from file order by 'size'");
        try {
            if (result.first()) {
                String id = result.getString("id");
                String name = result.getString("name");
                String directory = result.getString("directory");
                String size = result.getString("size");
                Object[] row = {id, name, directory, size};
                model.addRow(row);
                while (result.next()) {
                    id = result.getString("id");
                    name = result.getString("name");
                    directory = result.getString("directory");
                    size = result.getString("size");
                    String content = result.getString("content");
                    Object[] row2 = {id, name, directory, size, content};
                    model.addRow(row2);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
    }//GEN-LAST:event_order_by_sizeActionPerformed

    private void order_by_directoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_by_directoryActionPerformed
        DefaultTableModel model = (DefaultTableModel) report_table.getModel();
        model.setRowCount(0);
        ResultSet result = modelAction.customQuery("SELECT * from file order by 'directory'");
        try {
            if (result.first()) {
                String id = result.getString("id");
                String name = result.getString("name");
                String directory = result.getString("directory");
                String size = result.getString("size");
                Object[] row = {id, name, directory, size};
                model.addRow(row);
                while (result.next()) {
                    id = result.getString("id");
                    name = result.getString("name");
                    directory = result.getString("directory");
                    size = result.getString("size");
                    String content = result.getString("content");
                    Object[] row2 = {id, name, directory, size, content};
                    model.addRow(row2);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();
    }//GEN-LAST:event_order_by_directoryActionPerformed

    private void report_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_tableMouseClicked
        if (evt.isMetaDown()) {
            menu_table.show(report_table, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_report_tableMouseClicked

    private void action_historilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_historilActionPerformed
        this.editor_log_win.setVisible(false);
    }//GEN-LAST:event_action_historilActionPerformed

    private void export_excel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_excel_buttonActionPerformed
        File file = new File("./reporte.xls");
        try {
            ExportExcel excel = new ExportExcel(report_table, file);
            boolean result = excel.export();
            if (result) {
                JOptionPane.showMessageDialog(null, "Se exporto con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
            }
        } catch (Exception ex) {
            Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_export_excel_buttonActionPerformed

    private void send_ftp_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ftp_itemActionPerformed
        DefaultTableModel model = (DefaultTableModel) report_table.getModel();
        if (report_table.getSelectedRow() > -1) {
            String content = model.getValueAt(report_table.getSelectedRow(), 4).toString();
            String name = model.getValueAt(report_table.getSelectedRow(), 1).toString();
            String rute = "./exports/" + name + ".xml";
            File file = new File(rute);
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(file));
                bw.write(content);
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(AppView.class.getName()).log(Level.SEVERE, null, ex);
            }

            FTPClientExample example = new FTPClientExample(rute);
            example.conect();
            JOptionPane.showMessageDialog(editorForm, "Se ha enviado el archivo");

        }
    }//GEN-LAST:event_send_ftp_itemActionPerformed

    public void chargePermission() {
        DefaultComboBoxModel modelActual = (DefaultComboBoxModel) user_permission_selector.getModel();
        DefaultTableModel model = (DefaultTableModel) my_files_permission.getModel();
        int row = my_files_permission.getSelectedRow();
        if (row > -1) {
            int file = Integer.parseInt(model.getValueAt(row, 0).toString());
            String allName = modelActual.getSelectedItem().toString();
            String[] params = allName.split(" ");
            String[] conditionsUser = {"firstname = '" + params[0] + "'", "lastname = '" + params[1] + "'"};
            String[] columnsUser = {"*"};
            int idUserFile = 0;
            ResultSet result = modelAction.select("poa", "user", columnsUser, conditionsUser);
            try {
                if (result.first()) {
                    idUserFile = result.getInt("id");
                }
            } catch (SQLException ex) {
            }
            modelAction.close();

            String[] conditionsPermise = {"file_id = '" + file + "'", "user_id = '" + idUserFile + "'"};
            String[] columnsPermise = {"description"};
            result = modelAction.select("poa", "permission", columnsPermise, conditionsPermise);
            String description = "";
            try {
                if (result.first()) {
                    description = result.getString("description");
                }
            } catch (SQLException ex) {
            }
            modelAction.close();
            if (description.contains("R")) {
                read_permission_value.setSelected(true);
            } else {
                read_permission_value.setSelected(false);
            }
            if (description.contains("W")) {
                write_permission_value.setSelected(true);
            } else {
                write_permission_value.setSelected(false);
            }
        } else {
            write_permission_value.setSelected(false);
            read_permission_value.setSelected(false);
        }
    }

    private void savePermissionChange() {
        DefaultComboBoxModel modelActual = (DefaultComboBoxModel) user_permission_selector.getModel();
        DefaultTableModel model = (DefaultTableModel) my_files_permission.getModel();
        int row = my_files_permission.getSelectedRow();
        if (row > -1) {
            int file = Integer.parseInt(model.getValueAt(row, 0).toString());
            String allName = modelActual.getSelectedItem().toString();
            String[] params = allName.split(" ");
            String[] conditionsUser = {"firstname = '" + params[0] + "'", "lastname = '" + params[1] + "'"};
            String[] columnsUser = {"*"};
            int idUserFile = 0;
            ResultSet result = modelAction.select("poa", "user", columnsUser, conditionsUser);
            try {
                if (result.first()) {
                    idUserFile = result.getInt("id");
                }
            } catch (SQLException ex) {
            }
            modelAction.close();

            String[] conditionsPermise = {"file_id = '" + file + "'", "user_id = '" + idUserFile + "'"};
            String[] columnsPermise = {"description"};
            result = modelAction.select("poa", "permission", columnsPermise, conditionsPermise);
            String description = "";
            String change = "";
            try {
                if (result.first()) {
                    description = result.getString("description");
                }
            } catch (SQLException ex) {
            }
            modelAction.close();

            if (write_permission_value.isSelected() && !read_permission_value.isSelected()) {
                read_permission_value.setSelected(true);
            }

            if (read_permission_value.isSelected()) {
                change = "R";
                if (write_permission_value.isSelected()) {
                    change += "W";
                }
            }

            String[] columnsP = {"file_id", "user_id", "description"};
            String[] values = {"" + file, "" + idUserFile, change};

            if (description.equals("")) {
                modelAction.insert("poa", "permission", columnsP, values);
                modelAction.close();
                JOptionPane.showMessageDialog(this, "Se han creado los permisos");
            } else {
                modelAction.update("poa", "permission", columnsP, values, conditionsPermise);
                modelAction.close();
                JOptionPane.showMessageDialog(this, "Se han actualizado los permisos");
            }

            historial("ha cambiado los permisos de sus archivos", "");
        } else {
            JOptionPane.showMessageDialog(this, "No selecciono el archivo o el usuario a realizar permiso");
        }
    }

    private static XStream getXstreamObject() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("file", FileSystem.class);
        xstream.alias("block", Paragraph.class);
        xstream.addImplicitCollection(FileSystem.class, "paragraphs");
        return xstream;
    }

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

    public void chargeMyFiles() {
        DefaultTreeModel rootModel = (DefaultTreeModel) my_files_tree.getModel();
        rootModel.setRoot(new DefaultMutableTreeNode("Mis archivos"));
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) rootModel.getRoot();
        String[] conditions = {"autor = " + idUser};
        String[] columns = {"*"};
        ResultSet result = modelAction.select("poa", "file", columns, conditions);
        try {
            if (result.first()) {
                root.add(new DefaultMutableTreeNode(result.getString("name")));
                while (result.next()) {
                    root.add(new DefaultMutableTreeNode(result.getString("name")));
                }
            }
        } catch (SQLException ex) {
        }

        modelAction.close();

        DefaultTreeModel rootModel2 = (DefaultTreeModel) my_sharing_files.getModel();
        rootModel2.setRoot(new DefaultMutableTreeNode("Mis archivos compartidos"));
        DefaultMutableTreeNode root2 = (DefaultMutableTreeNode) rootModel2.getRoot();
        result = modelAction.customQuery("SELECT poa.file.name\n"
                + "FROM poa.permission \n"
                + "            Inner Join poa.user ON poa.permission.user_id = poa.user.id\n"
                + "            Inner Join poa.file ON poa.permission.file_id = poa.file.id\n"
                + "where poa.permission.user_id = " + this.idUser);
        try {
            if (result.first()) {
                root2.add(new DefaultMutableTreeNode(result.getString("name")));
                while (result.next()) {
                    root2.add(new DefaultMutableTreeNode(result.getString("name")));
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();

        DefaultTableModel model = (DefaultTableModel) report_table.getModel();
        model.setRowCount(0);
        result = modelAction.customQuery("SELECT * from file");
        try {
            if (result.first()) {
                String id = result.getString("id");
                String name = result.getString("name");
                String directory = result.getString("directory");
                String size = result.getString("size");
                Object[] row = {id, name, directory, size};
                model.addRow(row);
                while (result.next()) {
                    id = result.getString("id");
                    name = result.getString("name");
                    directory = result.getString("directory");
                    size = result.getString("size");
                    String content = result.getString("content");
                    Object[] row2 = {id, name, directory, size, content};
                    model.addRow(row2);
                }
            }
        } catch (SQLException ex) {
        }
        modelAction.close();

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
    private javax.swing.JButton action_historil;
    private javax.swing.JDialog all_files_content;
    private javax.swing.JButton bold_button_editor;
    private javax.swing.JButton button_auth;
    private javax.swing.JButton button_copy;
    private javax.swing.JButton button_cut;
    private javax.swing.JButton button_editor;
    private javax.swing.JButton button_editor_files;
    private javax.swing.JButton button_files;
    private javax.swing.JButton button_paste;
    private javax.swing.JButton center_button_align;
    private javax.swing.JButton color_editor_button;
    private javax.swing.JFrame editorForm;
    private javax.swing.JDialog editor_log_win;
    private javax.swing.JButton export_button_to_rtf;
    private javax.swing.JButton export_button_to_rtf1;
    private javax.swing.JButton export_excel_button;
    private javax.swing.JButton export_word_button;
    private javax.swing.JButton file_save_action;
    private javax.swing.JTextField file_save_directory;
    private javax.swing.JTextField file_save_name;
    private javax.swing.JComboBox<String> files_selection_list;
    private javax.swing.JComboBox<String> files_selection_list1;
    private javax.swing.JComboBox<String> font_size_combo;
    private javax.swing.JComboBox<String> fonts_combo;
    private javax.swing.JButton historial_editor_button;
    private javax.swing.JTable historial_table;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton justify_button_align;
    private javax.swing.JButton left_button_align;
    private javax.swing.JDialog log_window;
    private javax.swing.JButton loggin_button_action;
    private javax.swing.JPanel menu_insert_wrapper;
    private javax.swing.JPanel menu_insert_wrapper1;
    private javax.swing.JTabbedPane menu_sidebar;
    private javax.swing.JPopupMenu menu_table;
    private javax.swing.JTable my_files_permission;
    private javax.swing.JTree my_files_tree;
    private javax.swing.JTree my_sharing_files;
    private javax.swing.JDialog open_file_selector;
    private javax.swing.JButton open_file_show;
    private javax.swing.JMenuItem order_by_directory;
    private javax.swing.JMenuItem order_by_size;
    private javax.swing.JDialog permission_window;
    private javax.swing.JPanel port_papel_wrapper;
    private javax.swing.JPanel port_papel_wrapper1;
    private javax.swing.JPanel port_papel_wrapper2;
    private javax.swing.JPanel port_papel_wrapper3;
    private javax.swing.JCheckBox read_permission_value;
    private javax.swing.JButton redo_button_editor;
    private javax.swing.JTable report_table;
    private javax.swing.JButton right_button_align;
    private javax.swing.JTextField rtf_export_name;
    private javax.swing.JDialog save_file_export;
    private javax.swing.JDialog save_file_export_xml;
    private javax.swing.JDialog save_file_win;
    private javax.swing.JDialog send_file_window;
    private javax.swing.JMenuItem send_ftp_item;
    private javax.swing.JButton size_minus_button;
    private javax.swing.JButton size_pluss_button;
    private javax.swing.JTextPane text_editor;
    private javax.swing.JPasswordField ttf_password;
    private javax.swing.JTextField ttf_username;
    private javax.swing.JButton underline_button_editor;
    private javax.swing.JButton undo_button_editor;
    private javax.swing.JComboBox<String> user_permission_selector;
    private javax.swing.JCheckBox write_permission_value;
    private javax.swing.JTextField xml_export_name;
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
