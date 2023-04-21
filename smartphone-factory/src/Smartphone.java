public class Smartphone {
    String name;
    String model;
    int memoryCapacity;
    int screenSize;

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
}
