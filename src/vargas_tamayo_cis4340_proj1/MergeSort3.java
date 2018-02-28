/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author fathe
 */
public class MergeSort3 
{
    private LinkedList LinkedChain;
    private int size;
    
    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018
    public MergeSort3(int size)
    {
        LinkedChain = new LinkedList();
        this.size = size;
        setUp();
    }

    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018    
    private void setUp()
    {
        
        //ALLOWS RANDOM NUMBERS TO BE OUTPUTED
        Random rand = new Random();
        
        
        LinkedList temp = LinkedChain;
        
        System.out.println("[4,1,3,10,10,7,2,6,8,10]\n");
        
        temp.setInteger(4);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(1);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(3);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(10);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(10);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
       
        temp.setInteger(7);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(2);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
        
        temp.setInteger(6);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();
       
        temp.setInteger(8);
        temp.setNextLL(new LinkedList());
        temp = temp.getNextLink();        
        
        temp.setInteger(10);   
       
        
        
//                
////        //FOR LOOP IS USED TO CREATE A CHAIN OF LINK LIST AND ARE INITIALIZED WITH INTEGERS
//        for(int i = 0; i < size; i++)
//        {
//            //RANDOM NUMBER GENERATED IN STORED IN THIS VARIABLE
//            int num = rand.nextInt(100); //100000
//            
//            //NEW LINKED LIST IS CREATED AND THEN A INTEGER IS STORED
//            LinkedList addON = new LinkedList();
//            addON.setInteger(num);
//
//            //CURRECT LINKED LIST SETS THE NEXT LINKED LIST VARIABLE WITH THE LINKED LIST CREATED
//            temp.setNextLL(addON);
//            
//            //THE NEW LINKED LIST CREATED WILL HOLD THE PLACE OF TEMP 
//            temp = temp.getNextLink();
//        }
//        
        
    }

    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018    
    public void initMerge()
    {
        LinkedList ttf = recMerge(LinkedChain,size);
        
  ////////////////////////////////////////////////////////////      
        String all = "\n\n[ ";
        
        while(ttf != null)
        {
            all += ttf.getInteger() + " ";
            
            ttf = ttf.getNextLink();
        
        }
        
        System.out.println(all + "] ");
   ////////////////////////////////////////////////////////////     
        
    }

    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018    
    private LinkedList recMerge(LinkedList curLL, int size)
    {
        LinkedList MainLink = null;
        
        System.out.println("\nTotal Size: " + size);
        int L_Size = (int)Math.ceil(size/3.0);   System.out.println("L_Size: " + L_Size);
        int M_Size = (int)Math.ceil(((size-L_Size)/2.0)); System.out.println("M_Size: " + M_Size);
        int R_Size = size - (M_Size + L_Size);     System.out.println("R_Size: " + R_Size);
            
        LinkedList LeftSet = new LinkedList();
        LinkedList MiddleSet = new LinkedList();    
        LinkedList RightSet = new LinkedList();
        
        LinkedList L_TempLink = LeftSet;
        LinkedList M_TempLink = MiddleSet;     
        LinkedList R_TempLink = RightSet;

        
       for(int i = 0; i < size ; i++)
       {
           if(i < L_Size)
           {        
               L_TempLink.setInteger(curLL.getInteger());
               
               if(i + 1 != L_Size)
               {
                   L_TempLink.setNextLL(new LinkedList());
                   L_TempLink = L_TempLink.getNextLink();   
               }
               curLL = curLL.getNextLink();  
           }
           else if( i >= L_Size && i < (L_Size + M_Size))
           {
               M_TempLink.setInteger(curLL.getInteger());
               
               if(i + 1 != (L_Size + M_Size))
               {
                   M_TempLink.setNextLL(new LinkedList());
                   M_TempLink = M_TempLink.getNextLink();
               }
               curLL =curLL.getNextLink();
           }
           else if(i >= M_Size)
           {
               R_TempLink.setInteger(curLL.getInteger());
               
               if(i + 1 != size)
               {
                   R_TempLink.setNextLL(new LinkedList());
                   R_TempLink = R_TempLink.getNextLink();
                   curLL = curLL.getNextLink();
               }  
           }
       } 
/////////////////////////////////////////////////////////////////////////////       
        L_TempLink = LeftSet;
        M_TempLink = MiddleSet;     
        R_TempLink = RightSet;
        
        String num = "";
        
       while(L_TempLink != null)
       {
           num += L_TempLink.getInteger() + " ";
           L_TempLink = L_TempLink.getNextLink();
       }
        System.out.println("L: " + num);
       num = "";       
       while(M_TempLink != null)
       {
           num += M_TempLink.getInteger()+ " ";
           M_TempLink = M_TempLink.getNextLink();       
       
       }     
       System.out.println("M: " + num);
       num = "";        
       while(R_TempLink != null)
       {
           num += R_TempLink.getInteger()+ " ";
           R_TempLink = R_TempLink.getNextLink();      
       
       }
       System.out.println("R: " + num);
       num = "";       
       
       
 //////////////////////////////////////////////////////
 System.out.println("\nRecursion \n");
       
       
       
       
       
       
       
       
       
        
        if(L_Size >= 2)
        {
            LeftSet = recMerge(LeftSet,L_Size);          
        }
        
        if(M_Size >= 2)
        {
            MiddleSet = recMerge(MiddleSet,M_Size);
        }
        
        if(R_Size >= 2)
        {
            RightSet = recMerge(RightSet,R_Size);
        }
        
        MainLink = initSort(LeftSet,L_Size,MiddleSet,M_Size,RightSet,R_Size);
        
        return MainLink;
    }

    //Method Name: 
    //Purpose: 
    //Parameter: 
    //Method Input: 
    //Return Value:
    //Date: 2/27/2018
    private LinkedList initSort(LinkedList Left_Set,int L_Size,LinkedList Middle_Set,int M_Size, LinkedList Right_Set, int R_Size)
    {
        System.out.println("\nInitial Sort");
        System.out.println("L: " + L_Size);
        System.out.println("M: " + M_Size);
        System.out.println("R: " + R_Size);
        
        
        LinkedList MainLink = new LinkedList();
        LinkedList temp_Link = MainLink;
        
        while(L_Size !=0 && (M_Size != 0 && R_Size !=0))
        { 
            if(Left_Set.getInteger() < Middle_Set.getInteger())
            {
                if(Left_Set.getInteger() < Right_Set.getInteger())
                {
                    temp_Link.setInteger(Left_Set.getInteger());
                    
                    if(L_Size - 1 > 0 || M_Size > 0 || R_Size > 0)
                    {
                        temp_Link.setNextLL(new LinkedList());
                        temp_Link = temp_Link.getNextLink();
                    }

                    Left_Set = Left_Set.getNextLink();      
                    L_Size--;
                }
            }
            else if(Middle_Set.getInteger() < Right_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                if(M_Size - 1 > 0 || L_Size > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }

                Middle_Set = Middle_Set.getNextLink();      
                M_Size--;            
            }
            else
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(R_Size - 1 > 0 || L_Size > 0 || M_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }

                Right_Set = Middle_Set.getNextLink();      
                R_Size--;              
            }
        }
        
        while(L_Size !=0 && (M_Size != 0 && R_Size == 0))
        {
            if(Left_Set.getInteger() < Middle_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || M_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();

                    Left_Set = Left_Set.getNextLink();
                }

                L_Size--;

            }
            else if(Left_Set.getInteger() > Middle_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                if(L_Size > 0 || M_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Middle_Set = Middle_Set.getNextLink();
                }

                M_Size--;

            }
            else if(Left_Set.getInteger() == Middle_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());

                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Left_Set = Left_Set.getNextLink();

                L_Size--;

                temp_Link.setInteger(Middle_Set.getInteger());

                if(L_Size > 0 || M_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 

                    Middle_Set = Middle_Set.getNextLink();
                }

                M_Size--;     
            }
        }

        //L_Size !=0 && (M_Size == 0 && R_Size != 0)
        while(L_Size !=0 && (M_Size == 0 && R_Size != 0))
        {
            if(Left_Set.getInteger() < Right_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();

                    Left_Set = Left_Set.getNextLink();
                }

                L_Size--;

            }
            else if(Left_Set.getInteger() > Right_Set.getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                }

                R_Size--;

            }
            else if(Left_Set.getInteger() == Right_Set.getInteger())
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

                    Right_Set = Right_Set.getNextLink();
                }

                R_Size--;     
            }
        }
        
        //L_Size ==0 && (M_Size != 0 && R_Size != 0
        while(L_Size ==0 && (M_Size != 0 && R_Size != 0))
        {
            if(Middle_Set.getInteger() < Right_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                if(M_Size - 1 > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();

                    Middle_Set = Middle_Set.getNextLink();
                }

                M_Size--;

            }
            else if(Middle_Set.getInteger() > Right_Set.getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                }

                R_Size--;

            }
            else if(Middle_Set.getInteger() == Right_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Middle_Set = Middle_Set.getNextLink();

                M_Size--;

                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 

                    Right_Set = Right_Set.getNextLink();
                }

                R_Size--;     
            }
        }        
        
        //L_Size !=0 && (M_Size == 0 && R_Size == 0
        while(L_Size !=0 && (M_Size == 0 && R_Size == 0))
        {
            if(L_Size - 1 == 0)
            {
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Left_Set = Left_Set.getNextLink();
                
                L_Size--;  
            }
            else if(Left_Set.getInteger() < Left_Set.getNextLink().getInteger())
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
            else if(Left_Set.getInteger() == Left_Set.getNextLink().getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Left_Set = Left_Set.getNextLink();
                L_Size--;
                /////////////////////////////////////////////////
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Left_Set = Left_Set.getNextLink();
                L_Size--;                
            }   
        }

        while(L_Size ==0 && (M_Size != 0 && R_Size == 0))
        {
            if(M_Size - 1 == 0)
            {
                temp_Link.setInteger(Middle_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Middle_Set = Middle_Set.getNextLink();

                M_Size--;  
            }
            else if(Middle_Set.getInteger() < Middle_Set.getNextLink().getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;
            }
            else if(Middle_Set.getInteger() > Middle_Set.getNextLink().getInteger())
            {

                temp_Link.setInteger(Middle_Set.getNextLink().getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Middle_Set.setNextLL(Middle_Set.getNextLink().getNextLink());
                M_Size--;
            }
            else if(Middle_Set.getInteger() == Middle_Set.getNextLink().getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;
                /////////////////////////////////////////////////
                temp_Link.setInteger(Middle_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;                
            }
            
        }        
        
        while(L_Size ==0 && (M_Size == 0 && R_Size != 0))
        {
            if(R_Size - 1 == 0)
            {
                temp_Link.setInteger(Right_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Right_Set = Right_Set.getNextLink();
                
                R_Size--;  
            }
            else if(Right_Set.getInteger() < Right_Set.getNextLink().getInteger())
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
            else if(Right_Set.getInteger() == Right_Set.getNextLink().getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Right_Set = Right_Set.getNextLink();
                R_Size--;
                /////////////////////////////////////////////////
                temp_Link.setInteger(Right_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Right_Set = Right_Set.getNextLink();
                R_Size--;                
            }
            
        }
        
        /////////////////
        
        System.out.println("\nSorted");
        
        temp_Link = MainLink;
        
        String num = "";
        
        while(temp_Link != null)
        {
            num += temp_Link.getInteger() + " ";
            temp_Link = temp_Link.getNextLink();
        }
        
        System.out.println(num);
        
        
        
        
        
        
        
    
        return MainLink;
        
        
        
        
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
}
