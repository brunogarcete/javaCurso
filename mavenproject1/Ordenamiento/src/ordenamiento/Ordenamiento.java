package ordenamiento;

public class Ordenamiento {
    
    int[] array;
    
    
    /*
        Notas del insertionSort, evitar en lo posible su uso
        peor caso       : big O cuadratica.
        caso promedio   : big O cuadratica.
        mejor caso      : big O lineal
        algoritmo estable.
    */
    public void insertionSort(int array[]) {
   
        for (int paso = 1; paso < array.length; paso++) {
          int key = array[paso];
          int j = paso - 1;

          while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            --j;
          }
          
          array[j + 1] = key;
        }
    }
    
    
    /*
        Notas del bubbleSort, no se usa (OBSOLETO) solo en casos que se pida expresamente
        Peor caso       : big O cuadratica.
        Caso promedio   : big O cuadratica.
        Mejor caso      : big O lineal.
        algoritmo estable.
    */
    public void bubbleSort(int array[]) {   // O(n*n)
        for (int i = 0; i < array.length - 1; i++){
          for (int j = 0; j < array.length - i - 1; j++)
            if (array[j] > array[j + 1]) {
              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;
            }
        }
    }
    
    
    /*
        Notas del bubbleSortOptimo, no se usa (OBSOLETO) solo en casos que se pida expresamente
        Peor caso       : big O cuadratica.
        Caso promedio   : big O cuadratica.
        Mejor caso      : big O lineal.
        algoritmo estable.
    */
    public void bubbleSortOptimal(int[] array) { // O(n*n)
  
        for (int i = 0; i < (array.length - 1); i++) {
            
          boolean swapped = false;

          for (int j = 0; j < (array.length-i-1); j++) {
              
            if (array[j] > array[j + 1]) {
                
              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;

              swapped = true;
            }
          }

          if (!swapped)
            break;

        }
    }
    
    
    /*
        Notas del SelectionSort
        Peor Caso : 
    */
    public void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < array.length- 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {
          
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }
}