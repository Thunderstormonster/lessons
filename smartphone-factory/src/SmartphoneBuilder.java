public class SmartphoneBuilder implements Builder{
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

    public Smartphone getResult(){
        return new Smartphone(name,model,memoryCapacity,screenSize);
    }
}
