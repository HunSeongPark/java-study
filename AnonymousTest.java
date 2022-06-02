package anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Hunseong on 2022/06/02
 */
public class AnonymousTest {
    public static void main(String[] args) {

        Button b = new Button("Start");

        // Anonymous Class
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occured!");
            }
        });

        // Using Lambda
        b.addActionListener(e -> System.out.println("ActionEvent occured!"));
    }
}