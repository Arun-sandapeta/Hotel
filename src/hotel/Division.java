package hotel;

import hotel.Department;

import java.util.List;

public class Division {
    public String name;
    public List<Department> department;

    @Override
    public String toString() {
        return "hotel.Division{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
