package GeekBrians.Slava_5655380;

import java.util.Random;

public class Util {
    public static int[] strArrToIntArr(String[] sourceArr) {
        int[] returnArr = new int[sourceArr.length];
        for (int i = 0; i < returnArr.length; i++)
            returnArr[i] = Integer.parseInt(sourceArr[i]);
        return returnArr;
    }

    public static int[] generateAndPrintRandomArr() {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(9) + 1];
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }


    // Сделать так чтобы аргументом printArr мог быть массив Object произвольной глубины
    // Спросить почему не работает конвертирование int[] в Object[] и Object в Object[]?
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

}

