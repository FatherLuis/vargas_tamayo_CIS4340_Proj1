/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

import java.util.Objects;
import java.util.Random;


//Class name: MergeSort
//Class Author: Luis E. Vargas Tamayo
//Purpose of the class: Use Merge Sort on two linkedlist, sort LinkedList in Ascending Order
//Date: 2/27/2018
//List of changes with dates:
//Special Notes:
public class MergeSort 
{
    //HOLDS THE ENTIRE RANDOMIZED INTEGER LINKEDLIST
    private LinkedList LinkedChain;
    //HOLDS THE SIZE OF THE LINKEDCHAIN
    private int size;
    
    //Method Name: MergeSort()
    //Purpose: Constructor
    //Parameter: int size
    //Method Input: setUp();
    //Return Value: none
    //Date: 2/27/2018
    public MergeSort(int size)
    {
        //INSTANTIATES LINKEDLIST
        LinkedChain = new LinkedList();
        //STORES SIZE
        this.size = size;
        //GENERATES THE RANDOM INTEGERS AND PUTS EACH ON A LINKEDLIST
        setUp();
    }

    //Method Name: setUp;
    //Purpose: Generates random integers and puts each on a linkedlist
    //Parameter: none
    //Method Input: none
    //Return Value: none
    //Date: 2/27/2018    
    private void setUp()
    {
        //ALLOWS RANDOM NUMBERS TO BE OUTPUTED
        Random rand = new Random();
        //REFERENCE VARIABLE FOR LINKEDCHAIN
        LinkedList temp = LinkedChain;
       //FOR LOOP IS USED TO CREATE A CHAIN OF LINK LIST AND ARE INITIALIZED WITH INTEGERS
        for(int i = 0; i < size; i++)
        {
            //RANDOM NUMBER GENERATED IN STORED IN THIS VARIABLE
            int num = rand.nextInt(100000); //100000           
            //NEW LINKED LIST IS CREATED AND THEN A INTEGER IS STORED
            LinkedList addON = new LinkedList();
            addON.setInteger(num);
            //CURRECT LINKED LIST SETS THE NEXT LINKED LIST VARIABLE WITH THE LINKED LIST CREATED
            temp.setNextLL(addON);
            //THE NEW LINKED LIST CREATED WILL HOLD THE PLACE OF TEMP 
            temp = temp.getNextLink();
        }
    }

    //Method Name: initMerge()
    //Purpose: Begins the process of merge sort 
    //Parameter: none
    //Method Input: recMerge
    //Return Value: none
    //Date: 2/27/2018    
    public void initMerge()
    { 
        //LINKEDLIST LINKEDCHAIN IS SORTED AND STORED IN TTF.
        LinkedList ttf = recMerge(LinkedChain,size);
    }

    //Method Name: recMerge()
    //Purpose: Recursion method allows the linkedlist to be split into smaller linkedlist and then sorted
    //Parameter: LinkedList curLL, int size
    //Method Input: initSort()
    //Return Value: LinkedList
    //Date: 2/27/2018    
    private LinkedList recMerge(LinkedList curLL, int size)
    {
        //MAIN LINKEDLIST INSTANTIZES
        LinkedList MainLink = null;
        
        //Indicates the middle
        int mid_line = (int)Math.ceil(size/2.0);
        
        int L_Size = mid_line;
        int R_Size = size - L_Size;
        
        LinkedList LeftSet = new LinkedList();
        
        
        LinkedList RightSet = new LinkedList();
        
        //LeftSet.setInteger(curLL.getInteger());
        
        LinkedList TempLink = LeftSet;
        
        LinkedList TempLink2 = RightSet;
        
        //LeftSet.setInteger(curLL.getInteger());
        
        for(int i = 0; i < mid_line; i++)
        {
                
                TempLink.setInteger(curLL.getInteger());

                
                if(i +1 != mid_line)
                {
                    TempLink.setNextLL(new LinkedList());
                    TempLink = TempLink.getNextLink();
                }
                
                

            if( i + 1 == mid_line)
            {
                //FIGURE OUT A WAY TO ITERATE THROUGH THE LINKS
                
                size--;
                while(size != 0)
                {
                    curLL = curLL.getNextLink();
                    
                    TempLink2.setInteger(curLL.getInteger());
                    
                    if(size - 1 != 0)
                    {
                        TempLink2.setNextLL(new LinkedList());                   
                    }
                    
                    TempLink2 = TempLink2.getNextLink();

                    size--;

                }
                
                //TempLink2 = null;
                
                break;
            }
            
                
            if(curLL.getNextLink() != null)
            {
                curLL = curLL.getNextLink();
                size--;
            }
           
        }    
        
        if(L_Size >= 2)
        {
            LeftSet = recMerge(LeftSet,L_Size);
        }
        
        if(R_Size >= 2)
        {
            RightSet = recMerge(RightSet,R_Size);
        }
        
        MainLink = initSort(LeftSet,L_Size,RightSet,R_Size);
        
        
        
        return MainLink;
  
    }

    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018
    private LinkedList initSort(LinkedList Left_Set,int L_Size, LinkedList Right_Set, int R_Size)
    {
        LinkedList MainLink = new LinkedList();
        
        LinkedList temp_Link= MainLink;
        
        
        while(L_Size !=0 && R_Size !=0)
        {
            if(Left_Set.getInteger() < Right_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();
                }
                
                Left_Set = Left_Set.getNextLink();  
                L_Size--;

            }
            else if(Left_Set.getInteger() > Right_Set.getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }
                Right_Set = Right_Set.getNextLink();
                R_Size--;

            }
            else if(Objects.equals(Left_Set.getInteger(), Right_Set.getInteger()))
            {
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Left_Set = Left_Set.getNextLink();
                L_Size--;

                temp_Link.setInteger(Right_Set.getInteger());

                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 
                }
                Right_Set = Right_Set.getNextLink();
                R_Size--;     
            }
        }
        
        while(L_Size !=0)
        {
            if(L_Size - 1 > 0)
            {             
                if(Left_Set.getInteger() < Left_Set.getNextLink().getInteger())
                {
                    temp_Link.setInteger(Left_Set.getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Left_Set = Left_Set.getNextLink();
                    L_Size--;
                }
                else if(Left_Set.getInteger() > Left_Set.getNextLink().getInteger())
                {

                    temp_Link.setInteger(Left_Set.getNextLink().getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Left_Set.setNextLL(Left_Set.getNextLink().getNextLink());
                    L_Size--;
                }
                else if(Objects.equals(Left_Set.getInteger(), Left_Set.getNextLink().getInteger()))
                {
                    temp_Link.setInteger(Left_Set.getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Left_Set = Left_Set.getNextLink();
                    L_Size--;
                    ///////////////////////////////////////////////
                    temp_Link.setInteger(Left_Set.getInteger());
                    
                    if(L_Size - 1 > 0)
                    {
                        temp_Link.setNextLL(new LinkedList());
                        temp_Link = temp_Link.getNextLink();
                    }

                    Left_Set = Left_Set.getNextLink();
                    L_Size--;                
                }                   
            }
            else if(L_Size == 1)
            {
                temp_Link.setInteger(Left_Set.getInteger());       
                Left_Set = Left_Set.getNextLink();
                L_Size --;

            }
 
        }
        
        while(R_Size != 0)
        {            
            if(R_Size -1 > 0)
            {
                if(Right_Set.getInteger() < Right_Set.getNextLink().getInteger())
                {
                    temp_Link.setInteger(Right_Set.getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                    R_Size--;
                }
                else if(Right_Set.getInteger() > Right_Set.getNextLink().getInteger())
                {

                    temp_Link.setInteger(Right_Set.getNextLink().getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Right_Set.setNextLL(Right_Set.getNextLink().getNextLink());
                    R_Size--;
                }
                else if(Objects.equals(Right_Set.getInteger(), Right_Set.getNextLink().getInteger()))
                {
                    temp_Link.setInteger(Right_Set.getInteger());
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                    R_Size--;
                    /////////////////////////////////////////////////
                    temp_Link.setInteger(Right_Set.getInteger());
                    
                    if(R_Size - 1 > 0)
                    {
                        temp_Link.setNextLL(new LinkedList());
                        temp_Link = temp_Link.getNextLink();
                    }
                    
                    Right_Set = Right_Set.getNextLink();
                    R_Size--;                
                }        
            }
            else
            {
                temp_Link.setInteger(Right_Set.getInteger());
                R_Size--;
            
            }
        }
        
        return MainLink;
        
        
        
        
    }
    
    
    
    
    
        
    
    
    
    
    
    
    }
    
    

        
        
        
        
        
        
        
        
        
        
        
    
    
  
    
    
    
    
    

