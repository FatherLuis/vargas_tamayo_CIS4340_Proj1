
package vargas_tamayo_cis4340_proj1;

//Class name: Vargas_tamayo_CIS4340
//Class Author: Luis E. Vargas Tamayo
//Purpose of the class: Main operator to run Class Merges
//Date: 2/27/2018
//List of changes with dates: none
//Special Notes: none
public class Vargas_tamayo_CIS4340_Proj1 
{
    public static void main(String[] args) 
    {
        //NUMBER OF INTEGERS CREATED
        int n = 10000000;
        
        //VARIABLE WILL HOLD THE START OF WHEN THE PROGRAM STARTS
        Long start;
        //VARIABLE WILL HOLD THE END OF WHEN THE PROGRAM ENDS
        Long end;
        
    ////////////////////////////////////////////////////////////////////
        
        //TIME STARTS
        start = System.currentTimeMillis();
        //LINKEDLIST WITH GIVEN SIZE IS INITIALIZED
        MergeSort MS = new MergeSort(n);
        //TWO LINKEDLIST MERGE SORT BEGINS
        MS.initMerge();
        //MERGE SORT IS FINISH, TIME ENDS
        end = System.currentTimeMillis();
        //SUBTRACT THE END TIME BY THE START TIME TO COLLECT TOTAL TIME
//      System.out.println("Two LinkedList Merge Execution Time: "+(end - start)+ " Microseconds");  
        System.out.println("Two LinkedList Merge Execution Time: "+(double)(end - start)/1000+ " Seconds");
        
    //////////////////////////////////////////////////////////////////        
       
        //TIME STARTS
        start = System.currentTimeMillis();
        //lINKEDLIST WITH GIVEN SIZE IS INITIALIZED
        MergeSort3 MS3 = new MergeSort3(n);
        //THREE LINKEDLIST MERGE SORT BEGINS
        MS3.initMerge();
        //MERGE SORT IS FINISH, TIME ENDS
        end = System.currentTimeMillis();
        //SUBTRACT THE END TIME BY THE START TIME TO COLLECT TOTAL TIME
//        System.out.println("Three LinkedList Merge Execution Time: "+(end - start) + " Microseconds");    
        System.out.println("Three LinkedList Merge Execution Time: "+(double)(end - start)/1000+ " Seconds");
//        
 
    //////////////////////////////////////////////////////////////////         
    }
}
