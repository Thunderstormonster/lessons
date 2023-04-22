public class Smartphone{
    private String name;
    private String model;
    private int memoryCapacity;
    private int screenSize;

    public Smartphone(String name,String model,int memoryCapacity, int screenSize) {
        this.name=name;
        this.model=model;
        this.memoryCapacity=memoryCapacity;
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", screenSize=" + screenSize +
                '}';
    }
    public static void cloneSmartphone(Smartphone smartphone){
        System.out.println("Im here");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Smartphone newSmartphone=new Smartphone(smartphone.getName(),
                            smartphone.getModel(),smartphone.getMemoryCapacity(),
                            smartphone.getScreenSize());
    }
}
