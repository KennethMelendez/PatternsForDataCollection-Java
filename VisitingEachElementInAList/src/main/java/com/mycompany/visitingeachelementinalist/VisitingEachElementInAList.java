/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.visitingeachelementinalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kmlnd
 */
public class VisitingEachElementInAList {
    public static void main(String[] args) {
        
/*========================================
        
Patterns for Data Collection.
        
========================================*/
        
        
        List<String> stringList = new ArrayList<>();
        
        //add another String object to our list
        stringList.add("My First String");
        
        //add another String object to our list
        stringList.add("My Second String");
        
        //add another String object to our list
        stringList.add("My Third String");
        
        //add another String object to our list
        stringList.add("My Fourth String");
        
        //ask list how big the string is
        System.out.println("List size: " + stringList.size());
        
        
/*========================================
        
enhanced for loop
        
========================================*/        
        
        //Below is an example of an enhanced for loop
        //for each string current string/ grab string and operate on string on the body of the for loop
        for(String currentString : stringList) {
            System.out.println(currentString);
        }
        
/*========================================
        
using iterator
        
========================================*/     
        
        //Below does the same thing as up obove
        //Can solve problems in various ways
        
        //iterator pattern is a generaic type
        //asks for a iterator that holds strings
        
        
        Iterator<String>iterator = stringList.iterator();
        
        //as long as iterorator has one more thing to visit. Keep looping
        while(iterator.hasNext()){
            //declare string
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
