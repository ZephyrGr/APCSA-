
/**
 * 
 *Zephyr Granger
 *(11-26-18)
 */
public class MatrixRunner{
    
    public static void main(){
      CellMatrix cm = new CellMatrix(3, 4);   
      cm.printMatrix();
      cm.loadMatrix(); 
      cm.printMatrix(); 
      cm.getGreatestNeighbors(); 
    } 
} 
   
