import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonControls extends JPanel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private DrawingComponent drawingComponent;

    public ButtonControls(DrawingComponent dc){
        button1 = new JButton("BLACK");
        button2 = new JButton("WHITE");
        button3 = new JButton("MOVE SQUARE");
        drawingComponent = dc;
    }

    public void setUpPanel(){
        setLayout(new GridLayout(1, 3));
        add(button1);
        add(button2);
        add(button3);
        ButtonListener buttonListener = new ButtonListener();
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            Object o = ae.getSource();
            if(o == button1){
                drawingComponent.setBackgroundColor(Color.BLACK);
            } else if (o == button2){
                drawingComponent.setBackgroundColor(Color.WHITE);
            } else if (o == button3){
                drawingComponent.getSquare().adjustX(5);
            }

            drawingComponent.repaint();
        }
    }


}
