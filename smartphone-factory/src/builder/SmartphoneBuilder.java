package builder;

import factory.Smartphone;
import smartphoneType.BudgetSmartphone;
import smartphoneType.FlagshipSmartphone;
import smartphoneType.MidTierSmartphone;

import java.lang.annotation.Annotation;

public class SmartphoneBuilder implements Builder {
    private String name;

    private String model;

    private int memoryCapacity;
    private int screenSize;

    @Override
    public void setMemoryCapacity(int memoryCapacity){
        this.memoryCapacity=memoryCapacity;
    }

    @Override
    public void setScreenSize(int screenSize){
        this.screenSize=screenSize;
    }
    public void setName(String name){this.name=name;}

    public void setModel(String model){this.model=model;}

    public void componentForBudgetSmartphone(Class aClass,Builder builder){
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            BudgetSmartphone bAnnotation = (BudgetSmartphone) annotation;
            builder.setMemoryCapacity(bAnnotation.memoryCapacity());
            builder.setScreenSize(bAnnotation.screenSize());
        }
    }

    public void componentForMiddleSmartphone(Class aClass,Builder builder){
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            MidTierSmartphone mAnnotation = (MidTierSmartphone) annotation;
            builder.setMemoryCapacity(mAnnotation.memoryCapacity());
            builder.setScreenSize(mAnnotation.screenSize());
        }
    }

    public void componentForFlagshipSmartphone(Class aClass,Builder builder){
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            FlagshipSmartphone fAnnotation=(FlagshipSmartphone) annotation;
            builder.setMemoryCapacity(fAnnotation.memoryCapacity());
            builder.setScreenSize(fAnnotation.screenSize());
        }
    }

    public Smartphone getResult(){
        return new Smartphone(name,model,memoryCapacity,screenSize);
    }
}
