/**
 * Created by Korey on 6/1/17.
 */
public class Pirate {
    private String name;
    private int age;
    private int crewMembers;

    public Pirate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    public void attack(){};

    public void drinkRum() {
        System.out.println("The Pirate " + this.name + " is drinking rum!");
    }
}
