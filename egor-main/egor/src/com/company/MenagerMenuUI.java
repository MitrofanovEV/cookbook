package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenagerMenuUI {
private PrivateCollection privateCollection;
private CommonCollection commonCollection;
  private ArrayList<MenuCommand> menuCommand;

  public void doIt() {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setLayout(null);

    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();
    frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 270, 200);
    frame.setTitle("Manager Menu ");

    panel.setBackground(Color.black);

    JButton AddButton = new JButton("Add Recipe");
    AddButton.setLocation(20, 10);
    AddButton.setSize(100, 50);

    AddButton.setBackground(Color.darkGray);
    AddButton.setForeground(Color.LIGHT_GRAY);
    panel.add(AddButton);


    AddButton.addActionListener(e -> {

      frame.dispose();
      AddWebRacepie addWebRacepie = new AddWebRacepie();
      addWebRacepie.doIt();


    });

    JButton DownloadButton = new JButton("Download Recipe");
    DownloadButton.setLocation(140, 10);
    DownloadButton.setSize(100, 50);

    DownloadButton.setBackground(Color.darkGray);
    DownloadButton.setForeground(Color.LIGHT_GRAY);
    panel.add(DownloadButton);


    DownloadButton.addActionListener(e -> {

      frame.dispose();
      DownloadWebRecepie downloadWebRecepie = new DownloadWebRecepie();
      downloadWebRecepie.doIt();


    });

    JButton ChangeButton = new JButton("Change Recipe");
    ChangeButton.setLocation(80, 100);
    ChangeButton.setSize(100, 50);

    ChangeButton.setBackground(Color.darkGray);
    ChangeButton.setForeground(Color.LIGHT_GRAY);
    panel.add(ChangeButton);


    ChangeButton.addActionListener(e -> {

      frame.dispose();
      ChangeWebRecepie changeWebRecepie = new ChangeWebRecepie();
      changeWebRecepie.doIt();


    });

    frame.setVisible(true);
    frame.setContentPane(panel);

  }
}
