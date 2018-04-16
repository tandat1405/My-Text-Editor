
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.undo.*;
import javax.swing.event.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Fucking PC
 */
public class MainUI extends javax.swing.JFrame {
    
    private File fileSaveCurrent = null; //check xem text tren txtWorkPlace da duoc save thanh file chua
    private boolean isSave = true; //check xem phan dang lam viec duoc luu chua
    //moi mo len se la true vi khong co gi de save
    private Font newFont = null;
    private Stack<String> stackContentUndo = new Stack<>();
    private Stack<String> stackContentRedo = new Stack<>();
    UndoManager manager = new UndoManager();
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        txtWorkplace.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                manager.addEdit(e.getEdit());
            }
        });
//        txtWorkplace.getDocument().addUndoableEditListener(new UndoableEditListener() {
//			public void undoableEditHappened(UndoableEditEvent e) {
//				manager.addEdit(e.getEdit());
//			}
//		});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtWorkplace = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miUndo = new javax.swing.JMenuItem();
        miRedo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miCut = new javax.swing.JMenuItem();
        miCopy = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnFind = new javax.swing.JMenuItem();
        btnReplace = new javax.swing.JMenuItem();
        btnSelectAll = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnFont = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtWorkplace.setColumns(20);
        txtWorkplace.setRows(5);
        txtWorkplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWorkplaceKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtWorkplace);

        jMenu1.setText("File");

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        jMenu1.add(miNew);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        miSaveAs.setText("Save as");
        miSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(miSaveAs);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        miUndo.setText("Undo");
        miUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUndoActionPerformed(evt);
            }
        });
        jMenu2.add(miUndo);

        miRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miRedo.setText("Redo");
        miRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRedoActionPerformed(evt);
            }
        });
        jMenu2.add(miRedo);
        jMenu2.add(jSeparator2);

        miCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        miCut.setText("Cut");
        miCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCutActionPerformed(evt);
            }
        });
        jMenu2.add(miCut);

        miCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCopy.setText("Copy");
        miCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCopyActionPerformed(evt);
            }
        });
        jMenu2.add(miCopy);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Paste");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem6.setText("Delete");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator1);

        btnFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jMenu2.add(btnFind);

        btnReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        btnReplace.setText("Replace");
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });
        jMenu2.add(btnReplace);

        btnSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btnSelectAll.setText("Select All");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });
        jMenu2.add(btnSelectAll);
        jMenu2.add(jSeparator3);

        btnFont.setText("Font");
        btnFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFontActionPerformed(evt);
            }
        });
        jMenu2.add(btnFont);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        File tmpFile;
        
        if(fileSaveCurrent == null){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            tmpFile = fileChooser.getSelectedFile();
            if(tmpFile == null){
                return;
            }
            if(tmpFile.exists()){
                int o = JOptionPane.showConfirmDialog(this, "Do you want to save as?", "Comfirm save as", JOptionPane.YES_NO_OPTION);
                if(o == 1){
                    return;
                }
            }
            fileSaveCurrent = tmpFile;
        }
        saveFile();
        
        
        
        
        
    }//GEN-LAST:event_miSaveActionPerformed

    private void txtWorkplaceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkplaceKeyPressed
        isSave = false;
    }//GEN-LAST:event_txtWorkplaceKeyPressed

    private void miSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveAsActionPerformed
            File tmpFile;
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            tmpFile = fileChooser.getSelectedFile();
            if(tmpFile == null){
                return;
            }
            if(tmpFile.exists()){
                int o = JOptionPane.showConfirmDialog(this, "Do you want to save as?", "Comfirm save as", JOptionPane.YES_NO_OPTION);
                if(o == 1){
                    return;
                }
            }
            fileSaveCurrent = tmpFile;
        
        saveFile();
    }//GEN-LAST:event_miSaveAsActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        if(!isSave){
            int o = JOptionPane.showConfirmDialog(this, "Do you want to save?", "Save", JOptionPane.YES_NO_CANCEL_OPTION);
            if(o==0){
                miSaveActionPerformed(evt);
            }
            else if(o==1){
                txtWorkplace.setText("");
                fileSaveCurrent = null;
                isSave = true;
            }
            else{
                return;
            }
        }
        else{
            txtWorkplace.setText("");
                fileSaveCurrent = null;
                isSave = true;
        }
    }//GEN-LAST:event_miNewActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        if(!isSave){
            int o = JOptionPane.showConfirmDialog(this, "Do you want to save?", "Save", JOptionPane.YES_NO_CANCEL_OPTION);
            if(o == 0){
                miSaveActionPerformed(evt);
            }
            else if(o==1){
                File fileTmp;
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(this);
                fileTmp = fc.getSelectedFile();
                if(fileTmp == null){
                    return;
                }
                if(fileTmp.exists()){
                    try {
                        FileReader fr = new FileReader(fileTmp);
                        BufferedReader br = new BufferedReader(fr);
                        txtWorkplace.read(br, fr);
                        br.close();
                        fr.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Cant open file!");
                    }
                }
            }
            else{
                return;
            }
        }
        else{
            File fileTmp;
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(this);
                fileTmp = fc.getSelectedFile();
                if(fileTmp == null){
                    return;
                }
                if(fileTmp.exists()){
                    try {
                        FileReader fr = new FileReader(fileTmp);
                        BufferedReader br = new BufferedReader(fr);
                        txtWorkplace.read(br, fr);
                        br.close();
                        fr.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Cant open file!");
                    }
                }
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void miUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUndoActionPerformed
        try {
					manager.undo();
				} catch (Exception ex) {
                                    ex.printStackTrace();
				}
    }//GEN-LAST:event_miUndoActionPerformed

    private void miCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCutActionPerformed
        stackContentUndo.push(txtWorkplace.getText());
        txtWorkplace.cut();
    }//GEN-LAST:event_miCutActionPerformed

    private void miCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCopyActionPerformed
        txtWorkplace.copy();
    }//GEN-LAST:event_miCopyActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        stackContentUndo.push(txtWorkplace.getText());
        txtWorkplace.paste();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        stackContentUndo.push(txtWorkplace.getSelectedText());
        txtWorkplace.replaceSelection("");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void miRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRedoActionPerformed
        try {
					manager.redo();
				} catch (Exception ex) {
                                    ex.printStackTrace();
				}
    }//GEN-LAST:event_miRedoActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        new Find(txtWorkplace).setVisible(true);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
        new Replace(txtWorkplace).setVisible(true);
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFontActionPerformed
        new FontFrame(txtWorkplace).setVisible(true);
    }//GEN-LAST:event_btnFontActionPerformed

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        txtWorkplace.selectAll();
    }//GEN-LAST:event_btnSelectAllActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnFind;
    private javax.swing.JMenuItem btnFont;
    private javax.swing.JMenuItem btnReplace;
    private javax.swing.JMenuItem btnSelectAll;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem miCopy;
    private javax.swing.JMenuItem miCut;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miRedo;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JMenuItem miUndo;
    private javax.swing.JTextArea txtWorkplace;
    // End of variables declaration//GEN-END:variables

    private void saveFile() {
        try {
            FileWriter fw = new FileWriter(fileSaveCurrent);
            txtWorkplace.write(fw);
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cant save file !", "ERROR", JOptionPane.YES_OPTION);
        }
        isSave = true;
    }
    
}
