package com.company;

import java.util.ArrayList;

public class CommonCollection {

   private ArrayList<ErrorMessage> errorMessages;
   private Criteries criteries;
   private ArrayList<Recepies> recepies;
   private ArrayList<WebRecepie> webRecepies;
   private PrivateCollection privateCollection;
  public WebRecepie changeWebRecepie(){return new WebRecepie();}
  public void downloadRecepie(WebRecepie webRecepie){}
  public void addErrorMessage(){}
  public void searchForCriteries(){}
  public void chooseCriteries(){}
  public ArrayList<Criteries> search(){return new ArrayList<>();}
  public void doStatistics(WebRecepie webRecepie){}
}
