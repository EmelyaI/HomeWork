package Task1;

import java.util.Objects;

public class Dog implements Animal {
    private static final String voice = "Woof";
    private String Food;

    public Dog(String food) {
        Food = food;
    }

    @Override
    public void Voice() {

    }

    @Override
    public void Eat(String food) {
        if (Objects.equals(food, "meat") || Objects.equals(food, "Meat")) {
            System.out.println("Dog is happy");
        } else {
            System.out.println("Dog is unhappy");
        }
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }
}