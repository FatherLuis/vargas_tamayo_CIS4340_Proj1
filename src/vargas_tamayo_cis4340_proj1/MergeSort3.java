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
//Purpose of the class: Use Merge Sort on three linkedlist, sort LinkedList in Ascending Order
//Date: 2/27/2018
//List of changes with dates: none
//Special Notes: Code would look cleaner if i would have made some of the repeated code into methods
public class MergeSort3 
{
    private LinkedList LinkedChain;
    private int size;
    
    //Method Name: MergeSort3()
    //Purpose: Constructor
    //Parameter: int size
    //Method Input: setUp();
    //Return Value: none
    //Date: 2/27/2018
    public MergeSort3(int size)
    {
        LinkedChain = new LinkedList();
        this.size = size;
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
            //RANDOM NUMBER GENERATED IS STORED IN THIS VARIABLE, RANDOM NUMBER FROM 0-99999
            int num = rand.nextInt(100000); 
            //NEW LINKED LIST IS CREATED AND THEN A INTEGER IS STORED
            temp.setInteger(num);
            //CURRECT LINKED LIST SETS THE NEXT LINKED LIST VARIABLE WITH THE LINKED LIST CREATED
            temp.setNextLL(new LinkedList());
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
        
        //INSTANTIATES THE LEFTSET
        LinkedList LeftSet = new LinkedList();
        //INSTANTITATES THE MIDDLESET
        LinkedList MiddleSet = new LinkedList();  
        //INSTANTIATES THE RIGHTSET
        LinkedList RightSet = new LinkedList();
        
        //CALCULATE THE SIZE OF THE LEFT SET, DECIMAL ROUNDS UP TO THE NEXT INTEGER
        int L_Size = (int)Math.ceil(size/3.0); 
        //CALCULATE THE SIZE OF THE MIDDLE SET
        int M_Size = (int)Math.ceil(((size-L_Size)/2.0)); 
        //CALCULATE THE SIZE OF THE RIGHT SET
        int R_Size = size - (M_Size + L_Size);         
        
        //REFERENCE VARIABLE FOR LEFTSET
        LinkedList L_TempLink = LeftSet;
        //REFERENCE VARIABLE FOR MIDDLESET
        LinkedList M_TempLink = MiddleSet; 
        //REFERENCE VARIABLE FOR RIGHTSET
        LinkedList R_TempLink = RightSet;

       //FOR-LOOP WILL ITERATE THROUGH THE CURLL LINKEDLIST AND STORES ONE THIRD(+1 IN SOME CASES) OF THE LINKS TO THE LEFTSET
       //ANOTHER THIRD WOULD GO TO MIDDLESET, AND ONE THIRD TO RIGHT_SET (IF ANY IN COME CASES)          
       for(int i = 0; i < size ; i++)
       {
           //CHECKS IF THE ITERATION VARIABLE IS LESS THAN THE LEFTSET SIZE
           if(i < L_Size)
           {        
               //STORES INTEGER TO THE LEFTSET
               L_TempLink.setInteger(curLL.getInteger());
               
               //CHECKS IF THE ITERATOR IS NOT A ITERATION AWAY FROM THE LEFT SET SIZE
               if(i + 1 != L_Size)
               {
                   //INSTANTIATES A NEW LINKEDLIST FOR LEFT SET
                   L_TempLink.setNextLL(new LinkedList());
                   //REFERENCES THE NEW LINKEDLIST
                   L_TempLink = L_TempLink.getNextLink();   
               }
               //REFERENCES THE NEXT CURLL LINKEDLIST
               curLL = curLL.getNextLink();  
           }
           //CHECKS IF THE ITERATION VARIABLE IS LESS THAN THE LEFTSET SIZE + MIDDLESET SIZE
           else if( i >= L_Size && i < (L_Size + M_Size))
           {
               //STORES INTEGER TO THE MIDDLESET
               M_TempLink.setInteger(curLL.getInteger());
               
               //CHECKS IF THE ITERATOR IS NOT A ITERATION AWA FROM THE LEFT SET SIZE
               if(i + 1 != (L_Size + M_Size))
               {
                   //INSATNTIATES A NEW LINKEDLIST FOR MIDDLE SET
                   M_TempLink.setNextLL(new LinkedList());
                   //REFERENCES THE NEW LINKEDLIST
                   M_TempLink = M_TempLink.getNextLink();
               }
               //REFERENCES THE NEXT CURLL LINKEDLIST
               curLL =curLL.getNextLink();
           }
           //CHECKS IF THE ITERATION VARIABLE IS GREATED THAN THE LEFTSET SIZE + MIDDLESET SIZE
           else if(i >= (L_Size + M_Size))
           {
               //STORES THE INTEGER TO THE MIDDLESET
               R_TempLink.setInteger(curLL.getInteger());
               
               //CHECKS IF THE ITERATOR IS NOT AN ITERATION AWAY FROM THE CURLL SIZE
               if(i + 1 != size)
               {
                   //INSTANTIATES A NEW LINKEDLIST FOR RIGHT SET
                   R_TempLink.setNextLL(new LinkedList());
                   //REFERENCES THE NEW LINKEDLIST
                   R_TempLink = R_TempLink.getNextLink();
               }  
               //REFERENCES THE NEXT CURLL LINKEDLIST
               curLL = curLL.getNextLink();
           }
       } 
       
       
        //CHECKS IF THE LEFTSET SIZE IS GREATER THAN 2
        if(L_Size >= 2)
        {
            //RECURSION HAPPENS
            LeftSet = recMerge(LeftSet,L_Size);     
        }
        //CHECKS IF THE MIDDLESET SIZE IS GREATER THAN 2
        if(M_Size >= 2)
        {
            //RECURSION HAPPENS
            MiddleSet = recMerge(MiddleSet,M_Size);
        }
        //CHECKS IF THE RIGHTSET SIZE IS GREATER THAN 2
        if(R_Size >= 2)
        {
            //RECURSION HAPPENS
            RightSet = recMerge(RightSet,R_Size);  
        }
        
        try
        {
            //MERGES THE LEFT_SET, MIDDLE_SET, AND RIGHT_SET
            MainLink = initSort(LeftSet,L_Size,MiddleSet,M_Size,RightSet,R_Size);
        
        
        }catch(Exception ex){System.out.println("Something is wrong. I apologize for the inconvenience");}
   
        //RETURNS SORTED MERGE LINKEDLIST
        return MainLink;
    }

    //Method Name: initSort
    //Purpose: Sorts two Linkedlist in ascending order
    //Parameter: LinkedList Left_Set,int L_Size,LinkedList Middle_Set,int M_Size, LinkedList Right_Set, int R_Size
    //Method Input: none
    //Return Value: Linkedlist
    //Date: 2/27/2018
    private LinkedList initSort(LinkedList Left_Set,int L_Size,LinkedList Middle_Set,int M_Size, LinkedList Right_Set, int R_Size)
    { 
        //MAIN LINK INSTANTIATED
        LinkedList MainLink = new LinkedList();
        //REFERENCE VARIABLE FOR MAINLINK
        LinkedList temp_Link = MainLink;
        
        //LOOPS UNTIL THE SIZE OF THE LEFT, MIDDLE, OR RIGHT SET IS EQUAL TO ZERO
        while((L_Size > 0 && M_Size > 0) && R_Size > 0)
        {        
            //CHECKS IF THE LEFT SET INTEGER IS LESS THAN THE MDDLE SET INTEGER AND LESS THAN THE RIGHT SET INTEGER
            if(Left_Set.getInteger() < Middle_Set.getInteger() && Left_Set.getInteger() < Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(L_Size - 1 > 0 || M_Size > 0 || R_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();  
                //DECREASES THE LEFT SET SIZE
                L_Size--;
            }
            //CHECKS IF THE MIDDLE SET INTEGER IS LESS THAN THE LEFT SET INTEGER AND LESS THAN THE RIGHT SET INTEGER
            else if(Middle_Set.getInteger() < Left_Set.getInteger() && Middle_Set.getInteger() < Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(M_Size - 1 > 0 || L_Size > 0 || R_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }

                //REFERENCES THE NEXT MIDDLE LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();   
                //DECREASES THE MIDDLE SET SIZE
                M_Size--;            
            }
            //CHECKS IF THE RIGHT SET INTEGER IS LESS THAN THE LEFT SET INTEGER AND LESS THAN THE MIDDLE SET INTEGER
            else if(Right_Set.getInteger() < Left_Set.getInteger() && Right_Set.getInteger() < Middle_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(R_Size - 1 > 0 || L_Size > 0 || M_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }

                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();  
                //DECREASES THE RIGHT SET SIZE
                R_Size--;              
            }       
            //CHECKS IF THE LEFT SET INTEGER, MIDDLE SET INTEGER, AND THE RIGHT SET INTEGER ARE EQUAL
            else if(Objects.equals(Left_Set.getInteger(), Middle_Set.getInteger()) && Middle_Set.getInteger() == Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();
                
                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASES THE LEFT SET SIZE
                L_Size--;
                
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();
                
                //REFERENCES THE NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE THE MIDDLE SET SIZE
                M_Size--;
                
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());
                
                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(L_Size > 0 || M_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE RIGHT SET SIZE
                R_Size--;
            }    
            //CHECKS IF THE LEFT SET INTEGER AND THE MIDDLE SET INTEGER ARE EQUAL
            else if(Objects.equals(Left_Set.getInteger(), Middle_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASES THE LEFT SET 
                L_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(M_Size - 1 > 0 || L_Size > 0 || R_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;               
                
            }
            //CHECKS IF THE LEFT SET INTEGER AND THE RIGHT SET INTEGER ARE EQUAL
            else if(Objects.equals(Left_Set.getInteger(), Right_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(M_Size > 0 || L_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASES RIGHT SET SIZE
                R_Size--;             

            }
            //CHECKS IF THE MIDDLE SET INTEGER AND THE RIGHT SET INTEGER ARE EQUAL
            else if(Objects.equals(Middle_Set.getInteger(), Right_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                //CHECKS IF THERE STILL EXIST LINKEDLIST ON LEFT SET, MIDDLE SET, AND RIGHT SET
                if(M_Size > 0 || L_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                //REFERENCES NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE RIGHT SET SIZE
                R_Size--;      
            }
            //IF NONE OF THE CASES WORKED, THEN I MISSED A CASE AND AN INFINITE LOOP WOULD OCCUR
            else
            { 
                System.out.println("INFINITE LOOP, TERMINATE!"); 
                //SET SIZES EQUAL TO ZERO TO STOP THE ENTIRE PROGRAM
                L_Size = 0;
                M_Size = 0;
                R_Size = 0;
                        
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //LOOPS UNTIL THE SIZE OF THE LEFT AND MIDDLE SET IS ZERO
        while(L_Size !=0 && (M_Size != 0 && R_Size == 0))
        {
            if(Left_Set.getInteger() < Middle_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || M_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;

            }
            else if(Left_Set.getInteger() > Middle_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());

                if(L_Size > 0 || M_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;

            }
            else if(Objects.equals(Left_Set.getInteger(), Middle_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());

                if(L_Size > 0 || M_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;    
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //LOOPS UNTIL THE SIZE OF THE LEFT AND RIGHT SET IS ZERO
        while(L_Size !=0 && (M_Size == 0 && R_Size != 0))
        {
            if(Left_Set.getInteger() < Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || R_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;

            }
            else if(Left_Set.getInteger() > Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE RIGHT SET SIZE
                R_Size--;

            }
            else if(Objects.equals(Left_Set.getInteger(), Right_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                if(L_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                   
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE RIGHT SET SIZE
                R_Size--;     
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
        //LOOPS UNTIL THE SIZE OF THE MIDDLE AND RIGHT SET IS ZERO
        while(L_Size ==0 && (M_Size != 0 && R_Size != 0))
        {
            if(Middle_Set.getInteger() < Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());

                if(M_Size - 1 > 0 || R_Size > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                   
                //REFERENCES NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;

            }
            else if(Middle_Set.getInteger() > Right_Set.getInteger())
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }

                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE RIGHT SET SIZE
                R_Size--;

            }
            else if(Objects.equals(Middle_Set.getInteger(), Right_Set.getInteger()))
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());
                //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                temp_Link.setNextLL(new LinkedList());
                //REFERENCES THE NEW LINKEDLIST
                temp_Link = temp_Link.getNextLink();

                //REFERENCES NEXT MIDDLE SET LINKEDLIST
                Middle_Set = Middle_Set.getNextLink();
                //DECREASE MIDDLE SET SIZE
                M_Size--;

                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || R_Size - 1 > 0)
                {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                }
                   
                //REFERENCES THE NEXT RIGHT SET LINKEDLIST
                Right_Set = Right_Set.getNextLink();
                //DECREASE THE RIGHT SET SIZE
                R_Size--;    
            }
        }        
////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
        //LOOPS UNTIL THE SIZE OF THE LEFT SET IS ZERO
        while(L_Size !=0 && (M_Size == 0 && R_Size == 0))
        {
            if(L_Size - 1 > 0)
            {             
                if(Left_Set.getInteger() < Left_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                //REFERENCES THE NEXT LEFT SET LINKEDLIST
                Left_Set = Left_Set.getNextLink();
                //DECREASE LEFT SET SIZE
                L_Size--;
                }
                else if(Left_Set.getInteger() > Left_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Left_Set.getNextLink().getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Left_Set.setNextLL(Left_Set.getNextLink().getNextLink());
                    L_Size--;
                }
                else if(Objects.equals(Left_Set.getInteger(), Left_Set.getNextLink().getInteger()))
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Left_Set = Left_Set.getNextLink();
                    L_Size--;
                   
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Left_Set.getInteger());
                    
                    if(L_Size - 1 > 0)
                    {
                        //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                        temp_Link.setNextLL(new LinkedList());
                        //REFERENCES THE NEW LINKEDLIST
                        temp_Link = temp_Link.getNextLink();
                    }

                    Left_Set = Left_Set.getNextLink();
                    L_Size--;                
                }                   
            }
            else if(L_Size == 1)
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Left_Set.getInteger());       
                Left_Set = Left_Set.getNextLink();
                L_Size --;

            }
 
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //LOOPS UNTIL THE SIZE OF THE MIDDLE SET IS ZERO
        while(L_Size ==0 && (M_Size != 0 && R_Size == 0))
        {
            
            if(M_Size - 1 > 0)
            {
                 if(Middle_Set.getInteger() < Middle_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Middle_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Middle_Set = Middle_Set.getNextLink();
                    M_Size--;
                }
                else if(Middle_Set.getInteger() > Middle_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Middle_Set.getNextLink().getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Middle_Set.setNextLL(Middle_Set.getNextLink().getNextLink());
                    M_Size--;
                }
                else if(Objects.equals(Middle_Set.getInteger(), Middle_Set.getNextLink().getInteger()))
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Middle_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Middle_Set = Middle_Set.getNextLink();
                    M_Size--;
                    /////////////////////////////////////////////////
                    temp_Link.setInteger(Middle_Set.getInteger());
                    
                    if(M_Size - 1 > 0)
                    {
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();
                    }

                    Middle_Set = Middle_Set.getNextLink();
                    M_Size--;                
                }           
            }
            else
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Middle_Set.getInteger());
                M_Size--;
 
            } 
        }        
////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
        //LOOPS UNTIL THE SIZE OF THE RIGHT SET IS ZERO
        while(L_Size ==0 && (M_Size == 0 && R_Size != 0))
        {            
            if(R_Size -1 > 0)
            {
                if(Right_Set.getInteger() < Right_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                    R_Size--;
                }
                else if(Right_Set.getInteger() > Right_Set.getNextLink().getInteger())
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Right_Set.getNextLink().getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Right_Set.setNextLL(Right_Set.getNextLink().getNextLink());
                    R_Size--;
                }
                else if(Objects.equals(Right_Set.getInteger(), Right_Set.getNextLink().getInteger()))
                {
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                    temp_Link.setNextLL(new LinkedList());
                    //REFERENCES THE NEW LINKEDLIST
                    temp_Link = temp_Link.getNextLink();

                    Right_Set = Right_Set.getNextLink();
                    R_Size--;
                    
                    //STORES INTEGER TO MAINLINK
                    temp_Link.setInteger(Right_Set.getInteger());
                    
                    if(R_Size - 1 > 0)
                    {
                        //INSTANTIATES A NEW LINKED LIST FOR MAINLINK
                        temp_Link.setNextLL(new LinkedList());
                        //REFERENCES THE NEW LINKEDLIST
                        temp_Link = temp_Link.getNextLink();
                    }
                    
                    Right_Set = Right_Set.getNextLink();
                    R_Size--;                
                }        
            }
            else
            {
                //STORES INTEGER TO MAINLINK
                temp_Link.setInteger(Right_Set.getInteger());
                R_Size--;
            
            }
        }
        
        return MainLink;

    }
        
 
}
