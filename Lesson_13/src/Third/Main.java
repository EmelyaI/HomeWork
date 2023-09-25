/*Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
        оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        Написать метод, который удаляет студентов со средним баллом <3. Если средний
        балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        printStudents(List<Student> students, int course), который получает список студентов и
        номер курса. А также печатает на консоль имена тех студентов из списка, которые
        обучаются на данном курсе.*/
package Third;

import java.util.LinkedList;

public class Main {
    public static void removalOfStudents(LinkedList<Student> students) {
        students.removeIf(student -> student.getAvgGrade() < 3);

        for (Student student : students) {
            System.out.println("Student " + student.getName() + " go next course.");
        }
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("Name - " + s.getName() + ". Course - " + course);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Pasha", "П-120", 3, 4, 5, 3);
        Student student2 = new Student("Igor", "П-121", 2, 3, 3, 3);
        Student student3 = new Student("Nikita", "П-121", 2, 3, 2, 3);
        Student student4 = new Student("Ola", "П-120", 3, 2, 3, 3);
        Student student5 = new Student("Ilya", "П-122", 3, 4, 3, 3);

        LinkedList<Student> students = new LinkedList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        removalOfStudents(students);
        printStudents(students, 3);
    }
}