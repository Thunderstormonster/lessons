import position.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeManage {

    public static int showMenu(){
        System.out.println("4. Change department;");
        System.out.println("3. Remove employee;");
        System.out.println("2. Create new employee;");
        System.out.println("1. Print all employees;");
        System.out.println("0. Exit.");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }

    public static void createEmployee() throws NullPointerException{
        Scanner in=new Scanner(System.in);

        String name;
        String surname;
        int id;
        Position position;
        String dateOfEmployment;
        BigDecimal salary;
        String lastChangeOfSalary=null;
        Employee employee=null;

        System.out.println("1.Enter a name of the employee: ");
        name=in.nextLine();
        System.out.println("2.Enter surname of the employee: ");
        surname=in.nextLine();
        //[150,400)
        id=150+(int)Math.random()*250;
        dateOfEmployment=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        System.out.println("3.Enter employee position: ");
        switch (in.next()){
            case "Trainee":employee=new Employee(name,surname,id,new Trainee(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Team Lead":employee=new Employee(name,surname,id,new TeamLead(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Specialist":employee=new Employee(name,surname,id,new Specialist(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Senior Manager":employee=new Employee(name,surname,id,new SeniorManager(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Senior Developer":employee=new Employee(name,surname,id,new SeniorDeveloper(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Middle Developer":employee=new Employee(name,surname,id,new MiddleDeveloper(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Manager":employee=new Employee(name,surname,id,new Manager(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Junior Developer":employee=new Employee(name,surname,id,new JuniorDeveloper(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Head of marketing":employee=new Employee(name,surname,id,new HeadOfMarketing(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Head of hr":employee=new Employee(name,surname,id,new HeadOfHR(),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            default: System.out.println("No such position");
            break;
        }
        System.out.println("4.Enter employee start salary: ");
        employee.setSalary(BigDecimal.valueOf(in.nextInt()));

        FileManager.addEmployee(employee);
    }

    public static void removeEmployee(){
        for(int i=0;i<FileManager.employees.size();i++){
            System.out.println(i+". "+FileManager.employees.get(i).toString());
        }

        Scanner in=new Scanner(System.in);

        int id;
        Employee removedEmployee;

        System.out.println("Enter a number of thr employee to fire him: ");
        id=in.nextInt();

        for (int i=0;i<FileManager.employees.size();i++){
            if(id==i){
                removedEmployee=FileManager.employees.get(i);
                FileManager.removeEmployee(removedEmployee);
            }
        }
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        do{
            switch (showMenu()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    FileManager.employees.forEach((n)->System.out.println(n.toString()));
                    break;
                case 2:
                    EmployeeManage.createEmployee();
                    break;
                case 3:
                    EmployeeManage.removeEmployee();
                    break;
                case 4:
                    for(int i=0;i<FileManager.employees.size();i++){
                        System.out.println(i+". "+FileManager.employees.get(i).toString());
                    }
                    System.out.println("What employee do you wanna transfer? ");
                    int id=in.nextInt();
                    DepartmentManager.changeDepartment(FileManager.employees.get(id));
                    break;
            }
        }while (true);
    }
}
