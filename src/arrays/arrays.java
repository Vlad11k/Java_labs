package arrays;

import arrays.packageForLaba_2.Employee;

public class arrays {
    public static void main(String[] args) {
        Employee[] employee = new Employee[4];
        employee[0] = new Employee();
        employee[1] = new Employee("Михаил");
        employee[2] = new Employee("Владимир", 800);
        employee[3] = new Employee("Александр", 1000, 2);
        print_list(employee);
    }

    public static void print_list(Employee[] employee) { //Метод для вывода всего списка служащих
        for (int i = 0; i< employee.length; i++) {
            employee[i].print();
            System.out.println("_____________________________________");
        }
        System.out.println("Служащих с детьми: "+ Employee.getEmployees_with_children());
        System.out.println("Средняя зарплата: "+ Employee.getAveragePayment());
    }
}
