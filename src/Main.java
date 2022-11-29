public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Петров Александр Викторович", 1, 25_000);
        EMPLOYEES[1] = new Employee("Семенов Александр Викторович", 1, 35_000);
        EMPLOYEES[2] = new Employee("Марченко Александр Викторович", 2, 45_000);
        EMPLOYEES[3] = new Employee("Пушкин Александр Викторович", 1, 65_000);
        EMPLOYEES[4] = new Employee("Васильков Александр Викторович", 3, 26_000);
        EMPLOYEES[5] = new Employee("Одуванчиков Александр Викторович", 2, 49_000);
        EMPLOYEES[6] = new Employee("Ромашкин Александр Викторович", 4, 38_000);
        EMPLOYEES[7] = new Employee("Маков Александр Викторович", 4, 39_000);


        listEmployees();
        int sumSalaries = totalSumSalaries();
        System.out.println("Сумма зарплат: " + sumSalaries);
        Employee employeeMinSalary= findEmployeeMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой "+ employeeMinSalary);
        Employee employeeMaxSalary= findEmployeeMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой "+ employeeMaxSalary);
        double averageSalary=findAverageSalary();
        System.out.println("Средняя зарплата: "+ averageSalary);
        listNameEmployees();
        }



    private static void listEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int totalSumSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();
                System.out.println(employee);
            }
        }
        return sum;
    }
    private static Employee findEmployeeMinSalary(){
        int min= Integer.MAX_VALUE;
        Employee employeeMinSalary=null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary()<min){
                min= employee.getSalary();
                employeeMinSalary= employee;
            }

            }
        return employeeMinSalary;

    }
    private static Employee findEmployeeMaxSalary(){
        int max= Integer.MIN_VALUE;
        Employee employeeMaxSalary=null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary()>max){
                max= employee.getSalary();
                employeeMaxSalary= employee;
            }

        }
        return employeeMaxSalary;

    }
    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {

            return (double) totalSumSalaries() / count;
        }
        return 0;
    }
    private static void listNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}





