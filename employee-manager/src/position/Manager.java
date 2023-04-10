package position;

import position.Department;
import position.Position;

import java.math.BigDecimal;

public class Manager implements Position {
    private String name;
    private Department department;
    private BigDecimal salary;

    public Manager(String name,Department department,BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public Manager(Department department){
        this.department=department;
    }

    public Manager(){}

    public String getName(){return name;}

    public void setDepartment(Department department){this.department=department;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(400);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(800);}
}
