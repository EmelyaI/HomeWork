package Task1;

import java.util.Objects;

public class Rabbit implements Animal {
    private static final String voice = "Rabbit voice";
    private String Food;

    public Rabbit(String food) {
        Food = food;
    }

    @Override
    public void Voice() {
        System.out.println(voice);
    }

    @Override
    public void Eat(String food) {
        if (Objects.equals(food, "grass") || Objects.equals(food, "Grass")) {
            System.out.println("Rabbit is happy");
        } else {
            System.out.println("Rabbit is unhappy");
        }
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }
}
