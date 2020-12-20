package com.company;

import java.util.Date;

public class WebRecepie extends Recepie{

 protected String name;
 protected String description;
 private Date addDate;
 private int downloadCounts;
 private int ccal;
 public String view(){return "";}


   public int change(String str) {return 1;}
   public int changeCatalog(Catalog catalog){return 1;}
}
