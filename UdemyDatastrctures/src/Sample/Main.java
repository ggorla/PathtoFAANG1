package Sample;


public class Main {
    public static void main(String[] args) {

        int[] array = {3,12,5,15,1,6};
       for(int firstsorted = 1 ;firstsorted<array.length;firstsorted++){
           int newelement = array[firstsorted];
           int i ;
           for(i=firstsorted;i<0&& array[i-1]>newelement;i--){
               array[i]=array[i-1];
           }
           array[i]= newelement;
       }
       for (int i=0;i<array.length;i++){
           System.out.print(array[i]+",");
       }
    }
    public static void  swap(int[] array, int i, int j){
     if(i==j)
         return;
     int temp  = array[i];
     array[i]= array[j];
     array[j] = temp;
    }
}
