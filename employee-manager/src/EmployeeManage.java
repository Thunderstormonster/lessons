import position.Manager;
import position.SeniorManager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManage {

    public static int showMenu(){
        System.out.println("1. Print all employees;");
        System.out.println("0. Exit.");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Timothy","Dalton",19274,new Manager(),"12/02/2000", BigDecimal.valueOf(600),"25/12/2022"));
        employees.add(new Employee("Anna","May",18874,new SeniorManager(),"02/03/2010", BigDecimal.valueOf(900),"23/05/2015"));

        Scanner in=new Scanner(System.in);

        do{
            switch (showMenu()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    employees.forEach((n)->System.out.println(n.toString()));
            }
        }while (true);
    }
}
