/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

//Class name: LinkedList
//Class Author: Luis E. Vargas Tamayo
//Purpose of the class: Basic used of data structure linkedlist
//Date: 11/13/2017
//List of changes with dates: none
//Special Notes: none
public class LinkedList 
{
    private int Integer;
    private LinkedList  nextLL;
    /* 
    Method Name: getInteger()
    Method Inputted: none
    Parameters: none
    Purpose: returns private class variable
    Return: string
    Date:  11/13/2017
    */ 
    public Integer getInteger(){return Integer;}  
    
    /* 
    Method Name: getNextLink()
    Method Inputted: none
    Parameters: none
    Purpose: returns private class variable
    Return: LinkList
    Date:  11/13/2017
    */ 
    public LinkedList getNextLink(){return nextLL;} 
    
    /* 
    Method Name: setInteger()
    Method Inputted: none
    Parameters: String
    Purpose: places a new value on private variable
    Return: none
    Date:  11/13/2017
    */ 
    public void setInteger(Integer Integer){this.Integer = Integer;} 
    
    /* 
    Method Name: setLinkList()
    Method Inputted: none
    Parameters: LinkList
    Purpose: places a new value on private variable
    Return: none
    Date:  11/13/2017
    */ 
    public void setNextLL(LinkedList link) {this.nextLL = link;}
    
    



    
}
