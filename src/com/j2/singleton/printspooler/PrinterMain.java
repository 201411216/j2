package com.j2.singleton.printspooler;

public class PrinterMain{
  public static void main(String[] args){
    Printer printer1 = Printer.getPrinter();
    Printer printer2 = Printer.getPrinter();
  }
}