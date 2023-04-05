import java.math.BigDecimal;

public class MiddleDeveloper implements Position{
    private String name;
    private Department department;
    private BigDecimal salary;

    public MiddleDeveloper(String name,Department department,BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public MiddleDeveloper(){}

    public String getName(){return name;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(800);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(2000);}
}
