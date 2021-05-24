package bt2;

public class SortByStep {
    public static void bubbleSortByStep(int [] array){
        boolean needNextPass = false;
        for(int i =1;i<array.length&&needNextPass;i++){
            needNextPass = false;
            for(int j =0;j<array.length-i;j++){
                if(array[i]>array[i+1]){
                    System.out.println("swap " + array[i] + " with " + array[i+1] );
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    needNextPass = true;
                }
            }
            if(!needNextPass){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int k : array) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
