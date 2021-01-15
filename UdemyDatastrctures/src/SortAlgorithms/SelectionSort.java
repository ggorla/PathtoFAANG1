package SortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intarray = {20, 35, -15, 7, 55, 1, -22 };
        for(int lastIndex = intarray.length-1; lastIndex>0; lastIndex--){
            int largest = 0;
            for(int i = 1; i<=lastIndex; i++){
                if(intarray[i]>intarray[largest])
                    largest =i;
            }
            swap(intarray,largest,lastIndex);
        }

        for (int i=0; i<intarray.length; i++)
            System.out.println(intarray[i]);

    }
    public static void swap(int[] intarray, int i, int j){
        if( i== j)
            return;
        int temp = intarray[i];
        intarray[i] = intarray[j];
        intarray[j] = temp;
    }
}
