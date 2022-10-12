package lesson3.homework.task5;

public class Dog extends Animal {

    public String name;
    private static int dogCount;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public Dog() {
        dogCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void run(int distance) {
        if (distance > 500) {
            //  distance = 500;   // Если раскоментить то строчка не отрабатывает, не понимаю почему?
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have run " + 500 + " m");
        } else if (distance < 1) {
            //  distance = 0;   // Если раскоментить то строчка не отрабатывает, не понимаю почему?
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have run " + 0 + " m");
        } else {
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have run " + distance + " m");
        }
    }

    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have swum " + 10 + " m");
        } else if (distance < 1) {
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have swum " + 0 + " m");
        } else {
            System.out.println("Dog " + (getName() == null ? "" : getName()) + " have swum " + distance + " m");
        }
    }
}
