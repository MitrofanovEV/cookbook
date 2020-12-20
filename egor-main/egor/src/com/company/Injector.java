package com.company;

public class Injector {

   public void create_UI(){
      PrivateCollection privateCollection= new PrivateCollection();
      MenagerMenuUI menagerMenuUI = new MenagerMenuUI();
      CommonCollection commonCollection = new CommonCollection();
      AddWebRacepie addWebRacepie = new AddWebRacepie();
      DownloadWebRecepie downloadWebRecepie = new DownloadWebRecepie();
      ChangeWebRecepie changeWebRecepie = new ChangeWebRecepie();

      menagerMenuUI.doIt();
      //addWebRacepie.doIt();
      //downloadWebRecepie.doIt();
      //changeWebRecepie.doIt();
   }
}
