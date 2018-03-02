
package vargas_tamayo_cis4340_proj1;


public class Vargas_tamayo_CIS4340_Proj1 
{

    public static void main(String[] args) 
    {
     
        Long start = System.currentTimeMillis();
        
        MergeSort3 MS = new MergeSort3(100);
        MS.initMerge();
        
        Long end = System.currentTimeMillis();
        
        System.out.println((end - start) + " nanoseconds");
        
        
    }






    
}
