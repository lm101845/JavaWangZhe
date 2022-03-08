package newKingOfHonor;

import java.awt.*;

/**
 * @Author 李明
 * @Date 2022/3/8 22:49
 **/
public abstract class GameObject {
    //创建游戏父类

    //坐标
    private int x;
    private int y;
    //图片
    Image img;
    //游戏界面
    GameFrame gameFrame;
    //构造函数
    public GameObject(GameFrame game){
        this.gameFrame = gameFrame;
    }
    public GameObject(GameFrame game,int x,int y){
        this.gameFrame = gameFrame;
        this.x = x;
        this.y = y;
    }

    //添加游戏矩形的方法
    public abstract Rectangle getRec();

    //添加绘制元素的方法
    public abstract void paintSelf(Graphics g);
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().createImage(img);
    }

    public GameFrame getGameFrame() {
        return gameFrame;
    }

    public void setGameFrame(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
    }

}
