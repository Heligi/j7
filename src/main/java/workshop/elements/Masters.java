package workshop.elements;

public class Masters {
    private String name;
    private int experience;
    private int age;

    public Masters(String name, int experience, int age) {
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    //мастер флаастер
    public Masters(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Masters{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                '}';
    }
}
