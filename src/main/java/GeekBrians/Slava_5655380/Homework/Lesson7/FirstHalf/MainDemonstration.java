package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

import static GeekBrians.Slava_5655380.Util.*;

// ЗАДАНИЕ 3. Создайте два массива: с участниками и препятствиями,
// и заставьте всех участников пройти этот набор препятствий.
public class MainDemonstration {
    public static void main(String[] args) {
        Сompetitor[] competitors = {
                new Human(50, 10),
                new Human(500, 15),
                new Human(50, 50),
                new Human(100, 50),
                new Cat(100),
                new Cat(50),
                new Cat(87),
                new Robot(25)
        };
        Test[] tests = {
                new RunningTrack(10),
                new Wall(1),
                new RunningTrack(10),
                new Wall(1),
                new RunningTrack(10),
                new Wall(1),
                new RunningTrack(50),
                new Wall(5)
        };
        competitorIteration:
        for (Сompetitor competitor : competitors) {
            System.out.println();
            System.out.println("Новый участник - " + getClassShortName(competitor) + ", приступил к испытанию.");
            for (Test test : tests)
                // ЗАДАНИЕ 4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
                // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
                if (!test.test(competitor)) {
                    System.out.println("Этот " + getClassShortName(competitor) + " ПРОВАЛИЛ испытание.");
                    continue competitorIteration;
                }
            System.out.println("Этот " + getClassShortName(competitor) + " СПРАВИЛСЯ с испытанием.");
        }

    }
}
