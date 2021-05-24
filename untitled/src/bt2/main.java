package bt2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter " + array.length + " values:");
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] + " , ");
        }
        System.out.print("\nBegin sort processing...");
        SortByStep.bubbleSortByStep(array);
    }
}
