package input_output;


import java.io.IOException;

public class laba {
    public static void main(String[] args) throws IOException {
        Employee employee[] = new Employee[3];
        for (int i = 0; i<3; i++) {
            employee[i] = new Employee();
        }
        for (int i = 0; i<3; i++) {
            employee[i].fileInput();
        }
        Employee.fileOutput();
    }
}
