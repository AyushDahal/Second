/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproj;

/**
 *
 * @author ayushpc
 */
public class Looping {
    
    public static void main(String[] args) {
        
    
    
    int array1[]={1,2,3,4,8,10};
    int array2[]={1,4,10,15,16,40,50,60,70,1};
    
  for(int i=0;i<array2.length;i++)
  {
      for(int j=0;j<array1.length;j++)
      {
             if(array1[j]==array2[i])
     {
                  System.out.println(array2[i]);
  
        }
      }      
  
  
  }
  
            
        }
    
    
    
}
