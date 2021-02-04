package GeekBrians.Slava_5655380.Homework.Lesson7.FirstHalf;

public abstract class Test {
    public final int ENERGY_COST;

    public Test(int ENERGY_COST) {
        this.ENERGY_COST = ENERGY_COST;
    }

    abstract boolean test(Сompetitor competitor);
}
