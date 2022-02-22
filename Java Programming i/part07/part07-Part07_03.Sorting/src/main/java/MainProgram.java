
public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int number : array){
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startingIndex){
        int smallest = array[startingIndex];
        int indexOfSmallest = startingIndex;
        for(int i = startingIndex; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.print("[");
            for(int j = 0; j < array.length; j++){
                if(j == array.length - 1){
                    System.out.println(array[j] + "]");
                    continue;
                }
                System.out.print(array[j] + ", ");
            }
            System.out.println("");
        }
    }
}
