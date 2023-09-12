/*В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        Проанализировать и записать в другой файл самое длинное слово.*/

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File ("C:\\Future disc D\\Курсы\\HomeWorkk\\Resources\\RandJ.txt");
        System.out.println(file.exists());

    }
}