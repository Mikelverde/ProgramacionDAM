
package Vectores;


public class Mayor_menor_array {

 
    public static void main(String[] args) {
        
        int array[]={1,2,3,48,120,3};
        System.out.println(mayor(array));
        

    }
    
    public static int mayor(int array[]){
        int mayor=0;
        for(int i=0;i<array.length-1;i++){
            if(mayor<=array[i]){
                mayor=array[i];
            }
          
                
            }
        return mayor;
      
    }
}

       