package com.j2.adapter.iteratorenumeration;

import java.util.*;

public class TestDrive {
 public static void main (String args[]) {
  Vector v = new Vector(3);
  v.add(138);
  v.add(342);
  v.add(539);
  Enumeration enumeration = new IteratorEnumeration(v.iterator());
  System.out.println("iterator -> enumeration :");
  while (enumeration.hasMoreElements()) {
    System.out.println(enumeration.nextElement());
  }
  Iterator iterator = new EnumerationIterator(v.elements());
  System.out.println("enumerationiterator -> iterator :");
  while (iterator.hasNext()) {
   System.out.println(iterator.next());
  }
 }
}