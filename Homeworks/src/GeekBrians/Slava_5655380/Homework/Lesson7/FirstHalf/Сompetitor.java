package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

// ЗАДАНИЕ 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
public interface Сompetitor {
    default boolean run(int length) {
        System.out.print("пробежал " + length + " единиц ");
        return true;
    }
    default boolean jump(int height) {
        System.out.print("совершил прыжок высотой в " + height + " единиц ");
        return true;
    }
}
