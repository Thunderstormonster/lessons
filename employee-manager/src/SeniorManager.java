import java.math.BigDecimal;

public class SeniorManager implements Position{
    private String name;
    private Department department;
    private BigDecimal salary;

    public SeniorManager(String name, Department department, BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public SeniorManager(){}

    public String getName(){return name;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(300);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(600);}
}
