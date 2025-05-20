package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    // attributes of class
   private ArrayList<T>collection;
   private int maxSize;
   //TODO:
   //This is my Constructor
    //Declaring/Defining Constructor
    // Inside the constructor I only put the data type then the variable
    //Parameter- is the input of the function/method
   public FixedList(
           int maxSize //this is the parameter
   ){
       this.maxSize = maxSize;
       collection = new ArrayList<>();

   }
//T is any generic item/ T represents a data type that's not explicitly defined, but shared across the class
    public void add(T item){
       if (collection.size() == maxSize)return;// return means exit early
       collection.add(item);
    }

    public int getMaxSize() {
        return maxSize;
    }
}
