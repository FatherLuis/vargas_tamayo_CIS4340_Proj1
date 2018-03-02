/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj1;

//WORK ON INITSORT
public class Test 
{
    
    
    public void initSort(LinkedList LS,int L_Size,LinkedList MS,int M_Size, LinkedList RS, int R_Size)
    {
        
        LinkedList ML = new LinkedList();
        LinkedList TL = ML;
        
        if(L_Size != 0 && M_Size != 0 && R_Size != 0)
        {
            while(true)
            {
                if(LS.getInteger() < MS.getInteger() && LS.getInteger() < RS.getInteger())
                {

                }
                else if(MS.getInteger() < LS.getInteger() && MS.getInteger() < RS.getInteger())
                {

                }
                else if(RS.getInteger() < LS.getInteger() && RS.getInteger() < MS.getInteger())
                {

                }
                else if(LS.getInteger() == MS.getInteger() && MS.getInteger() == RS.getInteger())
                {
                
                
                }
                else if(LS.getInteger() == MS.getInteger() && MS.getInteger() != RS.getInteger())
                {
                
                
                }
                else if(LS.getInteger() == RS.getInteger() && RS.getInteger() != MS.getInteger())
                {
                
                
                
                }
                else if(MS.getInteger() == RS.getInteger() && RS.getInteger() != LS.getInteger())
                {
                
                
                }
                else
                {
                    System.out.println("I missed a case");
                }

            }
        }
        else if(L_Size != 0 && M_Size != 0 && R_Size == 0)
        {
            while(true)
            {
            
            
            
            }        
        
        
        }
        else if(L_Size != 0 && M_Size == 0 && R_Size != 0)
        {
            while(true)
            {
            
            
            
            }        
        
        
        }
        else if(L_Size == 0 && M_Size != 0 && R_Size != 0)
        {
            while(true)
            {
            
            
            
            }        
        
            
            
        }
        else if(L_Size != 0)
        {
            while(true)
            {
            
            
            
            }        
        
            
            
            
        }
        else if(M_Size !=0)
        {
            while(true)
            {
            
            
            
            }        
            
            
            
            
        }
        else if(R_Size != 0)
        {
            while(true)
            {
            
            
            
            }        
        
            
            
        }
        else
        {
            System.out.println("I Missed a case");
        
        }
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        while(L_Size != 0 && M_Size != 0 && R_Size != 0)
        {
        
        
        
            
            
            
        }
        
        while(L_Size != 0 && M_Size != 0)
        {
        
            
            
        
        }
        
        while(L_Size != 0 && R_Size != 0)
        {
        
            
            
        
        }       
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
