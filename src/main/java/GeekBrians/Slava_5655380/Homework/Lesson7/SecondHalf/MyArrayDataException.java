package GeekBrians.Slava_5655380.Homework.Lesson7.SecondHalf;

// ЗАДАНИЕ 6. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
public class MyArrayDataException extends NumberFormatException {
    final String[][] EXCEPTIONAL_ARRAY;
    final int EXCEPTION_ROW_INDEX;
    final int EXCEPTION_COLUMN_INDEX;

    MyArrayDataException(String[][] myArray, int i, int j) {
        super("unacceptable MyArray[" + i + "][" + j + "] value format: String value \"" + myArray[i][j] + "\"" + " cannot be converted to int");
        EXCEPTIONAL_ARRAY = myArray;
        EXCEPTION_ROW_INDEX = i;
        EXCEPTION_COLUMN_INDEX = j;
    }
}