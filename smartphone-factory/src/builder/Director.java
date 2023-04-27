package builder;

import smartphoneType.*;
import factory.*;

public class Director {
    public void constructNoNameChinaSmartphone(Builder builder){
        Smartphone smartphone= SmartphoneFactory.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());
        Class aClass= NoNameChinaSmartphone.class;

        builder.componentForBudgetSmartphone(aClass,builder);
    }
    public void constructNoNameIndiaSmartphone(Builder builder){
        Smartphone smartphone= SmartphoneFactory.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Class aClass= NoNameIndiaSmartphone.class;

        builder.componentForBudgetSmartphone(aClass,builder);
    }
    public void constructTaiwanSmartphone(Builder builder){
        Smartphone smartphone= SmartphoneFactory.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Class aClass= TaiwanSmartphone.class;

        builder.componentForMiddleSmartphone(aClass,builder);
    }
    public void constructTopKoreaSmartphone(Builder builder){
        Smartphone smartphone= SmartphoneFactory.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Class aClass= TopKoreaSmartphone.class;
        builder.componentForFlagshipSmartphone(aClass,builder);
    }
    public void constructTopUsaSmartphone(Builder builder){
        Smartphone smartphone= SmartphoneFactory.createSmartphone();

        builder.setName(smartphone.getName());
        builder.setModel(smartphone.getModel());

        Class aClass= TopUsaSmartphone.class;

        builder.componentForFlagshipSmartphone(aClass,builder);
    }


}
