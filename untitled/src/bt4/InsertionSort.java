package bt4;

public class  InsertionSort {
    void sort(int [] arr){
        int  n = arr.length;
        for(int i =0;i<arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while (j>=0 && arr[i] >key){
                arr[j+1]  = arr[i];

            }
        }
    }





}
