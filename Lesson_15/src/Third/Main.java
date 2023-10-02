package Third;

import java.util.function.Function;

/*Задача 3:
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.*/

public class Main {
    public static void main(String[] args) {
        int rate = 3;
        String byn = "123 BYN";
        Function<String, String> myFunction = numb ->
        {
            String[] s = byn.split(" ");
            int a = Integer.parseInt(s[0]) * rate;
            numb = Integer.toString(a);
            return numb;
        };
        String usd;
        usd = myFunction.apply(byn).concat(" USD");
        System.out.println(usd);
    }
}// Не уверен правильно ли это и 4е выполнил, но я просто не могу понять как это нужно делать тогда