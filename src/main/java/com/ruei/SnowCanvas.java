package com.ruei;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowCanvas extends Canvas {
    List<Snow> snows = new ArrayList<Snow>();
    public SnowCanvas(){
        for (int i = 0; i < 50; i++) {
            Snow snow = new Snow(this);
            snow.start();
            snows.add(snow);
        }
        setBackground(Color.pink);
    }

    public void  paint(Graphics g){
        g.drawString("Brunch",30,30);
        g.drawLine(30,40,90,40);
        for(Snow snow : snows){
            g.setColor(Color.WHITE);
            g.drawString("魚",snow.x,snow.y);
        }
    }

}
