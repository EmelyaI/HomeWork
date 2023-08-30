/*Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.*/
package Task8_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        float d = 0;
        String[] arr = new String[5];
        float[] arrP = new float[5];
        for (int i = 0; i < arr.length; i++) {
            float a;
            float b = 1;
            float c = 1;
            System.out.println("Enter figure");
            arr[i] = scanner.next();
            switch (arr[i]) {
                case "Circle" -> {
                    System.out.println("Enter radius");
                    a = scanner.nextFloat();
                    circle.FindSquareAndPer(a, b, c);
                    d += circle.getP();
                    arrP[i] = circle.getP();
                }
                case "Triangle" -> {
                    System.out.println("Enter lengths of all sides");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    c = scanner.nextFloat();
                    triangle.FindSquareAndPer(a, b, c);
                    d += triangle.getP();
                    arrP[i] = triangle.getP();
                }
                case "Rectangle" -> {
                    System.out.println("Enter lengths of all sides");
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    rectangle.FindSquareAndPer(a, b, c);
                    d += rectangle.getP();
                    arrP[i] = rectangle.getP();
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(j + 1 + ": " + "Figure - " + arr[j] + ". Perimeter " + arrP[j]);
        }
        System.out.println("Sum of perimeters = " + d);
    }
}