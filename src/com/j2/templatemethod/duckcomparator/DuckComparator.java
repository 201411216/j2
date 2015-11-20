package com.j2.templatemethod.duckcomparator;
import java.util.*;

public class DuckComparator implements Comparator<Duck>{
  public int compare(Duck d1, Duck d2){
    return d1.compareTo(d2);
  }
}