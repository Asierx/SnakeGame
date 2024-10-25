package com.snakegame;

import javax.swing.SwingUtilities;
import com.snakegame.view.GameFrame;
import com.snakegame.view.Menu;

public class Main {
    public static void main(String[] args) {
        // Establecer la apariencia de Nimbus
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            GameFrame frame = new GameFrame();
            Menu menu = new Menu(frame);
            frame.showMenu(menu);
            frame.setVisible(true);
        });
    }
}