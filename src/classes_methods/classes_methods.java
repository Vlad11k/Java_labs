package classes_methods;

public class classes_methods {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();


        employee1.setSurname("Иванов");
        employee2.setSurname("Петров");
        employee3.setSurname("Сидоров");

        employee1.setPayment(500);
        employee2.setPayment(600);
        employee3.setPayment(700);

        employee1.setChildren(1);
        employee2.setChildren(2);
        employee3.setChildren(3);

        employee1.print();
        employee2.print();
        employee3.print();
    }
}

