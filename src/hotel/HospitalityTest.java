package hotel;

import hotel.Department;
import hotel.Designation;
import hotel.Division;

import java.util.ArrayList;
import java.util.List;

public class HospitalityTest {
    public static void main(String[] args){
        Designation generalManager = new Designation();
        generalManager.designationName="General Manager";

        Designation hotelManager = new Designation();
        hotelManager.designationName="Hotel Manager";

        Designation pa = new Designation();
        pa.designationName="PA to hotel Manager";

        Designation healthAndSafety = new Designation();
        healthAndSafety.designationName="Health And Safety Manager";

        List<Designation> designationList = new ArrayList<>();
        designationList.add(generalManager);
        designationList.add(hotelManager);
        designationList.add(pa);
        designationList.add(healthAndSafety);


        Department managementOffice = new Department();
        managementOffice.deptName="Management Office";
        managementOffice.designation=designationList;

//  Data for Information Technology hotel.Division

        Designation itManager = new Designation();
        generalManager.designationName="IT manager";

        Designation itSpecialist = new Designation();
        hotelManager.designationName="IT specialist";

        Designation itTeamLead = new Designation();
        itTeamLead.designationName="IT Team Leader";

        Designation itTechnician = new Designation();
        itTechnician.designationName="IT Technician";

        List<Designation> designationList2 = new ArrayList<>();
        designationList2.add(itManager);
        designationList2.add(itSpecialist);
        designationList2.add(itTeamLead);
        designationList2.add(itTechnician);



        Department it = new Department();
        it.deptName="Information Technology";
        it.designation=designationList2;


        List<Department> departmentList = new ArrayList<>();
        departmentList.add(managementOffice);


        List<Department> departmentList1 = new ArrayList<>();
        departmentList1.add(it);


        Division executiveManagement = new Division();
        executiveManagement.name="Executive Management";
        executiveManagement.department=departmentList;


        Division informationTechnology = new Division();
        informationTechnology.name="Information Technology";
        informationTechnology.department=departmentList1;


        System.out.println(informationTechnology.department);

    }
}
