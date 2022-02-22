
public class MainProgram {

    public static void main(String[] args) {
        Person anna = new Person("anna", Education.PHD);
        Employees employees = new Employees();
        employees.add(anna);
        employees.print(Education.PHD);
    }
}
