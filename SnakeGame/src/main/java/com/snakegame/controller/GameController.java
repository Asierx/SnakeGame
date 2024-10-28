/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.snakegame.controller;

import javax.swing.Timer;
import com.snakegame.model.Food;
import com.snakegame.model.Snake;
import com.snakegame.view.GamePanel;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author asier
 */
public final class GameController implements KeyListener {

    private Snake snake;
    private Food food;
    private GamePanel gamepanel;
    private Timer timer;

    public GameController(GamePanel gamepanel) {
        this.gamepanel = gamepanel;
        this.snake = new Snake();
        this.food = new Food();
        initListeners();
        startGame();
    }
    private void initListeners() {
       
        
    }
    
    public void startGame() {
        
    }

    private void updateGame() {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }

