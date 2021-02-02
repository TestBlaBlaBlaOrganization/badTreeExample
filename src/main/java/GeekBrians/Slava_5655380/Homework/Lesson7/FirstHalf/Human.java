package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

import java.util.function.Function;

// ЗАДАНИЕ 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
public class Human implements Сompetitor {
    private int energyAmount;
    private final int MAX_ENERGY_WASTE;

    private boolean act(Function<Integer, Boolean> actFunc, int waste) {
        System.out.print("Человек ");
        // ЗАДАНИЕ 4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        if (waste <= MAX_ENERGY_WASTE && waste <= energyAmount) {
            actFunc.apply(waste);
            energyAmount -= waste;
            return true;
        }
        actFunc.apply((energyAmount < MAX_ENERGY_WASTE) ? energyAmount : MAX_ENERGY_WASTE);
        energyAmount = 0;
        return false;
    }

    public Human(int energyAmount, int MAX_ENERGY_WASTE) {
        this.energyAmount = energyAmount;
        this.MAX_ENERGY_WASTE = MAX_ENERGY_WASTE;
    }

    @Override
    public boolean run(int length) {
        // Код переписанных методов run и jump вынесен в отдельную функцию просто чтобы показать что в этом классе он одинаковый
        return act(Сompetitor.super::run, length);
    }

    @Override
    public boolean jump(int height) {
        // Код переписанных методов run и jump вынесен в отдельную функцию просто чтобы показать что в этом классе он одинаковый
        return act(Сompetitor.super::jump, height);
    }
}
