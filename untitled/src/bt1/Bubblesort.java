package bt1;


public class Bubblesort {
    public static int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
     static  boolean needNextPass = true;

    public static void sortnumber(int[] list) {
        for(int k =1; k<array.length&& needNextPass ; k++){
            needNextPass = false;
        for (int i = 0; i < list.length - k; i++) {
            if (list[i] > list[i + 1]) {
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
                needNextPass = true;
            }
        }
    }

    }
}