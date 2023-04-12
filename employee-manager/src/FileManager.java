import position.*;


import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;


public class FileManager {
    public static File file = new File("F:\\lessons\\employee-manager\\employees.data");
    public static ArrayList<Employee> employees=new ArrayList<>();
    /*{{
        add(new Employee("Timothy","Dalton",192,new HeadOfMarketing(Department.MARKETING),"12/02/2000", BigDecimal.valueOf(300),"25/12/2022"));
        add(new Employee("Anna","May",188,new Specialist(Department.MARKETING),"02/03/2010", BigDecimal.valueOf(900),"23/05/2015"));
    }};*/

    public static void addEmployee(Employee employee){
        employees.add(employee);
    }

    public static void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public static void saveEmployee(ArrayList<Employee> employees) {
        try{
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeInt(employees.size());

            for(Employee e:employees){
                oos.writeObject(e);
                System.out.println(e.toString());
            }


            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readEmployee() throws IOException, ClassNotFoundException {
        if(!file.exists()) {
            file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            employees=null;

            ois.close();

        }else{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            int employeeCount = ois.readInt();

            for (int i = 0; i < employeeCount; i++) {
                employees.add((Employee) ois.readObject());
            }
            ois.close();
        }
    }

}
