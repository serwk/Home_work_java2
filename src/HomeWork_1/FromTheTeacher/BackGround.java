package HomeWork_1.FromTheTeacher;

import java.awt.*;

public class BackGround {
    GameCanvas canvas;

    BackGround(GameCanvas c){
        canvas = c;
    }

    void setBackground(){
        Color color = new Color(
                (int)(Math.random() * 255),
                (int)(Math.random() * 255),
                (int)(Math.random() * 255)
        );
        canvas.setBackground(color);
    }
}
