package builder;

import smartphoneType.*;
import factory.*;

public class Director {

    Smartphone smartphone= SmartphoneFactory.createSmartphone();
    public void constructNoNameChinaSmartphone(Builder builder){
        Class aClass= NoNameChinaSmartphone.class;

        builder.componentOfName(smartphone,builder);
        builder.componentForBudgetSmartphone(aClass,builder);
    }
    public void constructNoNameIndiaSmartphone(Builder builder){
        Class aClass= NoNameIndiaSmartphone.class;

        builder.componentOfName(smartphone,builder);
        builder.componentForBudgetSmartphone(aClass,builder);
    }
    public void constructTaiwanSmartphone(Builder builder){
        Class aClass= TaiwanSmartphone.class;

        builder.componentOfName(smartphone,builder);
        builder.componentForMiddleSmartphone(aClass,builder);
    }
    public void constructTopKoreaSmartphone(Builder builder){
        Class aClass= TopKoreaSmartphone.class;

        builder.componentOfName(smartphone,builder);
        builder.componentForFlagshipSmartphone(aClass,builder);
    }
    public void constructTopUsaSmartphone(Builder builder){
        Class aClass= TopUsaSmartphone.class;

        builder.componentOfName(smartphone,builder);
        builder.componentForFlagshipSmartphone(aClass,builder);
    }


}
