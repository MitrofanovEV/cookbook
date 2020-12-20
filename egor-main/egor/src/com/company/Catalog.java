package com.company;

import java.util.ArrayList;

public class Catalog {

  private String name;
  private String description;
  private ArrayList<Recepie> recepies;
  //отношение агрегации к самому себе быть не может
   public String view (){return "";}
   public void addCatalog(){} //не должно поступать на вход ничего
   public void changeCatalog(String str) {}
}
