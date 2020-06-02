package rpg.game;

/**
 *
 * @author Krystian
 */
public class CharacterCreation extends javax.swing.JFrame {
       
    public static String chosenClass;     
    
    public CharacterCreation() {
        this.setTitle("Stwórz postać");
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        chooseCharacterLabel = new javax.swing.JLabel();
        warriorButton = new javax.swing.JButton();
        mageButton = new javax.swing.JButton();
        hunterButton = new javax.swing.JButton();
        typeNameLabel = new javax.swing.JLabel();
        closeChangesButton = new javax.swing.JButton();
        typeNameTextField = new javax.swing.JTextField();
        whatWasChosenLabel = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        confirmButton.setText("Zatwierdź");
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        chooseCharacterLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chooseCharacterLabel.setText("Wybierz klasę postaci");

        warriorButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        warriorButton.setText("Wojownik");
        warriorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        warriorButton.setPreferredSize(new java.awt.Dimension(100, 25));
        warriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorButtonActionPerformed(evt);
            }
        });

        mageButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mageButton.setText("Mag");
        mageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mageButton.setPreferredSize(new java.awt.Dimension(100, 25));
        mageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mageButtonActionPerformed(evt);
            }
        });

        hunterButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hunterButton.setText("Tropiciel");
        hunterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hunterButton.setMaximumSize(new java.awt.Dimension(100, 25));
        hunterButton.setPreferredSize(new java.awt.Dimension(100, 25));
        hunterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hunterButtonActionPerformed(evt);
            }
        });

        typeNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        typeNameLabel.setText("Podaj nazwę gracza");

        closeChangesButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        closeChangesButton.setText("Cofnij zmiany");
        closeChangesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeChangesButtonActionPerformed(evt);
            }
        });

        typeNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeNameTextFieldActionPerformed(evt);
            }
        });

        whatWasChosenLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        whatWasChosenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whatWasChosenLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whatWasChosenLabel.setPreferredSize(new java.awt.Dimension(33, 27));

        warning.setBackground(new java.awt.Color(255, 0, 0));
        warning.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        warning.setDoubleBuffered(true);

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(confirmButton)
                                .addGap(55, 55, 55)
                                .addComponent(closeChangesButton))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(warriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(typeNameLabel))
                                .addGap(18, 18, 18)
                                .addComponent(hunterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(typeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(chooseCharacterLabel)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(warning)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(whatWasChosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseCharacterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hunterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whatWasChosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(typeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        whatWasChosenLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeNameTextFieldActionPerformed

    private void closeChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeChangesButtonActionPerformed
        whatWasChosenLabel.setText("");
        warriorButton.setEnabled(true);
        mageButton.setEnabled(true);
        hunterButton.setEnabled(true);
      
    }//GEN-LAST:event_closeChangesButtonActionPerformed

    private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorButtonActionPerformed
        whatWasChosenLabel.setText("Wybrano wojownika!");
        warriorButton.setEnabled(false);
        mageButton.setEnabled(false);
        hunterButton.setEnabled(false);
        chosenClass = "Wojownik";           
    }//GEN-LAST:event_warriorButtonActionPerformed

    private void mageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageButtonActionPerformed
        whatWasChosenLabel.setText("Wybrano maga!");
        warriorButton.setEnabled(false);
        mageButton.setEnabled(false);
        hunterButton.setEnabled(false);
        chosenClass = "Mag";        
    }//GEN-LAST:event_mageButtonActionPerformed

    private void hunterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hunterButtonActionPerformed
        whatWasChosenLabel.setText("Wybrano tropiciela!");
        warriorButton.setEnabled(false);
        mageButton.setEnabled(false);
        hunterButton.setEnabled(false);
        chosenClass = "Tropiciel";        
    }//GEN-LAST:event_hunterButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String isChosen = whatWasChosenLabel.getText();
        String isName = typeNameTextField.getText();
        
        if(!isChosen.isEmpty() && !isName.isEmpty()) {
            
            String info[] = {
                isName,
                chosenClass
            };
            this.setVisible(false);
            gameBoard.main(info);
        } else {
            warning.setText("Podaj nazwę i klasę!");
        }
        
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseCharacterLabel;
    private javax.swing.JButton closeChangesButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton hunterButton;
    private javax.swing.JButton mageButton;
    private javax.swing.JLabel typeNameLabel;
    private javax.swing.JTextField typeNameTextField;
    private javax.swing.JLabel warning;
    private javax.swing.JButton warriorButton;
    private javax.swing.JLabel whatWasChosenLabel;
    // End of variables declaration//GEN-END:variables
}
