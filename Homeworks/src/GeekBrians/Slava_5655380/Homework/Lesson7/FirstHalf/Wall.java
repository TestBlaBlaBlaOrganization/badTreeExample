package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

// ЗАДАНИЕ 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
public class Wall extends Test {

    public Wall(int ENERGY_COST) { super(ENERGY_COST); }

    public boolean test(Сompetitor competitor) {
        // ЗАДАНИЕ 4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        if (competitor.jump(ENERGY_COST)) {
            System.out.println("успешно преодалев стену высотой " + ENERGY_COST + " единиц.");
            return true;
        }
        System.out.println("не преодалев стену высотой " + ENERGY_COST + " единиц.");
        return false;
    }
}
