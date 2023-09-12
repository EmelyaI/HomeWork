/*В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        Проанализировать и записать в другой файл самое длинное слово.*/

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:\\Future disc D\\Курсы\\HomeWorkk\\Resources\\RandJ.txt");
        File file2 = new File("C:\\Future disc D\\Курсы\\HomeWorkk\\Resources\\RandJNew.txt");
        try {
            FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);

            char[] cont = new char[145];
            fileReader.read(cont);

            Longest longest = new Longest(cont);
            longest.longestWord(cont);
            String longestWord = longest.getLongestWord1();

            fileWriter.write(longestWord + " - is the longest word in text");

            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}