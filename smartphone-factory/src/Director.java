import java.lang.annotation.Annotation;

public class Director {
    public void constructNoNameChinaSmartphone(Builder builder){
        Smartphone smartphone= Application.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Annotation[] annotations = NoNameChinaSmartphone.class.getAnnotations();
        for (Annotation annotation : annotations) {
            BudgetSmartphone bAnnotation = (BudgetSmartphone) annotation;
                builder.setMemoryCapacity(bAnnotation.memoryCapacity());
                builder.setScreenSize(bAnnotation.screenSize());
        }
    }
    public void constructNoNameIndiaSmartphone(Builder builder){
        Smartphone smartphone= Application.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Annotation[] annotations = NoNameIndiaSmartphone.class.getAnnotations();
        for (Annotation annotation : annotations) {
            BudgetSmartphone bAnnotation = (BudgetSmartphone) annotation;
            builder.setMemoryCapacity(bAnnotation.memoryCapacity());
            builder.setScreenSize(bAnnotation.screenSize());
        }
    }
    public void constructTaiwanSmartphone(Builder builder){
        Smartphone smartphone= Application.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Annotation[] annotations = TaiwanSmartphone.class.getAnnotations();
        for (Annotation annotation : annotations) {
            MidTierSmartphone mAnnotation = (MidTierSmartphone) annotation;
            builder.setMemoryCapacity(mAnnotation.memoryCapacity());
            builder.setScreenSize(mAnnotation.screenSize());
        }
    }
    public void constructTopKoreaSmartphone(Builder builder){
        Smartphone smartphone= Application.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Annotation[] annotations = TopKoreaSmartphone.class.getAnnotations();
        for (Annotation annotation : annotations) {
            FlagshipSmartphone fAnnotation=(FlagshipSmartphone) annotation;
            builder.setMemoryCapacity(fAnnotation.memoryCapacity());
            builder.setScreenSize(fAnnotation.screenSize());
        }
    }
    public void constructTopUsaSmartphone(Builder builder){
        Smartphone smartphone= Application.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Annotation[] annotations = TopUsaSmartphone.class.getAnnotations();
        for (Annotation annotation : annotations) {
            FlagshipSmartphone fAnnotation=(FlagshipSmartphone) annotation;
            builder.setMemoryCapacity(fAnnotation.memoryCapacity());
            builder.setScreenSize(fAnnotation.screenSize());
        }
    }
}
