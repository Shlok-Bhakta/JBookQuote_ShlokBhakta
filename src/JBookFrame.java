import javax.swing.*;

public class JBookFrame extends JFrame {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("");
    JButton button = new JButton("Show Title");

    public JBookFrame() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);
        setTitle("My Favorite Book");

        add(label);
        add(button);
        setlayout(new FlowLayout());
        button.setToolTipText("Click to reveal Button");
        button.setSize(75, 25);
        label.setSize(200, 150);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

    }

}
