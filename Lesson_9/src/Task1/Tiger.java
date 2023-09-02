package Task1;

import java.util.Objects;

public class Tiger implements Animal {
    private static final String voice = "Tiger voice";
    private String food;

    public Tiger(String food) {
        this.food = food;
    }

    @Override
    public void Voice() {
        System.out.println(voice);
    }

    @Override
    public void Eat(String food) {
        if (Objects.equals(food, "meat") || Objects.equals(food, "Meat")) {
            System.out.println("Tiger is happy");
        } else {
            System.out.println("Tiger is unhappy");
        }

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}