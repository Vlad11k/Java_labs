package arrays.packageForLaba_2;

public class Employee {
    static int general_payment; //Общая зарплата
    static int Employees_with_children; //Служащих с детьми
    static int number_employees_with_payment; //Слкжпщих получающих зарплату
    private String surname;
    private int payment;
    private int children;

    public Employee() { //Ничего не введено
        surname = "Неизвестно";
        payment = 0;
        children = 0;
    }

    public Employee(String surname) { //Введено только имя
        this.surname = surname;
        payment = 0;
        children = 0;
    }

    public Employee(String surname, int payment) { //Введены имя и зарплата
        this.surname = surname;
        this.payment = payment;
        number_employees_with_payment++;
        general_payment += payment;
        children = 0;
    }

    public Employee(String surname, int payment, int children) { //Введена вся информация
        this.surname = surname;
        this.payment = payment;
        number_employees_with_payment++;
        general_payment += payment;

        this.children = children;
        Employees_with_children++;
    }

    public String getSurname() {
        return surname;
    }

    public int getPayment() {
        return payment;
    }

    public int getChildren() {
        return children;
    }

    public static int getAveragePayment() {
        return (general_payment / number_employees_with_payment);
    }

    public static int getEmployees_with_children() {
        return Employees_with_children;
    }

    public void print() {
        System.out.println("Фамилия: " + getSurname());
        System.out.println("Зарплата: " + getPayment());
        if (getChildren() == 0) {
            System.out.println("Детей нет");
        } else {
            System.out.println("Дети есть");
        }
    }
}
