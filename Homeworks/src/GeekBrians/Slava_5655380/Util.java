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

    public static class Vector2i {
        public int x;
        public int y;

        // Я правильно понимаю, чтобы создать экземпляр импортируемого класса его конструктор должен быть public,
        // а инае получается default и экземпляры можно создавать только в пределах пакета?
        public Vector2i() {
            x = 0;
            y = 0;
        }

        public Vector2i(int u, int v) {
            x = u;
            y = v;
        }
    }

    // Сделать так чтобы аргументом printArr мог быть массив Object произвольной глубины
    // Спросить почему не работает конвертирование int[] в Object[] и Object в Object[]?
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void deepFill(Object arr[]){
        // ...
    }

    public static String getClassShortName(Object obj) {
        String[] classFullName = obj.getClass().toString().split("\\.");
        return classFullName[classFullName.length - 1];
    }


}

