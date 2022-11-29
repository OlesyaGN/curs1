public class Employee {

    private static int idGenerator = 1;

    private final String fullName;
    private int department;
    private int salary;
    private final int id;

    public Employee (String fullName,
                     int department,
                     int salary) {
        this.id= idGenerator ++;
        this.fullName= fullName;
        this.department=department;
        this.salary=salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        return "id:"+ id+" , Ф.И.О.:" + fullName+",отдел:"+department+ ", зарплата:"+ salary;
    }

}
