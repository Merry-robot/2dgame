package me.merry;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400,400);
        mainWindow.setVisible(true);

        GamePanel gamePanel = new GamePanel();
        mainWindow.add(gamePanel);

        mainWindow.pack();
    }
}