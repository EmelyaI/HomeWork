package Task1;

public interface Animal {
    default void Voice() {
        System.out.println("Voice");
    }

    default void Eat(String food) {
        System.out.println("Happy or unhappy");
    }
}
