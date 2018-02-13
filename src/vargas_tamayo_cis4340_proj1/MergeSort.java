/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class MergeSort 
{
    
    private LinkedList LinkedChain;
    private int size;
    
    
    public MergeSort(int size)
    {
        LinkedChain = new LinkedList();
        this.size = size;
        setUp();
    }
    
    private void setUp()
    {
        
        //ALLOWS RANDOM NUMBERS TO BE OUTPUTED
        Random rand = new Random();
        
        
        LinkedList temp = LinkedChain;
                
        //FOR LOOP IS USED TO CREATE A CHAIN OF LINK LIST AND ARE INITIALIZED WITH INTEGERS
        for(int i = 0; i < size; i++)
        {
            //RANDOM NUMBER GENERATED IN STORED IN THIS VARIABLE
            int num = rand.nextInt(100000);
            
            //NEW LINKED LIST IS CREATED AND THEN A INTEGER IS STORED
            LinkedList addON = new LinkedList();
            addON.setInteger(num);

            //CURRECT LINKED LIST SETS THE NEXT LINKED LIST VARIABLE WITH THE LINKED LIST CREATED
            temp.setLinkedList(addON);
            
            //THE NEW LINKED LIST CREATED WILL HOLD THE PLACE OF TEMP 
            temp = temp.getNextLink();
        }
        
        
    }
    
    public void initMerge()
    {
        recMerge(LinkedChain,size);
    }
    
    public void recMerge(LinkedList curLL, int size)
    {
        LinkedList LeftSet= new LinkedList();
        LinkedList RightSet =new LinkedList();
        
        LinkedList curTemp = curLL;
        
        int Low_Mid = (int) size / 2 ;
        int High_Mid = size - Low_Mid;
        
        
        
        
        LinkedList L_Temp = LeftSet;
        
        for(int i = 0; i < Low_Mid; i++)
        {
            
            L_Temp.setLinkedList(curTemp.getNextLink());
        
            curTemp = curTemp.getNextLink();
        }
        
        LinkedList H_Temp = RightSet;
        
        for(int i = High_Mid; i < size; i++)
        {
        
        
        }
        
        
        
        
        
    
    
    }
    
    
    
    
    
}
