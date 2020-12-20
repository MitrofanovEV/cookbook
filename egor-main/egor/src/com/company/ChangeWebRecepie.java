package com.company;

import javax.swing.*;
import java.awt.*;

public class ChangeWebRecepie extends MenuCommand {


   public void doIt (){
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      panel.setLayout(null);

      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 270, 200);
      frame.setTitle("Change Web Recipe");

      panel.setBackground(Color.black);

      JButton OperationButton = new JButton("Change Recipe");
      OperationButton.setLocation(80, 50);
      OperationButton.setSize(100, 50);

      OperationButton.setBackground(Color.darkGray);
      OperationButton.setForeground(Color.LIGHT_GRAY);
      panel.add(OperationButton);


      OperationButton.addActionListener(e -> {

         frame.dispose();


      });

      frame.setVisible(true);
      frame.setContentPane(panel);
   }
}
