/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encraption;

/**
 *
 * @author Zyad
 */
public class Encraption {

    public static void encryption ( String context,int key){
    
        int index;
        int check;
        String fv;
        for( int i = 0 ; i < context.length(); i++){
            
            char c =  context.charAt(i); 
          
          if(c >= 'a' && c < 'z'){
             
              System.out.print((char)(key + (int)c));//1+98 >>100 
              
            }else{
               
              if(key > 0){
              
              index = ((int) (c -'a')) + key ;//
              
           index = index %26;// index = 0 
           index = index + ((int)c - 25) ; // index = 122 -25 >>97
              System.out.print((char)(index));
              }else{
              
              
              }
           

          }
            
        }
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
       
        encryption("abz", 1);
        
        
              
        
        
        
        
    }
    
}
