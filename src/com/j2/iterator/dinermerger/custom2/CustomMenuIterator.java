package com.j2.iterator.dinermerger.custom;

public class CustomMenuIterator implements Iterator{
  MenuItem[] items;
  int position = 0;
  public CustomMenuIterator(MenuItem[] items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position>=items.length || items[position] == null){
      return false;
    }
    else{
      return true;
    }
  }
  public Object next(){
    MenuItem menuItem = items[position];
    position+=1;
    return menuItem;
  }
}
  