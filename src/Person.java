public class Person {

    private String name;

    public Person(String name)
    {
        setName(name);
    }

    public Person()
    {
        this("Unknown");
    }

    public String toString() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
