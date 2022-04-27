import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("");
    JButton button = new JButton();
    int state = 0;

    public JBookFrame() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setTitle("My Favorite Book");
        this.setLayout(new GridLayout(2, 1));
        
        /* Label Stuff */ {
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setText("In the light of the moon, a little egg lay on a leaf.");
            label.setSize(200, 150);
        }
        /* Button Stuff */ {
            button.setText("Reveal Title");
            button.setToolTipText("Click to reveal Button");
            button.setLayout(new FlowLayout(FlowLayout.CENTER));
            
        }

        this.add(label);
        this.add(button);


        button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(state == 0){
            String title = "The Very Hungry Caterpillar";
            button.setText("Hide Title");
            label.setText(title);
            state = 1;
        }
         else{
            String title = "In the light of the moon, a little egg lay on a leaf.";
            button.setText("Reveal Title");
            label.setText(title);
            state = 0;
        } 

    }

}
