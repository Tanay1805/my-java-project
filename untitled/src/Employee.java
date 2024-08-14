import java.util.Scanner;

class EmployeeDetails{
    String name;
    int employee_id;
    String Department;

    void addInfo(String nm, int emp_id, String Dept){
        this.name = nm;
        this.employee_id = emp_id;
        this.Department = Dept;
    }
    void displayData(){
        System.out.println("The details of the Employee is" +"\n"+"\n"+ name +"\n"+ employee_id+"\n" + Department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter tbe name of the Employee:");
        String name = st.next();

        System.out.println("Enter tbe Employee ID of the Employee:");
        int employ_id = st.nextInt();

        System.out.println("Enter the Department of the Employee:");
        String D = st.next();

        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.addInfo(name,employ_id,D);
        st.close();
        emp1.displayData();

    }
}

