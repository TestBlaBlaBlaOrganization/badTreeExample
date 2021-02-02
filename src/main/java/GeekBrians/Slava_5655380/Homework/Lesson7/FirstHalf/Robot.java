package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

import java.util.function.Function;

// ЗАДАНИЕ 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
public class Robot implements Сompetitor {
    private boolean act(Function<Integer, Boolean> actFunc, int waste) {
        System.out.print("Робот ");
        // ЗАДАНИЕ 4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        if (waste <= MAX_CHARGE) {
            Сompetitor.super.run(waste);
            return true;
        }
        System.out.print("не стал преодалевать препятствие расстоянием в " + waste + " единиц ");
        return false;
    }

    public final int MAX_CHARGE;

    public Robot(int MAX_CHARGE) {
        this.MAX_CHARGE = MAX_CHARGE;
    }

    @Override
    public boolean run(int length) {
        // Код переписанных методов run и jump вынесен в отдельную функцию просто чтобы показать что в этом классе он одинаковый
        return act(Сompetitor.super::run, length);
    }

    @Override
    public boolean jump(int height) {
        // Код переписанных методов run и jump вынесен в отдельную функцию просто чтобы показать что в этом классе он одинаковый
        return act(Сompetitor.super::run, height);
    }
}
