package com.j2.singleton.printspooler;

class Printer{
  private static Printer uniquePrinter = new Printer();
  private static String print = "Unique printer activate";
  private Printer(){}
  public static Printer getPrinter(){
    System.out.println(print);
    return uniquePrinter;
  }
}