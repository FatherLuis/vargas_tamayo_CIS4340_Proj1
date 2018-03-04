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
//List of changes with dates: none
//Special Notes: Code would look cleaner and smaller if i would have put repeated code in methods
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
        
        //CALCULATES THE HALF OF THE SIZE
        int mid_line = (int)Math.ceil(size/2.0);
     
        //INSTANTIATES LEFTSET
        LinkedList LeftSet = new LinkedList();
        //INSTANTIATES RIGHTSET
        LinkedList RightSet = new LinkedList(); 
        
        //INITIALIZES THE LEFTSET SIZE
        int L_Size = mid_line;
        //INITIALIZES THE RIGHTSET SIZE
        int R_Size = size - L_Size;

        //REFERENCE VARIABLE FOR LEFTSET
        LinkedList TempLink = LeftSet;
        //REFERENCE VARIABLE FOR RIGHTSET
        LinkedList TempLink2 = RightSet;

       //FOR-LOOP WILL ITERATE THROUGH THE CURLL LINKEDLIST AND STORES HALF THE LINKS TO THE LEFTSET
       //AND THE OTHER HALF TO THE RIGHT_SET        
       for(int i = 0; i < size ; i++)
       {
           //CHECKS IF THE ITERATION VARIABLE IS LESS THAN THE MID_LINE
           if(i < mid_line)
           {        
               //INTEGER VALUE FROM THE CURLL IS STORED IN THE LEFT_SET LINKEDLIST
               TempLink.setInteger(curLL.getInteger());
               
               //CHECKS IF THE NEXT ITERATION IS NOT THE MID_LINE
               if(i + 1 != mid_line)
               {
                   //INSTANTIATES A NEW LINKEDLIST
                   TempLink.setNextLL(new LinkedList());
                   //REFERENCES THE NEW LINKEDLIST
                   TempLink = TempLink.getNextLink();   
               }
               //CURLL REFERENCES THE NEXT LINKEDLIST
               curLL = curLL.getNextLink();  
           }
           //CHECKS IF THE ITERATION VARIABLE IS MORE THAN THE MID_LINE AND LESS THAN THE SIZE
           else if(i>= mid_line && i < size)
           {
               //INTEGER VALUE FROM THE CURLL IS STORED IN THE RIGHT_SET LINKEDLIST
               TempLink2.setInteger(curLL.getInteger());
               //CHECKS IF THE NEXT ITERATION IS THE END OF THE FORLOOP
               if(i + 1 != size)
               {
                   //INSTRANTIATES A NEW LINKEDLIST
                   TempLink2.setNextLL(new LinkedList());
                   //REFERENCES THE NEW LINKEDLIST
                   TempLink2 = TempLink2.getNextLink();
               }            
               //CURLL REFERENCES THE NEXT LINKEDLIST
               curLL = curLL.getNextLink();            
           }
       }

       //CHECKS IF THE LEFT_SET SIZE IS GREATER THAN 2
        if(L_Size >= 2)
        {
            //RECURTION HAPPENS
            LeftSet = recMerge(LeftSet,L_Size);
        }
        
        //CHECKS IF THE RIGHT_SET SIZE IS GREATER THAN 2
        if(R_Size >= 2)
        {
            //RECURSION HAPPENS
            RightSet = recMerge(RightSet,R_Size);
        }
        
        //MERGES THE LEFT_SET AND RIGHT_SET
        MainLink = initSort(LeftSet,L_Size,RightSet,R_Size);
        
        //RETURNS A SORTED LINKEDLIST
        return MainLink;
  
    }

    //Method Name: initSort
    //Purpose: Sorts two Linkedlist in ascending order
    //Parameter: LinkedList Left_Set,int L_Size, LinkedList Right_Set, int R_Size
    //Method Input: none
    //Return Value: Linkedlist
    //Date: 2/27/2018
    private LinkedList initSort(LinkedList Left_Set,int L_Size, LinkedList Right_Set, int R_Size)
    {
        //MAIN LINK INSTANTIATED
        LinkedList MainLink = new LinkedList();
        
        //REFERENCE VARIABLE
        LinkedList temp_Link= MainLink;
        
        //LOOPS UNTIL THE SIZE OF THE LEFT OR RIGHT SET IS EQUAL TO ZERO
        while(L_Size !=0 && R_Size !=0)
        {
            //CHECKS IF THE LEFT SET INTEGER IS LESS THAN THE RIGHT SET INTEGER
            if(Left_Set.getInteger() < Right_Set.getInteger())
            {
                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKS IN THE SETS
                if(L_Size - 1 > 0 || R_Size > 0)
                {
                    //INSTANSTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE MEW LINKEDLIST
                    temp_Link= temp_Link.getNextLink();
                }
                //REFERENCES THE NEXT LINKEDLIST
                Left_Set = Left_Set.getNextLink(); 
                //DECREASES THE SIZE OF THE LEFT_SET SIZE
                L_Size--;

            }
            //CHECKS IF THE RIGHT SET INTEGER IS LESS THAN THE LEFT SET INTEGER
            else if(Left_Set.getInteger() > Right_Set.getInteger())
            {
                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());
                //CHECKS IF THERE STILL EXIST LINKS IN THE SETS 
                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES THE NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASES THE SIZE OF THE RIGHT _SET
                R_Size--;

            }
            //CHECKS IF THE RIGHT SET INTEGER IS EQUAL TO THE LEFT SET INTEGER
            else if(Objects.equals(Left_Set.getInteger(), Right_Set.getInteger()))
            {
                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();
                
                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASES THE SIZE OF THE LEFT SET
                L_Size--;

                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());
                //CHECKS IF THERE STILL EXIST LINKS IN THE SETS 
                if(L_Size > 0 || R_Size - 1 > 0)
                {   
                    //REFERENCES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink(); 
                }
                //REFERENCES THE NEXT RIGHT LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE SIZE OF THE RIGHT SET
                R_Size--;     
            }
        }
        //LOOPS WHILE THE LEFT SET SIZE IS NOT ZERO
        while(L_Size !=0)
        {
            //CHECKS IF THE SIZE IS NOT ONE LINKEDLIST AWAY
            if(L_Size - 1 > 0)
            {             
                //CHECKS IF THE LEFT SET INTEGER IS LESS THAN THE LEFT SET  NEXT LINKEDLISTINTEGER
                if(Left_Set.getInteger() < Left_Set.getNextLink().getInteger())
                {
                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT LEFT  LINKEDLIST
                    Left_Set = Left_Set.getNextLink();
                    //DECREASES THE SIZE OF THE LEFT SET
                    L_Size--;
                }
                //CHECKS IF THE LEFT SET INTEGER IS GREATER THAN THE THEN LEFT SET NEXT LINKEDLIST INTEGER 
                else if(Left_Set.getInteger() > Left_Set.getNextLink().getInteger())
                {
                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Left_Set.getNextLink().getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT NEXT LEFT NEXT LINKEDLIST 
                    Left_Set.setNextLL(Left_Set.getNextLink().getNextLink());
                    //DECREASES THE SIZE OF THE LEFT SET
                    L_Size--;
                }
                //CHECKS IF THE LEFT SET INTEGER IS EQUAL TO THE LEFT SET NEXT LINKEDLIST INTEGER
                else if(Objects.equals(Left_Set.getInteger(), Left_Set.getNextLink().getInteger()))
                {
                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT LEFT SET LINKEDLIST
                    Left_Set = Left_Set.getNextLink();
                    //DECREASES THE SIZE OF THE LEFT SET
                    L_Size--;

                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    //CHECKS IF THERE STILL EXIST LINKS IN THE SETS                     
                    if(L_Size - 1 > 0)
                    {
                        //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                        temp_Link.setNextLL(new LinkedList());
                        //REFERENCES THE NEW LINKEDLIST
                        temp_Link = temp_Link.getNextLink();
                    }
                    //REFERENCES THE NEXT LEFT LINKEDLIST
                    Left_Set = Left_Set.getNextLink();
                    //DECREASES THE SIZE OF THE LEFT SET
                    L_Size--;                
                }                   
            }
            //CHECKS IF THE LEFT SET SIZE IS EQUAL TO ONE
            else if(L_Size == 1)
            {
                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());  
                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASES THE SIZE OF THE LEFT SET
                L_Size --;

            }
 
        }
        
        //LOOPS WHILE THE RIGHT SET SIZE IS NOT ZERO
        while(R_Size != 0)
        {     
            //CHECKS IF THE SIZE IS NOT ONE LINKEDLIST WAY
            if(R_Size -1 > 0)
            {
                //CHECKS IF THE RIGHT SET INTEGER IS LESS THAN THE RIGHT SET NEXT LINKEDLIST INTEGER
                if(Right_Set.getInteger() < Right_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT RIGHT LINKEDLIST
                    Right_Set = Right_Set.getNextLink();
                    //DECREASES THE SIZE OF THE RIGHT SET
                    R_Size--;
                }
                else if(Right_Set.getInteger() > Right_Set.getNextLink().getInteger())
                {
                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Right_Set.getNextLink().getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT NEXT RIGHT LINKEDLIST
                    Right_Set.setNextLL(Right_Set.getNextLink().getNextLink());
                    //DECREASES THE SIZE OF THE RIGHT SET
                    R_Size--;
                }
                else if(Objects.equals(Right_Set.getInteger(), Right_Set.getNextLink().getInteger()))
                {
                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERECNES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    //REFERENCES THE NEXT RIGHT LINKEDLIST
                    Right_Set = Right_Set.getNextLink();
                    //DECREASES THE SIZE OF THE RIGHT SET
                    R_Size--;

                    //STORES THE INTEGER INTO THE MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    //CHECKS IF THERE STILL EXIST LINKS IN THE SETS                     
                    if(R_Size - 1 > 0)
                    {
                        //INSTANTIATES THE NEW LINKEDLIST FOR MAINLINK
                        temp_Link.setNextLL(new LinkedList());
                        //REFERENCES THE NEW LINKEDLIST
                        temp_Link = temp_Link.getNextLink();
                    }
                    
                    //REFERENCES THE NEXT RIGHT LINKEDLIST
                    Right_Set = Right_Set.getNextLink();
                    //DECREASES THE SIZE OF THE RIGHT SET
                    R_Size--;                
                }        
            }
            //CHECKS IF THE RIGHT SET SIZE IS EQUAL TO ONE
            else if(R_Size == 1)
            {
                //STORES THE INTEGER INTO THE MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());
                //DECREASES THE SIZE OF THE RIGHT SET
                R_Size--;
            }
        }
        //RETURNS SORTED LINKEDLIST
        return MainLink;
    }
}
    
    

        
        
        
        
        
        
        
        
        
        
        
    
    
  
    
    
    
    
    

