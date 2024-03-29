package position;

import position.Department;
import position.Position;

import java.math.BigDecimal;

public class HeadOfMarketing implements Position {
    private String name;
    private Department department;
    private BigDecimal salary;

    public HeadOfMarketing(String name, Department department, BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public HeadOfMarketing(Department department){
        this.department=department;
    }

    public HeadOfMarketing(){}

    public String getName(){return name;}

    public void setDepartment(Department department){this.department=department;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(1000);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(2000);}
}
