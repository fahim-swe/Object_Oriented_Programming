package Class;

public class Fruit {
    private String Name;
    private String Colors;

    public Fruit() {
    }

    public Fruit(String name, String colors) {
        Name = name;
        Colors = colors;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColors() {
        return Colors;
    }

    public void setColors(String colors) {
        Colors = colors;
    }


    public void info()
    {
        System.out.println("Fruit Name: " + getName());
        System.out.println("Fruit Color: " + getColors());
    }
}


