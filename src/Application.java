import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {

        Department production = new Department("Production");
        Department finance = new Department("Finance");
        Department engineering = new Department("Engineering");
        Department personnel = new Department("Personnel");

        Employee employee1 = new Employee("Ivan", "Ivanov", "Java Developer");
        employee1.setCard(new IdCard(123456, LocalDate.of(2021, 10, 10)));
        employee1.setDepartment(production);
        employee1.setPastPosition(new PastPosition("engineer", engineering));
        employee1.setRoom(new Room(215));

        Employee employee2 = new Employee("Petr", "Petrov", "Java Developer");
        employee2.setCard(new IdCard(123123, LocalDate.of(2022, 10, 10)));
        employee2.setDepartment(production);
        employee2.setPastPosition(new PastPosition("engineer", engineering));
        employee2.setRoom(new Room(215));

        Employee employee3 = new Employee("Petr", "Sidorov", "Java Developer");
        employee3.setCard(new IdCard(123321, LocalDate.of(2022, 8, 8)));
        employee3.setDepartment(production);
        employee3.setPastPosition(new PastPosition("engineer", engineering));
        employee3.setRoom(new Room(215));

        Employee employee4 = new Employee("Nikolay", "Sidorov", "Economical Consultant");
        employee4.setCard(new IdCard(666444, LocalDate.of(2020, 3, 2)));
        employee4.setDepartment(finance);
        employee4.setPastPosition(new PastPosition("economist", finance));
        employee4.setRoom(new Room(211));

        Employee employee5 = new Employee("Yauhen", "Mironov", "Economical Consultant");
        employee5.setCard(new IdCard(122221, LocalDate.of(2022, 8, 8)));
        employee5.setDepartment(finance);
        employee5.setPastPosition(new PastPosition("economist", finance));
        employee5.setRoom(new Room(211));

        Employee employee6 = new Employee("John", "Kozlovski", "Economical Consultant");
        employee6.setCard(new IdCard(111111, LocalDate.of(2021, 8, 2)));
        employee6.setDepartment(finance);
        employee6.setPastPosition(new PastPosition("economist", finance));
        employee6.setRoom(new Room(211));

        Employee employee7 = new Employee("Hanna", "Danilova", "HR");
        employee7.setCard(new IdCard(111000, LocalDate.of(2025, 3, 1)));
        employee7.setDepartment(personnel);
        employee7.setPastPosition(new PastPosition("HR", personnel));
        employee7.setRoom(new Room(210));

        Employee employee8 = new Employee("Evgeniy", "Kaspersky", "HR");
        employee8.setCard(new IdCard(678905, LocalDate.of(2022, 10, 9)));
        employee8.setDepartment(personnel);
        employee8.setPastPosition(new PastPosition("Economical Consultant", finance));
        employee8.setRoom(new Room(210));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        for (Employee i : employees) {
            if (i.getDepartment().equals(production)) {
                System.out.println(i);
            }
        }

        for (Employee i : employees) {
            if (i.getPastPositions().get(0).getDepartment().equals(finance)) {
                System.out.println(i);
            }
        }

        //Collections Surname = new Collections(employees);
        //Surname.sort


    }
}
