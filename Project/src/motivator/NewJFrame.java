package motivator;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author tolik
 */
public class NewJFrame extends javax.swing.JFrame {

    String filename = "/home/tolik/qwerty.xml";

    DurationThread dtr;

    public NewJFrame() {
        initComponents();

        try {
            dtr = new DurationThread(ActiveEventTimeLabel,
                    EventsModelEditor.getActiveEventDateTime(filename));
        } catch (ParserConfigurationException ex) {
        } catch (SAXException ex) {
        } catch (IOException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EventsListDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        EventsList = new javax.swing.JList<>();
        AddNewEventButton = new javax.swing.JButton();
        DeleteEventButton = new javax.swing.JButton();
        ChooseFileButton = new javax.swing.JButton();
        EventsListFileChooser = new javax.swing.JFileChooser();
        AddNewEventDialog = new javax.swing.JDialog();
        AddNewEventNameTextField = new javax.swing.JTextField();
        AddNewEventNameLabel = new javax.swing.JLabel();
        AddNewEventRemarkTextField = new javax.swing.JTextField();
        AddNewEventRemarkLabel = new javax.swing.JLabel();
        AddNewEventExecLabel = new javax.swing.JLabel();
        AddNewEventOKButton = new javax.swing.JButton();
        AddNewEventCancelButton = new javax.swing.JButton();
        AddNewEventDateSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddNewEventTimeSpinner = new javax.swing.JSpinner();
        InvalidMessageDialogBox = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        IncorrectFormatButton = new javax.swing.JButton();
        FinishedActiveEventDialog = new javax.swing.JDialog();
        FinishedActiveEventOKButton = new javax.swing.JButton();
        showEventsDialogButton = new javax.swing.JButton();
        StopActiveEventButton = new javax.swing.JButton();
        ActiveEventTimeLabel = new javax.swing.JLabel();
        ActiveEventNameLabel = new javax.swing.JLabel();

        EventsListDialog.setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        EventsListDialog.setLocation(new java.awt.Point(150, 150));
        EventsListDialog.setMinimumSize(new java.awt.Dimension(450, 300));
        EventsListDialog.setResizable(false);
        EventsListDialog.setSize(new java.awt.Dimension(450, 300));
        EventsListDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                EventsListDialogWindowOpened(evt);
            }
        });

        EventsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(EventsList);

        AddNewEventButton.setText("Новое событие");
        AddNewEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventButtonActionPerformed(evt);
            }
        });

        DeleteEventButton.setText("Удалить событие");
        DeleteEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEventButtonActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChooseFileButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );

        EventsListFileChooser.setFileHidingEnabled(false);

        AddNewEventDialog.setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        AddNewEventDialog.setLocation(new java.awt.Point(150, 150));
        AddNewEventDialog.setMinimumSize(new java.awt.Dimension(450, 300));
        AddNewEventDialog.setResizable(false);
        AddNewEventDialog.setSize(new java.awt.Dimension(450, 300));
        AddNewEventDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AddNewEventDialogWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                AddNewEventDialogWindowClosed(evt);
            }
        });

        AddNewEventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventNameTextFieldActionPerformed(evt);
            }
        });

        AddNewEventNameLabel.setText("Название");

        AddNewEventRemarkTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewEventRemarkTextFieldActionPerformed(evt);
            }
        });

        AddNewEventRemarkLabel.setText("Примечание");

        AddNewEventExecLabel.setText("Окончание события");

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

        AddNewEventDateSpinner.setModel(new javax.swing.SpinnerDateModel());
        AddNewEventDateSpinner.setEditor(new javax.swing.JSpinner.DateEditor(AddNewEventDateSpinner, "dd-M-yyyy"));

        jLabel2.setText("Дата");

        jLabel5.setText("Время");

        AddNewEventTimeSpinner.setModel(new javax.swing.SpinnerDateModel());
        AddNewEventTimeSpinner.setEditor(new javax.swing.JSpinner.DateEditor(AddNewEventTimeSpinner, "HH:mm:ss"));

        javax.swing.GroupLayout AddNewEventDialogLayout = new javax.swing.GroupLayout(AddNewEventDialog.getContentPane());
        AddNewEventDialog.getContentPane().setLayout(AddNewEventDialogLayout);
        AddNewEventDialogLayout.setHorizontalGroup(
            AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddNewEventRemarkTextField)
                            .addComponent(AddNewEventRemarkLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddNewEventNameTextField)
                            .addComponent(AddNewEventNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(AddNewEventExecLabel)
                                .addGap(0, 233, Short.MAX_VALUE))))
                    .addGroup(AddNewEventDialogLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddNewEventDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddNewEventTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewEventDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddNewEventOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddNewEventCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddNewEventExecLabel)
                .addGap(18, 18, 18)
                .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewEventDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewEventTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(AddNewEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewEventOKButton)
                    .addComponent(AddNewEventCancelButton))
                .addContainerGap())
        );

        InvalidMessageDialogBox.setBounds(new java.awt.Rectangle(200, 200, 300, 100));

        jLabel3.setText("Неверный формат заполнения полей");

        IncorrectFormatButton.setText("OK");
        IncorrectFormatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncorrectFormatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InvalidMessageDialogBoxLayout = new javax.swing.GroupLayout(InvalidMessageDialogBox.getContentPane());
        InvalidMessageDialogBox.getContentPane().setLayout(InvalidMessageDialogBoxLayout);
        InvalidMessageDialogBoxLayout.setHorizontalGroup(
            InvalidMessageDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvalidMessageDialogBoxLayout.createSequentialGroup()
                .addGroup(InvalidMessageDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvalidMessageDialogBoxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(InvalidMessageDialogBoxLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(IncorrectFormatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        InvalidMessageDialogBoxLayout.setVerticalGroup(
            InvalidMessageDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvalidMessageDialogBoxLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(IncorrectFormatButton)
                .addContainerGap())
        );

        FinishedActiveEventDialog.setBounds(new java.awt.Rectangle(300, 400, 150, 100));

        FinishedActiveEventOKButton.setText("OK");
        FinishedActiveEventOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishedActiveEventOKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinishedActiveEventDialogLayout = new javax.swing.GroupLayout(FinishedActiveEventDialog.getContentPane());
        FinishedActiveEventDialog.getContentPane().setLayout(FinishedActiveEventDialogLayout);
        FinishedActiveEventDialogLayout.setHorizontalGroup(
            FinishedActiveEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(FinishedActiveEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FinishedActiveEventDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FinishedActiveEventOKButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        FinishedActiveEventDialogLayout.setVerticalGroup(
            FinishedActiveEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(FinishedActiveEventDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FinishedActiveEventDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FinishedActiveEventOKButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 150, 450, 300));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        showEventsDialogButton.setText("К списку событий");
        showEventsDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventsDialogButtonActionPerformed(evt);
            }
        });

        StopActiveEventButton.setText("Завершить");
        StopActiveEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActiveEventButtonActionPerformed(evt);
            }
        });

        ActiveEventTimeLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        ActiveEventTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActiveEventTimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ActiveEventNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ActiveEventNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActiveEventNameLabel.setText("Активное событие");
        ActiveEventNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(ActiveEventTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StopActiveEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(showEventsDialogButton))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addComponent(ActiveEventNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {StopActiveEventButton, showEventsDialogButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ActiveEventNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ActiveEventTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(StopActiveEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showEventsDialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {StopActiveEventButton, showEventsDialogButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StopActiveEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActiveEventButtonActionPerformed
        // TODO add your handling code here:
        try {
            EventsList.setModel(EventsModelEditor.finishActiveEvent(filename));
            ActiveEventNameLabel.setText(EventsModelEditor.getActiveEventName(filename));

            if (!dtr.isInterrupted()) {
                dtr.interrupt();
            }
            dtr = new DurationThread(ActiveEventTimeLabel,
                    EventsModelEditor.getActiveEventDateTime(filename));
            dtr.start();
        } catch (ParserConfigurationException e1) {
        } catch (SAXException e2) {
        } catch (IOException e3) {
        } catch (TransformerException e4) {
        }

        //formWindowActivated(evt);
    }//GEN-LAST:event_StopActiveEventButtonActionPerformed

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

        String MONTHS[] = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        String name = AddNewEventNameTextField.getText();
        String remark = AddNewEventRemarkTextField.getText();
        if (remark.isEmpty()) {
            remark = " ";
        }
        String date = AddNewEventDateSpinner.getValue().toString();
        String time = AddNewEventTimeSpinner.getValue().toString().split(" ")[3];

        String year = date.split(" ")[5];
        String month = String.valueOf(Arrays.asList(MONTHS).indexOf(date.split(" ")[1]));
        if (month.length() < 2) {
            month = "0" + month;
        }
        String day = date.split(" ")[2];

        date = year + "-" + month + "-" + day;

        String dateTime = date + " " + time;

        LocalDate now = LocalDate.now();
        LocalDate userDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);

        if (name.isEmpty()) {
            InvalidMessageDialogBox.setVisible(true);
        } else if (userDate.isBefore(now)) {
            InvalidMessageDialogBox.setVisible(true);
        } else {
            AddNewEventDialog.setVisible(false);

            try {
                EventsList.setModel(EventsModelEditor.addNewEvent(dateTime, name, remark, filename));
            } catch (ParserConfigurationException e1) {
            } catch (SAXException e2) {
            } catch (IOException e3) {
            } catch (TransformerException e4) {
            }
        }
    }//GEN-LAST:event_AddNewEventOKButtonActionPerformed

    private void AddNewEventCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewEventCancelButtonActionPerformed
        // TODO add your handling code here:
        AddNewEventDialog.setVisible(false);
    }//GEN-LAST:event_AddNewEventCancelButtonActionPerformed

    private void EventsListDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EventsListDialogWindowOpened
        // TODO add your handling code here:

        try {
            EventsList.setModel(EventsModelEditor.createEventsModel(filename));
        } catch (ParserConfigurationException ex) {
        } catch (SAXException ex) {
        } catch (IOException ex) {
        }


    }//GEN-LAST:event_EventsListDialogWindowOpened

    private void IncorrectFormatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncorrectFormatButtonActionPerformed
        // TODO add your handling code here:
        InvalidMessageDialogBox.setVisible(false);
    }//GEN-LAST:event_IncorrectFormatButtonActionPerformed

    private void DeleteEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEventButtonActionPerformed
        // TODO add your handling code here:
        int index = EventsList.getSelectedIndex();
        if (index != -1) {
            try {
                EventsModelEditor.finishEvent(index, filename);
                EventsList.setModel(EventsModelEditor.createEventsModel(filename));
            } catch (ParserConfigurationException ex) {
            } catch (SAXException ex) {
            } catch (IOException ex) {
            } catch (TransformerException ex) {
            }
        }
    }//GEN-LAST:event_DeleteEventButtonActionPerformed

    private void AddNewEventDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AddNewEventDialogWindowOpened
        // TODO add your handling code here:
        EventsListDialog.setVisible(false);
    }//GEN-LAST:event_AddNewEventDialogWindowOpened

    private void AddNewEventDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AddNewEventDialogWindowClosed
        // TODO add your handling code here:
        EventsListDialog.setVisible(true);
    }//GEN-LAST:event_AddNewEventDialogWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try {
            ActiveEventNameLabel.setText(EventsModelEditor.getActiveEventName(filename));

            if (!dtr.isInterrupted()) {
                dtr.interrupt();
            }
            dtr = new DurationThread(ActiveEventTimeLabel,
                    EventsModelEditor.getActiveEventDateTime(filename));
            dtr.start();

            String finDate = EventsModelEditor.getActiveEventDateTime(filename)[0];
            if (!finDate.equals(" ")) {
                String finTime = EventsModelEditor.getActiveEventDateTime(filename)[1];
                LocalDateTime finish = LocalDateTime.of(
                        LocalDate.parse(finDate, DateTimeFormatter.ISO_LOCAL_DATE),
                        LocalTime.parse(finTime, DateTimeFormatter.ISO_LOCAL_TIME));
                LocalDateTime start = LocalDateTime.now();
                Duration d = Duration.between(start, finish);
                if (d.isZero() || d.isNegative()) {
                    DefaultListModel model = EventsModelEditor.finishActiveEvent(filename);
                    EventsList.setModel(model);
                    
                }
            }

        } catch (ParserConfigurationException ex) {
        } catch (SAXException ex) {
        } catch (IOException ex) {
        } catch (TransformerException ex) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void FinishedActiveEventOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishedActiveEventOKButtonActionPerformed
        // TODO add your handling code here:
        FinishedActiveEventDialog.setVisible(false);
    }//GEN-LAST:event_FinishedActiveEventOKButtonActionPerformed

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
    private javax.swing.JLabel ActiveEventNameLabel;
    private javax.swing.JLabel ActiveEventTimeLabel;
    private javax.swing.JButton AddNewEventButton;
    private javax.swing.JButton AddNewEventCancelButton;
    private javax.swing.JSpinner AddNewEventDateSpinner;
    private javax.swing.JDialog AddNewEventDialog;
    private javax.swing.JLabel AddNewEventExecLabel;
    private javax.swing.JLabel AddNewEventNameLabel;
    private javax.swing.JTextField AddNewEventNameTextField;
    private javax.swing.JButton AddNewEventOKButton;
    private javax.swing.JLabel AddNewEventRemarkLabel;
    private javax.swing.JTextField AddNewEventRemarkTextField;
    private javax.swing.JSpinner AddNewEventTimeSpinner;
    private javax.swing.JButton ChooseFileButton;
    private javax.swing.JButton DeleteEventButton;
    private javax.swing.JList<String> EventsList;
    private javax.swing.JDialog EventsListDialog;
    private javax.swing.JFileChooser EventsListFileChooser;
    private javax.swing.JDialog FinishedActiveEventDialog;
    private javax.swing.JButton FinishedActiveEventOKButton;
    private javax.swing.JButton IncorrectFormatButton;
    private javax.swing.JDialog InvalidMessageDialogBox;
    private javax.swing.JButton StopActiveEventButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showEventsDialogButton;
    // End of variables declaration//GEN-END:variables
}
