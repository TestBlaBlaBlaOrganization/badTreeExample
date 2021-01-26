package GeekBrians.Slava_5655380.Homework.Lesson6;

public class Cat {
    private String name;
    private int appetite;
    // ЗАДАНИЕ 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private boolean satisfaction;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satisfaction = false;
    }

    public void eat(Bowl bowl) {
        // ЗАДАНИЕ 4. Считаем, что если коту мало еды в тарелке,
        // то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
        if (bowl.getFood() >= appetite) {
            System.out.println(name + " ate " + bowl.decreaseFood(appetite) + " food units.");
            satisfaction = true;
        } else
            System.out.println(name + " didn't eat and stared at you. There wasn't enough food to satisfy it.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatisfied() {
        return satisfaction;
    }
}