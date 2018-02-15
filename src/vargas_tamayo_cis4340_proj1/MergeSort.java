/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

import java.util.Objects;
import java.util.Random;




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
            temp.setNextLL(addON);
            
            //THE NEW LINKED LIST CREATED WILL HOLD THE PLACE OF TEMP 
            temp = temp.getNextLink();
        }
        
        
    }
    
    public void initMerge()
    {
        recMerge(LinkedChain,size);
    }
    
    private void recMerge(LinkedList curLL, int size)
    {
        //Indicates the middle
        int mid_line = (int)Math.ceil(size/2.0);
        
        int L_Size = mid_line;
        int R_Size = size - L_Size;
        
        LinkedList LeftSet = curLL;
        LinkedList RightSet = null;
        
        //LeftSet.setInteger(curLL.getInteger());
        
        LinkedList TempLink = LeftSet;
        
        //LeftSet.setInteger(curLL.getInteger());
        
        for(int i = 0; i < mid_line; i++)
        {
            //TempLink = TempLink.getNextLink();
            
            if( i + 1 == mid_line)
            {
                RightSet = TempLink;
                TempLink.setNextLL(null); 
                
                break;
            }
                
            if(TempLink.getNextLink() != null)
            {
                TempLink = TempLink.getNextLink();
            }
           
        }
        
        
        if(!(L_Size < 2))
        {
            recMerge(LeftSet,L_Size);   
        }
        
        if(!(R_Size < 2))
        {
            recMerge(RightSet,L_Size);
        
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    private void initSort(LinkedList Left_Set,int L_Size, LinkedList Right_Set, int R_Size)
    {
        LinkedList MainLink = new LinkedList();
        
        LinkedList temp_Link1 = Left_Set;
        
        LinkedList temp_Link2 = Right_Set;
        
        LinkedList temp_Link3 = MainLink;
        
        while(!(L_Size ==0) && !(R_Size == 0)  )
        {
            if(!temp_Link1.equals(null) && !temp_Link2.equals(null))
            {
                if(temp_Link1.getInteger() < temp_Link2.getInteger())
                {
                    temp_Link3.setInteger(temp_Link1.getInteger());
                    temp_Link3.setNextLL(new LinkedList());


                    temp_Link3 = temp_Link3.getNextLink();
                    temp_Link1 = temp_Link1.getNextLink();
                }
                else if(temp_Link1.getInteger() > temp_Link2.getInteger())
                {
                    temp_Link3.setInteger(temp_Link2.getInteger());
                    temp_Link3.setNextLL(new LinkedList());


                    temp_Link3 = temp_Link3.getNextLink();
                    temp_Link2 = temp_Link2.getNextLink();
                }
                else if(temp_Link1.getInteger() == temp_Link2.getInteger())
                {
                    MainLink.setInteger(temp_Link1.getInteger());
                    temp_Link3.setNextLL(new LinkedList());
                    temp_Link3 = temp_Link3.getNextLink();

                    MainLink.setInteger(temp_Link2.getInteger());
                    temp_Link3.setNextLL(new LinkedList());
                    temp_Link3 = temp_Link3.getNextLink();           
                }
            }
        }
        
    
    
    
    
    
    
    }
    
    
}
        
        
        
        
        
        
        
        
        
        
        
    
    
  
    
    
    
    
    

