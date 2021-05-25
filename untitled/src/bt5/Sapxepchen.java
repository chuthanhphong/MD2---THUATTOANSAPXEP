package bt5;

public class Sapxepchen {
    public void insertSort(int arr[]) {
        int valuetoinsert;
        int holeposition;
        int i;
//        for (i = 1; i < arr.length; i++) {
//            valuetoinsert = arr[i];
//            holeposition = i;
//            while (holeposition > 0 && arr[holeposition - 1] > valuetoinsert) {
//                arr[holeposition] = arr[holeposition - 1];
//                holeposition--;
//                System.out.println("Di chuyen phan tu: " + arr[holeposition]);
//            }
//            if (holeposition != i) {
//                System.out.println(" Chen phan tu: " + valuetoinsert
//                        + ", tai vi tri: " + holeposition);
//                arr[holeposition] = valuetoinsert;
//            }
//            System.out.println("vong lap thứ " + i);
//            display(arr);
//        }
//    }
//
//    public void display(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " , ");
//        }
//        System.out.println("]");
//    }
        for (i = 1; i < arr.length; i++) {
            valuetoinsert = arr[i];
            holeposition = i;
            while (holeposition > 0 && arr[holeposition - 1] > valuetoinsert) {
                arr[holeposition] = arr[holeposition - 1];
                holeposition--;
                System.out.println("Di chuyển vị trí thứ " + arr[holeposition]);

                if (holeposition != i) {
                    System.out.println("Chèn phần tử " + valuetoinsert + " tại vị trí " + holeposition);
                    arr[holeposition] = valuetoinsert;
                }
                System.out.println("Vòng lặp thứ " + i);
                display(arr);
            }
        }
    }

    public void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};
        Sapxepchen sapxepchen = new Sapxepchen();
        System.out.println("Mảng dữ liệu đầu vào");
        sapxepchen.display(arr);
        System.out.println("-----------------------------");
        sapxepchen.insertSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapxepchen.display(arr);
    }


}
