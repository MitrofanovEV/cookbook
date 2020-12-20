package com.company;

import javax.swing.*;
import java.awt.*;

public class DownloadWebRecepie extends MenuCommand{


   public void doIt (){
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      panel.setLayout(null);

      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 270, 200);
      frame.setTitle("Download Web Recipe");

      panel.setBackground(Color.black);

      JButton DownloadButton = new JButton("Download Recipe");
      DownloadButton.setLocation(80, 50);
      DownloadButton.setSize(100, 50);

      DownloadButton.setBackground(Color.darkGray);
      DownloadButton.setForeground(Color.LIGHT_GRAY);
      panel.add(DownloadButton);


      DownloadButton.addActionListener(e -> {

         frame.dispose();


      });

      frame.setVisible(true);
      frame.setContentPane(panel);
   }
}
