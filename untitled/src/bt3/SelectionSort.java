package bt3;

public class SelectionSort {
    static double[] arr = {1, 2, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double currentmin = array[i];
            int currentminIndex = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (currentmin > array[j]) {
                    currentmin = array[j];
                    currentminIndex = j;
                }
            }
            if(currentminIndex!=i){
                array[currentminIndex] =array[i];
                array[i] = currentmin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ,");
        }
    }
}
