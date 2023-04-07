package position;

import java.math.BigDecimal;

public interface Position {
    String getName();
    Department getDepartment();
    BigDecimal getMinSalary();
    BigDecimal getMaxSalary();
}
