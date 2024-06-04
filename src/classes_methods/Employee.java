package classes_methods;

public class Employee {
    private String surname;
    private int payment;
    private int children;

    public void setSurname (String surname){
        this.surname = surname;
    }
    public void setPayment (int payment){
        this.payment = payment;
    }
    public void setChildren (int children){
        this.children = children;
    }

    public String getSurname () {
        return surname;
    }

    public int getPayment () {
        return payment;
    }

    public int getChildren() {
        return children;
    }

    public void print() {
        System.out.println("Фамилия: "+ getSurname());
        System.out.println("Зарплата: "+ getPayment());
        if (getChildren() == 0)
        {
            System.out.println("Детей нет");
        } else {
            System.out.println("Дети есть");
        }
        System.out.println();
    }

}