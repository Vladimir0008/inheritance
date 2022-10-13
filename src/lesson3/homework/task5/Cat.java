package lesson3.homework.task5;

import lesson3.homework.task5.exception.DistanceException;
import lesson3.homework.task5.exception.SwimmingException;

public class Cat extends Animal {


    private String name;
    private static int instanceCount;

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat() {
        instanceCount++;
    }


    public void run(int distance) throws DistanceException {
        if (distance > 200 || distance <= 1) {
            throw new DistanceException("Distance is incorrect");
        }

        System.out.printf("Cat %s have run " + distance + " m\n", (getName() == null ? "" : getName()));
    }


    public void swim(int distance) throws SwimmingException {
        throw new SwimmingException("Cats can't swim!");
    }
}
