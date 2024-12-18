/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.snakegame.view;

import com.snakegame.view.GameFrame;
import com.snakegame.view.GameOptions;
import com.snakegame.view.GamePanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Menu extends javax.swing.JPanel {

    private final GameFrame frame;
  
    /**
     * Creates new form Menu
     * @param frame
     */
    public Menu(GameFrame frame) {
    this.frame = frame;
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

        startButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JToggleButton();
        jlTitle = new javax.swing.JLabel();
        optionsButton = new javax.swing.JButton();
        btnSupportMe = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)), "Project performed by Yoi2k", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 255, 51))); // NOI18N
        setForeground(new java.awt.Color(51, 255, 51));

        startButton.setBackground(new java.awt.Color(0, 255, 51));
        startButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        leaveButton.setBackground(new java.awt.Color(0, 0, 0));
        leaveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        leaveButton.setForeground(new java.awt.Color(255, 255, 255));
        leaveButton.setText("Leave");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 255, 102));
        jlTitle.setText("SNAKE GAME");
        jlTitle.setToolTipText("");
        jlTitle.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jlTitleComponentResized(evt);
            }
        });

        optionsButton.setBackground(new java.awt.Color(0, 255, 51));
        optionsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        optionsButton.setForeground(new java.awt.Color(255, 255, 255));
        optionsButton.setText("OPTIONS");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });

        btnSupportMe.setBackground(new java.awt.Color(255, 51, 51));
        btnSupportMe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupportMe.setForeground(new java.awt.Color(255, 255, 255));
        btnSupportMe.setText("SUPPORT ME!");
        btnSupportMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupportMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSupportMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leaveButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlTitle)
                                .addGap(67, 67, 67))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionsButton)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupportMe)
                    .addComponent(leaveButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        GamePanel gamePanel = new GamePanel(frame);
        frame.initBoard(gamePanel);
    }//GEN-LAST:event_startButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        // Display a confirmation dialog to the user
        int response = JOptionPane.showConfirmDialog(frame, "¿Are you sure you want to leave? :( ", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        
        // Check if the user selected "Yes"
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0); // If the user confirmed, exit the application
        }
    }//GEN-LAST:event_leaveButtonActionPerformed

    // Button for accesing to the Options Panel
    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        GameOptions gameOptions = new GameOptions(frame); // Create a new instance of the GameOptions class, passing the current frame as a parameter
        frame.initOptions(gameOptions); // Initialize the game options in the current frame by calling the initOptions method
    }//GEN-LAST:event_optionsButtonActionPerformed

    // Button for accesing to my personal linkPage (you can support me if you want) :)
    private void btnSupportMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupportMeActionPerformed

        // URL strings for portfolio and support page
        String myPortFolio = "https://linktr.ee/yoi2k"; // Link to the portfolio
        String SupportPage = "https://www.paypal.me/Yoi2k"; // Link to the support page

        // Try-catch block to handle potential exceptions during process execution
        try {
            // Initialization of the first process to open the portfolio link
            ProcessBuilder pbopenPortFolioCMD = new ProcessBuilder("cmd", "/c", "start", myPortFolio);

            // Execution of the first process to open the portfolio
            pbopenPortFolioCMD.start();

            // Pause for 0.5 seconds to allow the first process to initialize
            Thread.sleep(500); 

            // Initialization of the second process to open the support page link
            ProcessBuilder pbSupportDonoPageCMD = new ProcessBuilder("cmd", "/c", "start", SupportPage);

            // Execution of the second process to open the support page
            pbSupportDonoPageCMD.start();

        // Exception handling for IOException and InterruptedException
        } catch (IOException ex) {
            // Print an error message if there is an issue accessing the pages
            System.err.println("Accessing to Page Error: " + ex.getMessage());
        } catch (InterruptedException ex) {
            // Log an error if the sleep thread is interrupted
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupportMeActionPerformed

    private void jlTitleComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jlTitleComponentResized

    }//GEN-LAST:event_jlTitleComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSupportMe;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JToggleButton leaveButton;
    private javax.swing.JButton optionsButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
