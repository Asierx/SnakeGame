/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.snakegame.controller;

import javax.swing.Timer;
import com.snakegame.model.Food;
import com.snakegame.model.Snake;
import com.snakegame.view.GamePanel;

/**
 *
 * @author asier
 */
public class GameController {

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
   }

