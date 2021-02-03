package GeekBrians.Slava_5655380.Homework.Lesson9;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Cat[] catsToAdd = {
                new Cat("Barsik", "Brazilian Shorthair", 2),
                new Cat("Murzik", "Havana Brown", 10),
                new Cat("Pushok", "Himalayan", 5)
        };
        // ЗАДАНИЕ 2. Создать в бд таблицу с котами
        Connection connection = Cat.getConnectionToCatsDB();
        Cat.addToCatsDB(connection, catsToAdd);

        // ЗАДАНИЕ 3. Написать метод извлечения котов
        Cat.printCatsDB(connection);

        // ЗАДАНИЕ 4. Метод добавления котов
        Cat.addToCatsDB(connection, new Cat("Tom", "Havana Brown", 2));
        System.out.println("----------------Добавлен Tom----------------");
        Cat.printCatsDB(connection);

        // ЗАДАНИЕ 5. Метод удаления котов
        Cat.rmFromCatsDB(connection, 2);
        System.out.println("----------------Удалён Кот под номером " + 2 + "----------------");
        Cat.printCatsDB(connection);

        // ЗАДАНИЕ 6. Метод изменения котов
        Cat.updAgeInCatDB(connection, 3, 6);
        System.out.println("----------------Возраст Кота под номером 3 обновлён----------------");
        Cat.printCatsDB(connection);

        connection.close();
    }
}
