/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

import java.util.Random;


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
//        
//        //52 81 12 5 44 73 54 20 27 55 30 46 45 81 69 56 21 97 47 27 1 64 99 93 20 95 94 61 82 99 74 15 65 42 5 5 42 62 67 37 24 27 21 78 33 20 88 63 70 55 58 59 46 0 60 4 10 88 13 7 8 89 67 16 90 18 60 67 39 50 96 90 21 93 90 23 18 46 0 58 24 93 25 72 83 92 27 84 95 82 50 47 20 92 68 27 7 24 53 44 
//        
//        System.out.println("[52 81 12 5 44 73 54 20 27 55 30 46 45 81 69 56 21 97 47 27 1 64 99 93 20 95 94 61 82 99 74 15 65 42 5 5 42 62 67 37 24 27 21 78 33 20 88 63 70 55 58 59 46 0 60 4 10 88 13 7 8 89 67 16 90 18 60 67 39 50 96 90 21 93 90 23 18 46 0 58 24 93 25 72 83 92 27 84 95 82 50 47 20 92 68 27 7 24 53 44");
//        
//        int[] arr;
//        
//        //arr = {52,81,12,5,44,73,54,20,27,55,30,46,45,81,69,56,21,97,47,27,1,64,99,93,20,95,94,61,82,99,74,15,65,42,5,5,42,62,67,37,24,27,21,78,33,20,88,63,70,55,58,59,46,0,60,4,10,88,13,7,8,89,67,16,90,18,60,67,39,50,96,90,21,93,90,23,18,46,0,58,24,93,25,72,83,92,27,84,95,82,50,47,20,92,68,27,7,24,53,44};
//        
//    int[] asd = {52,81,12,5,44,73,54,20,27,55,30,46,45,81,68,53,21,97,47,27,1,64,99,93,20,95,94,61,82,99,74,15,65,42,5,5,42,62,67,37,24,27,21,78,33,20,88,63,70,55,58,59,46,0,60,4,10,88,13,7,8,89,67,16,90,18,60,67,39,50,96,90,21,93,90,23,18,46,0,58,24,93,25,72,83,92,27,84,95,82,50,47,20,92,68,27,7,24,53,44}; 
//        
//        
//        
//        
//        
        
        
        
        
//        
//        
//        
//        
//        for(int i = 0; i < 100; i++)
//        {
//                   
//            temp.setInteger(asd[i]);
//            
//            if(i + 1 != 100)
//            {
//                temp.setNextLL(new LinkedList());
//                temp = temp.getNextLink();
//            }
//
//        }
//        
//        
        
        
        
//        temp.setInteger(32);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(20);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(12);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(70);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(87);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//       
//        temp.setInteger(19);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(82);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//        
//        temp.setInteger(64);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();
//       
//        temp.setInteger(54);
//        temp.setNextLL(new LinkedList());
//        temp = temp.getNextLink();        
//        
//        temp.setInteger(39);   
//       
        //String str= "[ ";
                
//        //FOR LOOP IS USED TO CREATE A CHAIN OF LINK LIST AND ARE INITIALIZED WITH INTEGERS
        for(int i = 0; i < size; i++)
        {
            //RANDOM NUMBER GENERATED IN STORED IN THIS VARIABLE
            int num = rand.nextInt(100); //100000
            
            //NEW LINKED LIST IS CREATED AND THEN A INTEGER IS STORED
            temp.setInteger(num);
            
            //str += num + " ";

            //CURRECT LINKED LIST SETS THE NEXT LINKED LIST VARIABLE WITH THE LINKED LIST CREATED
            temp.setNextLL(new LinkedList());
            
            //THE NEW LINKED LIST CREATED WILL HOLD THE PLACE OF TEMP 
            temp = temp.getNextLink();
        }
        
        //System.out.println(str + "]");
        

        
        
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
//        String all = "\n\n[ ";
//        
//        while(ttf != null)
//        {
//            all += ttf.getInteger() + " ";
//            
//            ttf = ttf.getNextLink();
//        
//        }
//        
//        System.out.println(all + "] ");
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
        
        int L_Size = (int)Math.ceil(size/3.0); 
        int M_Size = (int)Math.ceil(((size-L_Size)/2.0)); 
        int R_Size = size - (M_Size + L_Size);   
            
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
        
        try
        {
        
            MainLink = initSort(LeftSet,L_Size,MiddleSet,M_Size,RightSet,R_Size);
        
        
        }catch(Exception ex){System.out.println("///////////////////////////////////////////////////////");}
   
        
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
        
        
        LinkedList MainLink = new LinkedList();
        LinkedList temp_Link = MainLink;
        
//////////////////////////////////////////////////////////////////////////       
        while((L_Size > 0 && M_Size > 0) && R_Size > 0)
        { 
            if(Left_Set.getInteger() < Middle_Set.getInteger() && Left_Set.getInteger() < Right_Set.getInteger())
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
            else if(Middle_Set.getInteger() < Left_Set.getInteger() && Middle_Set.getInteger() < Right_Set.getInteger())
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
            else if(Right_Set.getInteger() < Left_Set.getInteger() && Right_Set.getInteger() < Middle_Set.getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(R_Size - 1 > 0 || L_Size > 0 || M_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }

                Right_Set = Right_Set.getNextLink();      
                R_Size--;              
            }       
            
            
            
            else if(Left_Set.getInteger() == Middle_Set.getInteger() && Middle_Set.getInteger() == Right_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Left_Set = Left_Set.getNextLink();
                L_Size--;
                
                temp_Link.setInteger(Middle_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();
                
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;
                
                temp_Link.setInteger(Right_Set.getInteger());
                
                if(L_Size > 0 || M_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }
                
                Right_Set = Right_Set.getNextLink();
                R_Size--;
            }               
            else if(Left_Set.getInteger() == Middle_Set.getInteger())
            {
                
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Left_Set = Left_Set.getNextLink();
                L_Size--;

                temp_Link.setInteger(Middle_Set.getInteger());

                if(M_Size - 1 > 0 || L_Size > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 
                }
                
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;               
                
            }
            else if(Left_Set.getInteger() == Right_Set.getInteger())
            {
                
                temp_Link.setInteger(Left_Set.getInteger());
                temp_Link.setNextLL(new LinkedList());
                temp_Link = temp_Link.getNextLink();

                Left_Set = Left_Set.getNextLink();
                L_Size--;

                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || L_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 
                }
                
                Right_Set = Right_Set.getNextLink();
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

                if(M_Size > 0 || L_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink(); 
                }
                Right_Set = Right_Set.getNextLink();
                R_Size--;      
            }
            else
            {
                System.out.println("I missed a case");
            
            }
            
            
            
        }
///////////////////////////////////////////////////////////////////////////////////////////s   


        while(L_Size !=0 && (M_Size != 0 && R_Size == 0))
        {
            if(Left_Set.getInteger() < Middle_Set.getInteger())
            {
                temp_Link.setInteger(Left_Set.getInteger());

                if(L_Size - 1 > 0 || M_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();
                }
                
                Left_Set = Left_Set.getNextLink();
                L_Size--;

            }
            else if(Left_Set.getInteger() > Middle_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                if(L_Size > 0 || M_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }
                
                Middle_Set = Middle_Set.getNextLink();
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
                }
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;     
            }
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        while(L_Size !=0 && (M_Size == 0 && R_Size != 0))
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
                }
                   
                Right_Set = Right_Set.getNextLink();
                R_Size--;     
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        while(L_Size ==0 && (M_Size != 0 && R_Size != 0))
        {
            if(Middle_Set.getInteger() < Right_Set.getInteger())
            {
                temp_Link.setInteger(Middle_Set.getInteger());

                if(M_Size - 1 > 0 || R_Size > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link= temp_Link.getNextLink();
                }
                   
                Middle_Set = Middle_Set.getNextLink();
                M_Size--;

            }
            else if(Middle_Set.getInteger() > Right_Set.getInteger())
            {
                temp_Link.setInteger(Right_Set.getInteger());

                if(M_Size > 0 || R_Size - 1 > 0)
                {
                    temp_Link.setNextLL(new LinkedList());
                    temp_Link = temp_Link.getNextLink();
                }

                Right_Set = Right_Set.getNextLink();
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
                }
                   
                Right_Set = Right_Set.getNextLink();
                R_Size--;     
            }
        }        
        
        
        
        
        
        
        //L_Size !=0 && (M_Size == 0 && R_Size == 0
        while(L_Size !=0 && (M_Size == 0 && R_Size == 0))
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
                else if(Left_Set.getInteger() == Left_Set.getNextLink().getInteger())
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        while(L_Size ==0 && (M_Size != 0 && R_Size == 0))
        {
            
            if(M_Size - 1 > 0)
            {
                 if(Middle_Set.getInteger() < Middle_Set.getNextLink().getInteger())
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
                    
                    if(M_Size - 1 > 0)
                    {
                        temp_Link.setNextLL(new LinkedList());
                        temp_Link = temp_Link.getNextLink();
                    }

                    Middle_Set = Middle_Set.getNextLink();
                    M_Size--;                
                }           
            }
            else
            {
                temp_Link.setInteger(Middle_Set.getInteger());
                M_Size--;
 
            } 
        }        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        while(L_Size ==0 && (M_Size == 0 && R_Size != 0))
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
                else if(Right_Set.getInteger() == Right_Set.getNextLink().getInteger())
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
