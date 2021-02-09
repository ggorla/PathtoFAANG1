package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] intArray ={ -22,-15,1,7,20,35,55};
        System.out.println(iterativeBinarySearch(intArray,30));
    }
    public static int iterativeBinarySearch(int[] input, int value){
        int start=0;
        int end = input.length;
        while(start<end){
            int midpoint = (start+end)/2;
            if(input[midpoint]==value)
                return midpoint;
            else if (input[midpoint] < value) {
                start= midpoint+1;
            }else{
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int start , int end, int value){
        if(start>=end)
            return -1;
        int mid= (start+end)/2;
        System.out.println("midpoint:"+ mid);
        if(array[mid]==value)
            return mid;
        if(array[mid]<value)
            return recursiveBinarySearch(array,start,mid+1,value);
        else
            return recursiveBinarySearch(array,mid,end,value);
    }
}
