package com.example.cynth.editlist;

import java.util.ArrayList;

public class List {
    static ArrayList<String> theList = new ArrayList<>();

    // make methods to call in other classes
    public static String viewList() {
        String strList = "";
        for(int i = 0; i < theList.size(); i++) {
            strList += (i+1) + "." + theList.get(i) + "\n";
        }
        return strList;
    }

    // these methods can use methods from the arraylist java library
    //add method
    public static void addToList(String t) {
        theList.add(t);
    }

    public static void removefromList(int i) { theList.remove(i); }

    //public static int getSize() { return theList.size(); }

    public static void clearList() { theList.clear(); }

    public static String pickRandom() { //will return a String of the thing picked
        return theList.get((int)(theList.size()*Math.random())); // gets random person, cast int
    }
}
