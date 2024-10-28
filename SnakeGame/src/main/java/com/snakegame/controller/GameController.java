/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.snakegame.controller;

import javax.swing.Timer;
import com.snakegame.model.Food;
import com.snakegame.model.Snake;
import com.snakegame.view.GamePanel;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asier
 */
public final class GameController implements KeyListener {

    private Snake snake;
    private Food food;
    private GamePanel gamepanel;
    public Timer timer;
    private final int DELAY = 100; // Time delay in milliseconds between each game update
    private long startTime; // Stores the initial timer state
    private Timer gameTimer; // Timer that controls the periodic updates for the game state

    public GameController(GamePanel gamepanel) {
    this.gamepanel = gamepanel;
    this.snake = new Snake();
    this.food = new Food();
    this.startTime = System.currentTimeMillis();
    initListeners();
    startGame();
}
    private void initListeners() { 
    }
    
    // Method to initialize and start the game timer
    private void startGame() {
        // Records the current time in milliseconds as the start time of the game
        startTime = System.currentTimeMillis(); // Restarts the timer every time you execute or press "start"

        // Creates a new Timer instance that triggers an ActionEvent every DELAY milliseconds
        gameTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calls the method to update the game state
                updateGame();

                // Calculation of elapsed time since the game started
                long mselapsed = System.currentTimeMillis() - startTime; // Calculates the time elapsed in milliseconds

                // Formats the elapsed time into minutes and seconds
                long minutes = (mselapsed / 1000) / 60; // Calculates total minutes
                long seconds = (mselapsed / 1000) % 60; // Calculates remaining seconds

                // Calculates the milliseconds for the current second
                long milliseconds = mselapsed % 100;

                // Formats the time string as mm:ss:SS, ensuring two digits for each
                String timeString = String.format("%02d:%02d:%02d", minutes, seconds, milliseconds);

                // Updates the timer display in the game panel with the formatted time
                gamepanel.updateTimer(timeString);

                // Requests a repaint of the game panel to reflect any changes in the UI
                gamepanel.repaint();
            }
        });
        // Starts the timer, which begins the periodic execution of the ActionListener
        gameTimer.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void updateGame() {
        
    }
}

