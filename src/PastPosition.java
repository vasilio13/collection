public class PastPosition {

    private String name;
    private Department department;

    public PastPosition(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "PastPosition{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

}