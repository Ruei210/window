package com.ruei;

import java.util.Random;

public class Snow extends Thread{
    Random random = new Random();
    int x = random.nextInt(600);
    int y = random.nextInt(400);
    SnowCanvas parent;
    public Snow(SnowCanvas parent) {
        this.parent = parent;
    }
    public void run(){
        for (int i = 0; i < 250; i++) {
            int direction = random.nextInt(3)-1;
            x = x + direction;
            y = y + 1;
            parent.repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
