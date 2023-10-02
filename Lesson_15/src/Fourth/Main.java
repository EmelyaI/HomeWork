package Fourth;

import java.util.function.Consumer;

/*@FunctionalInterface
myConsumer*/
/*Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        выводить сумму, переведенную сразу в доллары.*/
public class Main {
    public static void main(String[] args) {
        int rate = 3;
        String z;
        String byn = "123 BYN";
        Consumer<String> subString = str ->
        {
            String[] s = byn.split(" ");
            int a = Integer.parseInt(s[0]) * rate;
            String usd = Integer.toString(a);
            usd = usd.concat(" USD");
            System.out.println(usd);
        };
        subString.accept(byn);

    }

}
