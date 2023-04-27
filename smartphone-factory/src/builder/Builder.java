package builder;

import factory.Smartphone;

public interface Builder {
    void setMemoryCapacity(int memoryCapacity);
    void setScreenSize(int screenSize);
    void setName(String name);
    void setModel(String model);
    void componentForBudgetSmartphone(Class aClass,Builder builder);
    void componentForMiddleSmartphone(Class aClass,Builder builder);
    void componentForFlagshipSmartphone(Class aClass,Builder builder);
    void componentOfName(Smartphone smartphone, Builder builder);
}
