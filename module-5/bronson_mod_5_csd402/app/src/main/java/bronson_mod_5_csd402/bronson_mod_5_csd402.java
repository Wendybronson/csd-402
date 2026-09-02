package bronson_mod_5_csd402;

/*
 * Wendy Bronson
 * September 3, 2026
 * Module 5.2
 * CSD402
 *
 * This program uses overloaded methods to locate the 
 * largest and smallest elements in two-dimensional
 * interger and double arrays.
 */

public class bronson_mod_5_csd402 {
    
    public static void main(String[] args) {
        
        int[][] intArray = {
            {10, 25, 7},
            {42, 3, 18},
            {9, 15, 30},
            
        };
        
        double[][] doubleArray = {
            {4.5, 7.8, 2.1},
            {9.6, 3.4, 5.5},
            {1.2, 8.7, 6.3}
        };
        
        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);

        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Integer Array:");
        System.out.println("Largest element: " +
              intArray[intLargest[0]][intLargest[1]] +
              " at location [" + intLargest[0] + "][" + intLargest[1] + "]");

        System.out.println("Smallest element: " +
              intArray[intSmallest[0]][intSmallest[1]] +
              " at location [" + intSmallest[0] + "][" + intSmallest[1] + "]");

        System.out.println();

        System.out.println("Double Array:");
        System.out.println("Largest element: " +
              doubleArray[doubleLargest[0]][doubleLargest[1]] +
              " at location [" + doubleLargest[0] + "][" + doubleLargest[1] + "]");

        System.out.println("Smallest element: " +
              doubleArray[doubleSmallest[0]][doubleSmallest[1]] +
              " at location [" + doubleSmallest[0] + "][" + doubleSmallest[1] + "]");
        
      }
    
    /*
     *Returns the row and column location of the
     *largest value in a two-dimensional interger array.
    */
    
    public static int[] locateLargest(int[][] arrayParam) {
        
        int largest = arrayParam[0][0];
        int row = 0;
        int column = 0;
        
        for (int i = 0; i <arrayParam.length; ++i){
            
            for (int j = 0; j <arrayParam[i].length; ++j){
                
                if (arrayParam[i][j] > largest){
                    
                    largest = arrayParam[i][j];
                    row = i;
                    column = j;
                    
                }
            }
        }
        
        return new int[] {row, column};
    }
    
    /*
     *Returns the row and column location of the 
     *largest value in a two-dimensional double array.
    */
    
    public static int[] locateLargest(double[][] arrayParam){
        
        double largest = arrayParam[0][0];
        int row = 0;
        int column = 0;
        
        for (int i = 0; i < arrayParam.length; ++i){
            
            for (int j = 0; j <arrayParam[i].length; ++j){
                
                if (arrayParam[i][j] > largest){
                    
                    largest = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new int[] {row, column};
        
    }
    
    /* 
     *Returns the row and column location of the
     *smallest value in a two-dimensional interger array.
    */
    
    public static int[] locateSmallest(int[][] arrayParam){
        
        int smallest = arrayParam[0][0];
        int row = 0;
        int column = 0;
        
        for (int i =0; i < arrayParam.length; ++i){
            
            for (int j = 0; j < arrayParam[i].length; ++j){
                
                if (arrayParam[i][j] < smallest){
                    
                    smallest = arrayParam[i][j];
                    row = i;
                    column = j;
                    
                }
            }
        }
        return new int[] {row, column};
        
    }
    
    /*
     *Returns the row and column location of the
     *smallest value in a two-dimensional double array.
    */
    
    public static int[] locateSmallest (double[][] arrayParam){
        
        double smallest = arrayParam[0][0];
        int row = 0;
        int column = 0;
        
        for (int i = 0; i < arrayParam.length; ++i){
            
            for (int j = 0; j < arrayParam[i].length; ++j){
                
                if (arrayParam[i][j] < smallest){
                    
                    smallest = arrayParam[i][j];
                    row = i;
                    column = j;
                    
                }
            }
        }
        
        return new int[] {row, column};
        
    }
}
        
