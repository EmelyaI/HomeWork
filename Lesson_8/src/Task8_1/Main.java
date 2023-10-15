/*Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        который печатает название должности и имплементировать этот метод в созданные
        классы.*/
package Task8_1;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.PrintJob();
        Worker worker = new Worker();
        worker.PrintJob();
        Manager manager = new Manager();
        manager.PrintJob();
    }
}