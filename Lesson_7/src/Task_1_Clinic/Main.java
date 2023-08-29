/*Задача 1:
        Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
        хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
        по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
        «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
        терапевта создать метод, который будет назначать врача пациенту согласно плану
        лечения:
        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
        лечить.*/
package Task_1_Clinic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Therapist therapist = new Therapist();
        Patient patient = new Patient();
        int a = scanner.nextInt();
        patient.enter(a);
        therapist.who_will_treat(a);
        String doctor = therapist.getDoc();
        patient.setDoctor(doctor);
        System.out.println("Treatment plan - " + patient.getTreatmentPlan() + ". Doctor - " + therapist.getDoc());
    }
}
