package input_output;

import java.io.*;

public class Employee {
    static int generalPayment;
    static int numberEmployeers;
    static int employeersWithChildrens;
    private String surname;
    private int payment;
    private boolean childrens;

    Employee() throws IOException {
        String yn;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
        System.out.println("Введите ФИО: ");
        surname = bufferedReader.readLine();
        numberEmployeers++;
        System.out.println("Введите зарпалту: ");
        payment = Integer.parseInt(bufferedReader.readLine());
        generalPayment += payment;
        System.out.println("Наличие детей(Да/Нет): ");
        yn = bufferedReader.readLine();
        if (yn.equals("Да") || yn.equals("да") || yn.equals("ДА") || yn.equals("дА")) {
            childrens = true;
            employeersWithChildrens++;
        } else if (yn.equals("Нет") || yn.equals("нет") || yn.equals("НЕТ") || yn.equals("нЕТ")) {
            childrens = false;
        } else {
            System.out.println("Вы ввели неверное значение");
        }
    }
    public void fileInput() throws IOException {
        File file = new File("Employee.doc");
        file.deleteOnExit();
        FileWriter writer = new FileWriter(file, true);

        writer.append("\nФИО служащего: "+surname+";\nЗарплата: "+payment+";\n");
        if (childrens) {
            writer.append("Дети есть\n");
        } else writer.append("Детей нет\n");
        writer.flush();
        writer.close();
    }
    public static void fileOutput() throws IOException {
        File file = new File("Employee.doc");
        FileReader reader = new FileReader(file);
        char buffer[] = new char[1];
        int n;
        do {
            n = reader.read(buffer);
            System.out.print(buffer[0]);
        } while(n == 1);
        reader.close();
        System.out.println("Средняя зарплата:"+getAveragePayment());
        System.out.println("Количество служащих с детьми:" + getEmployeersWithChildrens());
    }
    public static int getAveragePayment() {
        return (generalPayment/numberEmployeers);
    }

    public static int getEmployeersWithChildrens() {
        return employeersWithChildrens;
    }
}