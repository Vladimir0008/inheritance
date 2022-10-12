package lesson3.homework.task5;

public class Cat extends Animal {

    public String name;
    private static int catCount;

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public Cat() {
        catCount++;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Cat " + (getName() == null ? "" : getName()) + " have run " + 200 + " m");
        } else if (distance < 1) {
            System.out.println("Cat " + (getName() == null ? "" : getName()) + " have run " + 0 + " m");
        } else {
            System.out.println("Cat " + (getName() == null ? "" : getName()) + " have run " + distance + " m");
        }
    }

    public void swim(int distance) {
        System.out.println("Ups cats can't swim");
    }
}
