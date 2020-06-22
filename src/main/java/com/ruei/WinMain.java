package com.ruei;

import javax.swing.*;

public class WinMain extends JFrame {
    public WinMain(){                 //建構值
        setSize(300,200);
        SnowCanvas canvas = new SnowCanvas();
        JPanel panel = new JPanel();  //panel面板
        JButton button = new JButton("Press");
        panel.add(button);
        add(canvas);  //顯示在window
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {   //main方法才能執行
        new WinMain();
    }
}