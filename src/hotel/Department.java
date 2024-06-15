package hotel;

import java.util.List;

public class Department {
    public String deptName;
    public List<Designation> designation;
    public int requiredEmployees;

    @Override
    public String toString() {
        return "hotel.Department{" +
                "deptName='" + deptName + '\'' +
                ", designation=" + designation +
                ", requiredEmployees=" + requiredEmployees +
                '}';
    }
}
