import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private int value;
    private int valueSaver = 0;
    private boolean valueSaverBul = false;

    public MyWindow(int initialValue)
    {
        setBounds(500, 500, 500, 320);
        setTitle("Java Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton descrement = new JButton("<");
        descrement.setFont(font);
        add(descrement, BorderLayout.WEST);

        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        JButton obNull = new JButton("Обнуление");
        obNull.setFont(font);
        add(obNull, BorderLayout.NORTH);

        JButton saveButton = new JButton("SAVE");
        saveButton.setFont(font);
        add(saveButton, BorderLayout.SOUTH);

        descrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 1;
                counterValueView.setText(String.valueOf(value));
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 1;
                counterValueView.setText(String.valueOf(value));
            }
        });

        obNull.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(valueSaver != value)
                {
                    if(valueSaverBul == false)
                    {
                        valueSaverBul = true;
                        valueSaver = value;
                        return;
                    } else {
                        valueSaverBul = false;
                        value = valueSaver;
                        counterValueView.setText(String.valueOf(value));
                        return;
                    }
                }
            }
    });

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyWindow(0);
    }
}
