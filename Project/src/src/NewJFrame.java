/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motivator;

import java.io.FileFilter;
import java.time.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author tolik
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        EventsListDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        AddNewEventButton = new javax.swing.JButton();
        DeleteEventButton = new javax.swing.JButton();
        EditEventButton = new javax.swing.JButton();
        ChooseFileButton = new javax.swing.JButton();
        EventsListFileChooser = new javax.swing.JFileChooser();
        AddNewEventDialog = new javax.swing.JDialog();
        AddNewEventNameTextField = new javax.swing.JTextField();
        AddNewEventNameLabel = new javax.swing.JLabel();
        AddNewEventRemarkTextField = new javax.swing.JTextField();
        AddNewEventRemarkLabel = new javax.swing.JLabel();
        AddNewEventExecLabel = new javax.swing.JLabel();
        AddNewEventExecDateLabel = new javax.swing.JLabel();
        AddNewEventExecTimeLabel = new javax.swing.JLabel();
        AddNewEventPriorityLabel = new javax.swing.JLabel();
        AddNewEventPrioritySpinner = new javax.swing.JSpinner();
        AddNewEventDateTextField = new javax.swing.JFormattedTextField();
        AddNewEventTimeTextField = new javax.swing.JFormattedTextField();
        AddNewEventOKButton = new javax.swing.JButton();
        AddNewEventCancelButton = new javax.swing.JButton();
        showEventsDialogButton = new javax.swing.JButton();
        stopActiveEventBotton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        EventsListDialog.setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        EventsListDialog.setLocation(new java.awt.Point(150, 150));
        EventsListDialog.setLocationByPlatform(true);
        EventsListDialog.setMaximumSize(new java.awt.Dimension(450, 300));
        EventsListDialog.setMinimumSize(new java.awt.Dimension(450, 300));
        EventsListDialog.setPreferredSize(new java.awt.Dimension(450, 300));
        EventsListDialog.setResizable(false);
        EventsListDialog.setSize(new java.awt.Dimension(450, 300));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        AddNewEventButton.setText("Новое событие");
        AddNewEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventButtonActionPerformed(evt);
            }
        });

        DeleteEventButton.setText("Удалить событие");

        EditEventButton.setText("Редактировать");

        ChooseFileButton.setText("Выбрать файл");
        ChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EventsListDialogLayout = new javax.swing.GroupLayout(EventsListDialog.getContentPane());
        EventsListDialog.getContentPane().setLayout(EventsListDialogLayout);
        EventsListDialogLayout.setHorizontalGroup(
            EventsListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsListDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EventsListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewEventButton)
                    .addComponent(DeleteEventButton)
                    .addComponent(EditEventButton)
                    .addComponent(ChooseFileButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventsListDialogLayout.setVerticalGroup(
            EventsListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsListDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventsListDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventsListDialogLayout.createSequentialGroup()
                        .addComponent(AddNewEventButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteEventButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditEventButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChooseFileButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );

        EventsListFileChooser.setFileHidingEnabled(false);

        AddNewEventDialog.setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        AddNewEventDialog.setLocation(new java.awt.Point(150, 150));
        AddNewEventDialog.setLocationByPlatform(true);
        AddNewEventDialog.setMaximumSize(new java.awt.Dimension(450, 300));
        AddNewEventDialog.setMinimumSize(new java.awt.Dimension(450, 300));
        AddNewEventDialog.setPreferredSize(new java.awt.Dimension(450, 300));
        AddNewEventDialog.setResizable(false);
        AddNewEventDialog.setSize(new java.awt.Dimension(450, 300));

        AddNewEventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventNameTextFieldActionPerformed(evt);
            }
        });

        AddNewEventNameLabel.setText("Название события");

        AddNewEventRemarkTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventRemarkTextFieldActionPerformed(evt);
            }
        });

        AddNewEventRemarkLabel.setText("Примечание");

        AddNewEventExecLabel.setText("Окончание события");

        AddNewEventExecDateLabel.setText("Дата");

        AddNewEventExecTimeLabel.setText("Время");

        AddNewEventPriorityLabel.setText("Приоритет");

        AddNewEventDateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        AddNewEventDateTextField.setText(String.valueOf(LocalDate.now()));

        AddNewEventTimeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm:ss"))));
        AddNewEventTimeTextField.setText(String.valueOf(LocalTime.now()));

        AddNewEventOKButton.setText("OK");
        AddNewEventOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventOKButtonActionPerformed(evt);
            }
        });

        AddNewEventCancelButton.setText("Отмена");
        AddNewEventCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddNewEventDialogLayout = new javax.swing.GroupLayout(AddNewEventDialog.getContentPane());
        AddNewEventDialog.getContentPane().setLayout(AddNewEventDialogLayout);
        AddNewEventDialogLayout.setHorizontalGroup(
            AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewEventRemarkTextField)
                    .addComponent(AddNewEventRemarkLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddNewEventNameTextField)
                    .addComponent(AddNewEventNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                                .addComponent(AddNewEventExecDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddNewEventExecTimeLabel))
                            .addComponent(AddNewEventExecLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddNewEventPriorityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewEventPrioritySpinner))))
                .addContainerGap())
            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddNewEventDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddNewEventTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(AddNewEventOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(AddNewEventCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        AddNewEventDialogLayout.setVerticalGroup(
            AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(AddNewEventNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewEventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddNewEventRemarkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddNewEventRemarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNewEventExecLabel)
                            .addComponent(AddNewEventPriorityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddNewEventExecDateLabel)
                                .addComponent(AddNewEventExecTimeLabel))
                            .addComponent(AddNewEventPrioritySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNewEventDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddNewEventTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewEventDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNewEventOKButton)
                            .addComponent(AddNewEventCancelButton))
                        .addContainerGap())))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);

        showEventsDialogButton.setText("К списку событий");
        showEventsDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventsDialogButtonActionPerformed(evt);
            }
        });

        stopActiveEventBotton.setText("Завершить текущее событие");
        stopActiveEventBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActiveEventBottonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4 дня   15 часов");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(stopActiveEventBotton)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(showEventsDialogButton)
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stopActiveEventBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(showEventsDialogButton)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopActiveEventBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActiveEventBottonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActiveEventBottonActionPerformed

    private void AddNewEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventButtonActionPerformed
        // TODO add your handling code here:
        AddNewEventDialog.setVisible(true);
    }//GEN-LAST:event_AddNewEventButtonActionPerformed

    private void showEventsDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEventsDialogButtonActionPerformed
        // TODO add your handling code here:
        EventsListDialog.setVisible(true);
    }//GEN-LAST:event_showEventsDialogButtonActionPerformed

    private void ChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileButtonActionPerformed
        // TODO add your handling code here:
        
        EventsListFileChooser.setFileFilter(new FileNameExtensionFilter("xml", "xml"));
        EventsListFileChooser.showOpenDialog(EventsListDialog);
        
    }//GEN-LAST:event_ChooseFileButtonActionPerformed

    private void AddNewEventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddNewEventNameTextFieldActionPerformed

    private void AddNewEventRemarkTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventRemarkTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddNewEventRemarkTextFieldActionPerformed

    private void AddNewEventOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventOKButtonActionPerformed
        // TODO add your handling code here:
        AddNewEventDialog.setVisible(false);
    }//GEN-LAST:event_AddNewEventOKButtonActionPerformed

    private void AddNewEventCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventCancelButtonActionPerformed
        // TODO add your handling code here:
        AddNewEventDialog.setVisible(false);
    }//GEN-LAST:event_AddNewEventCancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewEventButton;
    private javax.swing.JButton AddNewEventCancelButton;
    private javax.swing.JFormattedTextField AddNewEventDateTextField;
    private javax.swing.JDialog AddNewEventDialog;
    private javax.swing.JLabel AddNewEventExecDateLabel;
    private javax.swing.JLabel AddNewEventExecLabel;
    private javax.swing.JLabel AddNewEventExecTimeLabel;
    private javax.swing.JLabel AddNewEventNameLabel;
    private javax.swing.JTextField AddNewEventNameTextField;
    private javax.swing.JButton AddNewEventOKButton;
    private javax.swing.JLabel AddNewEventPriorityLabel;
    private javax.swing.JSpinner AddNewEventPrioritySpinner;
    private javax.swing.JLabel AddNewEventRemarkLabel;
    private javax.swing.JTextField AddNewEventRemarkTextField;
    private javax.swing.JFormattedTextField AddNewEventTimeTextField;
    private javax.swing.JButton ChooseFileButton;
    private javax.swing.JButton DeleteEventButton;
    private javax.swing.JButton EditEventButton;
    private javax.swing.JDialog EventsListDialog;
    private javax.swing.JFileChooser EventsListFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showEventsDialogButton;
    private javax.swing.JButton stopActiveEventBotton;
    // End of variables declaration//GEN-END:variables
}