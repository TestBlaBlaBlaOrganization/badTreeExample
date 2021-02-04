package GeekBrians.Slava_5655380.Homework.Lesson7.SecondHalf;

// ЗАДАНИЕ 5. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    final String[][] EXCEPTIONAL_ARRAY;

    MyArraySizeException(String[][] exceptionalArray) {
        super((exceptionalArray.length != 4) ? "Array length " + exceptionalArray.length + " unacceptable for MyArray length 4" : "Index " + exceptionalArray[0].length + " unacceptable for MyArray[] length 4");
        EXCEPTIONAL_ARRAY = exceptionalArray;
    }
}