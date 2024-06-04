package files;

import java.io.*;

public class laba {
    static String stroka;
    static RandomAccessFile raf;
    static BufferedReader br;
    public static void main(String[] args) throws IOException, InterruptedException {
        br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        File file = new File("Документ.txt");
        while (true) {
            switch (menu()) {
                case 1:
                    if (file.exists()) {
                        readFile();
                    } else {
                        System.out.println("Файл отсутствует");
                        FileWriter writer = new FileWriter(file, true);
                        writer.append("JavaHelloJava123456Hello");
                        for (int i = 0; i < 5; i++) {
                            System.out.print("...");
                            Thread.sleep(1000);
                        }
                        System.out.println("\nТеперь файл создан");
                        Thread.sleep(2000);
                    }
                    break;
                case 2:
                    redact();
                    break;
                case 3:
                    findHelloJava();
                    break;
                case 4:
                    writeFile();
                    System.out.println("Файл записан.");
                    break;
                default:
                    System.out.println("Вы ввели неверное значение.");
                    return;
            }
        }
    }

    static int menu() throws IOException {
        int choice;
        System.out.println("Меню:");
        System.out.println("1) Чтение текста из файла");
        System.out.println("2) Редактирование текста файла");
        System.out.println("3) Поиск слов Java и Hello");
        System.out.println("4) Запись в бинарный файл");
        System.out.println("Ваш выбор: ");
        choice = Integer.parseInt(br.readLine());
        return choice;
    }

    public static void readFile() throws IOException {
        raf = new RandomAccessFile(new File("Документ.txt"),"r");
        stroka = raf.readLine();
        raf.close();
        System.out.println("Информация из файла: "+stroka);
    }
    public static void findHelloJava() throws IOException {
        int helloCount = 0;
        int javaCount = 0;
        raf = new RandomAccessFile(new File("Документ.txt"), "r");
        raf.seek(0);
        stroka = raf.readLine();
        int n;
        while (stroka.indexOf("Hello") != -1) {
            n = stroka.indexOf("Hello");
            helloCount++;
            stroka = stroka.replaceFirst("Hello", "");
        }
        raf.seek(0);
        stroka = raf.readLine();
        while (stroka.indexOf("Java") != -1) {
            n = stroka.indexOf("Java");
            javaCount++;
            stroka = stroka.replaceFirst("Java", "");
        }
        System.out.println("Колличество слов Hello: "+helloCount);
        System.out.println("Колличество слов Java: "+javaCount);
    }

    public static void redact() throws IOException {
        String s;
        System.out.println("Выберите действие:");
        System.out.println("1) Вставить текст в начало файла");
        System.out.println("2) Вставить текст в конец файла");
        System.out.println("3) Вставить текст в конкретную позицию файла");
        System.out.println("Ваш выбор: ");
        int choice = Integer.parseInt(br.readLine());
        raf = new RandomAccessFile(new File("Документ.txt"), "rw");
        stroka = raf.readLine();
        switch (choice) {
            case 1:
                System.out.println("Введите строку для добавления в начало: ");
                s = br.readLine();
                raf.seek(0);
                raf.writeBytes(s);
                raf.seek(s.length());
                raf.writeBytes(stroka);
                raf.close();
                System.out.println("Строка записана.");
                break;
            case 2:
                System.out.println("Введите строку для добавления в конец: ");
                s = br.readLine();
                raf.seek(raf.length());
                raf.writeBytes(s);
                raf.close();
                System.out.println("Строка записана.");
                break;
            case 3:
                System.out.println("Введите строку для добавления в конкретную позицию: ");
                s = br.readLine();
                System.out.println("Введите необходимую позицию в файле: ");
                int n = Integer.parseInt(br.readLine());
                raf.seek(n);
                stroka = raf.readLine();
                raf.seek(n);
                raf.writeBytes(s);
                raf.writeBytes(stroka);
                raf.close();
                System.out.println("Строка записана.");
                break;
            default:
                System.out.println("Вы ввели неверное значение");
                return;
        }
    }

    public static void writeFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("Binary.txt");
        raf = new RandomAccessFile("Документ.txt", "r");
        stroka = raf.readLine();
        byte[] buffer = stroka.getBytes();
        fos.write(buffer, 0, buffer.length);
        raf.close();
        fos.close();
    }
}