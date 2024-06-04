package abstract_classes;

import java.util.Scanner;
public class laba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cabinet cabinet1 = new Cabinet();
        Cabinet cabinet2 = new Cabinet(100);
        Cabinet cabinet3 = new Cabinet(100, 200, 50);
        Table table1 = new Table();
        Table table2 = new Table(3);
        Table table3 = new Table(4, 150);
        print_Tables(table1, table2, table3);
        print_Cabinet(cabinet1, cabinet2, cabinet3);
        bar_stol(scanner);
        stol(scanner);
    }
    public static void print_Tables (Table table1,Table table2, Table table3) {
        table1.print();
        table2.print();
        table3.print();
        System.out.println();
    }
    public static void print_Cabinet (Cabinet cabinet1, Cabinet cabinet2, Cabinet cabinet3) {
        cabinet1.print();
        cabinet2.print();
        cabinet3.print();
        System.out.println();
    }
    public static void bar_stol(Scanner scanner) {
        int vibor = 0;
        System.out.println("Выберите материал для барного стула:");
        System.out.println("1) Дерево");
        System.out.println("2) Металл");
        System.out.println("3) Пластик");
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            vibor=scanner.nextInt();
        }
        switch (vibor) {
            case 1:
                Bar_stool bar_stool1 = new Bar_stool(150, "Дерево");
                bar_stool1.print();
                break;
            case 2:
                Bar_stool bar_stool2 = new Bar_stool(100, "Металл");
                bar_stool2.print();
                break;
            case 3:
                Bar_stool bar_stool3 = new Bar_stool(50, "Пластик");
                bar_stool3.print();
                break;
            default:
                System.out.println("Вы ввели неверное значение.");
                break;
        }
    }
    public static void stol (Scanner scanner) {
        int vibor = 0;
        System.out.println("Выберите материал для табуретки:");
        System.out.println("1) Дерево");
        System.out.println("2) Металл");
        System.out.println("3) Пластик");
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            vibor = scanner.nextInt();
        }
        switch (vibor) {
            case 1:
                Stool stool1 = new Stool(20, "Дерево");
                stool1.print();
                break;
            case 2:
                Stool stool2 = new Stool(30, "Металл");
                stool2.print();
                break;
            case 3:
                Stool stool3 = new Stool(10, "Пластик");
                stool3.print();
                break;
            default:
                System.out.println("Вы ввели неверное значение.");
                break;
        }

    }
}
