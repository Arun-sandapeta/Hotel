package hotelMatrix;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {
    public static void main(String[] args){

        List<Node> departmentList = new ArrayList<>();
        List<Node> designationList = new ArrayList<>();

        Node divisionExecutive = new Node();
        divisionExecutive.type="Executive Management";
        divisionExecutive.nodes=departmentList;


        Node departmentManagement = new Node();
        departmentManagement.type="management Office";
        departmentManagement.nodes=designationList;

        Node departmentHealth = new Node();
        departmentHealth.type="Health and safety";
        departmentHealth.nodes=designationList;

        Node designationGM = new Node();
        designationGM.type="general manager";

        departmentList.add(departmentManagement);
        departmentList.add(departmentHealth);

        designationList.add(designationGM);

        System.out.println(divisionExecutive.type);
        System.out.println(divisionExecutive.nodes);
        System.out.println(departmentManagement.type);
        System.out.println(departmentManagement.nodes);





    }
}
