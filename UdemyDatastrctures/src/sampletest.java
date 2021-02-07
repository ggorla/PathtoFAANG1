public class sampletest {
    public static void main(String[] args) {
        int[] items = {20, 35, -15, 7, 55, 1, -22 };

       for(int lastsorted =items.length; lastsorted>0;lastsorted--){
           int largest = 0;

       }
        for(int i=0 ; i < items.length;i++){
            System.out.println(items[i]);
        }

    }
    public static void swap(int[] array, int i,int j){
        if(i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
