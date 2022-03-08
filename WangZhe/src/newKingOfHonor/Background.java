package newKingOfHonor;

import java.awt.*;

/**
 * @Author 李明
 * @Date 2022/3/8 22:32
 **/
public class Background extends GameObject{
    Image bg = Toolkit.getDefaultToolkit().getImage("img/Map.jpg");

    public Background(GameFrame game) {
        super(game);
    }
    //编写绘制方法
    public void paintSelf(Graphics g){
        g.drawImage(bg,0,0,null);
    }

    @Override
    public Rectangle getRec() {
        return null;
    }
}

