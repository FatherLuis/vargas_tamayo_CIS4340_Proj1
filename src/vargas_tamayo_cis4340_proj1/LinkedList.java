/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

/**
 *
 * @author fathe
 */
public class LinkedList 
{

    private int Integer;
    private LinkedList  nextLL;
    
    
    
    
    /* 
    Method Name: getTerm()
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
    Method Name: setTerm()
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
    public void setLinkedList(LinkedList link) {this.nextLL = link;}
    
    



    
}
