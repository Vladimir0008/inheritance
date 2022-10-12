package lesson3.homework.task5;

public class Cat extends Animal {
    private static int catCount;

    public static int getCatCount() {
        return catCount;
    }

    public Cat() {
        catCount++;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Cat have run " + 200 + " m");
        } else if (distance < 1) {
            System.out.println("Cat have run " + 0 + " m");
        } else {
            System.out.println("Cat have run " + distance + " m");
        }
    }

    public void swim(int distance) {
        System.out.println("Ups cats can't swim");
    }
}
