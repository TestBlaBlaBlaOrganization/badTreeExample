package GeekBrians.Slava_5655380.Homework.Lesson6;

public class HomeworkDemonstration {
    public static void main(String[] args) {
        // ЗАДАНИЕ 5. Создать массив котов и тарелку с едой,
        // попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] cats = {
                new Cat("Barsik", 15),
                new Cat("Murzok", 4),
                new Cat("Pushok", 10)
        };
        Bowl bowl = new Bowl(20);
        feedAndCheck(cats, bowl);
        System.out.println("----------------");
        bowl.putFood(99);
        feedAndCheck(cats, bowl);
    }

    private static void feedAndCheck(Cat[] cats, Bowl bowl) {
        for (Cat cat : cats)
            cat.eat(bowl);
        for (Cat cat : cats) {
            if (cat.isSatisfied())
                System.out.println(cat.getName() + " satisfied.");
            else
                System.out.println(cat.getName() + " not satisfied.");
        }
    }
}