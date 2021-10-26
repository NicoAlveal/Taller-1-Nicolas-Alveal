
package cuestionario1;

/**
 *
 * @author Nicolas Alveal
 */
import cuestionario1.CSVRead;
public class Insert {
    class ArrayIns
   {
   private long[] br;                
   private int nElems;               

   public ArrayIns(int max)          
      {
      br = new long[max];                 
      nElems = 0;                        
      }

   public void insert(long value)   
      {
      br[nElems] = value;             
      nElems++;                     
      }

   public void display()             
      {
      for(int j=0; j<nElems; j++)       
         System.out.print(br[j] + " ");  
      System.out.println("");
      }

   public void insertionSort()
      {
      int in, out;

      for(out=1; out<nElems; out++)   
         {
         long temp = br[out];          
         in = out;                      
         while(in>0 && br[in-1] >= temp) 
            {
            br[in] = br[in-1];           
            --in;                       
            }
         br[in] = temp;                  
         }  
      }  

   }  
class InsertSortApp
   {
  
    {
      int maxSize = 18249;            
      ArrayIns arr;                 
      arr = new ArrayIns(maxSize);  

      
      arr.display();                

      arr.insertionSort();         

      arr.display();                
      }  
   }  

}
