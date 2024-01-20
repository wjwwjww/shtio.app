import javax.swing.*;
import java.awt.*;

public class block {
    public static void main(String[] args) {
        frame a = new frame();
    }
}

class frame extends JFrame {
    JFrame a = new JFrame("a");
    Container b = a.getContentPane();
    JButton start = new JButton("start");

    JButton close = new JButton("close");

    ImageIcon icon = new ImageIcon("src/image.jpg");
    Image img = icon.getImage();
    int width = 980;
    int height = 1240;
    Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    ImageIcon iicon = new ImageIcon(newImg);
    JLabel label = new JLabel(iicon);

    public frame() {
        a.setLocation(1000, 1000);
        a.setSize(980, 1240);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();



        // 设置按钮透明
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);

        close.setOpaque(true);

        close.setContentAreaFilled(false);
        close.setBorderPainted(false);

        // 设置约束条件使组件居中
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        b.add(start);

        b.add(close);
        label.setBounds(0, 0, 980, 1240);
        a.getLayeredPane().add(label, -1);
        a.getLayeredPane().add(b, 0);
    }
}
