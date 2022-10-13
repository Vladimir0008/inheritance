package lesson3.homework.task5;

import lesson3.homework.task5.exception.DistanceException;

public class Dog extends Animal {


    private String name;
    private static int instanceCount;

    public Dog(String name) {
        this();
        this.name = name;
    }

    public Dog() {
        instanceCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }


    public void run(int distance) throws DistanceException {
        if (distance > 500 || distance <= 1) {
            throw new DistanceException("Distance is incorrect");
        }
        System.out.printf("Dog %s have run " + distance + " m\n", (getName() == null ?"": getName()));

    }

    public void swim(int distance) throws DistanceException {
        if (distance > 10 || distance <=0) {
            throw new DistanceException("Distance is incorrect");
        }
        System.out.printf("Dog %s have swum " + distance + " m\n", (getName()== null ?"": getName()));
    }
}
