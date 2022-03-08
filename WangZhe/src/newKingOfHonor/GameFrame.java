package newKingOfHonor;

import javax.swing.*;
import java.awt.*;

/**
 * @Author 李明
 * @Date 2022/3/8 21:49
 **/
public class GameFrame extends JFrame {
    //窗口尺寸
    private int windowWidth = 1400;
    private int windowHeight = 700;
    //游戏背景
    Background background = new Background(this);
    //launch方法初始化窗口
    public void launch(){
        //设置尺寸
        setSize(windowWidth,windowHeight);
        //窗口居中
        setLocationRelativeTo(null);
        //关闭事件
        setDefaultCloseOperation(3);
        //用户不能调整窗口大小
        setResizable(false);
        //窗口标题
        setTitle("叙利亚版王者荣耀");
        //窗口可见
        setVisible(true);
        //使用while循环来重绘窗口里的元素
        while (true){
            repaint();
            try{
                Thread.sleep(25);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g){
        background.paintSelf(g);
    }
    //main方法
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.launch();
    }
}
