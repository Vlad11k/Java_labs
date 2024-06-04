package multithreading;

import multithreading.storage.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Создание объектов грузовиков
        Truck truck1 = new Truck(1, 3, 2);
        Truck truck2 = new Truck(2, 5, 2);
        Truck truck3 = new Truck(3, 15, 5);

        //Создание объекта обозначающего массу всего груза на складе
        GeneralTons generalTons = new GeneralTons(186);

        //Объявление новых потоков
        TruckThread thread1 = new TruckThread(generalTons, truck1);
        TruckThread thread2 = new TruckThread(generalTons, truck2);
        TruckThread thread3 = new TruckThread(generalTons, truck3);

        //Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();

        //Ожидание завершения потоков
        thread1.join();
        thread2.join();
        thread3.join();

        //Вывод данных
        thread1.print();
        thread2.print();
        thread3.print();
        System.out.println("\nЗатраченное время = " + TruckThread.allTime);
    }
}
