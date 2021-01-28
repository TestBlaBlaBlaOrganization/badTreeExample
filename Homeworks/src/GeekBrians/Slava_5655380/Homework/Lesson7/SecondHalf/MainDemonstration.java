package GeekBrians.Slava_5655380.Homework.Lesson7.SecondHalf;

import java.util.Arrays;
import java.util.Random;

import static GeekBrians.Slava_5655380.Util.*;

public class MainDemonstration {
    public static void main(String[] args) {
        // ЗАДАНИЕ 7. В методе main() вызвать полученный метод, обработать возможные исключения
        // MyArraySizeException и MyArrayDataException и вывести результат расчета.
        try { System.out.println("myArray sum: " + sumMyArray(getValidMyArray())); }
        catch (MyArraySizeException e) { handleMyArraySizeException(e); }
        catch (MyArrayDataException e) { handleMyArrayDataException(e); }

        try { System.out.println("myArray sum: " + sumMyArray(getInvalidSizeMyArray())); }
        catch (MyArraySizeException e) { handleMyArraySizeException(e); }
        catch (MyArrayDataException e) { handleMyArrayDataException(e); }

        try { System.out.println("myArray sum: " + sumMyArray(getInvalidValueMyArray())); }
        catch (MyArraySizeException e) { handleMyArraySizeException(e); }
        catch (MyArrayDataException e) { handleMyArrayDataException(e); }
    }

    static public int sumMyArray(String[][] myArray) {
        final int MYARRAY_ROW_COUNT = 4,
                  MYARRAY_COLUMN_COUNT = 4;
        // ЗАДАНИЕ 5. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
        // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        if (myArray.length != MYARRAY_ROW_COUNT)
            throw new MyArraySizeException(myArray);
        if (myArray[0].length != MYARRAY_COLUMN_COUNT)
            throw new MyArraySizeException(myArray);
        // ЗАДАНИЕ 6. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        // должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        int sum = 0;
        for (int i = 0; i < MYARRAY_ROW_COUNT; i++)
            for (int j = 0; j < MYARRAY_COLUMN_COUNT; j++)
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(myArray, i, j);
                }
        return sum;
    }

    private static String[][] getValidMyArray() {
        String[][] myArray = new String[4][4];
        Random rand = new Random();
        for (String[] str : myArray)
            Arrays.fill(str, Integer.toString(rand.nextInt(10)));
        System.out.println("myArray");
        printArr(myArray);
        return myArray;
    }

    private static String[][] getInvalidSizeMyArray() {
        String[][] myArray = new String[2][5];
        Random rand = new Random();
        for (String[] str : myArray)
            Arrays.fill(str, Integer.toString(rand.nextInt(10)));
        System.out.println("myArray");
        printArr(myArray);
        return myArray;
    }

    private static String[][] getInvalidValueMyArray() {
        String[][] myArray = new String[4][4];
        Random rand = new Random();
        for (String[] str : myArray)
            Arrays.fill(str, Integer.toString(rand.nextInt(10)));
        myArray[2][2] = "з";
        myArray[2][3] = "o";
        System.out.println("myArray");
        printArr(myArray);
        return myArray;
    }

    private static void handleMyArraySizeException(MyArraySizeException e){
        System.out.println(e.getMessage());
        int sum = 0;
        for(int i = 0; i < e.EXCEPTIONAL_ARRAY.length; i++)
            for(int j = 0; j < e.EXCEPTIONAL_ARRAY[i].length; j++)
                sum += Integer.parseInt(e.EXCEPTIONAL_ARRAY[i][j]);
        System.out.println("Exceptional array sum: " + sum);
    }

    private static void handleMyArrayDataException(MyArrayDataException e){
        System.out.println(e.getMessage());
        int sum = 0;
        for(int i = 0; i < e.EXCEPTIONAL_ARRAY.length; i++)
            for(int j = 0; j < e.EXCEPTIONAL_ARRAY[i].length; j++)
                try { sum += Integer.parseInt(e.EXCEPTIONAL_ARRAY[i][j]); }
                catch (NumberFormatException nfe) { continue; }
        System.out.println("Exceptional array sum: " + sum);
    }
}