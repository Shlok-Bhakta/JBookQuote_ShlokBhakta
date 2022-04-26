import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookFrame extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("");
    JButton button = new JButton();

    public JBookFrame(String text) {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setTitle("My Favorite Book");
        this.setLayout(new FlowLayout());

        /* Label Stuff */ {
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setText(text);
            label.setSize(200, 150);
        }
        /* Button Stuff */ {
            button.setText("Reveal Title");
            button.setToolTipText("Click to reveal Button");
            button.setLayout(new FlowLayout(FlowLayout.CENTER));
        }

        this.add(label);
        this.add(button);

    }
    
    public void buttonClickChanged(ActionEvent event) {


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
